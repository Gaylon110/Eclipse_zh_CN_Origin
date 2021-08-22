package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.escstring.EscString;
import org.eclipse.gef.dot.internal.language.escstring.EscstringPackage;
import org.eclipse.gef.dot.internal.language.escstring.JustifiedText;
import org.eclipse.gef.dot.internal.language.services.DotEscStringGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DotEscStringSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotEscStringGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EscstringPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EscstringPackage.ESC_STRING:
				if(context == grammarAccess.getEscStringRule()) {
					sequence_EscString(context, (EscString) semanticObject); 
					return; 
				}
				else break;
			case EscstringPackage.JUSTIFIED_TEXT:
				if(context == grammarAccess.getJustifiedTextRule()) {
					sequence_JustifiedText(context, (JustifiedText) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lines+=JustifiedText*)
	 */
	protected void sequence_EscString(EObject context, EscString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((text=TEXT justification=Justification?) | justification=Justification)
	 */
	protected void sequence_JustifiedText(EObject context, JustifiedText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
