/** 
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 */
package org.eclipse.emf.facet.widgets.table.examples.library.core.internal.query.eobject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryFactory;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;

public class CreateWriter implements org.eclipse.emf.facet.query.java.core.IJavaQuery2<EObject, Writer> {

	public Writer evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final org.eclipse.emf.facet.efacet.core.IFacetManager facetManager)
			throws DerivedTypedElementException {
		Writer result = null;
		final ParameterValue editingDomParam = parameterValues
				.getParameterValueByName("editingDomain"); //$NON-NLS-1$
		if (source == null) {
			throw new DerivedTypedElementException(
					"The source must not be null"); //$NON-NLS-1$
		}
		if (editingDomParam == null) {
			throw new DerivedTypedElementException(
					"An editing domain parameter must exists."); //$NON-NLS-1$
		}
		if (!(editingDomParam.getValue() instanceof EditingDomain)) {
			throw new DerivedTypedElementException(
					"An editing domain parameter must not be null."); //$NON-NLS-1$
		}
		final EditingDomain editingDomain = (EditingDomain) editingDomParam
				.getValue();
		final ICommandFactory cmdFactory = ICommandFactoriesRegistry.INSTANCE
				.getCommandFactoryFor(editingDomain);
		result = LibraryFactory.eINSTANCE.createWriter();
		final Command command = cmdFactory.createAddCommand(editingDomain,
				source, LibraryPackage.eINSTANCE.getLibrary_Writers(),
				result);
		editingDomain.getCommandStack().execute(command);
		return result;
	}
	
}
