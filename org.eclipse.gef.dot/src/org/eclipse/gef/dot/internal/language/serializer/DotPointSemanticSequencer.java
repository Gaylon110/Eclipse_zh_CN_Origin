package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.point.Point;
import org.eclipse.gef.dot.internal.language.point.PointPackage;
import org.eclipse.gef.dot.internal.language.services.DotPointGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DotPointSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotPointGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PointPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PointPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (x=DOUBLE y=DOUBLE z=DOUBLE? inputOnly?='!'?)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
