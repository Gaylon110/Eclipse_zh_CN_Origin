/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.util.internal

import com.google.common.annotations.Beta
import java.lang.annotation.Target
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration

@Beta
@Target(TYPE)
@Active(LogProcessor)
annotation Log {
}

class LogProcessor extends AbstractClassProcessor {
	
	override doTransform(MutableClassDeclaration cls, extension TransformationContext context) {
		cls.addField("LOG") [
			static = true
			final = true
			type = Logger.newTypeReference
			initializer = '''
				?Logger?.getLogger(?cls.simpleName?.class)
			'''
			primarySourceElement = cls
		]
	}
}