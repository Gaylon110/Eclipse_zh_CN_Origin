/*
 * Copyright (c) 2006 Matthew Hall and others.
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

import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;

/**
 * Instances implementing this interface are representing an entry in a
 * LayerPrint.
 *
 * @author Matthew Hall
 */
public interface LayerEntry {

	/**
	 * Returns the target print of this entry.
	 *
	 * @return the target print of this entry.
	 */
	Print getTarget();

	/**
	 * Returns the horizontal alignment applied to the target.
	 *
	 * @return the horizontal alignment applied to the target.
	 */
	int getHorizontalAlignment();

	/**
	 * @param device
	 * @param gc
	 * @return the associated iterator for this entry
	 */
	LayerEntryIterator iterator(Device device, GC gc);
}