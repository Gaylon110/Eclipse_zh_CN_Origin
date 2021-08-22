/*******************************************************************************
� * Copyright (c) 2009, 2010, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Nicolas Guyomar (Mia-Software) - Bug 337398 - [Add a Query Column] Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation 
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 344670 - Problems with the columns creation : very slow + scrollbar blinked
 *    Nicolas Guyomar (Mia-Software) - Bug 346733 - Bug in TableLabelProvider : when the column is a FacetColumn the returned label is not correct
 *    Gregoire Dupe (Mia-Software) - Bug 350700 - AbstractTableWidget: Wrong cell label in multi-valued facet reference columns
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProviderFactory;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElementWithContext;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * @deprecated Replaced by org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider
 */
@Deprecated
public class TableLabelProvider extends CellLabelProvider {

	private static final int MAX_DISPLAYED_ELEMENTS = 5;
	private final List<Column> columns;
	private final ICustomizedLabelProvider labelProvider;
	private IFacetManager facetManager;

	public TableLabelProvider(final List<Column> columns,
			final ICustomizationManager customizatioMgr, final IFacetManager facetManager) {
		this.columns = columns;
		this.labelProvider = ICustomizedLabelProviderFactory.DEFAULT.createCustomizedLabelProvider(customizatioMgr);
		this.facetManager = facetManager;
	}

	private String queryResultToString(final Object object) {
		if (object == null) {
			return "null"; //$NON-NLS-1$
		}
		if (object instanceof Collection<?>) {
			StringBuilder stb = new StringBuilder();
			Collection<?> collection = (Collection<?>) object;
			for (Object o : collection) {
				if (stb.length() > 0) {
					stb.append(", "); //$NON-NLS-1$
				} 
				if (o instanceof EObject) {
					stb.append(this.labelProvider.getText(o));
				} else {
					stb.append(o.toString());
				}
			}
			return stb.toString();
		} else if (object instanceof ETypedElementResult) {
			return this.labelProvider.getText(FacetUtils
					.getResultValue((ETypedElementResult) object));
		}
		return this.labelProvider.getText(object);
	}

	private static String getMetaclassColumnText(final Object element) {
		if (element == null) {
			return ""; //$NON-NLS-1$
		}
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			final EClass eClass = eObject.eClass();
			if (eClass == null) {
				return Messages.TableLabelProvider_none;
			}
			return eClass.getName();
		}
		// primitive DataType
		return element.getClass().getSimpleName();
	}

	private String getContextColumnText(final IGridElement gridElement) {
		if (gridElement instanceof IGridElementWithContext) {
			IGridElementWithContext gridElementWithContext = (IGridElementWithContext) gridElement;
			EObject context = gridElementWithContext.getContext();
			return this.labelProvider.getText(context);
		}
		return Messages.TableLabelProvider_null;
	}

	private Image getContextColumnImage(final IGridElement gridElement) {
		if (gridElement instanceof IGridElementWithContext) {
			IGridElementWithContext gridElementWithContext = (IGridElementWithContext) gridElement;
			EObject context = gridElementWithContext.getContext();
			return this.labelProvider.getImage(context);
		}
		return null;
	}

	public Image getImage(final Object element) {
		return this.labelProvider.getImage(element);
	}

	public String getText(final Object element) {
		return this.labelProvider.getText(element);
	}

	public void addListener(final ILabelProviderListener listener) {
		this.labelProvider.addListener(listener);
	}

	public void dispose() {
		this.labelProvider.dispose();
	}

	public boolean isLabelProperty(final Object element, final String property) {
		return this.labelProvider.isLabelProperty(element, property);
	}

	public void removeListener(final ILabelProviderListener listener) {
		this.labelProvider.removeListener(listener);
	}

	public ICustomizationManager getCustomizationManager() {
		return this.labelProvider.getCustomizationManager();
	}

	public Color getForeground(final Object element) {
		return this.labelProvider.getForeground(element);
	}

	public Color getBackground(final Object element) {
		return this.labelProvider.getBackground(element);
	}

	public Font getFont(final Object element) {
		return this.labelProvider.getFont(element);
	}

	public boolean isUnderlined(final Object element) {
		return this.labelProvider.isUnderlined(element, null);
	}

	public boolean isStruckthrough(final Object element) {
		return this.labelProvider.isStruckthrough(element, null);
	}

	public Image getTopLeftOverlay(final Object element) {
		return this.labelProvider.getTopLeftOverlay(element, null);
	}

	public Image getTopMiddleOverlay(final Object element) {
		return this.labelProvider.getTopMiddleOverlay(element, null);
	}

	public Image getTopRightOverlay(final Object element) {
		return this.labelProvider.getTopRightOverlay(element, null);
	}

	public Image getBottomLeftOverlay(final Object element) {
		return this.labelProvider.getBottomLeftOverlay(element, null);
	}

	public Image getBottomMiddleOverlay(final Object element) {
		return this.labelProvider.getBottomMiddleOverlay(element, null);
	}

	public Image getBottomRightOverlay(final Object element) {
		return this.labelProvider.getBottomRightOverlay(element, null);
	}

	public String getText(final EObject element, final EStructuralFeature structuralFeature) throws CustomizationException {
		return this.labelProvider.getText(element, structuralFeature);
	}

	public Image getImage(final Object element, final ETypedElement featureColumn) {
		return this.labelProvider.getImage(element, featureColumn);
	}

	@Override
	public String getToolTipText(final Object element) {
		return this.labelProvider.getToolTipText(element, null);
	}

	@Override
	public Image getToolTipImage(final Object element) {
		return this.labelProvider.getToolTipImage(element, null);
	}

	@Override
	public Font getToolTipFont(final Object element) {
		return this.labelProvider.getToolTipFont(element, null);
	}

	@Override
	public Color getToolTipBackgroundColor(final Object element) {
		return this.labelProvider.getToolTipBackgroundColor(element, null);
	}

	@Override
	public Color getToolTipForegroundColor(final Object element) {
		return this.labelProvider.getToolTipForegroundColor(element, null);
	}

	public Image getToolTipTopLeftOverlay(final Object element) {
		return this.labelProvider.getToolTipTopLeftOverlay(element, null);
	}

	public Image getToolTipTopMiddleOverlay(final Object element) {
		return this.labelProvider.getToolTipTopMiddleOverlay(element, null);
	}

	public Image getToolTipTopRightOverlay(final Object element) {
		return this.labelProvider.getToolTipTopRightOverlay(element, null);
	}

	public Image getToolTipBottomLeftOverlay(final Object element) {
		return this.labelProvider.getToolTipBottomLeftOverlay(element, null);
	}

	public Image getToolTipBottomMiddleOverlay(final Object element) {
		return this.labelProvider.getToolTipBottomMiddleOverlay(element, null);
	}

	public Image getToolTipBottomRightOverlay(final Object element) {
		return this.labelProvider.getToolTipBottomRightOverlay(element, null);
	}

	@Override
	public int getToolTipTimeDisplayed(final Object element) {
		return this.labelProvider.getToolTipTimeDisplayed(element, null);
	}

	@Override
	public int getToolTipDisplayDelayTime(final Object element) {
		return this.labelProvider.getToolTipDisplayDelayTime(element, null);
	}

	@Override
	public int getToolTipStyle(final Object element) {
		return this.labelProvider.getToolTipStyle(element, null);
	}

	@Override
	public void update(final ViewerCell cell) {
		this.labelProvider.update(cell);
	}

}
