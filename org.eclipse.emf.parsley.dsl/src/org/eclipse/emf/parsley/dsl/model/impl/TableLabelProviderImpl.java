/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.parsley.dsl.model.FeatureBackgrounds;
import org.eclipse.emf.parsley.dsl.model.FeatureFonts;
import org.eclipse.emf.parsley.dsl.model.FeatureForegrounds;
import org.eclipse.emf.parsley.dsl.model.FeatureImages;
import org.eclipse.emf.parsley.dsl.model.FeatureTexts;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.RowBackgrounds;
import org.eclipse.emf.parsley.dsl.model.RowFonts;
import org.eclipse.emf.parsley.dsl.model.RowForegrounds;
import org.eclipse.emf.parsley.dsl.model.TableLabelProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Label Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getFeatureTexts <em>Feature Texts</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getFeatureImages <em>Feature Images</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getFeatureFonts <em>Feature Fonts</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getFeatureForegrounds <em>Feature Foregrounds</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getFeatureBackgrounds <em>Feature Backgrounds</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getRowFonts <em>Row Fonts</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getRowForegrounds <em>Row Foregrounds</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.TableLabelProviderImpl#getRowBackgrounds <em>Row Backgrounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableLabelProviderImpl extends WithFieldsImpl implements TableLabelProvider
{
  /**
   * The cached value of the '{@link #getFeatureTexts() <em>Feature Texts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureTexts()
   * @generated
   * @ordered
   */
  protected FeatureTexts featureTexts;

  /**
   * The cached value of the '{@link #getFeatureImages() <em>Feature Images</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureImages()
   * @generated
   * @ordered
   */
  protected FeatureImages featureImages;

  /**
   * The cached value of the '{@link #getFeatureFonts() <em>Feature Fonts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureFonts()
   * @generated
   * @ordered
   */
  protected FeatureFonts featureFonts;

  /**
   * The cached value of the '{@link #getFeatureForegrounds() <em>Feature Foregrounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureForegrounds()
   * @generated
   * @ordered
   */
  protected FeatureForegrounds featureForegrounds;

  /**
   * The cached value of the '{@link #getFeatureBackgrounds() <em>Feature Backgrounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureBackgrounds()
   * @generated
   * @ordered
   */
  protected FeatureBackgrounds featureBackgrounds;

  /**
   * The cached value of the '{@link #getRowFonts() <em>Row Fonts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowFonts()
   * @generated
   * @ordered
   */
  protected RowFonts rowFonts;

  /**
   * The cached value of the '{@link #getRowForegrounds() <em>Row Foregrounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowForegrounds()
   * @generated
   * @ordered
   */
  protected RowForegrounds rowForegrounds;

  /**
   * The cached value of the '{@link #getRowBackgrounds() <em>Row Backgrounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowBackgrounds()
   * @generated
   * @ordered
   */
  protected RowBackgrounds rowBackgrounds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableLabelProviderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.TABLE_LABEL_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureTexts getFeatureTexts()
  {
    return featureTexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureTexts(FeatureTexts newFeatureTexts, NotificationChain msgs)
  {
    FeatureTexts oldFeatureTexts = featureTexts;
    featureTexts = newFeatureTexts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS, oldFeatureTexts, newFeatureTexts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureTexts(FeatureTexts newFeatureTexts)
  {
    if (newFeatureTexts != featureTexts)
    {
      NotificationChain msgs = null;
      if (featureTexts != null)
        msgs = ((InternalEObject)featureTexts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS, null, msgs);
      if (newFeatureTexts != null)
        msgs = ((InternalEObject)newFeatureTexts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS, null, msgs);
      msgs = basicSetFeatureTexts(newFeatureTexts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS, newFeatureTexts, newFeatureTexts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureImages getFeatureImages()
  {
    return featureImages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureImages(FeatureImages newFeatureImages, NotificationChain msgs)
  {
    FeatureImages oldFeatureImages = featureImages;
    featureImages = newFeatureImages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES, oldFeatureImages, newFeatureImages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureImages(FeatureImages newFeatureImages)
  {
    if (newFeatureImages != featureImages)
    {
      NotificationChain msgs = null;
      if (featureImages != null)
        msgs = ((InternalEObject)featureImages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES, null, msgs);
      if (newFeatureImages != null)
        msgs = ((InternalEObject)newFeatureImages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES, null, msgs);
      msgs = basicSetFeatureImages(newFeatureImages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES, newFeatureImages, newFeatureImages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureFonts getFeatureFonts()
  {
    return featureFonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureFonts(FeatureFonts newFeatureFonts, NotificationChain msgs)
  {
    FeatureFonts oldFeatureFonts = featureFonts;
    featureFonts = newFeatureFonts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS, oldFeatureFonts, newFeatureFonts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureFonts(FeatureFonts newFeatureFonts)
  {
    if (newFeatureFonts != featureFonts)
    {
      NotificationChain msgs = null;
      if (featureFonts != null)
        msgs = ((InternalEObject)featureFonts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS, null, msgs);
      if (newFeatureFonts != null)
        msgs = ((InternalEObject)newFeatureFonts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS, null, msgs);
      msgs = basicSetFeatureFonts(newFeatureFonts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS, newFeatureFonts, newFeatureFonts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureForegrounds getFeatureForegrounds()
  {
    return featureForegrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureForegrounds(FeatureForegrounds newFeatureForegrounds, NotificationChain msgs)
  {
    FeatureForegrounds oldFeatureForegrounds = featureForegrounds;
    featureForegrounds = newFeatureForegrounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS, oldFeatureForegrounds, newFeatureForegrounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureForegrounds(FeatureForegrounds newFeatureForegrounds)
  {
    if (newFeatureForegrounds != featureForegrounds)
    {
      NotificationChain msgs = null;
      if (featureForegrounds != null)
        msgs = ((InternalEObject)featureForegrounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS, null, msgs);
      if (newFeatureForegrounds != null)
        msgs = ((InternalEObject)newFeatureForegrounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS, null, msgs);
      msgs = basicSetFeatureForegrounds(newFeatureForegrounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS, newFeatureForegrounds, newFeatureForegrounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureBackgrounds getFeatureBackgrounds()
  {
    return featureBackgrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureBackgrounds(FeatureBackgrounds newFeatureBackgrounds, NotificationChain msgs)
  {
    FeatureBackgrounds oldFeatureBackgrounds = featureBackgrounds;
    featureBackgrounds = newFeatureBackgrounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS, oldFeatureBackgrounds, newFeatureBackgrounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureBackgrounds(FeatureBackgrounds newFeatureBackgrounds)
  {
    if (newFeatureBackgrounds != featureBackgrounds)
    {
      NotificationChain msgs = null;
      if (featureBackgrounds != null)
        msgs = ((InternalEObject)featureBackgrounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS, null, msgs);
      if (newFeatureBackgrounds != null)
        msgs = ((InternalEObject)newFeatureBackgrounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS, null, msgs);
      msgs = basicSetFeatureBackgrounds(newFeatureBackgrounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS, newFeatureBackgrounds, newFeatureBackgrounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowFonts getRowFonts()
  {
    return rowFonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRowFonts(RowFonts newRowFonts, NotificationChain msgs)
  {
    RowFonts oldRowFonts = rowFonts;
    rowFonts = newRowFonts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS, oldRowFonts, newRowFonts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRowFonts(RowFonts newRowFonts)
  {
    if (newRowFonts != rowFonts)
    {
      NotificationChain msgs = null;
      if (rowFonts != null)
        msgs = ((InternalEObject)rowFonts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS, null, msgs);
      if (newRowFonts != null)
        msgs = ((InternalEObject)newRowFonts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS, null, msgs);
      msgs = basicSetRowFonts(newRowFonts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS, newRowFonts, newRowFonts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowForegrounds getRowForegrounds()
  {
    return rowForegrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRowForegrounds(RowForegrounds newRowForegrounds, NotificationChain msgs)
  {
    RowForegrounds oldRowForegrounds = rowForegrounds;
    rowForegrounds = newRowForegrounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS, oldRowForegrounds, newRowForegrounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRowForegrounds(RowForegrounds newRowForegrounds)
  {
    if (newRowForegrounds != rowForegrounds)
    {
      NotificationChain msgs = null;
      if (rowForegrounds != null)
        msgs = ((InternalEObject)rowForegrounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS, null, msgs);
      if (newRowForegrounds != null)
        msgs = ((InternalEObject)newRowForegrounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS, null, msgs);
      msgs = basicSetRowForegrounds(newRowForegrounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS, newRowForegrounds, newRowForegrounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowBackgrounds getRowBackgrounds()
  {
    return rowBackgrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRowBackgrounds(RowBackgrounds newRowBackgrounds, NotificationChain msgs)
  {
    RowBackgrounds oldRowBackgrounds = rowBackgrounds;
    rowBackgrounds = newRowBackgrounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS, oldRowBackgrounds, newRowBackgrounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRowBackgrounds(RowBackgrounds newRowBackgrounds)
  {
    if (newRowBackgrounds != rowBackgrounds)
    {
      NotificationChain msgs = null;
      if (rowBackgrounds != null)
        msgs = ((InternalEObject)rowBackgrounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS, null, msgs);
      if (newRowBackgrounds != null)
        msgs = ((InternalEObject)newRowBackgrounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS, null, msgs);
      msgs = basicSetRowBackgrounds(newRowBackgrounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS, newRowBackgrounds, newRowBackgrounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS:
        return basicSetFeatureTexts(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES:
        return basicSetFeatureImages(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS:
        return basicSetFeatureFonts(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS:
        return basicSetFeatureForegrounds(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS:
        return basicSetFeatureBackgrounds(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS:
        return basicSetRowFonts(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS:
        return basicSetRowForegrounds(null, msgs);
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS:
        return basicSetRowBackgrounds(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS:
        return getFeatureTexts();
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES:
        return getFeatureImages();
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS:
        return getFeatureFonts();
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS:
        return getFeatureForegrounds();
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS:
        return getFeatureBackgrounds();
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS:
        return getRowFonts();
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS:
        return getRowForegrounds();
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS:
        return getRowBackgrounds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS:
        setFeatureTexts((FeatureTexts)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES:
        setFeatureImages((FeatureImages)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS:
        setFeatureFonts((FeatureFonts)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS:
        setFeatureForegrounds((FeatureForegrounds)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS:
        setFeatureBackgrounds((FeatureBackgrounds)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS:
        setRowFonts((RowFonts)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS:
        setRowForegrounds((RowForegrounds)newValue);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS:
        setRowBackgrounds((RowBackgrounds)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS:
        setFeatureTexts((FeatureTexts)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES:
        setFeatureImages((FeatureImages)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS:
        setFeatureFonts((FeatureFonts)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS:
        setFeatureForegrounds((FeatureForegrounds)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS:
        setFeatureBackgrounds((FeatureBackgrounds)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS:
        setRowFonts((RowFonts)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS:
        setRowForegrounds((RowForegrounds)null);
        return;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS:
        setRowBackgrounds((RowBackgrounds)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_TEXTS:
        return featureTexts != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_IMAGES:
        return featureImages != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FONTS:
        return featureFonts != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_FOREGROUNDS:
        return featureForegrounds != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__FEATURE_BACKGROUNDS:
        return featureBackgrounds != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FONTS:
        return rowFonts != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_FOREGROUNDS:
        return rowForegrounds != null;
      case ModelPackage.TABLE_LABEL_PROVIDER__ROW_BACKGROUNDS:
        return rowBackgrounds != null;
    }
    return super.eIsSet(featureID);
  }

} //TableLabelProviderImpl