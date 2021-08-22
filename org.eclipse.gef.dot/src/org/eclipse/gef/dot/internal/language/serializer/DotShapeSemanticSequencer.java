package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.services.DotShapeGrammarAccess;
import org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape;
import org.eclipse.gef.dot.internal.language.shape.RecordBasedShape;
import org.eclipse.gef.dot.internal.language.shape.Shape;
import org.eclipse.gef.dot.internal.language.shape.ShapePackage;
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
public class DotShapeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotShapeGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ShapePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ShapePackage.POLYGON_BASED_SHAPE:
				if(context == grammarAccess.getPolygonBasedShapeRule()) {
					sequence_PolygonBasedShape(context, (PolygonBasedShape) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.RECORD_BASED_SHAPE:
				if(context == grammarAccess.getRecordBasedShapeRule()) {
					sequence_RecordBasedShape(context, (RecordBasedShape) semanticObject); 
					return; 
				}
				else break;
			case ShapePackage.SHAPE:
				if(context == grammarAccess.getShapeRule()) {
					sequence_Shape(context, (Shape) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     shape=PolygonBasedNodeShape
	 */
	protected void sequence_PolygonBasedShape(EObject context, PolygonBasedShape semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.POLYGON_BASED_SHAPE__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.POLYGON_BASED_SHAPE__SHAPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPolygonBasedShapeAccess().getShapePolygonBasedNodeShapeEnumRuleCall_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     shape=RecordBasedNodeShape
	 */
	protected void sequence_RecordBasedShape(EObject context, RecordBasedShape semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ShapePackage.Literals.RECORD_BASED_SHAPE__SHAPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShapePackage.Literals.RECORD_BASED_SHAPE__SHAPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecordBasedShapeAccess().getShapeRecordBasedNodeShapeEnumRuleCall_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (shape=PolygonBasedShape | shape=RecordBasedShape)
	 */
	protected void sequence_Shape(EObject context, Shape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
