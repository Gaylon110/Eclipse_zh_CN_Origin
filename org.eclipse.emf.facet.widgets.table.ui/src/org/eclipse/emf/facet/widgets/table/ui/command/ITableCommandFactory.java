/*******************************************************************************
 * Copyright (c) 2012 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.command;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITableCommandFactory {

	Command createRemoveRowByEObjectCommand(Collection<? extends EObject> eObjects);
	
	Command createAddRowsCommand(Collection<? extends EObject> eObjects);
	
	Command createSetFacetSetsCommand(List<? extends FacetSet> facetSets);
}
