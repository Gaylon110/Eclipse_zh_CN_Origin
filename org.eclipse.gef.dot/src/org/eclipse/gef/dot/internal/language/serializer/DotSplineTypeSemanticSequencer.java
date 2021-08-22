package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.point.Point;
import org.eclipse.gef.dot.internal.language.point.PointPackage;
import org.eclipse.gef.dot.internal.language.serializer.DotPointSemanticSequencer;
import org.eclipse.gef.dot.internal.language.services.DotSplineTypeGrammarAccess;
import org.eclipse.gef.dot.internal.language.splinetype.Spline;
import org.eclipse.gef.dot.internal.language.splinetype.SplineType;
import org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DotSplineTypeSemanticSequencer extends DotPointSemanticSequencer {

	@Inject
	private DotSplineTypeGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PointPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PointPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SplinetypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SplinetypePackage.SPLINE:
				if(context == grammarAccess.getSplineRule()) {
					sequence_Spline(context, (Spline) semanticObject); 
					return; 
				}
				else break;
			case SplinetypePackage.SPLINE_TYPE:
				if(context == grammarAccess.getSplineTypeRule()) {
					sequence_SplineType(context, (SplineType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (splines+=Spline splines+=Spline*)
	 */
	protected void sequence_SplineType(EObject context, SplineType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startp=Point? endp=Point? controlPoints+=Point (controlPoints+=Point controlPoints+=Point controlPoints+=Point)+)
	 */
	protected void sequence_Spline(EObject context, Spline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
