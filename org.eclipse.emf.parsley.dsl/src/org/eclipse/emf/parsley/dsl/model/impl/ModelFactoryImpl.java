/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.parsley.dsl.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelFactory init()
  {
    try
    {
      ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
      if (theModelFactory != null)
      {
        return theModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelPackage.MODEL: return createModel();
      case ModelPackage.MODULE: return createModule();
      case ModelPackage.EXTENDS_CLAUSE: return createExtendsClause();
      case ModelPackage.BINDINGS_SPECIFICATION: return createBindingsSpecification();
      case ModelPackage.BINDING: return createBinding();
      case ModelPackage.LABEL_PROVIDER: return createLabelProvider();
      case ModelPackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case ModelPackage.TEXTS: return createTexts();
      case ModelPackage.IMAGES: return createImages();
      case ModelPackage.FONTS: return createFonts();
      case ModelPackage.FOREGROUNDS: return createForegrounds();
      case ModelPackage.BACKGROUNDS: return createBackgrounds();
      case ModelPackage.TABLE_LABEL_PROVIDER: return createTableLabelProvider();
      case ModelPackage.POLYMORPHIC_SPECIFICATION: return createPolymorphicSpecification();
      case ModelPackage.FEATURE_CAPTION_PROVIDER: return createFeatureCaptionProvider();
      case ModelPackage.FORM_FEATURE_CAPTION_PROVIDER: return createFormFeatureCaptionProvider();
      case ModelPackage.DIALOG_FEATURE_CAPTION_PROVIDER: return createDialogFeatureCaptionProvider();
      case ModelPackage.FEATURE_TEXTS: return createFeatureTexts();
      case ModelPackage.FEATURE_IMAGES: return createFeatureImages();
      case ModelPackage.FEATURE_FONTS: return createFeatureFonts();
      case ModelPackage.FEATURE_FOREGROUNDS: return createFeatureForegrounds();
      case ModelPackage.FEATURE_BACKGROUNDS: return createFeatureBackgrounds();
      case ModelPackage.FEATURE_LABELS: return createFeatureLabels();
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS: return createWithFeatureAssociatedExpressions();
      case ModelPackage.ROW_FONTS: return createRowFonts();
      case ModelPackage.ROW_FOREGROUNDS: return createRowForegrounds();
      case ModelPackage.ROW_BACKGROUNDS: return createRowBackgrounds();
      case ModelPackage.WITH_EXPRESSIONS: return createWithExpressions();
      case ModelPackage.FEATURE_ASSOCIATED_EXPRESSION: return createFeatureAssociatedExpression();
      case ModelPackage.FEATURES_PROVIDER: return createFeaturesProvider();
      case ModelPackage.TABLE_FEATURES_PROVIDER: return createTableFeaturesProvider();
      case ModelPackage.FEATURE_SPECIFICATIONS: return createFeatureSpecifications();
      case ModelPackage.FEATURE_SPECIFICATION: return createFeatureSpecification();
      case ModelPackage.FORM_CONTROL_FACTORY: return createFormControlFactory();
      case ModelPackage.DIALOG_CONTROL_FACTORY: return createDialogControlFactory();
      case ModelPackage.CONTROL_FACTORY_SPECIFICATIONS: return createControlFactorySpecifications();
      case ModelPackage.CONTROL_FACTORY_SPECIFICATION: return createControlFactorySpecification();
      case ModelPackage.PROPOSAL_CREATOR: return createProposalCreator();
      case ModelPackage.MENU_BUILDER: return createMenuBuilder();
      case ModelPackage.MENUS: return createMenus();
      case ModelPackage.EMF_MENUS: return createEmfMenus();
      case ModelPackage.CONFIGURATOR: return createConfigurator();
      case ModelPackage.CONFIGURATOR_RESOURCE_URI: return createConfiguratorResourceURI();
      case ModelPackage.CONFIGURATOR_ECLASS: return createConfiguratorEClass();
      case ModelPackage.VIEWER_CONTENT_PROVIDER: return createViewerContentProvider();
      case ModelPackage.TABLE_VIEWER_CONTENT_PROVIDER: return createTableViewerContentProvider();
      case ModelPackage.CONTENT_PROVIDER_CHILDREN: return createContentProviderChildren();
      case ModelPackage.CONTENT_PROVIDER_ELEMENTS: return createContentProviderElements();
      case ModelPackage.RESOURCE_MANAGER: return createResourceManager();
      case ModelPackage.SIMPLE_METHOD_SPECIFICATION: return createSimpleMethodSpecification();
      case ModelPackage.EMF_FEATURE_ACCESS: return createEmfFeatureAccess();
      case ModelPackage.ABSTRACT_FEATURE_CAPTION_PROVIDER_WITH_LABEL: return createAbstractFeatureCaptionProviderWithLabel();
      case ModelPackage.ABSTRACT_FEATURE_PROVIDER: return createAbstractFeatureProvider();
      case ModelPackage.ABSTRACT_CONTROL_FACTORY: return createAbstractControlFactory();
      case ModelPackage.WITH_EXTENDS_CLAUSE: return createWithExtendsClause();
      case ModelPackage.WITH_FIELDS: return createWithFields();
      case ModelPackage.PARTS_SPECIFICATIONS: return createPartsSpecifications();
      case ModelPackage.PART_SPECIFICATION: return createPartSpecification();
      case ModelPackage.VIEW_SPECIFICATION: return createViewSpecification();
      case ModelPackage.TYPE_BINDING: return createTypeBinding();
      case ModelPackage.PROVIDER_BINDING: return createProviderBinding();
      case ModelPackage.VALUE_BINDING: return createValueBinding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsClause createExtendsClause()
  {
    ExtendsClauseImpl extendsClause = new ExtendsClauseImpl();
    return extendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingsSpecification createBindingsSpecification()
  {
    BindingsSpecificationImpl bindingsSpecification = new BindingsSpecificationImpl();
    return bindingsSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelProvider createLabelProvider()
  {
    LabelProviderImpl labelProvider = new LabelProviderImpl();
    return labelProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldSpecification createFieldSpecification()
  {
    FieldSpecificationImpl fieldSpecification = new FieldSpecificationImpl();
    return fieldSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Texts createTexts()
  {
    TextsImpl texts = new TextsImpl();
    return texts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Images createImages()
  {
    ImagesImpl images = new ImagesImpl();
    return images;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fonts createFonts()
  {
    FontsImpl fonts = new FontsImpl();
    return fonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foregrounds createForegrounds()
  {
    ForegroundsImpl foregrounds = new ForegroundsImpl();
    return foregrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Backgrounds createBackgrounds()
  {
    BackgroundsImpl backgrounds = new BackgroundsImpl();
    return backgrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableLabelProvider createTableLabelProvider()
  {
    TableLabelProviderImpl tableLabelProvider = new TableLabelProviderImpl();
    return tableLabelProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolymorphicSpecification createPolymorphicSpecification()
  {
    PolymorphicSpecificationImpl polymorphicSpecification = new PolymorphicSpecificationImpl();
    return polymorphicSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCaptionProvider createFeatureCaptionProvider()
  {
    FeatureCaptionProviderImpl featureCaptionProvider = new FeatureCaptionProviderImpl();
    return featureCaptionProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormFeatureCaptionProvider createFormFeatureCaptionProvider()
  {
    FormFeatureCaptionProviderImpl formFeatureCaptionProvider = new FormFeatureCaptionProviderImpl();
    return formFeatureCaptionProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogFeatureCaptionProvider createDialogFeatureCaptionProvider()
  {
    DialogFeatureCaptionProviderImpl dialogFeatureCaptionProvider = new DialogFeatureCaptionProviderImpl();
    return dialogFeatureCaptionProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureTexts createFeatureTexts()
  {
    FeatureTextsImpl featureTexts = new FeatureTextsImpl();
    return featureTexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureImages createFeatureImages()
  {
    FeatureImagesImpl featureImages = new FeatureImagesImpl();
    return featureImages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureFonts createFeatureFonts()
  {
    FeatureFontsImpl featureFonts = new FeatureFontsImpl();
    return featureFonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureForegrounds createFeatureForegrounds()
  {
    FeatureForegroundsImpl featureForegrounds = new FeatureForegroundsImpl();
    return featureForegrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureBackgrounds createFeatureBackgrounds()
  {
    FeatureBackgroundsImpl featureBackgrounds = new FeatureBackgroundsImpl();
    return featureBackgrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureLabels createFeatureLabels()
  {
    FeatureLabelsImpl featureLabels = new FeatureLabelsImpl();
    return featureLabels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithFeatureAssociatedExpressions createWithFeatureAssociatedExpressions()
  {
    WithFeatureAssociatedExpressionsImpl withFeatureAssociatedExpressions = new WithFeatureAssociatedExpressionsImpl();
    return withFeatureAssociatedExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowFonts createRowFonts()
  {
    RowFontsImpl rowFonts = new RowFontsImpl();
    return rowFonts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowForegrounds createRowForegrounds()
  {
    RowForegroundsImpl rowForegrounds = new RowForegroundsImpl();
    return rowForegrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowBackgrounds createRowBackgrounds()
  {
    RowBackgroundsImpl rowBackgrounds = new RowBackgroundsImpl();
    return rowBackgrounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithExpressions createWithExpressions()
  {
    WithExpressionsImpl withExpressions = new WithExpressionsImpl();
    return withExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureAssociatedExpression createFeatureAssociatedExpression()
  {
    FeatureAssociatedExpressionImpl featureAssociatedExpression = new FeatureAssociatedExpressionImpl();
    return featureAssociatedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturesProvider createFeaturesProvider()
  {
    FeaturesProviderImpl featuresProvider = new FeaturesProviderImpl();
    return featuresProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableFeaturesProvider createTableFeaturesProvider()
  {
    TableFeaturesProviderImpl tableFeaturesProvider = new TableFeaturesProviderImpl();
    return tableFeaturesProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureSpecifications createFeatureSpecifications()
  {
    FeatureSpecificationsImpl featureSpecifications = new FeatureSpecificationsImpl();
    return featureSpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureSpecification createFeatureSpecification()
  {
    FeatureSpecificationImpl featureSpecification = new FeatureSpecificationImpl();
    return featureSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormControlFactory createFormControlFactory()
  {
    FormControlFactoryImpl formControlFactory = new FormControlFactoryImpl();
    return formControlFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogControlFactory createDialogControlFactory()
  {
    DialogControlFactoryImpl dialogControlFactory = new DialogControlFactoryImpl();
    return dialogControlFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFactorySpecifications createControlFactorySpecifications()
  {
    ControlFactorySpecificationsImpl controlFactorySpecifications = new ControlFactorySpecificationsImpl();
    return controlFactorySpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFactorySpecification createControlFactorySpecification()
  {
    ControlFactorySpecificationImpl controlFactorySpecification = new ControlFactorySpecificationImpl();
    return controlFactorySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProposalCreator createProposalCreator()
  {
    ProposalCreatorImpl proposalCreator = new ProposalCreatorImpl();
    return proposalCreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuBuilder createMenuBuilder()
  {
    MenuBuilderImpl menuBuilder = new MenuBuilderImpl();
    return menuBuilder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menus createMenus()
  {
    MenusImpl menus = new MenusImpl();
    return menus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfMenus createEmfMenus()
  {
    EmfMenusImpl emfMenus = new EmfMenusImpl();
    return emfMenus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configurator createConfigurator()
  {
    ConfiguratorImpl configurator = new ConfiguratorImpl();
    return configurator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfiguratorResourceURI createConfiguratorResourceURI()
  {
    ConfiguratorResourceURIImpl configuratorResourceURI = new ConfiguratorResourceURIImpl();
    return configuratorResourceURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfiguratorEClass createConfiguratorEClass()
  {
    ConfiguratorEClassImpl configuratorEClass = new ConfiguratorEClassImpl();
    return configuratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewerContentProvider createViewerContentProvider()
  {
    ViewerContentProviderImpl viewerContentProvider = new ViewerContentProviderImpl();
    return viewerContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableViewerContentProvider createTableViewerContentProvider()
  {
    TableViewerContentProviderImpl tableViewerContentProvider = new TableViewerContentProviderImpl();
    return tableViewerContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProviderChildren createContentProviderChildren()
  {
    ContentProviderChildrenImpl contentProviderChildren = new ContentProviderChildrenImpl();
    return contentProviderChildren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProviderElements createContentProviderElements()
  {
    ContentProviderElementsImpl contentProviderElements = new ContentProviderElementsImpl();
    return contentProviderElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceManager createResourceManager()
  {
    ResourceManagerImpl resourceManager = new ResourceManagerImpl();
    return resourceManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMethodSpecification createSimpleMethodSpecification()
  {
    SimpleMethodSpecificationImpl simpleMethodSpecification = new SimpleMethodSpecificationImpl();
    return simpleMethodSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfFeatureAccess createEmfFeatureAccess()
  {
    EmfFeatureAccessImpl emfFeatureAccess = new EmfFeatureAccessImpl();
    return emfFeatureAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFeatureCaptionProviderWithLabel createAbstractFeatureCaptionProviderWithLabel()
  {
    AbstractFeatureCaptionProviderWithLabelImpl abstractFeatureCaptionProviderWithLabel = new AbstractFeatureCaptionProviderWithLabelImpl();
    return abstractFeatureCaptionProviderWithLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFeatureProvider createAbstractFeatureProvider()
  {
    AbstractFeatureProviderImpl abstractFeatureProvider = new AbstractFeatureProviderImpl();
    return abstractFeatureProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractControlFactory createAbstractControlFactory()
  {
    AbstractControlFactoryImpl abstractControlFactory = new AbstractControlFactoryImpl();
    return abstractControlFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithExtendsClause createWithExtendsClause()
  {
    WithExtendsClauseImpl withExtendsClause = new WithExtendsClauseImpl();
    return withExtendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithFields createWithFields()
  {
    WithFieldsImpl withFields = new WithFieldsImpl();
    return withFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartsSpecifications createPartsSpecifications()
  {
    PartsSpecificationsImpl partsSpecifications = new PartsSpecificationsImpl();
    return partsSpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartSpecification createPartSpecification()
  {
    PartSpecificationImpl partSpecification = new PartSpecificationImpl();
    return partSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewSpecification createViewSpecification()
  {
    ViewSpecificationImpl viewSpecification = new ViewSpecificationImpl();
    return viewSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeBinding createTypeBinding()
  {
    TypeBindingImpl typeBinding = new TypeBindingImpl();
    return typeBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProviderBinding createProviderBinding()
  {
    ProviderBindingImpl providerBinding = new ProviderBindingImpl();
    return providerBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueBinding createValueBinding()
  {
    ValueBindingImpl valueBinding = new ValueBindingImpl();
    return valueBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPackage getModelPackage()
  {
    return (ModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelPackage getPackage()
  {
    return ModelPackage.eINSTANCE;
  }

} //ModelFactoryImpl
