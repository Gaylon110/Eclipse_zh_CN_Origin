/*******************************************************************************
 * Copyright (c) 2011, 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *     Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *     Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *     Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *     Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *     Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *     Nicolas Bros (Mia-Software) - Bug 379524 - [Table] operations with parameters in "Allowed Contents" dialog
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.presentable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.ui.internal.exported.dialog.IETypedElementSelectionDialogFactory;
import org.eclipse.emf.facet.efacet.ui.internal.exported.dialog.IETypedElementSelectionDialogInternal;
import org.eclipse.emf.facet.util.emf.core.ModelUtils;
import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IDialogCallbackWithPreCommit;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialogCallback;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialogInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IMustRemoveNonConformingElementsDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public class AllowedContentsETypedElementSelectionDialog implements IAllowedContentsETypedElementSelectionDialogInternal {

	private IETypedElementSelectionDialogInternal typedElementSelectionDialog;
	private final Shell parentShell;
	private boolean mustRemoveNonConformingElements = true;
	private final IAllowedContentsETypedElementSelectionDialogCallback callback;
	private int returnCode = Window.CANCEL;
	private final Collection<? extends ETypedElement> typedElements;
	private final ICustomizationManager customizationManager;
	
	protected void setMustRemoveNonConformingElements(final boolean mustRemoveNonConformingElements) {
		this.mustRemoveNonConformingElements = mustRemoveNonConformingElements;
	}

	public AllowedContentsETypedElementSelectionDialog(
			final Shell parentShell,
			final Collection<? extends ETypedElement> typedElements,
			final IAllowedContentsETypedElementSelectionDialogCallback dialogCallback,
			final ICustomizationManager customizationManager) {
		this.parentShell = parentShell;
		this.typedElements = typedElements;
		this.callback = dialogCallback;
		this.customizationManager = customizationManager;
	}
	
	public void open() {
		final IDialogCallbackWithPreCommit<List<ETypedElement>, Object, Object> callback = new IDialogCallbackWithPreCommit<List<ETypedElement>, Object, Object>() {

			public void committed(final List<ETypedElement> result,
					final Object precommitResult) {
				if (isDisableListener()) {
					return;
				}
				okPressed();

			}

			public Object openPrecommitDialog(final List<ETypedElement> result,
					final IDialogCallback<Object> precommitCallback) {
				return null;
			}
		};
		Collection<? extends EPackage> knownEPackages = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(
						this.customizationManager.getResourceSet())
				.getRegisteredFacetSets();
		this.typedElementSelectionDialog = (IETypedElementSelectionDialogInternal) IETypedElementSelectionDialogFactory.DEFAULT
				.openETypedElementSelectionDialog(
						filterAllowedElements(this.typedElements), 1, true,
						callback, this.parentShell, this.customizationManager,
						knownEPackages);
	}

	/**
	 * Keep only ETypedElements that are defined in Facets that extend {@link EObject}, are single-valued, and return a
	 * boolean.
	 */
	private static Collection<? extends ETypedElement> filterAllowedElements(final Collection<? extends ETypedElement> elements) {
		final List<ETypedElement> filteredList = new ArrayList<ETypedElement>();
		for (final ETypedElement eTypedElement : elements) {
			if (extendsEObject(eTypedElement) 
					&& eTypedElement.getUpperBound() == 1 
					&& (eTypedElement.getLowerBound() == 1 || eTypedElement.getLowerBound() == 0) 
					&& !hasParameters(eTypedElement)) {
				final EClassifier eType = eTypedElement.getEType();
				if (ModelUtils.isBooleanDataType(eType)) {
					filteredList.add(eTypedElement);
				}
			}
		}
		return filteredList;
	}

	protected static boolean hasParameters(final ETypedElement eTypedElement) {
		boolean result = false;
		if (eTypedElement instanceof EOperation) {
			final EOperation operation = (EOperation) eTypedElement;
			result = operation.getEParameters().size() > 0;
		}
		return result;
	}

	private static boolean extendsEObject(final ETypedElement eTypedElement) {
		boolean extendsEObject = false;
		if (eTypedElement.eContainer() instanceof Facet) {
			final Facet facet = (Facet) eTypedElement.eContainer();
			if (facet.getExtendedMetaclass() == EcorePackage.eINSTANCE.getEObject()) {
				extendsEObject = true;
			}
		}
		return extendsEObject;
	}

	protected void typedElementSelectionDialogCanceled() {
		this.callback.canceled();
	}

	protected IMustRemoveNonConformingElementsDialog okPressed() {
		this.returnCode = Window.OK;

		IMustRemoveNonConformingElementsDialog result;
		ETypedElement selectedETypedElement = this.typedElementSelectionDialog.getFirstSelectedETypedElement();
		if (this.typedElementSelectionDialog.getReturnCode() == Window.OK) {
			if (this.callback.mustAskToRemoveNonAllowedElements(selectedETypedElement)) {
				final IMustRemoveNonConformingElementsDialog dialog = new MustRemoveNonConformingElementsPromptDialog(this.parentShell);
				dialog.addCloseListener(new Runnable() {
					public void run() {
						mustRemoveNonConformingElementsDialogClosed(dialog);
					}
				});
				dialog.open();
				result = new SynchronizedMustRemoveNonConformingElementsPromptDialog(dialog);
			} else {
				this.callback.committed(getSelectedETypedElement(), false);
				result = null;
			}
		} else {
			result = null;
		}
		return result;
	}

	protected void mustRemoveNonConformingElementsDialogClosed(final IMustRemoveNonConformingElementsDialog dialog) {
		ETypedElement selectedETypedElement = getSelectedETypedElement();
		if (selectedETypedElement != null) {
			boolean mustRemove = dialog.getMustRemoveNonConformingElements() != null
					&& dialog.getMustRemoveNonConformingElements().booleanValue();
			setMustRemoveNonConformingElements(mustRemove);
			this.callback.committed(selectedETypedElement, mustRemove);
		} else {
			this.callback.canceled();
		}
	}

	private boolean disableListener = false;

	protected boolean isDisableListener() {
		return this.disableListener;
	}

	public IMustRemoveNonConformingElementsDialog pressOk() {
		// When using the programmatic dialog API, we need to return the dialog
		// opened by okPressed() synchronously, so we don't want the listener to
		// call okPressed() again.
		try {
			this.disableListener = true;
			this.typedElementSelectionDialog.pressOk();
		} finally {
			this.disableListener = false;
		}

		return okPressed();
	}

	public void pressCancel() {
		this.typedElementSelectionDialog.pressCancel();
	}

	public ETypedElement getSelectedETypedElement() {
		return this.typedElementSelectionDialog.getFirstSelectedETypedElement();
	}

	public void select(final ETypedElement typedElement) {
		if (typedElement == null) {
			this.typedElementSelectionDialog.setSelectedETypedElements(new ArrayList<ETypedElement>());
		} else {
			this.typedElementSelectionDialog.setSelectedETypedElements(Collections.singletonList(typedElement));
		}
	}

	public boolean getMustRemoveNonConformingElements() {
		return this.mustRemoveNonConformingElements;
	}

	public Shell getShell() {
		return this.parentShell;
	}

	public int getReturnCode() {
		return this.returnCode;
	}
}
