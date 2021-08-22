/**
 */
package org.eclipse.gef.dot.internal.language.terminals;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.terminals.TerminalsFactory
 * @model kind="package"
 * @generated
 */
public interface TerminalsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terminals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotTerminals";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terminals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminalsPackage eINSTANCE = org.eclipse.gef.dot.internal.language.terminals.impl.TerminalsPackageImpl.init();

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.dot.internal.language.terminals.ID
	 * @see org.eclipse.gef.dot.internal.language.terminals.impl.TerminalsPackageImpl#getID()
	 * @generated
	 */
	int ID = 0;


	/**
	 * Returns the meta object for data type '{@link org.eclipse.gef.dot.internal.language.terminals.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see org.eclipse.gef.dot.internal.language.terminals.ID
	 * @model instanceClass="org.eclipse.gef.dot.internal.language.terminals.ID"
	 * @generated
	 */
	EDataType getID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TerminalsFactory getTerminalsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef.dot.internal.language.terminals.ID
		 * @see org.eclipse.gef.dot.internal.language.terminals.impl.TerminalsPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

	}

} //TerminalsPackage
