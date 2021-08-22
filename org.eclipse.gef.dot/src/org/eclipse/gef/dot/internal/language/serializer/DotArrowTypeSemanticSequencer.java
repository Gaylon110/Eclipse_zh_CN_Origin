package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowType;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage;
import org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape;
import org.eclipse.gef.dot.internal.language.services.DotArrowTypeGrammarAccess;
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
public class DotArrowTypeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotArrowTypeGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArrowtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArrowtypePackage.ARROW_SHAPE:
				if(context == grammarAccess.getAbstractArrowShapeRule() ||
				   context == grammarAccess.getArrowShapeRule()) {
					sequence_ArrowShape(context, (ArrowShape) semanticObject); 
					return; 
				}
				else break;
			case ArrowtypePackage.ARROW_TYPE:
				if(context == grammarAccess.getArrowTypeRule()) {
					sequence_ArrowType(context, (ArrowType) semanticObject); 
					return; 
				}
				else break;
			case ArrowtypePackage.DEPRECATED_ARROW_SHAPE:
				if(context == grammarAccess.getAbstractArrowShapeRule() ||
				   context == grammarAccess.getDeprecatedArrowShapeRule()) {
					sequence_DeprecatedArrowShape(context, (DeprecatedArrowShape) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (open?='o'? (side='l' | side='r')? shape=PrimitiveShape)
	 */
	protected void sequence_ArrowShape(EObject context, ArrowShape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arrowShapes+=AbstractArrowShape (arrowShapes+=AbstractArrowShape (arrowShapes+=AbstractArrowShape arrowShapes+=AbstractArrowShape?)?)?)
	 */
	protected void sequence_ArrowType(EObject context, ArrowType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     shape=DeprecatedShape
	 */
	protected void sequence_DeprecatedArrowShape(EObject context, DeprecatedArrowShape semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArrowtypePackage.Literals.DEPRECATED_ARROW_SHAPE__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArrowtypePackage.Literals.DEPRECATED_ARROW_SHAPE__SHAPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0(), semanticObject.getShape());
		feeder.finish();
	}
}
