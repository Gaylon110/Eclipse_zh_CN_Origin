/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.eclipse.egf.model.editor.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.ui.provider.TransactionalAdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @author Xavier Maysonnave
 * 
 */
public class FcoreContentProvider extends TransactionalAdapterFactoryContentProvider {

  public FcoreContentProvider(TransactionalEditingDomain editingDomain, AdapterFactory adapterFactory) {
    super(editingDomain, adapterFactory);
  }

  @Override
  protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
    return new FcorePropertySource(object, itemPropertySource);
  }

}
