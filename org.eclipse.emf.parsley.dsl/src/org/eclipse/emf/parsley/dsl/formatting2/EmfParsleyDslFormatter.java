/**
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 */
package org.eclipse.emf.parsley.dsl.formatting2;

import com.google.inject.Provider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.dsl.model.AbstractControlFactory;
import org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel;
import org.eclipse.emf.parsley.dsl.model.AbstractFeatureProvider;
import org.eclipse.emf.parsley.dsl.model.Binding;
import org.eclipse.emf.parsley.dsl.model.BindingsSpecification;
import org.eclipse.emf.parsley.dsl.model.Configurator;
import org.eclipse.emf.parsley.dsl.model.ControlFactorySpecification;
import org.eclipse.emf.parsley.dsl.model.ExtendsClause;
import org.eclipse.emf.parsley.dsl.model.FeatureAssociatedExpression;
import org.eclipse.emf.parsley.dsl.model.FeatureCaptionProvider;
import org.eclipse.emf.parsley.dsl.model.FeatureSpecification;
import org.eclipse.emf.parsley.dsl.model.FieldSpecification;
import org.eclipse.emf.parsley.dsl.model.LabelProvider;
import org.eclipse.emf.parsley.dsl.model.MenuBuilder;
import org.eclipse.emf.parsley.dsl.model.Model;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.PartSpecification;
import org.eclipse.emf.parsley.dsl.model.PartsSpecifications;
import org.eclipse.emf.parsley.dsl.model.PolymorphicSpecification;
import org.eclipse.emf.parsley.dsl.model.ProposalCreator;
import org.eclipse.emf.parsley.dsl.model.ProviderBinding;
import org.eclipse.emf.parsley.dsl.model.ResourceManager;
import org.eclipse.emf.parsley.dsl.model.SimpleMethodSpecification;
import org.eclipse.emf.parsley.dsl.model.TableLabelProvider;
import org.eclipse.emf.parsley.dsl.model.TableViewerContentProvider;
import org.eclipse.emf.parsley.dsl.model.TypeBinding;
import org.eclipse.emf.parsley.dsl.model.ValueBinding;
import org.eclipse.emf.parsley.dsl.model.ViewSpecification;
import org.eclipse.emf.parsley.dsl.model.ViewerContentProvider;
import org.eclipse.emf.parsley.dsl.model.WithExpressions;
import org.eclipse.emf.parsley.dsl.model.WithExtendsClause;
import org.eclipse.emf.parsley.dsl.model.WithFeatureAssociatedExpressions;
import org.eclipse.emf.parsley.dsl.model.WithFields;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author Lorenzo Bettini
 */
@SuppressWarnings("all")
public class EmfParsleyDslFormatter extends XbaseWithAnnotationsFormatter {
  @Override
  public void format(final Object o, final IFormattableDocument document) {
    if ((o instanceof AbstractControlFactory)) {
      this._format(((AbstractControlFactory)o), document);
      return;
    } else {
      if ((o instanceof AbstractFeatureCaptionProviderWithLabel)) {
        this._format(((AbstractFeatureCaptionProviderWithLabel)o), document);
        return;
      } else {
        if ((o instanceof AbstractFeatureProvider)) {
          this._format(((AbstractFeatureProvider)o), document);
          return;
        } else {
          if ((o instanceof Configurator)) {
            this._format(((Configurator)o), document);
            return;
          } else {
            if ((o instanceof FeatureCaptionProvider)) {
              this._format(((FeatureCaptionProvider)o), document);
              return;
            } else {
              if ((o instanceof LabelProvider)) {
                this._format(((LabelProvider)o), document);
                return;
              } else {
                if ((o instanceof MenuBuilder)) {
                  this._format(((MenuBuilder)o), document);
                  return;
                } else {
                  if ((o instanceof ProposalCreator)) {
                    this._format(((ProposalCreator)o), document);
                    return;
                  } else {
                    if ((o instanceof ResourceManager)) {
                      this._format(((ResourceManager)o), document);
                      return;
                    } else {
                      if ((o instanceof TableLabelProvider)) {
                        this._format(((TableLabelProvider)o), document);
                        return;
                      } else {
                        if ((o instanceof TableViewerContentProvider)) {
                          this._format(((TableViewerContentProvider)o), document);
                          return;
                        } else {
                          if ((o instanceof ViewerContentProvider)) {
                            this._format(((ViewerContentProvider)o), document);
                            return;
                          } else {
                            if ((o instanceof ControlFactorySpecification)) {
                              this._format(((ControlFactorySpecification)o), document);
                              return;
                            } else {
                              if ((o instanceof FeatureAssociatedExpression)) {
                                this._format(((FeatureAssociatedExpression)o), document);
                                return;
                              } else {
                                if ((o instanceof FeatureSpecification)) {
                                  this._format(((FeatureSpecification)o), document);
                                  return;
                                } else {
                                  if ((o instanceof Module)) {
                                    this._format(((Module)o), document);
                                    return;
                                  } else {
                                    if ((o instanceof ProviderBinding)) {
                                      this._format(((ProviderBinding)o), document);
                                      return;
                                    } else {
                                      if ((o instanceof TypeBinding)) {
                                        this._format(((TypeBinding)o), document);
                                        return;
                                      } else {
                                        if ((o instanceof ValueBinding)) {
                                          this._format(((ValueBinding)o), document);
                                          return;
                                        } else {
                                          if ((o instanceof ViewSpecification)) {
                                            this._format(((ViewSpecification)o), document);
                                            return;
                                          } else {
                                            if ((o instanceof BindingsSpecification)) {
                                              this._format(((BindingsSpecification)o), document);
                                              return;
                                            } else {
                                              if ((o instanceof ExtendsClause)) {
                                                this._format(((ExtendsClause)o), document);
                                                return;
                                              } else {
                                                if ((o instanceof FieldSpecification)) {
                                                  this._format(((FieldSpecification)o), document);
                                                  return;
                                                } else {
                                                  if ((o instanceof PolymorphicSpecification)) {
                                                    this._format(((PolymorphicSpecification)o), document);
                                                    return;
                                                  } else {
                                                    if ((o instanceof Model)) {
                                                      this._format(((Model)o), document);
                                                      return;
                                                    } else {
                                                      if ((o instanceof PartsSpecifications)) {
                                                        this._format(((PartsSpecifications)o), document);
                                                        return;
                                                      } else {
                                                        if ((o instanceof SimpleMethodSpecification)) {
                                                          this._format(((SimpleMethodSpecification)o), document);
                                                          return;
                                                        } else {
                                                          super.format(o, document);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void _format(final Model model, @Extension final IFormattableDocument document) {
    this.format(model.getImportSection(), document);
    this.format(model.getModule(), document);
  }
  
  public void _format(final Module module, @Extension final IFormattableDocument document) {
    final Procedure1<Module> _function = new Procedure1<Module>() {
      @Override
      public void apply(final Module it) {
        EmfParsleyDslFormatter.this.format(module.getExtendsClause(), document);
        EmfParsleyDslFormatter.this.format(module.getBindingsSpecification(), document);
        EmfParsleyDslFormatter.this.format(module.getLabelProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getTableLabelProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getFeatureCaptionProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getFormFeatureCaptionProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getDialogFeatureCaptionProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getFeaturesProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getTableFeaturesProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getFormControlFactory(), document);
        EmfParsleyDslFormatter.this.format(module.getDialogControlFactory(), document);
        EmfParsleyDslFormatter.this.format(module.getProposalCreator(), document);
        EmfParsleyDslFormatter.this.format(module.getMenuBuilder(), document);
        EmfParsleyDslFormatter.this.format(module.getConfigurator(), document);
        EmfParsleyDslFormatter.this.format(module.getViewerContentProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getTableViewerContentProvider(), document);
        EmfParsleyDslFormatter.this.format(module.getPartsSpecifications(), document);
        EmfParsleyDslFormatter.this.format(module.getResourceManager(), document);
      }
    };
    this.<Module>indentBlock(module, document, _function);
  }
  
  public void _format(final ExtendsClause extendsclause, @Extension final IFormattableDocument document) {
    this.format(extendsclause.getSuperType(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(extendsclause).keyword("extends"), _function);
  }
  
  public void _format(final BindingsSpecification bindingsspecification, @Extension final IFormattableDocument document) {
    final Procedure1<BindingsSpecification> _function = new Procedure1<BindingsSpecification>() {
      @Override
      public void apply(final BindingsSpecification it) {
        EmfParsleyDslFormatter.this.<Binding>formatAndSeparateElementsWithNewlines(bindingsspecification.getBindings(), document);
      }
    };
    this.<BindingsSpecification>indentBlock(bindingsspecification, document, _function);
  }
  
  public void _format(final TypeBinding typebinding, @Extension final IFormattableDocument document) {
    this.<TypeBinding>oneSpaceAfterKeyword(typebinding, "type", document);
    this.format(typebinding.getTypeToBind(), document);
    this.formatBinding(typebinding, document);
  }
  
  public void _format(final ProviderBinding providerbinding, @Extension final IFormattableDocument document) {
    this.<ProviderBinding>oneSpaceAfterKeyword(providerbinding, "provide", document);
    this.format(providerbinding.getType(), document);
    this.formatBinding(providerbinding, document);
  }
  
  public void _format(final ValueBinding valuebinding, @Extension final IFormattableDocument document) {
    this.<ValueBinding>oneSpaceAfterKeyword(valuebinding, "value", document);
    this.format(valuebinding.getTypeDecl(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(valuebinding).feature(ModelPackage.Literals.VALUE_BINDING__ID), _function);
    this.formatBinding(valuebinding, document);
  }
  
  private void formatBinding(final Binding binding, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(binding).keyword("->"), _function);
    this.format(binding.getTo(), document);
  }
  
  public void _format(final LabelProvider labelprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(labelprovider.getTexts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(labelprovider.getImages(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(labelprovider.getFonts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(labelprovider.getForegrounds(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(labelprovider.getBackgrounds(), document);
      }
    };
    this.formatWithFields(labelprovider, document, _function);
  }
  
  public void _format(final FieldSpecification expr, @Extension final IFormattableDocument document) {
    EList<XAnnotation> _annotations = expr.getAnnotations();
    for (final XAnnotation annotations : _annotations) {
      this.format(annotations, document);
    }
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(this.textRegionExtensions.regionFor(expr).keyword("val"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(this.textRegionExtensions.regionFor(expr).keyword("var"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(this.textRegionExtensions.regionFor(expr).keyword("extension"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.<JvmTypeReference>append(expr.getType(), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(expr).keyword("="), _function_4);
    this.format(expr.getType(), document);
    this.format(expr.getRight(), document);
    final Procedure1<IHiddenRegionFormatter> _function_5 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.prepend(this.textRegionExtensions.regionFor(expr).keyword(";"), _function_5);
  }
  
  public void _format(final TableLabelProvider tablelabelprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(tablelabelprovider.getFeatureTexts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(tablelabelprovider.getFeatureImages(), document);
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(tablelabelprovider.getFeatureFonts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(tablelabelprovider.getFeatureForegrounds(), document);
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(tablelabelprovider.getFeatureBackgrounds(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(tablelabelprovider.getRowFonts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(tablelabelprovider.getRowForegrounds(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(tablelabelprovider.getRowBackgrounds(), document);
      }
    };
    this.formatWithFields(tablelabelprovider, document, _function);
  }
  
  public void _format(final PolymorphicSpecification specification, @Extension final IFormattableDocument document) {
    this.format(specification.getParameterType(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(specification).keyword("->"), _function);
    this.format(specification.getExpression(), document);
  }
  
  public void _format(final FeatureCaptionProvider featurecaptionprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        final Provider<List<? extends EObject>> _function = new Provider<List<? extends EObject>>() {
          @Override
          public List<? extends EObject> get() {
            return featurecaptionprovider.getFeatureTexts().getSpecifications();
          }
        };
        EmfParsleyDslFormatter.this.<EObject>indentBlockAndFormatAndSeparateElementsWithNewlines(featurecaptionprovider.getFeatureTexts(), document, _function);
      }
    };
    this.formatWithFields(featurecaptionprovider, document, _function);
  }
  
  public void _format(final AbstractFeatureCaptionProviderWithLabel featurecaptionprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(featurecaptionprovider.getFeatureTexts(), document);
        EmfParsleyDslFormatter.this.<EObject>formatFeatureSpecifications(featurecaptionprovider.getFeatureLabels(), document);
      }
    };
    this.formatWithFields(featurecaptionprovider, document, _function);
  }
  
  public void _format(final FeatureAssociatedExpression featureassociatedexpression, @Extension final IFormattableDocument document) {
    this.format(featureassociatedexpression.getParameterType(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(featureassociatedexpression).keyword(":"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(featureassociatedexpression).keyword("->"), _function_1);
    this.format(featureassociatedexpression.getExpression(), document);
  }
  
  public void _format(final AbstractFeatureProvider featuresprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        final Provider<List<? extends EObject>> _function = new Provider<List<? extends EObject>>() {
          @Override
          public List<? extends EObject> get() {
            return featuresprovider.getFeatures().getFeatureSpecifications();
          }
        };
        EmfParsleyDslFormatter.this.<EObject>indentBlockAndFormatAndSeparateElementsWithNewlines(featuresprovider.getFeatures(), document, _function);
      }
    };
    this.formatWithFields(featuresprovider, document, _function);
  }
  
  public void _format(final FeatureSpecification featurespecification, @Extension final IFormattableDocument document) {
    this.format(featurespecification.getParameterType(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(featurespecification).keyword("->"), _function);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(featurespecification).keywords(",");
    for (final ISemanticRegion comma : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
        @Override
        public void apply(final IHiddenRegionFormatter it) {
          it.noSpace();
        }
      };
      final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
        @Override
        public void apply(final IHiddenRegionFormatter it) {
          it.oneSpace();
        }
      };
      document.append(document.prepend(comma, _function_1), _function_2);
    }
  }
  
  public void _format(final AbstractControlFactory controlfactory, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        final Provider<List<? extends EObject>> _function = new Provider<List<? extends EObject>>() {
          @Override
          public List<? extends EObject> get() {
            return controlfactory.getControls().getSpecifications();
          }
        };
        EmfParsleyDslFormatter.this.<EObject>indentBlockAndFormatAndSeparateElementsWithNewlines(controlfactory.getControls(), document, _function);
      }
    };
    this.formatWithFields(controlfactory, document, _function);
  }
  
  public void _format(final ControlFactorySpecification controlfactoryspecification, @Extension final IFormattableDocument document) {
    this.format(controlfactoryspecification.getParameterType(), document);
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(controlfactoryspecification).keyword(":"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(controlfactoryspecification).keyword("->"), _function_1);
    this.format(controlfactoryspecification.getExpression(), document);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(this.textRegionExtensions.regionFor(controlfactoryspecification).keyword("target"), _function_2);
    this.format(controlfactoryspecification.getTarget(), document);
  }
  
  public void _format(final ProposalCreator proposalcreator, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<FeatureAssociatedExpression>formatAndSeparateElementsWithNewlines(proposalcreator.getProposalsSpecifications(), document);
      }
    };
    this.formatWithFields(proposalcreator, document, _function);
  }
  
  public void _format(final MenuBuilder menubuilder, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(menubuilder.getMenus(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(menubuilder.getEmfMenus(), document);
      }
    };
    this.formatWithFields(menubuilder, document, _function);
  }
  
  public void _format(final Configurator configurator, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(configurator.getResourceURI(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(configurator.getEClassSpec(), document);
      }
    };
    this.formatWithFields(configurator, document, _function);
  }
  
  public void _format(final ViewerContentProvider viewercontentprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(viewercontentprovider.getElements(), document);
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(viewercontentprovider.getChildren(), document);
      }
    };
    this.formatWithFields(viewercontentprovider, document, _function);
  }
  
  public void _format(final TableViewerContentProvider tableviewercontentprovider, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.<EObject>formatSpecifications(tableviewercontentprovider.getElements(), document);
      }
    };
    this.formatWithFields(tableviewercontentprovider, document, _function);
  }
  
  public void _format(final ResourceManager resourcemanager, @Extension final IFormattableDocument document) {
    final Procedure1<WithFields> _function = new Procedure1<WithFields>() {
      @Override
      public void apply(final WithFields it) {
        EmfParsleyDslFormatter.this.format(resourcemanager.getInitializeBody(), document);
        EmfParsleyDslFormatter.this.format(resourcemanager.getSaveBody(), document);
      }
    };
    this.formatWithFields(resourcemanager, document, _function);
  }
  
  public void _format(final SimpleMethodSpecification simplemethodspecification, @Extension final IFormattableDocument document) {
    this.<XExpression>formatAndSeparateWithNewlines(simplemethodspecification.getBody(), document);
  }
  
  public void _format(final PartsSpecifications partsspecifications, @Extension final IFormattableDocument document) {
    final Procedure1<PartsSpecifications> _function = new Procedure1<PartsSpecifications>() {
      @Override
      public void apply(final PartsSpecifications it) {
        EmfParsleyDslFormatter.this.<PartSpecification>formatAndSeparateElementsWithNewlines(partsspecifications.getParts(), document);
      }
    };
    this.<PartsSpecifications>indentBlock(partsspecifications, document, _function);
  }
  
  public void _format(final ViewSpecification viewspecification, @Extension final IFormattableDocument document) {
    final Procedure1<ViewSpecification> _function = new Procedure1<ViewSpecification>() {
      @Override
      public void apply(final ViewSpecification it) {
        final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.oneSpace();
          }
        };
        document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).keyword("viewpart"), _function);
        final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.oneSpace();
          }
        };
        document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).keyword("viewname"), _function_1);
        final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.setNewLines(1, 1, 2);
          }
        };
        document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).feature(ModelPackage.Literals.VIEW_SPECIFICATION__VIEW_NAME), _function_2);
        final Procedure1<IHiddenRegionFormatter> _function_3 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.oneSpace();
          }
        };
        document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).keyword("viewclass"), _function_3);
        EmfParsleyDslFormatter.this.format(viewspecification.getType(), document);
        final Procedure1<IHiddenRegionFormatter> _function_4 = new Procedure1<IHiddenRegionFormatter>() {
          @Override
          public void apply(final IHiddenRegionFormatter it) {
            it.setNewLines(1, 1, 2);
          }
        };
        document.<JvmTypeReference>append(viewspecification.getType(), _function_4);
        String _category = viewspecification.getCategory();
        boolean _tripleNotEquals = (_category != null);
        if (_tripleNotEquals) {
          final Procedure1<IHiddenRegionFormatter> _function_5 = new Procedure1<IHiddenRegionFormatter>() {
            @Override
            public void apply(final IHiddenRegionFormatter it) {
              it.oneSpace();
            }
          };
          document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).keyword("viewcategory"), _function_5);
          final Procedure1<IHiddenRegionFormatter> _function_6 = new Procedure1<IHiddenRegionFormatter>() {
            @Override
            public void apply(final IHiddenRegionFormatter it) {
              it.setNewLines(1, 1, 2);
            }
          };
          document.append(EmfParsleyDslFormatter.this.textRegionExtensions.regionFor(viewspecification).feature(ModelPackage.Literals.VIEW_SPECIFICATION__CATEGORY), _function_6);
        }
      }
    };
    this.<ViewSpecification>indentBlock(viewspecification, document, _function);
  }
  
  private WithExtendsClause formatWithFields(final WithFields e, @Extension final IFormattableDocument document, final Procedure1<? super WithFields> elementsFormatter) {
    final Procedure1<WithExtendsClause> _function = new Procedure1<WithExtendsClause>() {
      @Override
      public void apply(final WithExtendsClause it) {
        EmfParsleyDslFormatter.this.formatFields(e, document);
        elementsFormatter.apply(e);
      }
    };
    return this.formatWithExtendsClause(e, document, _function);
  }
  
  private WithExtendsClause formatWithExtendsClause(final WithExtendsClause e, @Extension final IFormattableDocument document, final Procedure1<? super WithExtendsClause> elementsFormatter) {
    WithExtendsClause _xblockexpression = null;
    {
      this.format(e.getExtendsClause(), document);
      final Procedure1<WithExtendsClause> _function = new Procedure1<WithExtendsClause>() {
        @Override
        public void apply(final WithExtendsClause it) {
          elementsFormatter.apply(e);
        }
      };
      this.<WithExtendsClause>indentBlock(e, document, _function);
      _xblockexpression = this.<WithExtendsClause>separateElementsWithNewlines(e, document);
    }
    return _xblockexpression;
  }
  
  private void formatFields(final WithFields withFields, @Extension final IFormattableDocument document) {
    this.<FieldSpecification>formatAndSeparateElementsWithNewlines(withFields.getFields(), document);
  }
  
  private <T extends EObject> EObject formatSpecifications(final WithExpressions e, @Extension final IFormattableDocument document) {
    final Provider<List<? extends EObject>> _function = new Provider<List<? extends EObject>>() {
      @Override
      public List<? extends EObject> get() {
        return e.getSpecifications();
      }
    };
    return this.<EObject>indentBlockAndFormatAndSeparateElementsWithNewlines(e, document, _function);
  }
  
  private <T extends EObject> EObject formatFeatureSpecifications(final WithFeatureAssociatedExpressions e, @Extension final IFormattableDocument document) {
    final Provider<List<? extends EObject>> _function = new Provider<List<? extends EObject>>() {
      @Override
      public List<? extends EObject> get() {
        return e.getSpecifications();
      }
    };
    return this.<EObject>indentBlockAndFormatAndSeparateElementsWithNewlines(e, document, _function);
  }
  
  /**
   * The elementsProvider is invoked only if the passed parent is not null
   */
  private <T extends EObject> EObject indentBlockAndFormatAndSeparateElementsWithNewlines(final EObject parent, @Extension final IFormattableDocument document, final Provider<List<? extends T>> elementsProvider) {
    EObject _xifexpression = null;
    if ((parent != null)) {
      EObject _xblockexpression = null;
      {
        final List<? extends T> list = elementsProvider.get();
        final Procedure1<EObject> _function = new Procedure1<EObject>() {
          @Override
          public void apply(final EObject it) {
            EmfParsleyDslFormatter.this.<T>formatAndSeparateElementsWithNewlines(list, document);
          }
        };
        this.<EObject>indentBlock(parent, document, _function);
        _xblockexpression = this.<EObject>separateElementsWithNewlines(parent, document);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private <T extends EObject> void formatAndSeparateElementsWithNewlines(final List<? extends T> elements, @Extension final IFormattableDocument document) {
    for (final T e : elements) {
      this.<T>formatAndSeparateWithNewlines(e, document);
    }
  }
  
  private <T extends EObject> T formatAndSeparateWithNewlines(final T e, final IFormattableDocument document) {
    T _xblockexpression = null;
    {
      this.format(e, document);
      _xblockexpression = this.<T>separateElementsWithNewlines(e, document);
    }
    return _xblockexpression;
  }
  
  private <T extends EObject> ISemanticRegion oneSpaceAfterKeyword(final T element, final String k, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    return document.append(this.textRegionExtensions.regionFor(element).keyword(k), _function);
  }
  
  private <T extends EObject> T separateElementsWithNewlines(final T element, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.setNewLines(1, 1, 2);
      }
    };
    return document.<T>append(element, _function);
  }
  
  private <T extends EObject> void indentBlock(final T element, @Extension final IFormattableDocument document, final Procedure1<? super T> elementsFormatter) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(element).keyword("{");
    final ISemanticRegion close = this.textRegionExtensions.regionFor(element).keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.indent();
      }
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    elementsFormatter.apply(element);
  }
}
