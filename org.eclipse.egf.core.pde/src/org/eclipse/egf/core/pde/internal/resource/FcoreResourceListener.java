/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.eclipse.egf.core.pde.internal.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.egf.common.helper.BundleHelper;
import org.eclipse.egf.common.helper.ProjectHelper;
import org.eclipse.egf.common.helper.URIHelper;
import org.eclipse.egf.core.fcore.IPlatformFcoreConstants;
import org.eclipse.egf.core.fcore.IResourceFcoreDelta;
import org.eclipse.egf.core.fcore.IResourceFcoreListener;
import org.eclipse.egf.core.pde.EGFPDEPlugin;
import org.eclipse.egf.core.pde.l10n.EGFPDEMessages;
import org.eclipse.egf.core.pde.plugin.IPluginChangesCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.osgi.util.NLS;

/**
 * @author Xavier Maysonnave
 * 
 */
public class FcoreResourceListener implements IResourceChangeListener {

    // Type of event that should be processed no matter what the real event type is.
    public int _overridenEventType = -1;

    // A list of listeners interested in changes to fcore resources
    private List<IResourceFcoreListener> _listeners;

    public FcoreResourceListener() {
        // ensure that we are listening to the workspace
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }

    /**
     * Notify all interested listeners in changes made to fcore resource
     * 
     * @param delta
     *            the delta of changes
     */
    private void fireResourceFcore(IResourceFcoreDelta delta) {
        if (_listeners != null) {
            for (IResourceFcoreListener listener : _listeners) {
                listener.fcoreChanged(delta);
            }
        }
    }

    /**
     * Add a listener
     * 
     * @param listener
     *            the listener to be added
     */
    public void addResourceFcoreListener(IResourceFcoreListener listener) {
        if (_listeners == null) {
            _listeners = new ArrayList<IResourceFcoreListener>();
        }
        if (_listeners.contains(listener) == false) {
            _listeners.add(listener);
        }
    }

    /**
     * Remove a listener
     * 
     * @param listener
     *            the listener to be removed
     */
    public void removeResourceFcoreListener(IResourceFcoreListener listener) {
        if (_listeners == null) {
            return;
        }
        _listeners.remove(listener);
    }

    /**
     * This listens for workspace changes.
     */

    public void resourceChanged(IResourceChangeEvent event) {

        int eventType = _overridenEventType == -1 ? event.getType() : _overridenEventType;

        try {

            class ResourceDeltaVisitor implements IResourceDeltaVisitor {

                protected List<IPath> _newFcores = new UniqueEList<IPath>();

                protected List<IPath> _removedFcores = new UniqueEList<IPath>();

                protected Map<IPath, IPath> _movedFcores = new HashMap<IPath, IPath>();

                protected ResourceFcoreDelta _deltaFcores = new ResourceFcoreDelta();

                public boolean visit(IResourceDelta delta) throws CoreException {

                    try {

                        // Ignore opening and closing projects, handled by PlatformManager
                        if (delta.getResource().getType() == IResource.PROJECT && (delta.getFlags() & IResourceDelta.OPEN) != 0) {
                            return false;
                        }

                        // Process file
                        if (delta.getResource().getType() != IResource.FILE) {
                            return true;
                        }

                        // check whether or not we are processing an fcore
                        boolean isFcore = IPlatformFcoreConstants.FCORE_FILE_EXTENSION.equals(delta.getResource().getFileExtension());
                        // Locate the bundleId, resource should be located in a bundle project
                        String bundleId = BundleHelper.getBundleId(delta.getResource());
                        URI uri = URIHelper.getPlatformPluginURI(delta.getResource());
                        if (uri != null && bundleId != null) {
                            if (delta.getKind() == IResourceDelta.CHANGED && isFcore) {
                                if (delta.getFlags() != IResourceDelta.MARKERS && (delta.getFlags() & IResourceDelta.CONTENT) != 0) {
                                    _deltaFcores.addUpdatedFcore(delta);
                                }
                            } else if (delta.getKind() == IResourceDelta.ADDED && isFcore) {
                                if ((delta.getFlags() & IResourceDelta.MOVED_FROM) == 0) {
                                    _deltaFcores.addNewFcore(delta.getFullPath());
                                    _newFcores.add(delta.getResource().getFullPath());
                                }
                            } else if (delta.getKind() == IResourceDelta.REMOVED) {
                                boolean isMovedToFcore = false;
                                if ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0) {
                                    isMovedToFcore = IPlatformFcoreConstants.FCORE_FILE_EXTENSION.equals(delta.getMovedToPath().getFileExtension());
                                }
                                // Check whether or not we are moving an fcore to an fcore
                                if ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0 && isFcore && isMovedToFcore) {
                                    _deltaFcores.addMovedFcore(delta.getResource().getFullPath(), delta.getMovedToPath());
                                    _movedFcores.put(delta.getResource().getFullPath(), delta.getMovedToPath());
                                    // Check whether or not we are moving a non fcore to an fcore
                                } else if ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0 && isFcore == false && isMovedToFcore) {
                                    _deltaFcores.addNewFcore(delta.getMovedToPath(), delta.getResource().getProject());
                                    _newFcores.add(delta.getMovedToPath());
                                    // Check whether or not we are deleting an fcore
                                } else if (isFcore) {
                                    _deltaFcores.addRemovedFcore(delta.getResource().getFullPath());
                                    _removedFcores.add(delta.getResource().getFullPath());
                                }
                            }

                        }

                    } catch (Throwable t) {
                        EGFPDEPlugin.getDefault().logError("FcoreResourceListener.resourceChanged(..) _ ", t); //$NON-NLS-1$
                    }

                    return true;

                }

                public ResourceFcoreDelta getFcoresDelta() {
                    return _deltaFcores;
                }

                public Map<IPath, IPath> getMovedFcores() {
                    return _movedFcores;
                }

                public List<IPath> getRemovedFcores() {
                    return _removedFcores;
                }

                public List<IPath> getNewFcores() {
                    return _newFcores;
                }

            }

            switch (eventType) {
                case IResourceChangeEvent.POST_CHANGE:
                    final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
                    event.getDelta().accept(visitor);
                    // Process added, moved and removed resources
                    if (visitor.getMovedFcores().isEmpty() == false || visitor.getRemovedFcores().isEmpty() == false || visitor.getNewFcores().isEmpty() == false) {
                        WorkspaceJob job = new FcoreSynchJob(visitor.getFcoresDelta().getAffectedProjects(), visitor.getMovedFcores(), visitor.getRemovedFcores(), visitor.getNewFcores());
                        job.setUser(false);
                        job.setSystem(true);
                        job.schedule();
                    }
                    // Broadcast events if any
                    if (visitor.getFcoresDelta().isEmpty() == false) {
                        // Debug
                        if (EGFPDEPlugin.getDefault().isDebugging()) {
                            trace(visitor.getFcoresDelta());
                        }
                        // Notify all interested listeners in the changes made to models
                        fireResourceFcore(visitor.getFcoresDelta());
                    }
            }

        } catch (CoreException ce) {
            EGFPDEPlugin.getDefault().logError("FcoreResourceListener.resourceChanged(..) _", ce); //$NON-NLS-1$
        }

    }

    public void dispose() {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        _listeners = null;
    }

    private void trace(IResourceFcoreDelta delta) {
        if (delta.getNewFcores().size() > 0) {
            EGFPDEPlugin.getDefault().logInfo(NLS.bind("FcoreResourceListener Added {0} Fcore{1}.", //$NON-NLS-1$ 
                    delta.getNewFcores().size(), delta.getNewFcores().size() < 2 ? "" : "s" //$NON-NLS-1$  //$NON-NLS-2$
            ));
            for (URI uri : delta.getNewFcores()) {
                EGFPDEPlugin.getDefault().logInfo(URIHelper.toString(uri), 1);
            }
        }
        if (delta.getRemovedFcores().size() > 0) {
            EGFPDEPlugin.getDefault().logInfo(NLS.bind("FcoreResourceListener Removed {0} Fcore{1}.", //$NON-NLS-1$ 
                    delta.getRemovedFcores().size(), delta.getRemovedFcores().size() < 2 ? "" : "s" //$NON-NLS-1$  //$NON-NLS-2$
            ));
            for (URI uri : delta.getRemovedFcores()) {
                EGFPDEPlugin.getDefault().logInfo(URIHelper.toString(uri), 1);
            }
        }
        if (delta.getUpdatedFcores().size() > 0) {
            EGFPDEPlugin.getDefault().logInfo(NLS.bind("FcoreResourceListener Updated {0} Fcore{1}.", //$NON-NLS-1$ 
                    delta.getUpdatedFcores().size(), delta.getUpdatedFcores().size() < 2 ? "" : "s" //$NON-NLS-1$  //$NON-NLS-2$
            ));
            for (URI uri : delta.getUpdatedFcores()) {
                EGFPDEPlugin.getDefault().logInfo(URIHelper.toString(uri), 1);
            }
        }
        if (delta.getMovedFcores().size() > 0) {
            EGFPDEPlugin.getDefault().logInfo(NLS.bind("FcoreResourceListener Moved {0} Fcore{1}.", //$NON-NLS-1$ 
                    delta.getMovedFcores().size(), delta.getMovedFcores().size() < 2 ? "" : "s" //$NON-NLS-1$  //$NON-NLS-2$
            ));
            for (URI uri : delta.getMovedFcores().keySet()) {
                EGFPDEPlugin.getDefault().logInfo(URIHelper.toString(uri), 1);
                EGFPDEPlugin.getDefault().logInfo("To: " + URIHelper.toString(delta.getMovedFcores().get(uri)), 2); //$NON-NLS-1$
            }
        }
    }

    private static class FcoreSynchJob extends WorkspaceJob {

        private Map<IPath, IPath> _movedFcores;

        private List<IPath> _newFcores;

        private List<IPath> _removedFcores;

        /**
         * Initializes me with the list of resources changes that I am to
         * process.
         * 
         * @param affectedProjects
         *            the projects affected by the workspace changes
         */
        FcoreSynchJob(List<IProject> affectedProjects, Map<IPath, IPath> movedFcores, List<IPath> removedFcores, List<IPath> newFcores) {
            super(EGFPDEMessages.PluginModelUpdate_progressMessage);
            _movedFcores = movedFcores;
            _removedFcores = removedFcores;
            _newFcores = newFcores;
            setRule(ProjectHelper.getRule(affectedProjects));
        }

        @Override
        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
            try {
                SubMonitor subMonitor = SubMonitor.convert(monitor, EGFPDEMessages.PluginModelUpdate_progressMessage, (_movedFcores.size() + _removedFcores.size() + _newFcores.size()) * 1000);
                // Moved Fcores
                for (IPath path : _movedFcores.keySet()) {
                    // Ignore non Bundle project
                    if (BundleHelper.getPluginModelBase(path) != null) {
                        // Delete command
                        IPluginChangesCommand unsetCommand = EGFPDEPlugin.getFcoreExtensionHelper().unsetFcoreExtension(path);
                        unsetCommand.execute(subMonitor.newChild(1000, SubMonitor.SUPPRESS_NONE));
                        if (monitor.isCanceled()) {
                            throw new InterruptedException();
                        }
                    }
                    // Ignore non Bundle project
                    if (BundleHelper.getPluginModelBase(_movedFcores.get(path)) != null) {
                        // Create command
                        IPluginChangesCommand createCommand = EGFPDEPlugin.getFcoreExtensionHelper().setFcoreExtension(_movedFcores.get(path));
                        createCommand.execute(subMonitor.newChild(1000, SubMonitor.SUPPRESS_NONE));
                        if (monitor.isCanceled()) {
                            throw new InterruptedException();
                        }
                    }
                }
                // Removed Fcores
                for (IPath path : _removedFcores) {
                    // Ignore non Bundle project
                    if (BundleHelper.getPluginModelBase(path) != null) {
                        // Delete command
                        IPluginChangesCommand unsetCommand = EGFPDEPlugin.getFcoreExtensionHelper().unsetFcoreExtension(path);
                        unsetCommand.execute(subMonitor.newChild(1000, SubMonitor.SUPPRESS_NONE));
                        if (monitor.isCanceled()) {
                            throw new InterruptedException();
                        }
                    }
                }
                // Added Fcores
                for (IPath path : _newFcores) {
                    // Ignore non Bundle project
                    if (BundleHelper.getPluginModelBase(path) != null) {
                        // Create command
                        IPluginChangesCommand createCommand = EGFPDEPlugin.getFcoreExtensionHelper().setFcoreExtension(path);
                        createCommand.execute(subMonitor.newChild(1000, SubMonitor.SUPPRESS_NONE));
                        if (monitor.isCanceled()) {
                            throw new InterruptedException();
                        }
                    }
                }
            } catch (InterruptedException e) {
                return Status.CANCEL_STATUS;
            } finally {
                monitor.done();
            }
            return Status.OK_STATUS;
        }

    }

}
