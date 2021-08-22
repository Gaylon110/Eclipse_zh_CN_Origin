package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.services.DotStyleGrammarAccess;
import org.eclipse.gef.dot.internal.language.style.Style;
import org.eclipse.gef.dot.internal.language.style.StyleItem;
import org.eclipse.gef.dot.internal.language.style.StylePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DotStyleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotStyleGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StylePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StylePackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
					return; 
				}
				else break;
			case StylePackage.STYLE_ITEM:
				if(context == grammarAccess.getStyleItemRule()) {
					sequence_StyleItem(context, (StyleItem) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=NAME (args+=NAME args+=NAME*)?)
	 */
	protected void sequence_StyleItem(EObject context, StyleItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((styleItems+=StyleItem styleItems+=StyleItem*)?)
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
