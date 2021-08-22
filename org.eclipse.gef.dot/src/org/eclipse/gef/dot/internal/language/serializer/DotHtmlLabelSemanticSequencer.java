package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage;
import org.eclipse.gef.dot.internal.language.services.DotHtmlLabelGrammarAccess;
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
public class DotHtmlLabelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotHtmlLabelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HtmllabelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HtmllabelPackage.HTML_ATTR:
				if(context == grammarAccess.getHtmlAttrRule()) {
					sequence_HtmlAttr(context, (HtmlAttr) semanticObject); 
					return; 
				}
				else break;
			case HtmllabelPackage.HTML_CONTENT:
				if(context == grammarAccess.getHtmlContentRule()) {
					sequence_HtmlContent(context, (HtmlContent) semanticObject); 
					return; 
				}
				else break;
			case HtmllabelPackage.HTML_LABEL:
				if(context == grammarAccess.getHtmlLabelRule()) {
					sequence_HtmlLabel(context, (HtmlLabel) semanticObject); 
					return; 
				}
				else break;
			case HtmllabelPackage.HTML_TAG:
				if(context == grammarAccess.getHtmlTagRule()) {
					sequence_HtmlTag(context, (HtmlTag) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID value=ATTR_VALUE)
	 */
	protected void sequence_HtmlAttr(EObject context, HtmlAttr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HtmllabelPackage.Literals.HTML_ATTR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HtmllabelPackage.Literals.HTML_ATTR__NAME));
			if(transientValues.isValueTransient(semanticObject, HtmllabelPackage.Literals.HTML_ATTR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HtmllabelPackage.Literals.HTML_ATTR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHtmlAttrAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHtmlAttrAccess().getValueATTR_VALUETerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tag=HtmlTag | text=TEXT)
	 */
	protected void sequence_HtmlContent(EObject context, HtmlContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parts+=HtmlContent*
	 */
	protected void sequence_HtmlLabel(EObject context, HtmlLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=HtmlAttr* (selfClosing?=TAG_END_CLOSE | (children+=HtmlContent* closeName=ID)))
	 */
	protected void sequence_HtmlTag(EObject context, HtmlTag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
