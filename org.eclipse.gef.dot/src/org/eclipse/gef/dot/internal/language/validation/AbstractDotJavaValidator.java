/*
* generated by Xtext
*/
package org.eclipse.gef.dot.internal.language.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractDotJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipse.gef.dot.internal.language.dot.DotPackage.eINSTANCE);
		return result;
	}

}