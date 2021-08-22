package org.eclipse.gef.dot.internal.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.language.dot.AttrList;
import org.eclipse.gef.dot.internal.language.dot.AttrStmt;
import org.eclipse.gef.dot.internal.language.dot.Attribute;
import org.eclipse.gef.dot.internal.language.dot.DotAst;
import org.eclipse.gef.dot.internal.language.dot.DotGraph;
import org.eclipse.gef.dot.internal.language.dot.DotPackage;
import org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode;
import org.eclipse.gef.dot.internal.language.dot.EdgeRhsSubgraph;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph;
import org.eclipse.gef.dot.internal.language.dot.NodeId;
import org.eclipse.gef.dot.internal.language.dot.NodeStmt;
import org.eclipse.gef.dot.internal.language.dot.Port;
import org.eclipse.gef.dot.internal.language.dot.Subgraph;
import org.eclipse.gef.dot.internal.language.services.DotGrammarAccess;
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
public class DotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DotPackage.ATTR_LIST:
				if(context == grammarAccess.getAttrListRule()) {
					sequence_AttrList(context, (AttrList) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.ATTR_STMT:
				if(context == grammarAccess.getAttrStmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_AttrStmt(context, (AttrStmt) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DOT_AST:
				if(context == grammarAccess.getDotAstRule()) {
					sequence_DotAst(context, (DotAst) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DOT_GRAPH:
				if(context == grammarAccess.getDotGraphRule()) {
					sequence_DotGraph(context, (DotGraph) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.EDGE_RHS_NODE:
				if(context == grammarAccess.getEdgeRhsRule() ||
				   context == grammarAccess.getEdgeRhsNodeRule()) {
					sequence_EdgeRhsNode(context, (EdgeRhsNode) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.EDGE_RHS_SUBGRAPH:
				if(context == grammarAccess.getEdgeRhsRule() ||
				   context == grammarAccess.getEdgeRhsSubgraphRule()) {
					sequence_EdgeRhsSubgraph(context, (EdgeRhsSubgraph) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.EDGE_STMT_NODE:
				if(context == grammarAccess.getEdgeStmtNodeRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_EdgeStmtNode(context, (EdgeStmtNode) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.EDGE_STMT_SUBGRAPH:
				if(context == grammarAccess.getEdgeStmtSubgraphRule()) {
					sequence_EdgeStmtSubgraph(context, (EdgeStmtSubgraph) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStmtRule() ||
				   context == grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()) {
					sequence_SubgraphOrEdgeStmtSubgraph(context, (EdgeStmtSubgraph) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.NODE_ID:
				if(context == grammarAccess.getNodeIdRule()) {
					sequence_NodeId(context, (NodeId) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.NODE_STMT:
				if(context == grammarAccess.getNodeStmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_NodeStmt(context, (NodeStmt) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.PORT:
				if(context == grammarAccess.getPortRule()) {
					sequence_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.SUBGRAPH:
				if(context == grammarAccess.getStmtRule() ||
				   context == grammarAccess.getSubgraphRule() ||
				   context == grammarAccess.getSubgraphOrEdgeStmtSubgraphRule() ||
				   context == grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0()) {
					sequence_Subgraph(context, (Subgraph) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attributes+=Attribute*)
	 */
	protected void sequence_AttrList(EObject context, AttrList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AttributeType attrLists+=AttrList+)
	 */
	protected void sequence_AttrStmt(EObject context, AttrStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getValueIDParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     graphs+=DotGraph*
	 */
	protected void sequence_DotAst(EObject context, DotAst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (strict?='strict'? type=GraphType name=ID? stmts+=Stmt*)
	 */
	protected void sequence_DotGraph(EObject context, DotGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=EdgeOp node=NodeId)
	 */
	protected void sequence_EdgeRhsNode(EObject context, EdgeRhsNode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.EDGE_RHS__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.EDGE_RHS__OP));
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.EDGE_RHS_NODE__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.EDGE_RHS_NODE__NODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_1_0(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=EdgeOp subgraph=Subgraph)
	 */
	protected void sequence_EdgeRhsSubgraph(EObject context, EdgeRhsSubgraph semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.EDGE_RHS__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.EDGE_RHS__OP));
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.EDGE_RHS_SUBGRAPH__SUBGRAPH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.EDGE_RHS_SUBGRAPH__SUBGRAPH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_1_0(), semanticObject.getSubgraph());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (node=NodeId edgeRHS+=EdgeRhs+ attrLists+=AttrList*)
	 */
	protected void sequence_EdgeStmtNode(EObject context, EdgeStmtNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subgraph=Subgraph edgeRHS+=EdgeRhs+ attrLists+=AttrList*)
	 */
	protected void sequence_EdgeStmtSubgraph(EObject context, EdgeStmtSubgraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID port=Port?)
	 */
	protected void sequence_NodeId(EObject context, NodeId semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (node=NodeId attrLists+=AttrList*)
	 */
	protected void sequence_NodeStmt(EObject context, NodeStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (compass_pt=COMPASS_PT | (name=ID compass_pt=COMPASS_PT?))
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subgraph=SubgraphOrEdgeStmtSubgraph_EdgeStmtSubgraph_1_0 edgeRHS+=EdgeRhs+ attrLists+=AttrList*)
	 */
	protected void sequence_SubgraphOrEdgeStmtSubgraph(EObject context, EdgeStmtSubgraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? stmts+=Stmt*)
	 */
	protected void sequence_Subgraph(EObject context, Subgraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
