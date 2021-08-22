/*******************************************************************************
 * Copyright (c) 2015, 2016 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *     Jonathan Pepin (Soft-Maint) - Bug 480777 - IllegalStateException at org.eclipse.emf.facet.efacet.edit.ui.internal.provider.FacetItemPropertyDescriptor.getDescription()
 *     Jonathan Pepin (Soft-Maint) - Bug 509459 - PropertySourceProvider dependency on implementation instead of interface
 *     Jonathan Pepin (Soft-Maint) - Bug 509463 - Add compatibility of DataTypes to PropertyDescriptor
 *******************************************************************************/

package org.eclipse.emf.facet.efacet.edit.ui.internal.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.emf.facet.efacet.edit.core.IFacetCommandFactory;
import org.eclipse.emf.facet.efacet.edit.ui.internal.Activator;
import org.eclipse.emf.facet.efacet.edit.ui.internal.FacetPropertyRuntimeException;
import org.eclipse.emf.facet.efacet.edit.ui.internal.Messages;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.osgi.util.NLS;

public class FacetItemPropertyDescriptor implements IItemPropertyDescriptor {

	private final EObject eObject;
	private final EStructuralFeature feature;
	private final Object value;
	private final EditingDomain editingDomain;
	private final ILabelProvider labelProvider;
	private final IFacetManager facetManager;

	public FacetItemPropertyDescriptor(final EObject eObject,
			final EStructuralFeature structuralFeature, final Object value,
			final EditingDomain editingDomain,
			final ILabelProvider labelProvider, final IFacetManager facetManager) {
		this.eObject = eObject;
		this.feature = structuralFeature;
		this.value = value;
		this.editingDomain = editingDomain;
		this.labelProvider = labelProvider;
		this.facetManager = facetManager;
	}

	public Object getPropertyValue(final Object object) {
		return this.value;
	}

	public boolean isPropertySet(final Object object) {
		return ((EObject) object).eIsSet(this.feature);
	}

	public void resetPropertyValue(final Object object) {
		if (this.editingDomain == null) {
			this.eObject.eUnset(this.feature);
		} else {
			final CommandStack commandStack = this.editingDomain
					.getCommandStack();
			final Command command = SetCommand.create(this.editingDomain,
					this.eObject, this.feature, SetCommand.UNSET_VALUE);
			commandStack.execute(command);
		}
	}

	/**
	 * Test if Property is editable (true) or read-only (false) on is changeable
	 * (false)
	 */
	public boolean canSetProperty(final Object object) {
		boolean result;
		if (this.editingDomain == null) {
			result = this.feature.isChangeable();
		} else {
			result = this.feature.isChangeable()
					&& !this.editingDomain.isReadOnly(this.eObject.eResource());
		}
		return result;
	}

	public void setPropertyValue(final Object object, final Object newValue) {
		if (this.editingDomain == null) {
			this.eObject.eSet(this.feature, newValue);
		} else {
			final CommandStack commandStack = this.editingDomain
					.getCommandStack();
			try {
				final Command command = IFacetCommandFactory.DEFAULT
						.createSetCommand(this.eObject, this.feature, newValue,
								this.editingDomain, this.facetManager);
				commandStack.execute(command);
			} catch (FacetCommandException e) {
				final String objectName =
						this.labelProvider.getText(this.eObject);
				final String msg = String.format(
						"Can't set the value %s on %s.%s", //$NON-NLS-1$
						newValue, objectName, this.feature.getName());
				Logger.logError(e, msg, Activator.getDefault());
				throw new FacetPropertyRuntimeException(msg, e);
			}
		}
	}

	/**
	 * By default facet property have no specific category and added with other
	 * common properties
	 */
	public String getCategory(final Object object) {
		return null;
	}

	public String getDescription(final Object object) {
		return NLS.bind(Messages.FacetItemPropertyDescriptor_The_xx_of_the_yy,
				this.feature.getName(), this.eObject.eClass().getName());
	}

	public String getDisplayName(final Object object) {
		return this.feature.getName();
	}

	/**
	 * The only flag recognized by Eclipse is
	 * org.eclipse.ui.views.properties.expert if properties marked with this
	 * flag, the property will not be displayed unless button or drop-down
	 * "Show Advanced Properties" is selected
	 */
	public String[] getFilterFlags(final Object object) {
		return new String[0];
	}

	public Object getHelpContextIds(final Object object) {
		return null;
	}

	public String getId(final Object object) {
		return this.feature.getName();
	}

	public IItemLabelProvider getLabelProvider(final Object object) {

		return new IItemLabelProvider() {
			public String getText(final Object obj) {
				return getLabelProvider().getText(obj);
			}

			public Object getImage(final Object obj) {
				return getLabelProvider().getImage(obj);
			}
		};
	}

	public boolean isCompatibleWith(final Object object,
			final Object anotherObject,
			final IItemPropertyDescriptor propDescriptor) {
		return false;
	}

	public Object getFeature(final Object object) {
		return this.feature;
	}

	public boolean isMany(final Object object) {
		return this.feature.getUpperBound() == -1;
	}

	/**
	 * construct list if the feature is a reference or a boolean attribute
	 * otherwise return null
	 */
	public Collection<?> getChoiceOfValues(final Object object) {
		final EClassifier eType = this.feature.getEType();
		List<Object> result = null;
		if (this.feature instanceof EReference) {
			result = new ArrayList<Object>();
			final Resource eResource = this.eObject.eResource();
			final ResourceSet resourceSet = eResource.getResourceSet();
			final TreeIterator<Notifier> allContents = resourceSet
					.getAllContents();
			while (allContents.hasNext()) {
				final Notifier notifier = allContents.next();
				if (notifier instanceof EObject) {
					final EObject choiceValue = (EObject) notifier;
					if (eType.isInstance(choiceValue)) {
						result.add(choiceValue);
					}
				}
			}
		} else if (eType.getInstanceClass() == Boolean.class
				|| eType.getInstanceClass() == Boolean.TYPE) {
			result = Arrays
					.asList(new Object[] { Boolean.FALSE, Boolean.TRUE });
		}
		return result;
	}

	/**
	 * Used only if the property should be edited as multi-line text
	 */
	public boolean isMultiLine(final Object object) {
		return false;
	}

	/**
	 * return true to order alphabetical values in list
	 */
	public boolean isSortChoices(final Object object) {
		return true;
	}

	protected ILabelProvider getLabelProvider() {
		return this.labelProvider;
	}
}
