/*
 * Copyright (c) 2010-2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.internal.net4j.protocol;

import org.eclipse.emf.cdo.common.protocol.CDODataInput;
import org.eclipse.emf.cdo.common.protocol.CDODataOutput;
import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.spi.common.branch.InternalCDOBranchManager.BranchLoader.BranchInfo;

import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class LoadBranchRequest extends CDOClientRequest<BranchInfo>
{
  private int branchID;

  public LoadBranchRequest(CDOClientProtocol protocol, int branchID)
  {
    super(protocol, CDOProtocolConstants.SIGNAL_LOAD_BRANCH);
    this.branchID = branchID;
  }

  @Override
  protected void requesting(CDODataOutput out) throws IOException
  {
    out.writeXInt(branchID);
  }

  @Override
  protected BranchInfo confirming(CDODataInput in) throws IOException
  {
    return new BranchInfo(in);
  }
}
