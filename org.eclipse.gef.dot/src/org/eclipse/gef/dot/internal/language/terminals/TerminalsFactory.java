/**
 */
package org.eclipse.gef.dot.internal.language.terminals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.terminals.TerminalsPackage
 * @generated
 */
public interface TerminalsFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminalsFactory eINSTANCE = org.eclipse.gef.dot.internal.language.terminals.impl.TerminalsFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TerminalsPackage getTerminalsPackage();

} //TerminalsFactory
