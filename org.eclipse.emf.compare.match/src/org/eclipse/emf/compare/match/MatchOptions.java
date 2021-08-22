/*******************************************************************************
 * Copyright (c) 2006, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.match;

/**
 * Defines constants for the different options available to tweak the matching process.
 * <p>
 * Available options include :
 * <table>
 * <tr>
 * <td>Option</td>
 * <td>effect</td>
 * <td>value</td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_DISTINCT_METAMODEL}</td>
 * <td>Specifies whether the models to compare are of the same meta-model. This mainly impact performance by
 * allowing faster checks to match elements (no use trying to match an interface and a class).</td>
 * <td>Boolean, defaults to <code>false</code></td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_IGNORE_ID}</td>
 * <td>Specifies whether we should ignore functional IDs when matching.</td>
 * <td>Boolean, defaults to <code>False</code></td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_IGNORE_XMI_ID}</td>
 * <td>Specifies whether we should ignore XMI IDs when matching.</td>
 * <td>Boolean, defaults to <code>False</code></td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_PROGRESS_MONITOR}</td>
 * <td>Specifies the progress monitor that will be used to monitor the comparison.</td>
 * <td>Instance of an IProgressMonitor's implementation, defaults to <code>null</code></td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_SEARCH_WINDOW}</td>
 * <td>Specifies the number of siblings the match procedure will consider to find similar objects. Higher
 * values increase comparison time, lower values decrease comparison accuracy.</td>
 * <td>Positive integer, defaults to <code>100</code>. A negative value will be reset to the default.</td>
 * </tr>
 * <tr>
 * <td>{@link #OPTION_MATCH_SCOPE_PROVIDER}</td>
 * <td>Allows to pass an {@link org.eclipse.emf.compare.match.engine.IMatchScopeProvider} instance to the
 * {@link org.eclipse.emf.compare.match.engine.IMatchEngine} to restrict the scope of comparison.</td>
 * <td>The specified {@link org.eclipse.emf.compare.match.engine.IMatchScopeProvider} may be evaluated by the
 * {@link org.eclipse.emf.compare.match.engine.IMatchEngine} to restrict the scope of objects/resources to be
 * compared.</td>
 * </tr>
 * </table>
 * </p>
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public interface MatchOptions {
	/** Default value for the "distinct metamodel" option. */
	boolean DEFAULT_DISTINCT_METAMODEL = false;

	/** Default value for the "ignore functional id" option. */
	boolean DEFAULT_IGNORE_ID = false;

	/** Default value for the "ignore xmi id" option. */
	boolean DEFAULT_IGNORE_XMI_ID = false;

	/** Default value for the search window. */
	int DEFAULT_SEARCH_WINDOW = 100;

	/** Key for the option specifying whether the compared models are of distinct meta-models. */
	String OPTION_DISTINCT_METAMODELS = "match.distinct.metamodels"; //$NON-NLS-1$

	/** Key for the option specifying whether we should ignore functional IDs for comparison. */
	String OPTION_IGNORE_ID = "match.ignore.id"; //$NON-NLS-1$

	/** Key for the option specifying whether we should ignore XMI ID when comparing. */
	String OPTION_IGNORE_XMI_ID = "match.ignore.xmi.id"; //$NON-NLS-1$

	/** Key for the option to give a progress monitor to the match engine. */
	String OPTION_PROGRESS_MONITOR = "match.progress.monitor"; //$NON-NLS-1$

	/** Key for the option defining the search window. */
	String OPTION_SEARCH_WINDOW = "match.search.window"; //$NON-NLS-1$

	/**
	 * Key for an {@link org.eclipse.emf.compare.match.engine.IMatchScopeProvider} to limit the scope
	 * processed by the match engine.
	 * 
	 * @since 1.1
	 */
	String OPTION_MATCH_SCOPE_PROVIDER = "match.scope.provider"; //$NON-NLS-1$
}
