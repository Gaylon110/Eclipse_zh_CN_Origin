/******************************************************************************
 * Copyright (c) 2016 Oracle
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ling Hao - initial implementation and ongoing maintenance
 ******************************************************************************/

package org.eclipse.sapphire.ui.swt.gef.parts;

import org.eclipse.sapphire.ui.swt.gef.DiagramConfigurationManager;

/**
 * @author <a href="mailto:ling.hao@oracle.com">Ling Hao</a>
 */

public class LineShapeEditPart extends ShapeEditPart
{
	public LineShapeEditPart(DiagramConfigurationManager configManager)
	{
		super(configManager);
	}

	@Override
	public boolean isSelectable() {
		return false;
	}
}
