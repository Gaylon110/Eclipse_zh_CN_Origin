package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.services.DotGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DotSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DotGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttrList___CommaKeyword_2_1_0_or_SemicolonKeyword_2_1_1__q;
	protected AbstractElementAlias match_Stmt_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_Subgraph_SubgraphKeyword_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DotGrammarAccess) access;
		match_AttrList___CommaKeyword_2_1_0_or_SemicolonKeyword_2_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1()));
		match_Stmt_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getStmtAccess().getSemicolonKeyword_1());
		match_Subgraph_SubgraphKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0());
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
			if(match_AttrList___CommaKeyword_2_1_0_or_SemicolonKeyword_2_1_1__q.equals(syntax))
				emit_AttrList___CommaKeyword_2_1_0_or_SemicolonKeyword_2_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Stmt_SemicolonKeyword_1_q.equals(syntax))
				emit_Stmt_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Subgraph_SubgraphKeyword_1_0_q.equals(syntax))
				emit_Subgraph_SubgraphKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (',' | ';')?
	 */
	protected void emit_AttrList___CommaKeyword_2_1_0_or_SemicolonKeyword_2_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Stmt_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'subgraph'?
	 */
	protected void emit_Subgraph_SubgraphKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
