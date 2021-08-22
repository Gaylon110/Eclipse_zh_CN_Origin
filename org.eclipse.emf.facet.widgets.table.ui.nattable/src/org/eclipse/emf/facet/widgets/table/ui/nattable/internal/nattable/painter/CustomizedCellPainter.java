/*******************************************************************************
 * Copyright (c) 2010, 2017 CEA LIST, and Mia-Software
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *   Nicolas Bros (Mia-Software) - Bug 332010 - view Facet customizations on NatTable
 *   Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *   Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *   Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *   Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *   Nicolas Bros (Mia-Software) - Bug 356564 - [Table Editor] customizations on attributes and references don't work
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 352608 - [Table] marker at the end of the truncated displayed text
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *   Nicolas Bros (Mia-Software) - Bug 374941 - To be able to customize overlay icons on EClass
 *   Gregoire Dupe (Mia-Software) - Bug 374941 - To be able to customize overlay icons on EClass
 *   Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *   Nicolas Bros (Mia-Software) - Bug 378238 - [Table] autoresize doesn't work
 *   Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 *   Thomas Cicognani (Mia-Software) - Bug 513070 - NatTable and customization: cannot change background from columns
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.util.swt.colorprovider.IColorProvider;
import org.eclipse.emf.facet.util.swt.colorprovider.IColorProviderFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;

import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.painter.cell.TextPainter;
import net.sourceforge.nattable.style.CellStyleAttributes;
import net.sourceforge.nattable.style.CellStyleUtil;
import net.sourceforge.nattable.style.DisplayMode;

public class CustomizedCellPainter extends TextPainter {

	private static final String ERROR_MSG = Messages.CustomizedCellPainter_error_msg;
	private static final int LEFT_MARIN = 0;
	private static final int RIGHT_MARGIN = 0;
	private static final int OFFSET_AFTER_ICON = 18;
	private static final int OVERLAY_SIZE = 8;
	private static final int PREFERRED_WIDTH_MARGIN = 8;
	private static final int MAX_COLOR = 0xFF;

	private final ICustomizedLabelProvider tableLabelProvider;
	private final NatTableWidget natTableWidget;

	public CustomizedCellPainter(
			final ICustomizedLabelProvider tableLabelProvider,
			final NatTableWidget natTableWidget) {
		this.tableLabelProvider = tableLabelProvider;
		this.natTableWidget = natTableWidget;
	}

	@Override
	protected String convertDataType(final LayerCell cell, final IConfigRegistry configRegistry) {
		String result = CustomizedCellPainter.ERROR_MSG;
		final Object dataValue = cell.getDataValue();
		if (dataValue instanceof IGridElement) {
			final IGridElement gridElement = (IGridElement) dataValue;
			final Column column = gridElement.getColumn();
			if (column instanceof FeatureColumn) {
				Object value = null;
				try {
					value = getValueOf(gridElement);
				} catch (final FacetManagerException e) {
					Logger.logWarning(e, Activator.getDefault());
					value = ""; //$NON-NLS-1$
				}
				try {
					result = this.tableLabelProvider.getText(value);
				} catch (final Exception e) {
					Logger.logWarning(e, Activator.getDefault());
				}
			} else if (column != null) {
				Logger.logWarning("unhandled column type: " + column.getClass().getSimpleName(), Activator.getDefault()); //$NON-NLS-1$
			}
		} else if (dataValue instanceof FeatureColumn) {
			final FeatureColumn featureColumn = (FeatureColumn) dataValue;
			result = this.tableLabelProvider.getText(featureColumn.getFeature());
		} else {
			if (dataValue != null) {
				Logger.logWarning("Unhandled cell data type in painter: " + dataValue, Activator.getDefault()); //$NON-NLS-1$
				result = dataValue.toString();
			} else {
				result = "null"; //$NON-NLS-1$
			}
		}
		return result;
	}

	@Override
	public void paintCell(final LayerCell cell, final GC gc, final Rectangle rectangle,
			final IConfigRegistry configRegistry) {

		final int convertedColumn = this.natTableWidget.convertCellPositionToDataLayer(cell);
		if (convertedColumn < this.natTableWidget.getController().getTable().getColumns().size()) {

			// leave a 2 pixel wide margin around the whole cell
			final Rectangle rectangleWithMargin = new Rectangle(rectangle.x + 2, rectangle.y + 2,
					rectangle.width - 2 * 2, rectangle.height - 2 * 2);

			final Object dataValue = cell.getDataValue();

			if (dataValue instanceof IGridElement) {
				final IGridElement gridElement = (IGridElement) dataValue;
				paintGridElement(gridElement, rectangleWithMargin, cell, gc, rectangle, configRegistry);
			} else if (dataValue instanceof FeatureColumn) {
				final FeatureColumn column = (FeatureColumn) dataValue;
				final ETypedElement typedElement = column.getFeature();
				String text = this.tableLabelProvider.getText(typedElement);
				if (text == null) {
					text = ""; //$NON-NLS-1$
				}
				gc.drawText(text, rectangle.x, rectangleWithMargin.y, true);
			} else {
				Logger.logWarning("Unhandled cell data type in painter: " + dataValue, Activator.getDefault()); //$NON-NLS-1$
			}
		}

	}

	private void paintGridElement(final IGridElement gridElement,
			final Rectangle rectangleWithMargin, final LayerCell cell,
			final GC gc, final Rectangle rectangle,
			final IConfigRegistry configRegistry) {
		drawBackground(cell, gc, rectangle, configRegistry, gridElement);
		final Rectangle originalClipping = gc.getClipping();
		gc.setClipping(rectangleWithMargin);
		setupGCFromCustomization(gc, gridElement, cell, configRegistry);
		final Image icon = drawIcon(gc, rectangle, rectangleWithMargin, gridElement);
		drawText(gc, rectangleWithMargin, gridElement, icon);
		drawUnderline(gc, rectangleWithMargin, gridElement, rectangle);
		drawStruckthrough(gc, rectangleWithMargin, gridElement, rectangle);
		drawOverlay(gc, rectangle, gridElement);
		gc.setClipping(originalClipping);
	}

	private void drawOverlay(final GC gc, final Rectangle rectangle, final IGridElement gridElement) {
		Object value;
		try {
			value = getValueOf(gridElement);
			if (value instanceof EObject) {
				final Image[] topImages = new Image[] {
						this.tableLabelProvider.getTopLeftOverlay(value, null),
						this.tableLabelProvider.getTopMiddleOverlay(value, null),
						this.tableLabelProvider.getTopRightOverlay(value, null) };
				final Image[] bottomImages = new Image[] {
						this.tableLabelProvider.getBottomLeftOverlay(value, null),
						this.tableLabelProvider.getBottomMiddleOverlay(value, null),
						this.tableLabelProvider.getBottomRightOverlay(value, null) };
				final Image[][] imageMatrix = new Image[][] { topImages,
						bottomImages };
				for (int row = 0; row < imageMatrix.length; row++) {
					final Image[] rowContent = imageMatrix[row];
					for (int column = 0; column < rowContent.length; column++) {
						final Rectangle iconRectangle = new Rectangle(
								rectangle.x + (column * CustomizedCellPainter.OVERLAY_SIZE),
								rectangle.y + (row * CustomizedCellPainter.OVERLAY_SIZE),
								CustomizedCellPainter.OVERLAY_SIZE,
								CustomizedCellPainter.OVERLAY_SIZE);
						gc.setClipping(iconRectangle);
						if (rowContent[column] != null) {
							gc.drawImage(rowContent[column], iconRectangle.x, iconRectangle.y);
						}
					}
				}
			}
		} catch (final FacetManagerException e) {
			// If the value computation fails, we do not display any icons.
			Logger.logError(e, Activator.getDefault());
		}
	}

	private Image drawIcon(final GC gc, final Rectangle rectangle, final Rectangle rectangleWithMargin, final IGridElement gridElement) {
		gc.setClipping(rectangle);
		final Image icon = getIcon(gridElement);
		if (icon != null) {
			gc.drawImage(icon, rectangleWithMargin.x, rectangleWithMargin.y);
		}
		return icon;
	}

	protected Image getIcon(final IGridElement gridElement) {
		Image icon = null;
		try {
			final Object value = getValueOf(gridElement);
			if (value instanceof EObject) {
				icon = this.tableLabelProvider.getImage(value, null);
			}
		} catch (final FacetManagerException e) {
			// If the value computation fails, we do not display any icons.
			Logger.logError(e, Activator.getDefault());
		}
		return icon;
	}

	private Object getValueOf(final IGridElement gridElement)
			throws FacetManagerException {
		return TableWidgetUtils.getValueOf(gridElement, this.natTableWidget.getController().getFacetContext());
	}

	private void drawText(final GC gc, final Rectangle rectangleWithMargin, final IGridElement gridElement, final Image icon) {
		gc.setClipping(rectangleWithMargin);
		// Text settings
		String text;
		try {
			text = this.tableLabelProvider.getText(getValueOf(gridElement));
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
			text = CustomizedCellPainter.ERROR_MSG;
		}
		text = truncate(gc, rectangleWithMargin.width, text, icon);
		int x = rectangleWithMargin.x;
		if (icon != null) {
			final int totalOffsetAfterIcon;
			if (hasOverlay(gridElement)) {
				hasOverlay(gridElement);
				totalOffsetAfterIcon = CustomizedCellPainter.OFFSET_AFTER_ICON + CustomizedCellPainter.OVERLAY_SIZE;
			} else {
				totalOffsetAfterIcon = CustomizedCellPainter.OFFSET_AFTER_ICON;
			}
			x = rectangleWithMargin.x + totalOffsetAfterIcon;
		}
		gc.drawText(text, x, rectangleWithMargin.y, true);
	}

	protected boolean hasOverlay(final IGridElement gridElement) {
		boolean result = false;
		Object value = null;
		try {
			value = getValueOf(gridElement);
		} catch (final FacetManagerException e) {
			Logger.logWarning("Error computing grid element value", Activator.getDefault()); //$NON-NLS-1$
		}
		if (value instanceof EObject) {
			final EObject eObject = (EObject) value;
			result = this.tableLabelProvider.getTopLeftOverlay(eObject, null) != null
					|| this.tableLabelProvider.getTopMiddleOverlay(eObject, null) != null
					|| this.tableLabelProvider.getTopRightOverlay(eObject, null) != null
					|| this.tableLabelProvider.getBottomLeftOverlay(eObject, null) != null
					|| this.tableLabelProvider.getBottomMiddleOverlay(eObject, null) != null
					|| this.tableLabelProvider.getBottomRightOverlay(eObject, null) != null;
		}
		return result;
	}

	@Override
	public int getPreferredWidth(final LayerCell cell, final GC gc, final IConfigRegistry configRegistry) {
		int preferredWidth = -1;
		final Object dataValue = cell.getDataValue();
		if (dataValue instanceof IGridElement) {
			final IGridElement gridElement = (IGridElement) dataValue;
			setupGCFromCustomization(gc, gridElement, cell, configRegistry);
		}

		final String text = convertDataType(cell, configRegistry).split("\\r?\\n")[0]; //$NON-NLS-1$
		preferredWidth = gc.textExtent(text).x;

		if (dataValue instanceof IGridElement) {
			final IGridElement gridElement = (IGridElement) dataValue;
			if (getIcon(gridElement) != null) {
				preferredWidth += CustomizedCellPainter.OFFSET_AFTER_ICON;
				if (hasOverlay(gridElement)) {
					preferredWidth += CustomizedCellPainter.OVERLAY_SIZE;
				}
			}
			preferredWidth += CustomizedCellPainter.PREFERRED_WIDTH_MARGIN;
		}
		// note: the FeatureColumn is not custom painted, so we don't need to add OFFSET_AFTER_ICON
		return preferredWidth;
	}

	protected void setupGCFromCustomization(final GC gc, final IGridElement gridElement, 
			final LayerCell cell, final IConfigRegistry configRegistry) {
		Object value = null;
		try {
			value = getValueOf(gridElement);
		} catch (final FacetManagerException e) {
			Logger.logWarning("Error computing grid element value", Activator.getDefault()); //$NON-NLS-1$
		}
		if (value instanceof EObject) {
			final EObject eObject = (EObject) value;
			final Color background = this.tableLabelProvider.getBackground(eObject);
			final Color foreground = this.tableLabelProvider.getForeground(eObject);
			final Font font = this.tableLabelProvider.getFont(eObject);
			gc.setFont(font);
			gc.setForeground(foreground);
			gc.setBackground(background);
		} else {
			setupGCFromConfig(gc, CellStyleUtil.getCellStyle(cell, configRegistry));
			final EObject element = gridElement.getRow().getElement();
			if (element != null) {
				final Color foreground = this.tableLabelProvider.getForeground(element);
				if (foreground != null) {
					gc.setForeground(foreground);
				}
				final Font font = this.tableLabelProvider.getFont(element);
				if (font != null) {
					gc.setFont(font);
				}
			}
		}
	}

	private void drawStruckthrough(final GC gc, final Rectangle rectangleWithMargin,
			final IGridElement gridElement, final Rectangle rectangle) {
		final EObject element = gridElement.getRow().getElement();
		if (element != null) {
			if (this.tableLabelProvider.isStruckthrough(gridElement.getRow().getElement(),
					((FeatureColumn) gridElement.getColumn()).getFeature())) {
				gc.setClipping(rectangle);
				final int y = rectangleWithMargin.y + rectangleWithMargin.height / 2 + 1;
				gc.drawLine(rectangleWithMargin.x + CustomizedCellPainter.LEFT_MARIN, y, rectangleWithMargin.x
						+ rectangleWithMargin.width - CustomizedCellPainter.RIGHT_MARGIN, y);
			}
		}
	}

	private void drawUnderline(final GC gc, final Rectangle rectangleWithMargin,
			final IGridElement gridElement, final Rectangle rectangle) {
		final EObject element = gridElement.getRow().getElement();
		if (element != null) {
			if (this.tableLabelProvider.isUnderlined(element,
					((FeatureColumn) gridElement.getColumn()).getFeature())) {
				gc.setClipping(rectangle);
				final int y = rectangleWithMargin.y + rectangleWithMargin.height - 1;
				gc.drawLine(rectangleWithMargin.x + CustomizedCellPainter.LEFT_MARIN, y, rectangleWithMargin.x
						+ rectangleWithMargin.width - CustomizedCellPainter.RIGHT_MARGIN, y);
			}
		}
	}

	private void drawBackground(final LayerCell cell, final GC gc,
			final Rectangle rectangle, final IConfigRegistry configRegistry,
			final IGridElement gridElement) {
		final Color backgroundColor = getBackground(cell, gridElement, configRegistry);
		final Color originalBackground = gc.getBackground();
		gc.setBackground(backgroundColor);
		gc.fillRectangle(rectangle);
		gc.setBackground(originalBackground);
	}

	private Color getBackground(final LayerCell cell, final IGridElement gridElement, final IConfigRegistry configRegistry) {
		Color backgroundColor = CellStyleUtil.getCellStyle(cell, configRegistry).getAttributeValue(
				CellStyleAttributes.BACKGROUND_COLOR);
		Object value = null;
		try {
			value = getValueOf(gridElement);
		} catch (final FacetManagerException e) {
			Logger.logWarning("Error computing grid element value", Activator.getDefault()); //$NON-NLS-1$
		}
		Object objectForBackground = null;
		if (value instanceof EObject) {
			objectForBackground = value;
		} else {
			final Row row = gridElement.getRow();
			objectForBackground = row.getElement();
		}
		Color background = null;
		if (objectForBackground != null) {
			background = this.tableLabelProvider
					.getBackground(objectForBackground);
			final Column column = gridElement.getColumn();
			if (column instanceof FeatureColumn) {
				background = getFeatureColumnBackground(objectForBackground,
						(FeatureColumn) column);
			}
		}
		if (background != null) {
			if (cell.getDisplayMode() == DisplayMode.SELECT) {
				// merge the customized color with the selection color
				final double opacity = 0.3d;
				final Color mergedColor = mergeColors(background,
						backgroundColor, opacity);
				backgroundColor = mergedColor;
			} else {
				backgroundColor = background;
			}
		}
		return backgroundColor;
	}

	private Color getFeatureColumnBackground(final Object objectForBackground,
			final FeatureColumn featureColumn) {
		Color background = null;
		final ETypedElement feature = featureColumn.getFeature();
		final Color cellBackground = this.tableLabelProvider
				.getBackground(objectForBackground, feature);
		if (cellBackground.getRed() != MAX_COLOR
				|| cellBackground.getGreen() != MAX_COLOR
				|| cellBackground.getBlue() != MAX_COLOR) {
			/*
			 * Cell background is not default color (white) so use it instead of
			 * general line color for this cell
			 */
			background = cellBackground;
		}
		return background;
	}

	private static String truncate(final GC gc, final int cellWidth, final String text, final Image icon) {
		String result = text;
		int iconWidth = 0;
		if (icon != null) {
			iconWidth = icon.getImageData().width;
		}
		final int textWidth = gc.textExtent(text).x;
		final int usableCellWidth = cellWidth - iconWidth;
		if (textWidth > usableCellWidth) {
			final float ratio = ((float) usableCellWidth) / ((float) textWidth);
			final int nbCharacterMax = Math.max(Math.round((text.length() * ratio) - TextPainter.DOT.length()), 0);
			result = text.substring(0, nbCharacterMax) + TextPainter.DOT;
		}
		return result;
	}

	private Color mergeColors(final Color color1, final Color color2, final double opacity) {
		final double opacity2 = 1.0d - opacity;
		final RGB rgb = new RGB(((int) (color1.getRed() * opacity + color2.getRed() * opacity2)),
				((int) (color1.getGreen() * opacity + color2.getGreen() * opacity2)),
				((int) (color1.getBlue() * opacity + color2.getBlue() * opacity2)));
		final Device device = color1.getDevice();
		final IColorProvider colorProvider = IColorProviderFactory.DEFAULT
				.getOrCreateIColorProvider(device);
		return colorProvider.getColor(rgb);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}