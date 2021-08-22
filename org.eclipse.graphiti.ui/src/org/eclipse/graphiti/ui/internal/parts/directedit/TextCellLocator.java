/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *    Volker Wegert - Bug 332363 - Direct Editing: enable automatic resizing for combo boxes
 *    mwenz - Bug 359112 - Connection text decorator's direct editing box size is not accurate when the text has length zero
 *    mgorning - Bug 347262 - DirectEditingFeature with TYPE_DIALOG type
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.ui.internal.parts.directedit;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.func.IDirectEditing;
import org.eclipse.graphiti.ui.platform.ICellEditorProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * implementation of a locator for direct edit CellEditors
 * 
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
 */
public class TextCellLocator implements CellEditorLocator {

	private IFigure figure;

	private IDirectEditingFeature directEditingFeature;

	private int initialWidth = -1;

	public TextCellLocator(IFigure figure, IDirectEditingFeature directEditingFeature) {
		this.figure = figure;
		this.directEditingFeature = directEditingFeature;
	}

	public void relocate(CellEditor celleditor) {

		Control control = celleditor.getControl();

		if (directEditingFeature.getEditingType() == IDirectEditing.TYPE_MULTILINETEXT) {

			// IFigure parentFigure = figure.getParent();
			Rectangle rect = figure.getClientArea().getCopy();
			figure.translateToAbsolute(rect);
			org.eclipse.swt.graphics.Rectangle trim = ((Text) control).computeTrim(0, 0, 0, 0);
			rect.translate(trim.x, trim.y);
			rect.width += trim.width;
			rect.height += trim.height;
			// control.setBounds(rect.x, rect.y, rect.width, rect.height);

			int correction = 16;

			Text text = (Text) celleditor.getControl();
			Dimension d = FigureUtilities.getTextExtents(text.getText(), text.getFont());

			int widthToSet = Math.min(rect.width, d.width + correction);
			rect.x += (rect.width - widthToSet) / 2;
			rect.y += (rect.height - d.height) / 2;

			text.setBounds(rect.x, rect.y, widthToSet, d.height);

		} else if (directEditingFeature.getEditingType() == IDirectEditing.TYPE_TEXT) {

			Rectangle rect = figure.getBounds().getCopy();
			figure.translateToAbsolute(rect);

			if (directEditingFeature.stretchFieldToFitText()) {
				Text text = (Text) control;

				// Bug 359112 - Prevent enlarging the input field in case string
				// length is 0 (would set field length to 64)
				int widthHint = SWT.DEFAULT;
				if (text.getText().length() == 0) {
					// In case of text length 0 set field width hint to minimum
					// value so that field is rendered in minimal size
					widthHint = 0;
				}
				Point pref = text.computeSize(widthHint, SWT.DEFAULT);

				// initialWidth is the minimum width for the field
				if (initialWidth == -1) {
					initialWidth = pref.x;
				}

				if (pref.x < initialWidth) {
					pref.x = initialWidth;
				}

				control.setBounds(rect.x, rect.y, pref.x + 10, pref.y);
			} else {

				int height = control.getFont().getFontData()[0].getHeight();

				control.setBounds(rect.x + 2, rect.y + 2, rect.width - 4, height * 2);
			}

		} else if (directEditingFeature.getEditingType() == IDirectEditing.TYPE_DROPDOWN
				|| directEditingFeature.getEditingType() == IDirectEditing.TYPE_DROPDOWN_READ_ONLY) {
			Rectangle rect = figure.getBounds().getCopy();

			figure.translateToAbsolute(rect);
			int minWidth = 80;
			if (rect.width > minWidth) {
				minWidth = rect.width;
			}

			if (directEditingFeature.stretchFieldToFitText()) {
				CCombo combo = (CCombo) control;
				Point pref = combo.computeSize(-1, -1);
				if (minWidth < pref.x)
					minWidth = pref.x;
			}

			control.setBounds(rect.x, rect.y, minWidth, 14);
		} else if (directEditingFeature.getEditingType() == IDirectEditing.TYPE_CUSTOM
				&& (directEditingFeature instanceof ICellEditorProvider)) {
			ICellEditorProvider cep = (ICellEditorProvider) directEditingFeature;
			cep.relocate(celleditor, figure);
		}
	}

	public IFigure getFigure() {
		return figure;
	}
}
