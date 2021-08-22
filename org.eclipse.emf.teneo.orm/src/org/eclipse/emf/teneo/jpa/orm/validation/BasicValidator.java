/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicValidator.java,v 1.1 2009/07/23 11:16:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.validation;

import org.eclipse.emf.teneo.jpa.orm.Column;
import org.eclipse.emf.teneo.jpa.orm.EnumType;
import org.eclipse.emf.teneo.jpa.orm.FetchType;
import org.eclipse.emf.teneo.jpa.orm.Lob;
import org.eclipse.emf.teneo.jpa.orm.TemporalType;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.jpa.orm.Basic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BasicValidator {
	boolean validate();

	boolean validateColumn(Column value);
	boolean validateLob(Lob value);
	boolean validateTemporal(TemporalType value);
	boolean validateEnumerated(EnumType value);
	boolean validateFetch(FetchType value);
	boolean validateName(String value);
	boolean validateOptional(boolean value);
}