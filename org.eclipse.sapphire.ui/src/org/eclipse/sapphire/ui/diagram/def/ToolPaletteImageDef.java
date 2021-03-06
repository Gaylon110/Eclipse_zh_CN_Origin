/******************************************************************************
 * Copyright (c) 2016 Oracle
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Shenxue Zhou - initial implementation and ongoing maintenance
 ******************************************************************************/

package org.eclipse.sapphire.ui.diagram.def;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.el.Function;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author <a href="mailto:shenxue.zhou@oracle.com">Shenxue Zhou</a>
 */

public interface ToolPaletteImageDef extends Element 
{
    ElementType TYPE = new ElementType( ToolPaletteImageDef.class );
    
    // *** ToolPaletteImage ***

    @Type( base = Function.class )
    @Required
    @XmlBinding( path = "" )

    ValueProperty PROP_TOOL_PALETTE_IMAGE = new ValueProperty( TYPE, "ToolPaletteImage" );
    
    Value<Function> getToolPaletteImage();
    void setToolPaletteImage( String value );
    void setToolPaletteImage( Function value );

}
