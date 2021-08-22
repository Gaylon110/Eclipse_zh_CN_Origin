package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * This interface must be implemented by clients of the dialog, in order to decide whether a second dialog must be
 * opened based on the selection in the first dialog, and be notified when the first dialog is closed (either by Cancel
 * or OK)
 */
public interface IAllowedContentsETypedElementSelectionDialogCallback {
	/**
	 * @return whether a second dialog should be opened to ask the user whether to remove non-allowed contents, based on
	 *         the selected ETypedElement
	 */
	boolean mustAskToRemoveNonAllowedElements(ETypedElement allowedContentsTypedElement);

	/**
	 * The user committed their selection (either by OK or double-click on the element).
	 * 
	 * @param typedElement
	 *            the selected {@link ETypedElement}
	 * @param removeNonAllowedContents
	 *            whether the user chose to remove non-allowed contents
	 */
	void committed(ETypedElement typedElement, boolean removeNonAllowedContents);

	/** The user canceled the dialog */
	void canceled();
}