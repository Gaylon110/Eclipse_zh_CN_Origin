/*******************************************************************************
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.oclstdlib.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class OCLstdlibProposalProvider extends AbstractOCLstdlibProposalProvider
{
	@Override
	public void complete_PrimitiveTypeIdentifier(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, getPrimitiveTypeImage());
	}

//	@Override
//	protected ConfigurableCompletionProposal doCreateProposal(String proposal,
//			StyledString displayString, Image image, int replacementOffset,
//			int replacementLength) {
//		System.out.println("Create " + displayString);
//		return super.doCreateProposal(proposal, displayString, image, replacementOffset,
//			replacementLength);
//	}
}
