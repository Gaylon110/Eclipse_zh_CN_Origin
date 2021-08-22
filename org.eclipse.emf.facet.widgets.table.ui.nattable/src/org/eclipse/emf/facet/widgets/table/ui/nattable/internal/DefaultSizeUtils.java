/*******************************************************************************
 * Copyright (c) 2012, 2013 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 352485 - [Table] Default height of cells is too small, leading to text truncations
 *    Fabien Treguer (Soft-Maint) - Bug 422829 - [Table] Row height too small when Windows dpi settings are increased
 *    Grégoire Dupé (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.swt.fontprovider.IFontProvider;
import org.eclipse.emf.facet.util.swt.fontprovider.IFontProviderFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public final class DefaultSizeUtils {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());

	private static final int DEFAULT_WIDTH = 100;
	private static final int WIDTH_MARGIN = 0;
	private static final int DEFAULT_HEIGHT = 20;
	private static final int HEIGHT_MARGIN = 4;
	private static final int DEFAULT_HEADER_WIDTH = 20;
	private static final int DEFAULT_HEADER_WIDTH_PER_DIGIT = 8;
	private static final int HEADER_WIDTH_MARGIN = 4;
	private static final int DEFAULT_DPI = 96;

	private static Font headerFont = null;
	
	private DefaultSizeUtils() {
		// Must not be used.
	}

	public static int getDefaultCellHeight() {
		return getCellHeight(-1);
	}

	public static int getCellHeight(final int storedHeight) {
		int height;
		if (storedHeight == -1) {
			height = (int) (DEFAULT_HEIGHT * getRatio()) + HEIGHT_MARGIN;
		} else {
			final int basicHeight = Math.max(1, storedHeight) - HEIGHT_MARGIN;
			height = (int) (basicHeight * getRatio() + HEIGHT_MARGIN);
		}
		if (DefaultSizeUtils.DEBUG) {
			DebugUtils.debug("height=" + height); //$NON-NLS-1$
		}
		return height;
	}

	public static int getDefaultCellWidth() {
		return getCellWidth(-1);
	}
	
	public static int getCellWidth(final int storedWidth) {
		int width;
		if (storedWidth == -1) {
			width = (int) (DEFAULT_WIDTH * getRatio()) + DefaultSizeUtils.WIDTH_MARGIN;
		} else {
			final int basicWidth = Math.max(1, storedWidth) - WIDTH_MARGIN;
			width = (int) (basicWidth * getRatio() + WIDTH_MARGIN);
		}
		if (DefaultSizeUtils.DEBUG) {
			DebugUtils.debug("width=" + width); //$NON-NLS-1$
		}
		return width;
	}

	public static int getDefaultRowHeaderWidth() {
		final int width = (int) (DEFAULT_HEADER_WIDTH * getRatio()) + DefaultSizeUtils.HEADER_WIDTH_MARGIN;
		if (DefaultSizeUtils.DEBUG) {
			DebugUtils.debug("width=" + width); //$NON-NLS-1$
		}
		return width;
	}
	
	public static int getRowHeaderWidth(final int rowCount) {
		final int nbDigits = String.valueOf(rowCount).length();
		final int nbDigitsSensitiveWidth = DEFAULT_HEADER_WIDTH_PER_DIGIT * nbDigits;
		final int basicWidth = Math.max(DEFAULT_HEADER_WIDTH, nbDigitsSensitiveWidth);
		final int width = (int) (basicWidth * getRatio()) + DefaultSizeUtils.HEADER_WIDTH_MARGIN;
		if (DefaultSizeUtils.DEBUG) {
			DebugUtils.debug("width=" + width); //$NON-NLS-1$
		}
		return width;
	}

	public static Font getHeaderFont() {
		if (headerFont == null) {
			final Font systemFont = Display.getDefault().getSystemFont();
			final FontData[] fontData = systemFont.getFontData();
			final FontData[] fd = fontData.clone();
			fd[0].setStyle(SWT.BOLD);
			final IFontProvider fontProvider = IFontProviderFactory.DEFAULT
					.getOrCreateIFontProvider(Display.getDefault());
			headerFont = fontProvider.getFont(fd[0]);
		}
		return headerFont;
	}
	
	private static double getRatio() {
		int dpiX = Display.getDefault().getDPI().x;
		int dpiY = Display.getDefault().getDPI().y;
		if (DefaultSizeUtils.DEBUG) {
			DebugUtils.debug("dpi x=" + dpiX); //$NON-NLS-1$
			DebugUtils.debug("dpi y=" + dpiX); //$NON-NLS-1$
		}
		return ((double) dpiY) / DefaultSizeUtils.DEFAULT_DPI;
	}
}
