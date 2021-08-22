package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.color.ColorPackage;
import org.eclipse.gef.dot.internal.language.color.HSVColor;
import org.eclipse.gef.dot.internal.language.color.RGBColor;
import org.eclipse.gef.dot.internal.language.color.StringColor;
import org.eclipse.gef.dot.internal.language.services.DotColorGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DotColorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotColorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ColorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ColorPackage.HSV_COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getHSVColorRule()) {
					sequence_HSVColor(context, (HSVColor) semanticObject); 
					return; 
				}
				else break;
			case ColorPackage.RGB_COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getRGBColorRule()) {
					sequence_RGBColor(context, (RGBColor) semanticObject); 
					return; 
				}
				else break;
			case ColorPackage.STRING_COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getStringColorRule()) {
					sequence_StringColor(context, (StringColor) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (h=COLOR_NUMBER s=COLOR_NUMBER v=COLOR_NUMBER)
	 */
	protected void sequence_HSVColor(EObject context, HSVColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ColorPackage.Literals.HSV_COLOR__H) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ColorPackage.Literals.HSV_COLOR__H));
			if(transientValues.isValueTransient(semanticObject, ColorPackage.Literals.HSV_COLOR__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ColorPackage.Literals.HSV_COLOR__S));
			if(transientValues.isValueTransient(semanticObject, ColorPackage.Literals.HSV_COLOR__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ColorPackage.Literals.HSV_COLOR__V));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0(), semanticObject.getH());
		feeder.accept(grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0(), semanticObject.getV());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (r=hex g=hex b=hex a=hex?)
	 */
	protected void sequence_RGBColor(EObject context, RGBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scheme=COLOR_STRING? (name=HEXADECIMAL_DIGIT | name=COLOR_STRING | name=COLOR_NUMBER))
	 */
	protected void sequence_StringColor(EObject context, StringColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
