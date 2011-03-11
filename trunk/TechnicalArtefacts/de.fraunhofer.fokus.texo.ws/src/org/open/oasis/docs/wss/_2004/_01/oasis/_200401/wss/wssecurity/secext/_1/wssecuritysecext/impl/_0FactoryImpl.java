/**
* This file is part of WSSecurityPolicyEditor.
* Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
* Authors: Tom Sattler
* 
* WSSecurityPolicyEditor is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* WSSecurityPolicyEditor is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* 
* You should have received a copy of the GNU Affero General Public License
* along with WSSecurityPolicyEditor.  If not, see <http://www.gnu.org/licenses/>.
* 
* For more information, please contact Fraunhofer FOKUS at this
* address: elankontakt [at] fokus [dot] fraunhofer [dot] de
* http://www.fokus.fraunhofer.de
*/
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0FactoryImpl extends EFactoryImpl implements _0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _0Factory init() {
		try {
			_0Factory the_0Factory = (_0Factory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"); 
			if (the_0Factory != null) {
				return the_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _0Package.ATTRIBUTED_STRING: return createAttributedString();
			case _0Package.ATTRIBUTED_STRING1: return createAttributedString1();
			case _0Package.BINARY_SECURITY_TOKEN_TYPE: return createBinarySecurityTokenType();
			case _0Package.BINARY_SECURITY_TOKEN_TYPE1: return createBinarySecurityTokenType1();
			case _0Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _0Package.EMBEDDED_TYPE: return createEmbeddedType();
			case _0Package.EMBEDDED_TYPE1: return createEmbeddedType1();
			case _0Package.ENCODED_STRING: return createEncodedString();
			case _0Package.ENCODED_STRING1: return createEncodedString1();
			case _0Package.KEY_IDENTIFIER_TYPE: return createKeyIdentifierType();
			case _0Package.KEY_IDENTIFIER_TYPE1: return createKeyIdentifierType1();
			case _0Package.PASSWORD_STRING: return createPasswordString();
			case _0Package.PASSWORD_STRING1: return createPasswordString1();
			case _0Package.REFERENCE_TYPE: return createReferenceType();
			case _0Package.REFERENCE_TYPE1: return createReferenceType1();
			case _0Package.SECURITY_HEADER_TYPE: return createSecurityHeaderType();
			case _0Package.SECURITY_HEADER_TYPE1: return createSecurityHeaderType1();
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE: return createSecurityTokenReferenceType();
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE1: return createSecurityTokenReferenceType1();
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE: return createTransformationParametersType();
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE1: return createTransformationParametersType1();
			case _0Package.USERNAME_TOKEN_TYPE: return createUsernameTokenType();
			case _0Package.USERNAME_TOKEN_TYPE1: return createUsernameTokenType1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.FAULTCODE_ENUM:
				return createFaultcodeEnumFromString(eDataType, initialValue);
			case _0Package.FAULTCODE_ENUM1:
				return createFaultcodeEnum1FromString(eDataType, initialValue);
			case _0Package.TUSAGE:
				return createTUsageFromString(eDataType, initialValue);
			case _0Package.TUSAGE1:
				return createTUsage1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.FAULTCODE_ENUM:
				return convertFaultcodeEnumToString(eDataType, instanceValue);
			case _0Package.FAULTCODE_ENUM1:
				return convertFaultcodeEnum1ToString(eDataType, instanceValue);
			case _0Package.TUSAGE:
				return convertTUsageToString(eDataType, instanceValue);
			case _0Package.TUSAGE1:
				return convertTUsage1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedString createAttributedString() {
		AttributedStringImpl attributedString = new AttributedStringImpl();
		return attributedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedString1 createAttributedString1() {
		AttributedString1Impl attributedString1 = new AttributedString1Impl();
		return attributedString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecurityTokenType createBinarySecurityTokenType() {
		BinarySecurityTokenTypeImpl binarySecurityTokenType = new BinarySecurityTokenTypeImpl();
		return binarySecurityTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecurityTokenType1 createBinarySecurityTokenType1() {
		BinarySecurityTokenType1Impl binarySecurityTokenType1 = new BinarySecurityTokenType1Impl();
		return binarySecurityTokenType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedType createEmbeddedType() {
		EmbeddedTypeImpl embeddedType = new EmbeddedTypeImpl();
		return embeddedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedType1 createEmbeddedType1() {
		EmbeddedType1Impl embeddedType1 = new EmbeddedType1Impl();
		return embeddedType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedString createEncodedString() {
		EncodedStringImpl encodedString = new EncodedStringImpl();
		return encodedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedString1 createEncodedString1() {
		EncodedString1Impl encodedString1 = new EncodedString1Impl();
		return encodedString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIdentifierType createKeyIdentifierType() {
		KeyIdentifierTypeImpl keyIdentifierType = new KeyIdentifierTypeImpl();
		return keyIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIdentifierType1 createKeyIdentifierType1() {
		KeyIdentifierType1Impl keyIdentifierType1 = new KeyIdentifierType1Impl();
		return keyIdentifierType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordString createPasswordString() {
		PasswordStringImpl passwordString = new PasswordStringImpl();
		return passwordString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordString1 createPasswordString1() {
		PasswordString1Impl passwordString1 = new PasswordString1Impl();
		return passwordString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 createReferenceType1() {
		ReferenceType1Impl referenceType1 = new ReferenceType1Impl();
		return referenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityHeaderType createSecurityHeaderType() {
		SecurityHeaderTypeImpl securityHeaderType = new SecurityHeaderTypeImpl();
		return securityHeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityHeaderType1 createSecurityHeaderType1() {
		SecurityHeaderType1Impl securityHeaderType1 = new SecurityHeaderType1Impl();
		return securityHeaderType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenReferenceType createSecurityTokenReferenceType() {
		SecurityTokenReferenceTypeImpl securityTokenReferenceType = new SecurityTokenReferenceTypeImpl();
		return securityTokenReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenReferenceType1 createSecurityTokenReferenceType1() {
		SecurityTokenReferenceType1Impl securityTokenReferenceType1 = new SecurityTokenReferenceType1Impl();
		return securityTokenReferenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationParametersType createTransformationParametersType() {
		TransformationParametersTypeImpl transformationParametersType = new TransformationParametersTypeImpl();
		return transformationParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationParametersType1 createTransformationParametersType1() {
		TransformationParametersType1Impl transformationParametersType1 = new TransformationParametersType1Impl();
		return transformationParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsernameTokenType createUsernameTokenType() {
		UsernameTokenTypeImpl usernameTokenType = new UsernameTokenTypeImpl();
		return usernameTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsernameTokenType1 createUsernameTokenType1() {
		UsernameTokenType1Impl usernameTokenType1 = new UsernameTokenType1Impl();
		return usernameTokenType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultcodeEnumFromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultcodeEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultcodeEnum1FromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultcodeEnum1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createTUsageFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUsageToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createTUsage1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUsage1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Package get_0Package() {
		return (_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _0Package getPackage() {
		return _0Package.eINSTANCE;
	}

} //_0FactoryImpl
