package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.rect.Rect;
import org.eclipse.gef.dot.internal.language.rect.RectPackage;
import org.eclipse.gef.dot.internal.language.services.DotRectGrammarAccess;
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
public class DotRectSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotRectGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RectPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RectPackage.RECT:
				if(context == grammarAccess.getRectRule()) {
					sequence_Rect(context, (Rect) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (llx=DOUBLE lly=DOUBLE urx=DOUBLE ury=DOUBLE)
	 */
	protected void sequence_Rect(EObject context, Rect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RectPackage.Literals.RECT__LLX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RectPackage.Literals.RECT__LLX));
			if(transientValues.isValueTransient(semanticObject, RectPackage.Literals.RECT__LLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RectPackage.Literals.RECT__LLY));
			if(transientValues.isValueTransient(semanticObject, RectPackage.Literals.RECT__URX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RectPackage.Literals.RECT__URX));
			if(transientValues.isValueTransient(semanticObject, RectPackage.Literals.RECT__URY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RectPackage.Literals.RECT__URY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRectAccess().getLlxDOUBLETerminalRuleCall_0_0(), semanticObject.getLlx());
		feeder.accept(grammarAccess.getRectAccess().getLlyDOUBLETerminalRuleCall_2_0(), semanticObject.getLly());
		feeder.accept(grammarAccess.getRectAccess().getUrxDOUBLETerminalRuleCall_4_0(), semanticObject.getUrx());
		feeder.accept(grammarAccess.getRectAccess().getUryDOUBLETerminalRuleCall_6_0(), semanticObject.getUry());
		feeder.finish();
	}
}
