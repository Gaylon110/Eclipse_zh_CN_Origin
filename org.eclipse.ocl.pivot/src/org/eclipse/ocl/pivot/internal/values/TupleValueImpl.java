/*******************************************************************************
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.pivot.internal.values;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.eclipse.ocl.pivot.values.ValuesPackage;

/**
 * UML implementation of a tuple value.
 *
 * @author Christian W. Damus (cdamus)
 * @generated NOT
 */
public class TupleValueImpl extends ValueImpl implements TupleValue
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.TUPLE_VALUE;
	}

	protected final @NonNull TupleTypeId tupleTypeId;
	private final @Nullable Object @NonNull [] partValues;
	private Integer hashCode = null;

	/**
	 * Initializes me with a map of part values.
	 *
	 * @param tupleTypeId my type
	 * @param values my parts
	 */
	public TupleValueImpl(@NonNull TupleTypeId tupleTypeId, @NonNull Map<@NonNull ? extends TuplePartId, @Nullable Object> values) {
		this.tupleTypeId = tupleTypeId;
		partValues = new @Nullable Object[tupleTypeId.getPartIds().length];
		for (Map.Entry<@NonNull ? extends TuplePartId, @Nullable Object> entry : values.entrySet()) {
			partValues[entry.getKey().getIndex()] = entry.getValue();
		}
	}

	/**
	 * Convenience constructor to initialize me with a list of values as
	 * required by the Collection::product() operation.
	 *
	 * @param tupleTypeId my type
	 * @param values my values which are aligned to the tupleTypeId.getParts()
	 */
	public TupleValueImpl(@NonNull TupleTypeId tupleTypeId, @Nullable Object... values) {
		this.tupleTypeId = tupleTypeId;
		TuplePartId[] partIds = tupleTypeId.getPartIds();
		if (partIds.length != values.length) {
			throw new InvalidValueException("Mismatching tuple values");
		}
		partValues = new @Nullable Object[partIds.length];
		for (int i = 0; i < values.length; i++) {
			partValues[i] = values[i];
		}
	}

	@Override
	public @NonNull Object asObject() {
		return partValues;
	}

	@Override
	public @NonNull TupleValue asTupleValue() {
		return this;
	}

	// overrides the inherited implementation
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof TupleValueImpl)) {
			return false;
		}
		TupleValueImpl that = (TupleValueImpl)o;
		if (this.tupleTypeId != that.tupleTypeId) {
			return false;
		}
		@Nullable Object @NonNull [] partValues2 = partValues;			// Avoids a null-error on JDT 4.5
		for (int i = 0; i < partValues2.length; i++) {
			Object thisPart = partValues2[i];
			Object thatPart = that.partValues[i];
			if (thisPart == null) {
				if (thatPart != null) {
					return false;
				}
			}
			else {
				if (!thisPart.equals(thatPart)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public @NonNull TupleTypeId getTypeId() {
		return tupleTypeId;
	}

	// implements the inherited specification
	@Override
	public @Nullable Object getValue(@NonNull TuplePartId partId) {
		return getValue(partId.getIndex());
	}

	// implements the inherited specification
	@Override
	public @Nullable Object getValue(int index) {
		return partValues[index];
	}

	// overrides the inherited implementation
	@Override
	public int hashCode() {
		if (hashCode == null) {
			int hash = tupleTypeId.hashCode();
			for (@Nullable Object partValue : partValues) {
				hash = 37* hash + (partValue != null ? partValue.hashCode() : 0);
			}
			hashCode = hash;
		}
		return hashCode;
	}


	@Override
	public void toString(@NonNull StringBuilder s, int sizeLimit) {
		s.append("Tuple{"); //$NON-NLS-1$
		TuplePartId[] partIds = tupleTypeId.getPartIds();
		for (int i = 0; i < partIds.length; i++) {
			TuplePartId partId = partIds[i];
			if (i != 0) {
				s.append(", "); //$NON-NLS-1$
			}
			s.append(partId.getDisplayName());
			s.append(" = "); //$NON-NLS-1$a
			ValueUtil.toString(partValues[i], s, 40);
		}
		s.append("}"); //$NON-NLS-1$
	}

	/*    private String toString(Object o) {
        / *if (o instanceof String) {
            return "'" + (String) o + "'"; //$NON-NLS-1$ //$NON-NLS-2$
        } else if (o instanceof NullValue) {
            return o.toString();
        } else if (o instanceof CollectionValue) {
            return toString((CollectionValue) o);
        } else* / if (o == null) {
            return "null"; //$NON-NLS-1$
        } else {
            return o.toString();
        }
    } */
}
