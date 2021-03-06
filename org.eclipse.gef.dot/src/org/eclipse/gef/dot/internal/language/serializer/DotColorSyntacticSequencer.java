package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.services.DotColorGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DotColorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DotColorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_HSVColor_CommaKeyword_1_q;
	protected AbstractElementAlias match_HSVColor_CommaKeyword_3_q;
	protected AbstractElementAlias match_StringColor___SolidusKeyword_0_0_SolidusKeyword_0_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DotColorGrammarAccess) access;
		match_HSVColor_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getHSVColorAccess().getCommaKeyword_1());
		match_HSVColor_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getHSVColorAccess().getCommaKeyword_3());
		match_StringColor___SolidusKeyword_0_0_SolidusKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStringColorAccess().getSolidusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getStringColorAccess().getSolidusKeyword_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_HSVColor_CommaKeyword_1_q.equals(syntax))
				emit_HSVColor_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HSVColor_CommaKeyword_3_q.equals(syntax))
				emit_HSVColor_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StringColor___SolidusKeyword_0_0_SolidusKeyword_0_2__q.equals(syntax))
				emit_StringColor___SolidusKeyword_0_0_SolidusKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_HSVColor_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_HSVColor_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('/' '/')?
	 */
	protected void emit_StringColor___SolidusKeyword_0_0_SolidusKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
