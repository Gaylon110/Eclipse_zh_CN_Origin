package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.services.DotHtmlLabelGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DotHtmlLabelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DotHtmlLabelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_HtmlAttr_WSTerminalRuleCall_1_q;
	protected AbstractElementAlias match_HtmlAttr_WSTerminalRuleCall_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DotHtmlLabelGrammarAccess) access;
		match_HtmlAttr_WSTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_1());
		match_HtmlAttr_WSTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getASSIGNRule())
			return getASSIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_ENDRule())
			return getTAG_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_END_CLOSERule())
			return getTAG_END_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_STARTRule())
			return getTAG_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_START_CLOSERule())
			return getTAG_START_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ASSIGN: '=';
	 */
	protected String getASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal TAG_END        :  '>';
	 */
	protected String getTAG_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal TAG_END_CLOSE  : '/>';
	 */
	protected String getTAG_END_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/>";
	}
	
	/**
	 * terminal TAG_START      :  '<';
	 */
	protected String getTAG_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal TAG_START_CLOSE: '</';
	 */
	protected String getTAG_START_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "</";
	}
	
	/**
	 * terminal WS: (' '|'\t'|'\n'|'\r'|'\f')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_HtmlAttr_WSTerminalRuleCall_1_q.equals(syntax))
				emit_HtmlAttr_WSTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HtmlAttr_WSTerminalRuleCall_3_q.equals(syntax))
				emit_HtmlAttr_WSTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_HtmlAttr_WSTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_HtmlAttr_WSTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
