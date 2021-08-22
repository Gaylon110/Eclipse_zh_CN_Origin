/**
 */
package org.eclipse.gef.dot.internal.language.terminals.impl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.terminals.TerminalsFactory;
import org.eclipse.gef.dot.internal.language.terminals.TerminalsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminalsPackageImpl extends EPackageImpl implements TerminalsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gef.dot.internal.language.terminals.TerminalsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TerminalsPackageImpl()
	{
		super(eNS_URI, TerminalsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TerminalsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TerminalsPackage init()
	{
		if (isInited) return (TerminalsPackage)EPackage.Registry.INSTANCE.getEPackage(TerminalsPackage.eNS_URI);

		// Obtain or create and register package
		TerminalsPackageImpl theTerminalsPackage = (TerminalsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TerminalsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TerminalsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTerminalsPackage.createPackageContents();

		// Initialize created meta-data
		theTerminalsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTerminalsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TerminalsPackage.eNS_URI, theTerminalsPackage);
		return theTerminalsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getID()
	{
		return idEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalsFactory getTerminalsFactory()
	{
		return (TerminalsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create data types
		idEDataType = createEDataType(ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(idEDataType, org.eclipse.gef.dot.internal.language.terminals.ID.class, "ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TerminalsPackageImpl
