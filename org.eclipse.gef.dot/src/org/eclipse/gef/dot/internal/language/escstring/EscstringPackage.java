/**
 */
package org.eclipse.gef.dot.internal.language.escstring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.gef.dot.internal.language.escstring.EscstringFactory
 * @model kind="package"
 * @generated
 */
public interface EscstringPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "escstring";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotEscString";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "escstring";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EscstringPackage eINSTANCE = org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.escstring.impl.EscStringImpl <em>Esc String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscStringImpl
   * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getEscString()
   * @generated
   */
  int ESC_STRING = 0;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESC_STRING__LINES = 0;

  /**
   * The number of structural features of the '<em>Esc String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESC_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl <em>Justified Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl
   * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getJustifiedText()
   * @generated
   */
  int JUSTIFIED_TEXT = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFIED_TEXT__TEXT = 0;

  /**
   * The feature id for the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFIED_TEXT__JUSTIFICATION = 1;

  /**
   * The number of structural features of the '<em>Justified Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFIED_TEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.escstring.Justification <em>Justification</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.escstring.Justification
   * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getJustification()
   * @generated
   */
  int JUSTIFICATION = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.escstring.EscString <em>Esc String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Esc String</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.EscString
   * @generated
   */
  EClass getEscString();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.escstring.EscString#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.EscString#getLines()
   * @see #getEscString()
   * @generated
   */
  EReference getEscString_Lines();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText <em>Justified Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Justified Text</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.JustifiedText
   * @generated
   */
  EClass getJustifiedText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getText()
   * @see #getJustifiedText()
   * @generated
   */
  EAttribute getJustifiedText_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Justification</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getJustification()
   * @see #getJustifiedText()
   * @generated
   */
  EAttribute getJustifiedText_Justification();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.escstring.Justification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Justification</em>'.
   * @see org.eclipse.gef.dot.internal.language.escstring.Justification
   * @generated
   */
  EEnum getJustification();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EscstringFactory getEscstringFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.escstring.impl.EscStringImpl <em>Esc String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscStringImpl
     * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getEscString()
     * @generated
     */
    EClass ESC_STRING = eINSTANCE.getEscString();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESC_STRING__LINES = eINSTANCE.getEscString_Lines();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl <em>Justified Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl
     * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getJustifiedText()
     * @generated
     */
    EClass JUSTIFIED_TEXT = eINSTANCE.getJustifiedText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTIFIED_TEXT__TEXT = eINSTANCE.getJustifiedText_Text();

    /**
     * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTIFIED_TEXT__JUSTIFICATION = eINSTANCE.getJustifiedText_Justification();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.escstring.Justification <em>Justification</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.escstring.Justification
     * @see org.eclipse.gef.dot.internal.language.escstring.impl.EscstringPackageImpl#getJustification()
     * @generated
     */
    EEnum JUSTIFICATION = eINSTANCE.getJustification();

  }

} //EscstringPackage
