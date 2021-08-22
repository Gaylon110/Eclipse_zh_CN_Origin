/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelFactory eINSTANCE = org.eclipse.emf.parsley.dsl.model.impl.ModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Extends Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends Clause</em>'.
   * @generated
   */
  ExtendsClause createExtendsClause();

  /**
   * Returns a new object of class '<em>Bindings Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bindings Specification</em>'.
   * @generated
   */
  BindingsSpecification createBindingsSpecification();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Label Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Provider</em>'.
   * @generated
   */
  LabelProvider createLabelProvider();

  /**
   * Returns a new object of class '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Specification</em>'.
   * @generated
   */
  FieldSpecification createFieldSpecification();

  /**
   * Returns a new object of class '<em>Texts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Texts</em>'.
   * @generated
   */
  Texts createTexts();

  /**
   * Returns a new object of class '<em>Images</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Images</em>'.
   * @generated
   */
  Images createImages();

  /**
   * Returns a new object of class '<em>Fonts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fonts</em>'.
   * @generated
   */
  Fonts createFonts();

  /**
   * Returns a new object of class '<em>Foregrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foregrounds</em>'.
   * @generated
   */
  Foregrounds createForegrounds();

  /**
   * Returns a new object of class '<em>Backgrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Backgrounds</em>'.
   * @generated
   */
  Backgrounds createBackgrounds();

  /**
   * Returns a new object of class '<em>Table Label Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Label Provider</em>'.
   * @generated
   */
  TableLabelProvider createTableLabelProvider();

  /**
   * Returns a new object of class '<em>Polymorphic Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polymorphic Specification</em>'.
   * @generated
   */
  PolymorphicSpecification createPolymorphicSpecification();

  /**
   * Returns a new object of class '<em>Feature Caption Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Caption Provider</em>'.
   * @generated
   */
  FeatureCaptionProvider createFeatureCaptionProvider();

  /**
   * Returns a new object of class '<em>Form Feature Caption Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Feature Caption Provider</em>'.
   * @generated
   */
  FormFeatureCaptionProvider createFormFeatureCaptionProvider();

  /**
   * Returns a new object of class '<em>Dialog Feature Caption Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialog Feature Caption Provider</em>'.
   * @generated
   */
  DialogFeatureCaptionProvider createDialogFeatureCaptionProvider();

  /**
   * Returns a new object of class '<em>Feature Texts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Texts</em>'.
   * @generated
   */
  FeatureTexts createFeatureTexts();

  /**
   * Returns a new object of class '<em>Feature Images</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Images</em>'.
   * @generated
   */
  FeatureImages createFeatureImages();

  /**
   * Returns a new object of class '<em>Feature Fonts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Fonts</em>'.
   * @generated
   */
  FeatureFonts createFeatureFonts();

  /**
   * Returns a new object of class '<em>Feature Foregrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Foregrounds</em>'.
   * @generated
   */
  FeatureForegrounds createFeatureForegrounds();

  /**
   * Returns a new object of class '<em>Feature Backgrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Backgrounds</em>'.
   * @generated
   */
  FeatureBackgrounds createFeatureBackgrounds();

  /**
   * Returns a new object of class '<em>Feature Labels</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Labels</em>'.
   * @generated
   */
  FeatureLabels createFeatureLabels();

  /**
   * Returns a new object of class '<em>With Feature Associated Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Feature Associated Expressions</em>'.
   * @generated
   */
  WithFeatureAssociatedExpressions createWithFeatureAssociatedExpressions();

  /**
   * Returns a new object of class '<em>Row Fonts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Fonts</em>'.
   * @generated
   */
  RowFonts createRowFonts();

  /**
   * Returns a new object of class '<em>Row Foregrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Foregrounds</em>'.
   * @generated
   */
  RowForegrounds createRowForegrounds();

  /**
   * Returns a new object of class '<em>Row Backgrounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row Backgrounds</em>'.
   * @generated
   */
  RowBackgrounds createRowBackgrounds();

  /**
   * Returns a new object of class '<em>With Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Expressions</em>'.
   * @generated
   */
  WithExpressions createWithExpressions();

  /**
   * Returns a new object of class '<em>Feature Associated Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Associated Expression</em>'.
   * @generated
   */
  FeatureAssociatedExpression createFeatureAssociatedExpression();

  /**
   * Returns a new object of class '<em>Features Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features Provider</em>'.
   * @generated
   */
  FeaturesProvider createFeaturesProvider();

  /**
   * Returns a new object of class '<em>Table Features Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Features Provider</em>'.
   * @generated
   */
  TableFeaturesProvider createTableFeaturesProvider();

  /**
   * Returns a new object of class '<em>Feature Specifications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Specifications</em>'.
   * @generated
   */
  FeatureSpecifications createFeatureSpecifications();

  /**
   * Returns a new object of class '<em>Feature Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Specification</em>'.
   * @generated
   */
  FeatureSpecification createFeatureSpecification();

  /**
   * Returns a new object of class '<em>Form Control Factory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Control Factory</em>'.
   * @generated
   */
  FormControlFactory createFormControlFactory();

  /**
   * Returns a new object of class '<em>Dialog Control Factory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialog Control Factory</em>'.
   * @generated
   */
  DialogControlFactory createDialogControlFactory();

  /**
   * Returns a new object of class '<em>Control Factory Specifications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Factory Specifications</em>'.
   * @generated
   */
  ControlFactorySpecifications createControlFactorySpecifications();

  /**
   * Returns a new object of class '<em>Control Factory Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Factory Specification</em>'.
   * @generated
   */
  ControlFactorySpecification createControlFactorySpecification();

  /**
   * Returns a new object of class '<em>Proposal Creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposal Creator</em>'.
   * @generated
   */
  ProposalCreator createProposalCreator();

  /**
   * Returns a new object of class '<em>Menu Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu Builder</em>'.
   * @generated
   */
  MenuBuilder createMenuBuilder();

  /**
   * Returns a new object of class '<em>Menus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menus</em>'.
   * @generated
   */
  Menus createMenus();

  /**
   * Returns a new object of class '<em>Emf Menus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emf Menus</em>'.
   * @generated
   */
  EmfMenus createEmfMenus();

  /**
   * Returns a new object of class '<em>Configurator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configurator</em>'.
   * @generated
   */
  Configurator createConfigurator();

  /**
   * Returns a new object of class '<em>Configurator Resource URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configurator Resource URI</em>'.
   * @generated
   */
  ConfiguratorResourceURI createConfiguratorResourceURI();

  /**
   * Returns a new object of class '<em>Configurator EClass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configurator EClass</em>'.
   * @generated
   */
  ConfiguratorEClass createConfiguratorEClass();

  /**
   * Returns a new object of class '<em>Viewer Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewer Content Provider</em>'.
   * @generated
   */
  ViewerContentProvider createViewerContentProvider();

  /**
   * Returns a new object of class '<em>Table Viewer Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Viewer Content Provider</em>'.
   * @generated
   */
  TableViewerContentProvider createTableViewerContentProvider();

  /**
   * Returns a new object of class '<em>Content Provider Children</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Provider Children</em>'.
   * @generated
   */
  ContentProviderChildren createContentProviderChildren();

  /**
   * Returns a new object of class '<em>Content Provider Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Provider Elements</em>'.
   * @generated
   */
  ContentProviderElements createContentProviderElements();

  /**
   * Returns a new object of class '<em>Resource Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Manager</em>'.
   * @generated
   */
  ResourceManager createResourceManager();

  /**
   * Returns a new object of class '<em>Simple Method Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Method Specification</em>'.
   * @generated
   */
  SimpleMethodSpecification createSimpleMethodSpecification();

  /**
   * Returns a new object of class '<em>Emf Feature Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emf Feature Access</em>'.
   * @generated
   */
  EmfFeatureAccess createEmfFeatureAccess();

  /**
   * Returns a new object of class '<em>Abstract Feature Caption Provider With Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Feature Caption Provider With Label</em>'.
   * @generated
   */
  AbstractFeatureCaptionProviderWithLabel createAbstractFeatureCaptionProviderWithLabel();

  /**
   * Returns a new object of class '<em>Abstract Feature Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Feature Provider</em>'.
   * @generated
   */
  AbstractFeatureProvider createAbstractFeatureProvider();

  /**
   * Returns a new object of class '<em>Abstract Control Factory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Control Factory</em>'.
   * @generated
   */
  AbstractControlFactory createAbstractControlFactory();

  /**
   * Returns a new object of class '<em>With Extends Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Extends Clause</em>'.
   * @generated
   */
  WithExtendsClause createWithExtendsClause();

  /**
   * Returns a new object of class '<em>With Fields</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Fields</em>'.
   * @generated
   */
  WithFields createWithFields();

  /**
   * Returns a new object of class '<em>Parts Specifications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parts Specifications</em>'.
   * @generated
   */
  PartsSpecifications createPartsSpecifications();

  /**
   * Returns a new object of class '<em>Part Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part Specification</em>'.
   * @generated
   */
  PartSpecification createPartSpecification();

  /**
   * Returns a new object of class '<em>View Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Specification</em>'.
   * @generated
   */
  ViewSpecification createViewSpecification();

  /**
   * Returns a new object of class '<em>Type Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Binding</em>'.
   * @generated
   */
  TypeBinding createTypeBinding();

  /**
   * Returns a new object of class '<em>Provider Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider Binding</em>'.
   * @generated
   */
  ProviderBinding createProviderBinding();

  /**
   * Returns a new object of class '<em>Value Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Binding</em>'.
   * @generated
   */
  ValueBinding createValueBinding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelPackage getModelPackage();

} //ModelFactory