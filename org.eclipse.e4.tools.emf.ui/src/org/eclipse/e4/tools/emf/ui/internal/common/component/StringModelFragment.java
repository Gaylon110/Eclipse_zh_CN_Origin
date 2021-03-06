/*******************************************************************************
 * Copyright (c) 2010, 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 * Steven Spungin <steve@spungin.tv> - Ongoing Maintenance, Bug 439532, Bug 443945
 * Patrik Suzzi <psuzzi@gmail.com> - Bug 467262
 * Olivier Prouvost <olivier.prouvost@opcoach.com> - Bug 509488
 * Patrik Suzzi <psuzzi@gmail.com> - Bug 509606
 ******************************************************************************/
package org.eclipse.e4.tools.emf.ui.internal.common.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.emf.xpath.EcoreXPathContextFactory;
import org.eclipse.e4.emf.xpath.XPathContext;
import org.eclipse.e4.emf.xpath.XPathContextFactory;
import org.eclipse.e4.tools.emf.ui.common.IEditorFeature.FeatureClass;
import org.eclipse.e4.tools.emf.ui.common.Util;
import org.eclipse.e4.tools.emf.ui.common.Util.InternalPackage;
import org.eclipse.e4.tools.emf.ui.common.component.AbstractComponentEditor;
import org.eclipse.e4.tools.emf.ui.internal.ResourceProvider;
import org.eclipse.e4.tools.emf.ui.internal.common.E4PickList;
import org.eclipse.e4.tools.emf.ui.internal.common.component.ControlFactory.TextPasteHandler;
import org.eclipse.e4.tools.emf.ui.internal.common.component.dialogs.FeatureSelectionDialog;
import org.eclipse.e4.tools.emf.ui.internal.common.component.dialogs.FindParentReferenceElementDialog;
import org.eclipse.e4.tools.emf.ui.internal.common.component.tabs.empty.E;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.impl.ApplicationElementImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.fragment.MStringModelFragment;
import org.eclipse.e4.ui.model.fragment.impl.FragmentPackageImpl;
import org.eclipse.e4.ui.model.fragment.impl.StringModelFragmentImpl;
import org.eclipse.e4.ui.model.internal.ModelUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class StringModelFragment extends AbstractComponentEditor {
	private Composite composite;
	private EMFDataBindingContext context;

	// The selected Container is the class that match the ID.
	// It can be get from the FindParentReferenceDialog or computed from the ID.
	private EClass selectedContainer;

	private final IListProperty MODEL_FRAGMENT__ELEMENTS = EMFProperties
			.list(FragmentPackageImpl.Literals.MODEL_FRAGMENT__ELEMENTS);

	// This is the list of available 'add child' actions depending on selected
	// values
	private final List<Action> actions = new ArrayList<>();

	@Inject
	IEclipseContext eclipseContext;

	// The pickList to select the kind of children to add (must be refreshed)
	private E4PickList pickList;

	@Inject
	public StringModelFragment() {
		super();
	}

	@PostConstruct
	public void init() {
	}

	@Override
	public Image getImage(Object element) {
		return getImage(element, ResourceProvider.IMG_StringModelFragment);
	}

	@Override
	public String getLabel(Object element) {

		if (selectedContainer == null) {
			return Messages.StringModelFragment_Label;
		} else {
			return Messages.StringModelFragment_LabelFor + selectedContainer.getName();
		}
	}

	@Override
	public FeaturePath[] getLabelProperties() {
		return new FeaturePath[] {
				FeaturePath.fromList(FragmentPackageImpl.Literals.STRING_MODEL_FRAGMENT__FEATURENAME),
				FeaturePath.fromList(FragmentPackageImpl.Literals.STRING_MODEL_FRAGMENT__PARENT_ELEMENT_ID) };
	}

	@Override
	public String getDetailLabel(Object element) {
		if (element instanceof StringModelFragmentImpl) {
			final StringModelFragmentImpl fragment = (StringModelFragmentImpl) element;
			String ret = ""; //$NON-NLS-1$
			if (E.notEmpty(fragment.getFeaturename())) {
				ret += fragment.getFeaturename();
			}
			if (E.notEmpty(fragment.getParentElementId())) {
				ret += " (" + fragment.getParentElementId() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
			}
			return ret;
		}
		return null;
	}

	@Override
	public String getDescription(Object element) {
		return Messages.StringModelFragment_Description;
	}

	@Override
	public Composite doGetEditor(Composite parent, Object object) {
		if (composite == null) {
			context = new EMFDataBindingContext();
			composite = createForm(parent);
		}
		selectedContainer = null;
		getMaster().setValue(object);
		updateChildrenChoice();
		getEditor().setHeaderTitle(getLabel(null));
		return composite;
	}

	/**
	 * Returns the selectedContainer, which is the EClass behind the Extended
	 * Element ID. It can be known thanks to the dialog or must be computed from
	 * the ID value
	 *
	 * @return
	 */
	private EClass getSelectedContainer() {

		if (selectedContainer != null) {
			return selectedContainer;
		}

		// we get the StringModelFragment. If not initialized, no search...
		StringModelFragmentImpl modelFragment = getStringModelFragment();
		if (modelFragment == null) {
			return null;
		}

		// If no element ID, no search...
		String parentElementId = modelFragment.getParentElementId();
		if ((parentElementId == null) || (parentElementId.isEmpty())) {
			return null;
		}

		// known ID for application are directly filtered.
		if ("xpath:/".equals(parentElementId) || "org.eclipse.e4.legacy.ide.application".equals(parentElementId)) {
			selectedContainer = ApplicationPackageImpl.eINSTANCE.getApplication();
			return selectedContainer;
		}

		// We have to proceed to a simple search on all elements in all resource
		// set... this resource set is cached by Util...
		ResourceSet resourceSet = Util.getModelElementResources();

		String xpath = parentElementId.startsWith("xpath:") ? parentElementId.substring(6) : null;

		for (final Resource res : resourceSet.getResources()) {
			final TreeIterator<EObject> it = EcoreUtil.getAllContents(res, true);
			while (it.hasNext()) {
				final EObject o = it.next();
				// We found this element, if this is an application element not
				// contained in model fragment imports
				// and having the same ID. We return the first found.

				// Deal with non default MApplication IDs.
				if (xpath != null) {
					if (o instanceof MApplication) {
						EClass found = getTargetClassFromXPath((MApplication) o, xpath);
						if (found != null) {
							selectedContainer = found;
							return selectedContainer;
						}
					}
				} else {
					// This is a standard search with ID.
					if ((o instanceof MApplicationElement)
							&& (o.eContainingFeature() != FragmentPackageImpl.Literals.MODEL_FRAGMENTS__IMPORTS)
							&& parentElementId.equals(((MApplicationElement) o).getElementId())) {
						selectedContainer = o.eClass();
						return selectedContainer;
					}
				}
			}
		}

		updateTitle();

		return selectedContainer;
	}

	private void updateTitle() {
		getEditor().setHeaderTitle(getLabel(null));
	}

	private StringModelFragmentImpl getStringModelFragment() {
		return ((StringModelFragmentImpl) getMaster().getValue());
	}

	private Composite createForm(Composite parent) {
		final CTabFolder folder = new CTabFolder(parent, SWT.BOTTOM);

		final CTabItem item = new CTabItem(folder, SWT.NONE);
		item.setText(Messages.ModelTooling_Common_TabDefault);

		parent = createScrollableContainer(folder);
		item.setControl(parent.getParent());

		if (getEditor().isShowXMIId() || getEditor().isLiveModel()) {
			ControlFactory.createXMIId(parent, this);
		}

		final IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);
		{
			final Label l = new Label(parent, SWT.NONE);
			l.setText(Messages.StringModelFragment_ParentId);
			l.setToolTipText(Messages.StringModelFragment_ParentIdTooltip);
			l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

			final Composite comp = new Composite(parent, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			comp.setLayoutData(gd);
			final GridLayout gl = new GridLayout(2, false);
			gl.marginWidth = gl.marginHeight = 0;
			gl.verticalSpacing = 0;
			gl.marginLeft = gl.marginBottom = gl.marginRight = gl.marginTop = 0;
			comp.setLayout(gl);

			final Text t = new Text(comp, SWT.BORDER);
			TextPasteHandler.createFor(t);
			// t.setEditable(false);
			gd = new GridData(GridData.FILL_HORIZONTAL);
			t.setLayoutData(gd);
			context.bindValue(textProp.observeDelayed(200, t),
					EMFEditProperties
					.value(getEditingDomain(),
							FragmentPackageImpl.Literals.STRING_MODEL_FRAGMENT__PARENT_ELEMENT_ID)
					.observeDetail(getMaster()));

			// Add a modify listener to control the change of the ID -> Must
			// force the computation of selectedContainer.
			t.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					selectedContainer = null;
				}
			});

			final Button b = new Button(comp, SWT.PUSH | SWT.FLAT);
			b.setText(Messages.ModelTooling_Common_FindEllipsis);
			b.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					final FindParentReferenceElementDialog dialog = new FindParentReferenceElementDialog(b.getShell(),
							StringModelFragment.this, (MStringModelFragment) getMaster().getValue(), Messages,
							getSelectedContainer());
					dialog.open();
					selectedContainer = dialog.getSelectedContainer();
					updateTitle();
				}
			});
		}

		{
			final Label l = new Label(parent, SWT.NONE);
			l.setText(Messages.StringModelFragment_Featurename);
			l.setToolTipText(Messages.StringModelFragment_FeaturenameTooltip);
			l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

			final Composite comp = new Composite(parent, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			comp.setLayoutData(gd);
			final GridLayout gl = new GridLayout(2, false);
			gl.marginWidth = gl.marginHeight = 0;
			gl.verticalSpacing = 0;
			gl.marginLeft = gl.marginBottom = gl.marginRight = gl.marginTop = 0;
			comp.setLayout(gl);

			final Text t = new Text(comp, SWT.BORDER);
			TextPasteHandler.createFor(t);
			gd = new GridData(GridData.FILL_HORIZONTAL);
			t.setLayoutData(gd);
			context.bindValue(textProp.observeDelayed(200, t),
					EMFEditProperties
					.value(getEditingDomain(), FragmentPackageImpl.Literals.STRING_MODEL_FRAGMENT__FEATURENAME)
					.observeDetail(getMaster()));

			// create the decoration for the text component
			final ControlDecoration deco = new ControlDecoration(t, SWT.TOP | SWT.LEFT);

			// use an existing image
			Image image = FieldDecorationRegistry.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION).getImage();

			// set description and image
			deco.setDescriptionText(Messages.StringModelFragment_Ctrl_Space);
			deco.setImage(image);

			// always show decoration
			deco.setShowOnlyOnFocus(false);

			// hide the decoration if the text component has content
			t.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					Text text = (Text) e.getSource();
					if (!text.getText().isEmpty()) {
						deco.hide();
					} else {
						deco.show();
					}
				}
			});

			KeyStroke keyStroke;
			try {
				keyStroke = KeyStroke.getInstance("Ctrl+Space");
				ContentProposalAdapter adapter = new ContentProposalAdapter(t, new TextContentAdapter(),
						new StringModelFragmentProposalProvider(this, t), keyStroke, null);
				adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			t.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					updateChildrenChoice();
				}
			});

			final Button button = new Button(comp, SWT.PUSH | SWT.FLAT);
			button.setText(Messages.ModelTooling_Common_FindEllipsis);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					final FeatureSelectionDialog dialog = new FeatureSelectionDialog(button.getShell(),
							getEditingDomain(), (MStringModelFragment) getMaster().getValue(), Messages,
							getSelectedContainer());
					dialog.open();
				}
			});

		}

		ControlFactory.createTextField(parent, Messages.StringModelFragment_PositionInList, getMaster(), context,
				textProp, EMFEditProperties.value(getEditingDomain(),
						FragmentPackageImpl.Literals.STRING_MODEL_FRAGMENT__POSITION_IN_LIST));

		// ------------------------------------------------------------
		{

			pickList = new E4PickList(parent, SWT.NONE, null, Messages, this,
					FragmentPackageImpl.Literals.MODEL_FRAGMENT__ELEMENTS) {
				@Override
				protected void addPressed() {
					final EClass eClass = ((FeatureClass) ((IStructuredSelection) getSelection())
							.getFirstElement()).eClass;
					handleAdd(eClass, false);
				}

				@Override
				protected List<?> getContainerChildren(Object master) {
					return ((StringModelFragmentImpl) master).getElements();
				}
			};

			pickList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
			pickList.setText(""); //$NON-NLS-1$

			pickList.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					final FeatureClass eclass = (FeatureClass) element;
					return eclass.label;
				}
			});

			pickList.setComparator(new ViewerComparator() {
				@Override
				public int compare(Viewer viewer, Object e1, Object e2) {
					final FeatureClass eClass1 = (FeatureClass) e1;
					final FeatureClass eClass2 = (FeatureClass) e2;
					return eClass1.label.compareTo(eClass2.label);
				}
			});

		}

		createContributedEditorTabs(folder, context, getMaster(), MStringModelFragment.class);

		folder.setSelection(0);

		updateChildrenChoice();

		return folder;
	}

	static class StringModelFragmentProposalProvider implements IContentProposalProvider {

		private StringModelFragment fragment;
		private Text text;

		/**
		 * Initialize the class passing the current instance.
		 */
		public StringModelFragmentProposalProvider(StringModelFragment fragment, Text t) {
			this.fragment = fragment;
			this.text = t;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.fieldassist.IContentProposalProvider#getProposals(java.lang.String,
		 *      int)
		 */
		@Override
		public IContentProposal[] getProposals(String cont, int position) {
			List<String[]> contents = new ArrayList<>();
			StringBuilder sb = new StringBuilder(256);
			if (fragment.getSelectedContainer() != null) {
				for (EReference r : fragment.getSelectedContainer().getEAllReferences()) {
					if (Util.referenceIsModelFragmentCompliant(r) && r.getName().startsWith(text.getText())) {
						String content = r.getName();
						sb.setLength(0);
						sb.append(content).append(": ");
						final EClassifier type = ModelUtils.getTypeArgument(this.fragment.getSelectedContainer(),
								r.getEGenericType());
						if (r.isMany()) {
							// List<Container>
							sb.append("List<").append(type.getName()).append(">");
						} else {
							// TypeOfTheClass
							sb.append(type.getName());
						}
						contents.add(new String[] { content, sb.toString() });
					}
				}
			}

			Collections.sort(contents, new Comparator<String[]>() {

				@Override
				public int compare(String[] o1, String[] o2) {
					// compare
					return o1[0].compareTo(o2[0]);
				}
			});

			IContentProposal[] contentProposals = new IContentProposal[contents.size()];
			for (int i = 0; i < contents.size(); i++) {
				contentProposals[i] = new ContentProposal(contents.get(i)[0], contents.get(i)[1], null);
			}
			return contentProposals;
		}

	}

	public void dispose() {
		if (composite != null) {
			composite.dispose();
			composite = null;
		}

		if (context != null) {
			context.dispose();
			context = null;
		}
	}

	/**
	 * This method will update the picklist containing the list of possible
	 * children classes
	 *
	 */
	private void updateChildrenChoice() {
		selectedContainer = getSelectedContainer();

		final List<FeatureClass> list = getTargetChildrenClasses();

		pickList.setInput(list);
		if (list.size() > 0) {
			pickList.setSelection(new StructuredSelection(list.get(0)));
		}

		// pickList.getList().refresh();

		final IEMFListProperty prop = EMFProperties.list(FragmentPackageImpl.Literals.MODEL_FRAGMENT__ELEMENTS);
		pickList.getList().setInput(prop.observeDetail(getMaster()));

		// Update the possible actions
		actions.clear();
		for (final FeatureClass featureClass : list) {
			actions.add(new Action(featureClass.label) {
				@Override
				public void run() {
					handleAdd(featureClass.eClass, false);
				}
			});
		}
	}

	@Override
	public IObservableList getChildList(Object element) {
		return MODEL_FRAGMENT__ELEMENTS.observe(element);
	}

	protected void handleAdd(EClass eClass, boolean separator) {
		final EObject eObject = EcoreUtil.create(eClass);
		setElementId(eObject);
		final Command cmd = AddCommand.create(getEditingDomain(), getMaster().getValue(),
				FragmentPackageImpl.Literals.MODEL_FRAGMENT__ELEMENTS, eObject);

		if (cmd.canExecute()) {
			getEditingDomain().getCommandStack().execute(cmd);
			getEditor().setSelection(eObject);
		}
	}

	@Override
	public List<Action> getActions(Object element) {
		final ArrayList<Action> l = new ArrayList<>(super.getActions(element));
		l.addAll(actions);
		Collections.sort(l, new Comparator<Action>() {
			@Override
			public int compare(Action o1, Action o2) {

				return o1.getText().compareTo(o2.getText());
			}
		});
		return l;
	}

	/**
	 * Returns the EClass of the Application element(s) referenced by the xpath
	 * value (without prefix)
	 *
	 * @param application
	 *            : the application to be parsed
	 * @param xpath
	 *            : the xpath value without the 'xpath:' prefix
	 * @return the list of EClass(es) matching this xpath
	 */
	private EClass getTargetClassFromXPath(MApplication application, String xpath) {

		XPathContextFactory<EObject> f = EcoreXPathContextFactory.newInstance();
		XPathContext xpathContext = f.newContext((EObject) application);
		Iterator<Object> i = xpathContext.iterate(xpath);

		try {
			while (i.hasNext()) {
				Object obj = i.next();
				if (obj instanceof MApplicationElement) {
					ApplicationElementImpl ae = (ApplicationElementImpl) obj;
					return ae.eClass();
				}
			}
		} catch (Exception ex) {
			// custom xpath functions will throw exceptions
			ex.printStackTrace();
		}

		return null;
	}

	/**
	 * This method computes the available classes that can be selected as child
	 * for the current selected element. The result is cached in a map as the
	 * meta model will not change !
	 *
	 * @return an empty list or the list for possible children
	 */

	public List<FeatureClass> getTargetChildrenClasses() {
		List<FeatureClass> result = Collections.emptyList();

		if (selectedContainer != null) {

			// The top level class for children, is the class of the EReference
			// bound to feature name
			EReference childRef = null;
			String featurename = getStringModelFragment().getFeaturename();

			for (EReference ref : selectedContainer.getEAllReferences()) {
				if (ref.getName().equals(featurename)) {
					childRef = ref;
					break;
				}
			}

			if (childRef == null) {
				return result;
			}

			// Get the parent EClass where this childRef is defined...
			// For instance : for the 'children' reference it will be in
			// UIElementContainer<T extends UIElement>
			// We must check if the selectedContainer extends
			// UIElementContainer<XXX> and in this case childRef is XXX
			final EClass childClass = (EClass) ModelUtils.getTypeArgument(selectedContainer,
					childRef.getEGenericType());

			// Search for descendant of ChildClass -> This result could be
			// cached for all StringModelFragment editors instances and computed
			// once...
			result = new ArrayList<>();
			for (final InternalPackage p : Util.loadPackages()) {
				for (EClass c : p.getAllClasses()) {
					if (childClass.isSuperTypeOf(c)) {
						result.add(new FeatureClass(c.getName(), c));
					}
				}

			}
		}
		return result;

	}

}
