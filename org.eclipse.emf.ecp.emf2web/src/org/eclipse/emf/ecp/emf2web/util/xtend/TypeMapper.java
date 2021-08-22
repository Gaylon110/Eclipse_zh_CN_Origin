/**
 * Copyright (c) 2011-2015 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Stefan Dirix - initial API and implementation
 */
package org.eclipse.emf.ecp.emf2web.util.xtend;

import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * @author Stefan Dirix
 */
@SuppressWarnings("all")
public class TypeMapper {
  public static boolean isBooleanType(final EClassifier eType) {
    boolean _switchResult = false;
    Class<?> _instanceClass = eType.getInstanceClass();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_instanceClass, boolean.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Boolean.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isStringType(final EClassifier eType) {
    boolean _switchResult = false;
    Class<?> _instanceClass = eType.getInstanceClass();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_instanceClass, String.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isNumberType(final EClassifier eType) {
    boolean _switchResult = false;
    Class<?> _instanceClass = eType.getInstanceClass();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_instanceClass, BigDecimal.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, double.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Double.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, float.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Float.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isIntegerType(final EClassifier eType) {
    boolean _switchResult = false;
    Class<?> _instanceClass = eType.getInstanceClass();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_instanceClass, BigInteger.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Byte.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, byte.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, char.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Character.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, int.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Integer.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Long.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, long.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Short.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, short.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isDateType(final EClassifier eType) {
    boolean _switchResult = false;
    Class<?> _instanceClass = eType.getInstanceClass();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_instanceClass, XMLGregorianCalendar.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_instanceClass, Date.class)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isEnumType(final EClassifier eType) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      EClass _eEnum = EcorePackage.eINSTANCE.getEEnum();
      boolean _isInstance = _eEnum.isInstance(eType);
      if (_isInstance) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isUnsupportedType(final EClassifier eType) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      EDataType _eByteArray = EcorePackage.eINSTANCE.getEByteArray();
      if (Objects.equal(eType, _eByteArray)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eDiagnosticChain = EcorePackage.eINSTANCE.getEDiagnosticChain();
      if (Objects.equal(eType, _eDiagnosticChain)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eEList = EcorePackage.eINSTANCE.getEEList();
      if (Objects.equal(eType, _eEList)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eEnumerator = EcorePackage.eINSTANCE.getEEnumerator();
      if (Objects.equal(eType, _eEnumerator)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eFeatureMap = EcorePackage.eINSTANCE.getEFeatureMap();
      if (Objects.equal(eType, _eFeatureMap)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eFeatureMapEntry = EcorePackage.eINSTANCE.getEFeatureMapEntry();
      if (Objects.equal(eType, _eFeatureMapEntry)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eInvocationTargetException = EcorePackage.eINSTANCE.getEInvocationTargetException();
      if (Objects.equal(eType, _eInvocationTargetException)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eJavaClass = EcorePackage.eINSTANCE.getEJavaClass();
      if (Objects.equal(eType, _eJavaClass)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eJavaObject = EcorePackage.eINSTANCE.getEJavaObject();
      if (Objects.equal(eType, _eJavaObject)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eMap = EcorePackage.eINSTANCE.getEMap();
      if (Objects.equal(eType, _eMap)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eResource = EcorePackage.eINSTANCE.getEResource();
      if (Objects.equal(eType, _eResource)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eResourceSet = EcorePackage.eINSTANCE.getEResourceSet();
      if (Objects.equal(eType, _eResourceSet)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      EDataType _eTreeIterator = EcorePackage.eINSTANCE.getETreeIterator();
      if (Objects.equal(eType, _eTreeIterator)) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean isAllowed(final EClassifier eType) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _or_4 = false;
    boolean _isBooleanType = TypeMapper.isBooleanType(eType);
    if (_isBooleanType) {
      _or_4 = true;
    } else {
      boolean _isStringType = TypeMapper.isStringType(eType);
      _or_4 = _isStringType;
    }
    if (_or_4) {
      _or_3 = true;
    } else {
      boolean _isNumberType = TypeMapper.isNumberType(eType);
      _or_3 = _isNumberType;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _isIntegerType = TypeMapper.isIntegerType(eType);
      _or_2 = _isIntegerType;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _isDateType = TypeMapper.isDateType(eType);
      _or_1 = _isDateType;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _isEnumType = TypeMapper.isEnumType(eType);
      _or = _isEnumType;
    }
    return _or;
  }
}
