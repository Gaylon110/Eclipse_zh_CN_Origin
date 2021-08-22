/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.services;

import org.eclipse.graphiti.mm.pictograms.Diagram;

/**
 * Migration support for converting models from older to newer versions.
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 * 
 * @since 0.8.0
 */
public interface IMigrationService {

	/**
	 * Moves fonts which, in 0.7.0, were aggregated by AbstractText and Style to
	 * the diagram which aggregates fonts centrally as of 0.8.0. Possibly
	 * modifies the diagram. Has to be called from within a write transaction.
	 * It is assumed that there is only one diagram stored in the underlying
	 * resource.
	 * 
	 * @param diagram
	 *            the diagram to be migrated
	 * @see {@link #shouldMigrate070To080(Diagram)}
	 */
	public abstract void migrate070To080(Diagram diagram);

	/**
	 * Checks if fonts are set on graphical elements while not being managed by
	 * the diagram. It is assumed that there is only one diagram stored in the
	 * underlying resource.
	 * 
	 * @param diagram
	 *            the diagram under consideration
	 * @return true if the diagram should be migrated, false otherwise
	 * 
	 * @see {@link #migrate070To080(Diagram)}
	 * 
	 */
	public abstract boolean shouldMigrate070To080(Diagram diagram);

	/**
	 * Sets all filled attributes of abstract text instances to false. Prior to
	 * 0.9 the filled attribute was not evaluated by the rendering engine. A
	 * actual value of TRUE was an effective FALSE. Has to be called from within
	 * a write transaction. It is assumed that there is only one diagram stored
	 * in the underlying resource.
	 * 
	 * @param d
	 *            the diagram to be migrated
	 * 
	 * @see org.eclipse.graphiti.ui.internal.editor.DiagramEditorInternal#migrateDiagramModelIfNecessary()
	 * @since 0.9
	 */
	public abstract void migrate080To090(Diagram d);

	/**
	 * Checks if a version number is present. Prior to 0.9 no version number was
	 * given to the diagram.
	 * 
	 * @param d
	 *            the diagram under consideration
	 * @return true if the diagram should be migrated
	 * 
	 * @see org.eclipse.graphiti.ui.internal.editor.DiagramEditorInternal#migrateDiagramModelIfNecessary()
	 * @since 0.9
	 */
	public abstract boolean shouldMigrate080To090(Diagram d);

}