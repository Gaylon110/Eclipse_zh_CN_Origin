/*******************************************************************************
 * Copyright (c) 2007, 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Manumitting Technologies Inc - bug 324310
 *******************************************************************************/
package org.eclipse.pde.api.tools.internal.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.internal.launching.environments.EnvironmentsManager;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallChangedListener;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.PropertyChangeEvent;
import org.eclipse.jdt.launching.VMStandin;
import org.eclipse.jdt.launching.environments.ExecutionEnvironmentDescription;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.ExportPackageDescription;
import org.eclipse.osgi.service.resolver.HostSpecification;
import org.eclipse.osgi.service.resolver.ResolverError;
import org.eclipse.osgi.service.resolver.State;
import org.eclipse.osgi.service.resolver.StateHelper;
import org.eclipse.osgi.service.resolver.StateObjectFactory;
import org.eclipse.pde.api.tools.internal.AnyValue;
import org.eclipse.pde.api.tools.internal.ApiBaselineManager;
import org.eclipse.pde.api.tools.internal.CoreMessages;
import org.eclipse.pde.api.tools.internal.provisional.ApiPlugin;
import org.eclipse.pde.api.tools.internal.provisional.model.IApiBaseline;
import org.eclipse.pde.api.tools.internal.provisional.model.IApiComponent;
import org.eclipse.pde.api.tools.internal.provisional.model.IApiElement;
import org.eclipse.pde.api.tools.internal.util.Util;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.osgi.framework.Version;

import com.ibm.icu.text.MessageFormat;

/**
 * Implementation of an {@link IApiBaseline}
 *
 * @since 1.0
 */
public class ApiBaseline extends ApiElement implements IApiBaseline, IVMInstallChangedListener {

	/**
	 * Empty array of component
	 */
	private static final IApiComponent[] EMPTY_COMPONENTS = new IApiComponent[0];

	/**
	 * OSGi bundle state
	 */
	private State fState;

	/**
	 * Execution environment identifier
	 */
	private String fExecutionEnvironment;

	/**
	 * Component representing the system library
	 */
	private IApiComponent fSystemLibraryComponent;

	/**
	 * Whether an execution environment should be automatically resolved as API
	 * components are added.
	 */
	private boolean fAutoResolve = false;

	/**
	 * Contains the location of the baseline if the baseline was created with a
	 * location.
	 */
	private String fLocation;
	/**
	 * Execution environment status
	 */
	private IStatus fEEStatus = null;

	/**
	 * Constant to match any value for ws, os, arch.
	 */
	private AnyValue ANY_VALUE = new AnyValue("*"); //$NON-NLS-1$

	/**
	 * Cache of resolved packages.
	 * <p>
	 * Map of <code>PackageName -> Map(componentName -> IApiComponent[])</code>
	 * </p>
	 * For each package the cache contains a map of API components that provide
	 * that package, by source component name (including the <code>null</code>
	 * component name).
	 */
	private HashMap<String, HashMap<IApiComponent, IApiComponent[]>> fComponentsProvidingPackageCache = null;

	/**
	 * Maps component id's to components.
	 * <p>
	 * Map of <code>componentId -> {@link IApiComponent}</code>
	 * </p>
	 */
	private HashMap<String, IApiComponent> fComponentsById = null;
	/**
	 * Maps component id's to all components sorted from higher to lower version.
	 */
	private HashMap<String, Set<IApiComponent>> fAllComponentsById = null;
	/**
	 * Maps project name's to components.
	 * <p>
	 * Map of <code>project name -> {@link IApiComponent}</code>
	 * </p>
	 */
	private HashMap<String, IApiComponent> fComponentsByProjectNames = null;
	/**
	 * Cache of system package names
	 */
	private HashSet<String> fSystemPackageNames = null;

	/**
	 * The VM install this baseline is bound to for system libraries or
	 * <code>null</code>. Only used in the IDE when OSGi is running.
	 */
	private IVMInstall fVMBinding = null;


	/**
	 * Constructs a new API baseline with the given name.
	 *
	 * @param name baseline name
	 */
	public ApiBaseline(String name) {
		super(null, IApiElement.BASELINE, name);
		fAutoResolve = true;
		fEEStatus = new Status(IStatus.ERROR, ApiPlugin.PLUGIN_ID, CoreMessages.ApiBaseline_0);
	}

	/**
	 * Constructs a new API baseline with the given attributes.
	 *
	 * @param name baseline name
	 * @param eeDescription execution environment description file
	 * @throws CoreException if unable to create a baseline with the given
	 *             attributes
	 */
	public ApiBaseline(String name, File eeDescription) throws CoreException {
		this(name, eeDescription, null);
	}

	/**
	 * Constructs a new API baseline with the given attributes.
	 *
	 * @param name baseline name
	 * @param eeDescription execution environment description file
	 * @param location the given baseline location
	 * @throws CoreException if unable to create a baseline with the given
	 *             attributes
	 */
	public ApiBaseline(String name, File eeDescription, String location) throws CoreException {
		this(name);
		if (eeDescription != null) {
			fAutoResolve = false;
			ExecutionEnvironmentDescription ee = new ExecutionEnvironmentDescription(eeDescription);
			String profile = ee.getProperty(ExecutionEnvironmentDescription.CLASS_LIB_LEVEL);
			initialize(ee);
			fEEStatus = new Status(IStatus.OK, ApiPlugin.PLUGIN_ID, MessageFormat.format(CoreMessages.ApiBaseline_1, profile));
		}
		this.fLocation = location;
	}

	/**
	 * Initializes this baseline to resolve in the execution environment
	 * associated with the given description.
	 *
	 * @param ee execution environment description
	 * @throws CoreException if unable to initialize based on the given id
	 */
	private void initialize(ExecutionEnvironmentDescription ee) throws CoreException {
		Properties properties = null;
		String environmentId = ee.getProperty(ExecutionEnvironmentDescription.CLASS_LIB_LEVEL);
		if (ApiPlugin.isRunningInFramework()) {
			properties = getJavaProfileProperties(environmentId);
			if (properties == null) {
				//Java10 onwards, we take profile via this method
				IExecutionEnvironment ev = EnvironmentsManager.getDefault().getEnvironment(environmentId);
				properties = ev.getProfileProperties();

			}
		} else {
			properties = Util.getEEProfile(environmentId);
		}
		if (properties == null) {
			abort("Unknown execution environment: " + environmentId, null); //$NON-NLS-1$
		} else {
			initialize(properties, ee);
		}
	}

	/**
	 * Returns the property file for the given environment or <code>null</code>.
	 *
	 * @param ee execution environment symbolic name
	 * @return properties file or <code>null</code> if none
	 */
	public static Properties getJavaProfileProperties(String ee) {
		Bundle osgiBundle = Platform.getBundle("org.eclipse.osgi"); //$NON-NLS-1$
		if (osgiBundle == null) {
			return null;
		}
		URL profileURL = osgiBundle.getEntry(ee.replace('/', '_') + ".profile"); //$NON-NLS-1$
		if (profileURL != null) {
			InputStream is = null;
			try {
				profileURL = FileLocator.resolve(profileURL);
				URLConnection openConnection = profileURL.openConnection();
				openConnection.setUseCaches(false);
				is = openConnection.getInputStream();
				if (is != null) {
					Properties profile = new Properties();
					profile.load(is);
					return profile;
				}
			} catch (IOException e) {
				ApiPlugin.log(e);
			} finally {
				try {
					if (is != null) {
						is.close();
					}
				} catch (IOException e) {
					ApiPlugin.log(e);
				}
			}
		}
		return null;
	}

	/**
	 * Initializes this baseline from the given properties.
	 *
	 * @param profile OGSi profile properties
	 * @param description execution environment description
	 * @throws CoreException if unable to initialize
	 */
	private void initialize(Properties profile, ExecutionEnvironmentDescription description) throws CoreException {
		String value = profile.getProperty(Constants.FRAMEWORK_SYSTEMPACKAGES);
		if(value== null) {
			// If the profile is JavaSE-10, hard-coding the VM packages for now.
			String id = description.getProperty(ExecutionEnvironmentDescription.CLASS_LIB_LEVEL);
			if ("JavaSE-10".equalsIgnoreCase(id)) { //$NON-NLS-1$
				// calculated via
				// org.eclipse.osgi.storage.Storage.calculateVMPackages
				value = "com.oracle.awt,com.oracle.net,com.oracle.nio,com.oracle.tools.packager,com.sun.jarsigner,com.sun.java.accessibility.util,com.sun.javadoc,com.sun.javafx.tools.packager,com.sun.javafx.tools.packager.bundlers,com.sun.javafx.tools.resource,com.sun.jdi,com.sun.jdi.connect,com.sun.jdi.connect.spi,com.sun.jdi.event,com.sun.jdi.request,com.sun.management,com.sun.net.httpserver,com.sun.net.httpserver.spi,com.sun.nio.file,com.sun.nio.sctp,com.sun.security.auth,com.sun.security.auth.callback,com.sun.security.auth.login,com.sun.security.auth.module,com.sun.security.jgss,com.sun.source.doctree,com.sun.source.tree,com.sun.source.util,com.sun.tools.attach,com.sun.tools.attach.spi,com.sun.tools.javac,com.sun.tools.javadoc,com.sun.tools.jconsole,javafx.animation,javafx.application,javafx.beans,javafx.beans.binding,javafx.beans.property,javafx.beans.property.adapter,javafx.beans.value,javafx.collections,javafx.collections.transformation,javafx.concurrent,javafx.css,javafx.css.converter,javafx.embed.swing,javafx.event,javafx.fxml,javafx.geometry,javafx.print,javafx.scene,javafx.scene.canvas,javafx.scene.chart,javafx.scene.control,javafx.scene.control.cell,javafx.scene.control.skin,javafx.scene.effect,javafx.scene.image,javafx.scene.input,javafx.scene.layout,javafx.scene.media,javafx.scene.paint,javafx.scene.shape,javafx.scene.text,javafx.scene.transform,javafx.scene.web,javafx.stage,javafx.util,javafx.util.converter,javax.accessibility,javax.activation,javax.activity,javax.annotation,javax.annotation.processing,javax.crypto,javax.crypto.interfaces,javax.crypto.spec,javax.imageio,javax.imageio.event,javax.imageio.metadata,javax.imageio.plugins.bmp,javax.imageio.plugins.jpeg,javax.imageio.plugins.tiff,javax.imageio.spi,javax.imageio.stream,javax.jnlp,javax.jws,javax.jws.soap,javax.lang.model,javax.lang.model.element,javax.lang.model.type,javax.lang.model.util,javax.management,javax.management.loading,javax.management.modelmbean,javax.management.monitor,javax.management.openmbean,javax.management.relation,javax.management.remote,javax.management.remote.rmi,javax.management.timer,javax.naming,javax.naming.directory,javax.naming.event,javax.naming.ldap,javax.naming.spi,javax.net,javax.net.ssl,javax.print,javax.print.attribute,javax.print.attribute.standard,javax.print.event,javax.rmi,javax.rmi.CORBA,javax.rmi.ssl,javax.script,javax.security.auth,javax.security.auth.callback,javax.security.auth.kerberos,javax.security.auth.login,javax.security.auth.spi,javax.security.auth.x500,javax.security.cert,javax.security.sasl,javax.smartcardio,javax.sound.midi,javax.sound.midi.spi,javax.sound.sampled,javax.sound.sampled.spi,javax.sql,javax.sql.rowset,javax.sql.rowset.serial,javax.sql.rowset.spi,javax.swing,javax.swing.border,javax.swing.colorchooser,javax.swing.event,javax.swing.filechooser,javax.swing.plaf,javax.swing.plaf.basic,javax.swing.plaf.metal,javax.swing.plaf.multi,javax.swing.plaf.nimbus,javax.swing.plaf.synth,javax.swing.table,javax.swing.text,javax.swing.text.html,javax.swing.text.html.parser,javax.swing.text.rtf,javax.swing.tree,javax.swing.undo,javax.tools,javax.transaction,javax.transaction.xa,javax.xml,javax.xml.bind,javax.xml.bind.annotation,javax.xml.bind.annotation.adapters,javax.xml.bind.attachment,javax.xml.bind.helpers,javax.xml.bind.util,javax.xml.catalog,javax.xml.crypto,javax.xml.crypto.dom,javax.xml.crypto.dsig,javax.xml.crypto.dsig.dom,javax.xml.crypto.dsig.keyinfo,javax.xml.crypto.dsig.spec,javax.xml.datatype,javax.xml.namespace,javax.xml.parsers,javax.xml.soap,javax.xml.stream,javax.xml.stream.events,javax.xml.stream.util,javax.xml.transform,javax.xml.transform.dom,javax.xml.transform.sax,javax.xml.transform.stax,javax.xml.transform.stream,javax.xml.validation,javax.xml.ws,javax.xml.ws.handler,javax.xml.ws.handler.soap,javax.xml.ws.http,javax.xml.ws.soap,javax.xml.ws.spi,javax.xml.ws.spi.http,javax.xml.ws.wsaddressing,javax.xml.xpath,jdk.dynalink,jdk.dynalink.beans,jdk.dynalink.linker,jdk.dynalink.linker.support,jdk.dynalink.support,jdk.incubator.http,jdk.javadoc.doclet,jdk.jfr,jdk.jfr.consumer,jdk.jshell,jdk.jshell.execution,jdk.jshell.spi,jdk.jshell.tool,jdk.management.cmm,jdk.management.jfr,jdk.management.resource,jdk.nashorn.api.scripting,jdk.nashorn.api.tree,jdk.net,jdk.packager.services,jdk.packager.services.singleton,jdk.security.jarsigner,netscape.javascript,org.ietf.jgss,org.omg.CORBA,org.omg.CORBA.DynAnyPackage,org.omg.CORBA.ORBPackage,org.omg.CORBA.TypeCodePackage,org.omg.CORBA.portable,org.omg.CORBA_2_3,org.omg.CORBA_2_3.portable,org.omg.CosNaming,org.omg.CosNaming.NamingContextExtPackage,org.omg.CosNaming.NamingContextPackage,org.omg.Dynamic,org.omg.DynamicAny,org.omg.DynamicAny.DynAnyFactoryPackage,org.omg.DynamicAny.DynAnyPackage,org.omg.IOP,org.omg.IOP.CodecFactoryPackage,org.omg.IOP.CodecPackage,org.omg.Messaging,org.omg.PortableInterceptor,org.omg.PortableInterceptor.ORBInitInfoPackage,org.omg.PortableServer,org.omg.PortableServer.CurrentPackage,org.omg.PortableServer.POAManagerPackage,org.omg.PortableServer.POAPackage,org.omg.PortableServer.ServantLocatorPackage,org.omg.PortableServer.portable,org.omg.SendingContext,org.omg.stub.java.rmi,org.w3c.dom,org.w3c.dom.bootstrap,org.w3c.dom.css,org.w3c.dom.events,org.w3c.dom.html,org.w3c.dom.ls,org.w3c.dom.ranges,org.w3c.dom.stylesheets,org.w3c.dom.traversal,org.w3c.dom.views,org.w3c.dom.xpath,org.xml.sax,org.xml.sax.ext,org.xml.sax.helpers,sun.misc,sun.reflect"; //$NON-NLS-1$
			}
		}
		String[] systemPackages = null;
		if (value != null) {
			systemPackages = value.split(","); //$NON-NLS-1$
		}
		if (!(this instanceof WorkspaceBaseline)) {
			Dictionary<String, Object> dictionary = new Hashtable<>();
			dictionary.put(Constants.FRAMEWORK_SYSTEMPACKAGES, value);
			value = profile.getProperty(Constants.FRAMEWORK_EXECUTIONENVIRONMENT);
			if (value != null) {
				dictionary.put(Constants.FRAMEWORK_EXECUTIONENVIRONMENT, value);
			}
			fExecutionEnvironment = profile.getProperty("osgi.java.profile.name"); //$NON-NLS-1$
			if (fExecutionEnvironment == null) {
				// Java 10 onwards, profile id is same as class lib level.
				String id = description.getProperty(ExecutionEnvironmentDescription.CLASS_LIB_LEVEL);
				fExecutionEnvironment = id;
				if (fExecutionEnvironment == null) {
					abort("Profile file missing 'osgi.java.profile.name'", null); //$NON-NLS-1$
				}
			}
			dictionary.put("osgi.os", ANY_VALUE); //$NON-NLS-1$
			dictionary.put("osgi.arch", ANY_VALUE); //$NON-NLS-1$
			dictionary.put("osgi.ws", ANY_VALUE); //$NON-NLS-1$
			dictionary.put("osgi.nl", ANY_VALUE); //$NON-NLS-1$

			getState().setPlatformProperties(dictionary);
		}
		// clean up previous system library
		if (fSystemLibraryComponent != null && fComponentsById != null) {
			fComponentsById.remove(fSystemLibraryComponent.getSymbolicName());
		}
		if (fSystemPackageNames != null) {
			fSystemPackageNames.clear();
			fSystemPackageNames = null;
		}
		clearComponentsCache();
		// set new system library
		fSystemLibraryComponent = new SystemLibraryApiComponent(this, description, systemPackages);
		addComponent(fSystemLibraryComponent);
	}


	/**
	 * Clears the package -> components cache and sets it to <code>null</code>
	 */
	private synchronized void clearComponentsCache() {
		if (fComponentsProvidingPackageCache != null) {
			fComponentsProvidingPackageCache.clear();
			fComponentsProvidingPackageCache = null;
		}
	}

	/**
	 * Adds an {@link IApiComponent} to the fComponentsById mapping
	 *
	 * @param component
	 */
	protected void addComponent(IApiComponent component) {
		if (component == null) {
			return;
		}
		if (fComponentsById == null) {
			fComponentsById = new HashMap<>();
		}
		if (fAllComponentsById == null) {
			fAllComponentsById = new HashMap<>();
		}

		IApiComponent comp = fComponentsById.get(component.getSymbolicName());

		// if more than 1 components, store all of them
		if (comp != null) {
			if (fAllComponentsById.containsKey(component.getSymbolicName())) {
				Set<IApiComponent> allComponents = fAllComponentsById.get(component.getSymbolicName());
				if (!allComponents.contains(component)) {
					allComponents.add(component);
				}
			} else {
				TreeSet<IApiComponent> allComponents = new TreeSet<>(new Comparator<IApiComponent>() {
					@Override
					public int compare(IApiComponent comp1, IApiComponent comp2) {
						return new Version(comp2.getVersion()).compareTo(new Version(comp1.getVersion()));
			        	}
				});
				allComponents.add(comp);
				allComponents.add(component);
				fAllComponentsById.put(component.getSymbolicName(), allComponents);
			}
		}

		fComponentsById.put(component.getSymbolicName(), component);
		if (component instanceof ProjectComponent) {
			ProjectComponent projectApiComponent = (ProjectComponent) component;
			if (this.fComponentsByProjectNames == null) {
				this.fComponentsByProjectNames = new HashMap<>();
			}
			this.fComponentsByProjectNames.put(projectApiComponent.getJavaProject().getProject().getName(), component);
		}
	}

	@Override
	public void addApiComponents(IApiComponent[] components) throws CoreException {
		HashSet<String> ees = new HashSet<>();
		for (IApiComponent apiComponent : components) {
			BundleComponent component = (BundleComponent) apiComponent;
			if (component.isSourceComponent()) {
				continue;
			}
			BundleDescription description = component.getBundleDescription();
			getState().addBundle(description);
			addComponent(component);
			ees.addAll(Arrays.asList(component.getExecutionEnvironments()));
		}
		resolveSystemLibrary(ees);
		getState().resolve();
	}

	/**
	 * Resolves and initializes the system library to use based on API component
	 * requirements. Only works when running in the framework. Has no effect if
	 * not running in the framework.
	 */
	protected void resolveSystemLibrary(HashSet<String> ees) {
		if (ApiPlugin.isRunningInFramework() && fAutoResolve) {
			IStatus error = null;
			IExecutionEnvironmentsManager manager = JavaRuntime.getExecutionEnvironmentsManager();
			Map<IVMInstall, Set<String>> VMsToEEs = new HashMap<>();
			for (String ee : ees) {
				IExecutionEnvironment environment = manager.getEnvironment(ee);
				if (environment != null) {
					IVMInstall[] compatibleVMs = environment.getCompatibleVMs();
					for (IVMInstall vm : compatibleVMs) {
						Set<String> EEs = VMsToEEs.get(vm);
						if (EEs == null) {
							EEs = new HashSet<>();
							VMsToEEs.put(vm, EEs);
						}
						EEs.add(ee);
					}
				}
			}
			// select VM that is compatible with most required environments
			IVMInstall bestFit = null;
			int bestCount = 0;
			for (Entry<IVMInstall, Set<String>> entry : VMsToEEs.entrySet()) {
				Set<String> EEs = entry.getValue();
				if (EEs.size() > bestCount) {
					bestCount = EEs.size();
					bestFit = entry.getKey();
				}
			}
			String systemEE = null;
			if (bestFit != null) {
				// find the EE this VM is strictly compatible with
				IExecutionEnvironment[] environments = manager.getExecutionEnvironments();
				for (IExecutionEnvironment environment : environments) {
					if (environment.isStrictlyCompatible(bestFit)) {
						systemEE = environment.getId();
						break;
					}
				}
				if (systemEE == null) {
					// https://bugs.eclipse.org/bugs/show_bug.cgi?id=383261
					// we don't need to compute anything here, in all cases if
					// we fail to find a compatible EE, fall back to highest
					// known.
					// TODO this should be updated for each new EE that gets
					// added
					systemEE = "JavaSE-1.7"; //$NON-NLS-1$
				}
				// only update if different from current or missing VM binding
				if (!systemEE.equals(getExecutionEnvironment()) || fVMBinding == null) {
					try {
						File file = Util.createEEFile(bestFit, systemEE);
						JavaRuntime.addVMInstallChangedListener(this);
						fVMBinding = bestFit;
						ExecutionEnvironmentDescription ee = new ExecutionEnvironmentDescription(file);
						initialize(ee);
					} catch (CoreException e) {
						error = new Status(IStatus.ERROR, ApiPlugin.PLUGIN_ID, CoreMessages.ApiBaseline_2, e);
					} catch (IOException e) {
						error = new Status(IStatus.ERROR, ApiPlugin.PLUGIN_ID, CoreMessages.ApiBaseline_2, e);
					}
				}
			} else {
				// no VMs match any required EE
				error = new Status(IStatus.ERROR, ApiPlugin.PLUGIN_ID, CoreMessages.ApiBaseline_6);
			}
			if (error == null) {
				// build status for unbound required EE's
				Set<String> missing = new HashSet<>(ees);
				Set<String> covered = new HashSet<>(VMsToEEs.get(bestFit));
				missing.removeAll(covered);
				if (missing.isEmpty()) {
					fEEStatus = new Status(IStatus.OK, ApiPlugin.PLUGIN_ID, MessageFormat.format(CoreMessages.ApiBaseline_1, systemEE));
				} else {
					MultiStatus multi = new MultiStatus(ApiPlugin.PLUGIN_ID, 0, CoreMessages.ApiBaseline_4, null);
					for (String id : missing) {
						multi.add(new Status(IStatus.WARNING, ApiPlugin.PLUGIN_ID, MessageFormat.format(CoreMessages.ApiBaseline_5, id)));
					}
					fEEStatus = multi;
				}
			} else {
				fEEStatus = error;
			}
		}
	}

	/**
	 * Returns true if the {@link IApiBaseline} has its information loaded
	 * (components) false otherwise. This is a handle only method that will not
	 * load information from disk.
	 *
	 * @return true if the {@link IApiBaseline} has its information loaded
	 *         (components) false otherwise.
	 */
	public boolean peekInfos() {
		return fComponentsById != null;
	}

	@Override
	public IApiComponent[] getApiComponents() {
		loadBaselineInfos();
		if (fComponentsById == null) {
			return EMPTY_COMPONENTS;
		}
		Collection<IApiComponent> values = fComponentsById.values();
		return values.toArray(new IApiComponent[values.size()]);
	}

	@Override
	public synchronized IApiComponent[] resolvePackage(IApiComponent sourceComponent, String packageName) throws CoreException {
		HashMap<IApiComponent, IApiComponent[]> componentsForPackage = null;
		if (fComponentsProvidingPackageCache != null) {
			componentsForPackage = fComponentsProvidingPackageCache.get(packageName);
		} else {
			fComponentsProvidingPackageCache = new HashMap<>(8);
		}
		IApiComponent[] cachedComponents = null;
		if (componentsForPackage != null) {
			cachedComponents = componentsForPackage.get(sourceComponent);
			if (cachedComponents != null && cachedComponents.length > 0) {
				return cachedComponents;
			}
		} else {
			componentsForPackage = new HashMap<>(8);
			fComponentsProvidingPackageCache.put(packageName, componentsForPackage);
		}

		// check resolvePackage0 before the system packages to avoid wrong
		// add/remove API problems - see bug 430640
		if (sourceComponent != null) {
			ArrayList<IApiComponent> componentsList = new ArrayList<>();
			resolvePackage0(sourceComponent, packageName, componentsList);
			if (componentsList.size() != 0) {
				cachedComponents = new IApiComponent[componentsList.size()];
				componentsList.toArray(cachedComponents);
			}
		}
		if (isSystemPackage(packageName)) {
			if (fSystemLibraryComponent != null) {
				if (cachedComponents == null) {
					cachedComponents = new IApiComponent[] {
							fSystemLibraryComponent };
				} else {
					IApiComponent[] cachedComponents2 = new IApiComponent[cachedComponents.length + 1];
					System.arraycopy(cachedComponents, 0, cachedComponents2, 0, cachedComponents.length);
					cachedComponents2[cachedComponents.length] = fSystemLibraryComponent;
					cachedComponents = cachedComponents2;
				}
			}
		}

		if (cachedComponents == null) {
			cachedComponents = EMPTY_COMPONENTS;
		}
		if (cachedComponents.length == 0) {
			return EMPTY_COMPONENTS;
		}
		componentsForPackage.put(sourceComponent, cachedComponents);
		return cachedComponents;
	}

	/**
	 * Resolves the listing of {@link IApiComponent}s that export the given
	 * package name. The collection of {@link IApiComponent}s is written into
	 * the specified list <code>componentList</code>
	 *
	 * @param component
	 * @param packageName
	 * @param componentsList
	 * @throws CoreException
	 */
	private void resolvePackage0(IApiComponent component, String packageName, List<IApiComponent> componentsList) throws CoreException {
		if (component instanceof BundleComponent) {
			BundleDescription bundle = ((BundleComponent) component).getBundleDescription();
			if (bundle != null) {
				StateHelper helper = getState().getStateHelper();
				ExportPackageDescription[] visiblePackages = helper.getVisiblePackages(bundle);
				for (ExportPackageDescription pkg : visiblePackages) {
					String pkgName = pkg.getName();
					if (pkgName.equals(".")) { //$NON-NLS-1$
						// translate . to default package
						pkgName = Util.DEFAULT_PACKAGE_NAME;
					}
					if (packageName.equals(pkgName)) {
						BundleDescription bundleDescription = pkg.getExporter();
						IApiComponent exporter = getApiComponent(bundleDescription.getSymbolicName());
						if (exporter != null) {
							componentsList.add(exporter);
						}
					}
				}
				if (component.isFragment()) {
					// a fragment can see all the packages from the host
					HostSpecification host = bundle.getHost();
					BundleDescription[] hosts = host.getHosts();
					for (BundleDescription currentHost : hosts) {
						IApiComponent apiComponent = component.getBaseline().getApiComponent(currentHost.getName());
						if (apiComponent != null) {
							resolvePackage0(apiComponent, packageName, componentsList);
						}
					}
				}
				// check for package within the source component
				String[] packageNames = component.getPackageNames();
				int index = Arrays.binarySearch(packageNames, packageName, null);
				if (index >= 0) {
					componentsList.add(component);
				}
			}
		}
	}

	/**
	 * Returns all of the visible dependent components from the current state
	 *
	 * @param components
	 * @return the listing of visible dependent components to the given ones
	 * @throws CoreException
	 */
	public IApiComponent[] getVisibleDependentComponents(IApiComponent[] components) throws CoreException {
		ArrayList<BundleDescription> bundles = getBundleDescriptions(components);
		BundleDescription[] descs = getState().getStateHelper().getDependentBundles(bundles.toArray(new BundleDescription[bundles.size()]));
		HashSet<BundleDescription> visible = new HashSet<>();
		ExportPackageDescription[] packages = null;
		for (BundleDescription desc : descs) {
			packages = getState().getStateHelper().getVisiblePackages(desc);
			for (ExportPackageDescription package1 : packages) {
				if (bundles.contains(package1.getSupplier())) {
					visible.add(desc);
				}
			}
		}
		return getApiComponents(visible.toArray(new BundleDescription[visible.size()]));
	}

	/**
	 * Returns whether the specified package is supplied by the system library.
	 *
	 * @param packageName package name
	 * @return whether the specified package is supplied by the system library
	 */
	private boolean isSystemPackage(String packageName) {
		if (packageName.startsWith("java.")) { //$NON-NLS-1$
			return true;
		}
		if (fSystemPackageNames == null) {
			ExportPackageDescription[] systemPackages = getState().getSystemPackages();
			fSystemPackageNames = new HashSet<>(systemPackages.length);
			for (ExportPackageDescription systemPackage : systemPackages) {
				fSystemPackageNames.add(systemPackage.getName());
			}
		}
		return fSystemPackageNames.contains(packageName);
	}

	/**
	 * @return the OSGi state for this {@link IApiBaseline}
	 * @nooverride This method is not intended to be re-implemented or extended
	 *             by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public State getState() {
		if (fState == null) {
			fState = StateObjectFactory.defaultFactory.createState(true);
		}
		return fState;
	}

	@Override
	public IApiComponent getApiComponent(String id) {
		loadBaselineInfos();
		if (fComponentsById == null) {
			return null;
		}
		return fComponentsById.get(id);
	}

	@Override
	public Set<IApiComponent> getAllApiComponents(String id) {
		loadBaselineInfos();
		if (fAllComponentsById == null) {
			return Collections.emptySet();
		}
		if (fAllComponentsById.get(id) == null) {
			return Collections.emptySet();
		}
		return fAllComponentsById.get(id);
	}

	@Override
	public String getExecutionEnvironment() {
		return fExecutionEnvironment;
	}

	/**
	 * Loads the information from the *.profile file the first time the baseline
	 * is accessed
	 */
	private void loadBaselineInfos() {
		if (fComponentsById != null) {
			return;
		}
		try {
			ApiBaselineManager.getManager().loadBaselineInfos(this);
		} catch (CoreException ce) {
			ApiPlugin.log(ce);
		}
	}

	/**
	 * Returns all errors in the state.
	 *
	 * @return state errors
	 * @nooverride This method is not intended to be re-implemented or extended
	 *             by clients.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public ResolverError[] getErrors() {
		List<ResolverError> errs = null;
		BundleDescription[] bundles = getState().getBundles();
		for (BundleDescription bundle : bundles) {
			ResolverError[] errors = getState().getResolverErrors(bundle);
			for (ResolverError error : errors) {
				if (errs == null) {
					errs = new ArrayList<>();
				}
				errs.add(error);
			}
		}
		if (errs != null) {
			return errs.toArray(new ResolverError[errs.size()]);
		}
		return null;
	}

	/**
	 * @see org.eclipse.pde.api.tools.internal.model.ApiElement#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		super.setName(name);
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IApiBaseline) {
			IApiBaseline baseline = (IApiBaseline) obj;
			return this.getName().equals(baseline.getName());
		}
		return super.equals(obj);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}

	@Override
	public void dispose() {
		if (fState == null) {
			// already disposed or nothing to dispose
			return;
		}
		doDispose();
		fState = null;
	}

	/**
	 * performs the actual dispose of mappings and cached elements
	 */
	protected void doDispose() {
		if (ApiPlugin.isRunningInFramework()) {
			JavaRuntime.removeVMInstallChangedListener(this);
		}
		clearCachedElements();
		IApiComponent[] components = getApiComponents();
		for (IApiComponent component2 : components) {
			component2.dispose();
		}
		clearComponentsCache();
		if (fComponentsById != null) {
			fComponentsById.clear();
			fComponentsById = null;
		}
		if (fAllComponentsById != null) {
			fAllComponentsById.clear();
			fAllComponentsById = null;
		}
		if (fComponentsByProjectNames != null) {
			fComponentsByProjectNames.clear();
			fComponentsByProjectNames = null;
		}
		if (fSystemPackageNames != null) {
			fSystemPackageNames.clear();
		}
		if (fSystemLibraryComponent != null) {
			fSystemLibraryComponent.dispose();
			fSystemLibraryComponent = null;
		}
	}

	/**
	 * @see org.eclipse.pde.api.tools.internal.provisional.model.IApiBaseline#close()
	 */
	@Override
	public void close() throws CoreException {
		clearCachedElements();
		IApiComponent[] components = getApiComponents();
		for (IApiComponent component2 : components) {
			component2.close();
		}
	}

	/**
	 * Clears all element information from the cache for this baseline
	 *
	 * @since 1.1
	 */
	void clearCachedElements() {
		ApiModelCache.getCache().removeElementInfo(this);
	}

	@Override
	public IApiComponent[] getDependentComponents(IApiComponent[] components) throws CoreException {
		ArrayList<BundleDescription> bundles = getBundleDescriptions(components);
		BundleDescription[] bundleDescriptions = getState().getStateHelper().getDependentBundles(bundles.toArray(new BundleDescription[bundles.size()]));
		return getApiComponents(bundleDescriptions);
	}

	/**
	 * Returns an array of API components corresponding to the given bundle
	 * descriptions.
	 *
	 * @param bundles bundle descriptions
	 * @return corresponding API components
	 */
	private IApiComponent[] getApiComponents(BundleDescription[] bundles) {
		ArrayList<IApiComponent> dependents = new ArrayList<>(bundles.length);
		for (BundleDescription bundle : bundles) {
			IApiComponent component = getApiComponent(bundle.getSymbolicName());
			if (component != null) {
				dependents.add(component);
			}
		}
		return dependents.toArray(new IApiComponent[dependents.size()]);
	}

	/**
	 * Returns an array of bundle descriptions corresponding to the given API
	 * components.
	 *
	 * @param components API components
	 * @return corresponding bundle descriptions
	 */
	private ArrayList<BundleDescription> getBundleDescriptions(IApiComponent[] components) throws CoreException {
		ArrayList<BundleDescription> bundles = new ArrayList<>(components.length);
		for (IApiComponent component : components) {
			if (component instanceof BundleComponent) {
				bundles.add(((BundleComponent) component).getBundleDescription());
			}
		}
		return bundles;
	}

	@Override
	public IApiComponent[] getPrerequisiteComponents(IApiComponent[] components) throws CoreException {
		ArrayList<BundleDescription> bundles = getBundleDescriptions(components);
		BundleDescription[] bundlesDescriptions = getState().getStateHelper().getPrerequisites(bundles.toArray(new BundleDescription[bundles.size()]));
		return getApiComponents(bundlesDescriptions);
	}

	/**
	 * Clear cached settings for the given package.
	 *
	 * @param packageName
	 * @noreference This method is not intended to be referenced by clients.
	 * @nooverride This method is not intended to be re-implemented or extended
	 *             by clients.
	 */
	public synchronized void clearPackage(String packageName) {
		if (fComponentsProvidingPackageCache != null) {
			fComponentsProvidingPackageCache.remove(packageName);
		}
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public IStatus getExecutionEnvironmentStatus() {
		return fEEStatus;
	}

	@Override
	public void defaultVMInstallChanged(IVMInstall previous, IVMInstall current) {
	}

	@Override
	public void vmAdded(IVMInstall vm) {
		if (!(vm instanceof VMStandin)) {
			// there may be a better fit for VMs/EEs
			try {
				rebindVM();
			} catch (CoreException e) {
				ApiPlugin.log(e);
			}
		}
	}

	@Override
	public void vmChanged(PropertyChangeEvent event) {
		if (!(event.getSource() instanceof VMStandin)) {
			String property = event.getProperty();
			if (IVMInstallChangedListener.PROPERTY_INSTALL_LOCATION.equals(property) || IVMInstallChangedListener.PROPERTY_LIBRARY_LOCATIONS.equals(property)) {
				try {
					rebindVM();
				} catch (CoreException e) {
					ApiPlugin.log(e);
				}
			}
		}
	}

	/**
	 * Re-binds the VM this baseline is bound to.
	 */
	private void rebindVM() throws CoreException {
		fVMBinding = null;
		IApiComponent[] components = getApiComponents();
		HashSet<String> ees = new HashSet<>();
		for (IApiComponent component2 : components) {
			ees.addAll(Arrays.asList(component2.getExecutionEnvironments()));
		}
		resolveSystemLibrary(ees);
	}

	@Override
	public void vmRemoved(IVMInstall vm) {
		if (vm.equals(fVMBinding)) {
			try {
				rebindVM();
			} catch (CoreException e) {
				ApiPlugin.log(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return this.fLocation;
	}

	@Override
	public void setLocation(String location) {
		this.fLocation = location;
	}

	@Override
	public IApiComponent getApiComponent(IProject project) {
		loadBaselineInfos();
		if (fComponentsByProjectNames == null) {
			return null;
		}
		return fComponentsByProjectNames.get(project.getName());
	}
}
