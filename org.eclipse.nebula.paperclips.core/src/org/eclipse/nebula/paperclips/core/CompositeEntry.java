/*
 * Copyright (c) 2005 Matthew Hall and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Matthew Hall - initial API and implementation
 */
package org.eclipse.nebula.paperclips.core;

import org.eclipse.nebula.paperclips.core.internal.util.Util;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;

/**
 * An entry in a CompositePiece.
 * 
 * @author Matthew Hall
 */
public class CompositeEntry {
	final PrintPiece piece;
	final Point offset;

	/**
	 * Constructs a CompositeEntry with the given PrintPiece and offset.
	 * 
	 * @param piece
	 *            the PrintPiece for this entry.
	 * @param offset
	 *            the painting offset within the CompositePrint.
	 */
	public CompositeEntry(PrintPiece piece, Point offset) {
		Util.notNull(piece, offset);
		checkOffset(offset);

		this.piece = piece;
		this.offset = offset;
	}

	private void checkOffset(Point offset) {
		if (offset.x < 0 || offset.y < 0)
			PaperClips.error(SWT.ERROR_INVALID_ARGUMENT,
					"Offset cannot be negative: " + offset); //$NON-NLS-1$
	}

	/**
	 * Disposes this entry's print piece.
	 */
	public void dispose() {
		piece.dispose();
	}
}