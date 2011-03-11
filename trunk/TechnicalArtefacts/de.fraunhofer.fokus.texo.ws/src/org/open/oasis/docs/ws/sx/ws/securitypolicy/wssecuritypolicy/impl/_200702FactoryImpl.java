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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _200702FactoryImpl extends EFactoryImpl implements _200702Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _200702Factory init() {
		try {
			_200702Factory the_200702Factory = (_200702Factory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702"); 
			if (the_200702Factory != null) {
				return the_200702Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _200702FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200702FactoryImpl() {
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
			case _200702Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _200702Package.EMPTY_TYPE: return createEmptyType();
			case _200702Package.HEADER_TYPE: return createHeaderType();
			case _200702Package.ISSUED_TOKEN_TYPE: return createIssuedTokenType();
			case _200702Package.KEY_VALUE_TOKEN_TYPE: return createKeyValueTokenType();
			case _200702Package.NESTED_POLICY_TYPE: return createNestedPolicyType();
			case _200702Package.QNAME_ASSERTION_TYPE: return createQNameAssertionType();
			case _200702Package.REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE: return createRequestSecurityTokenTemplateType();
			case _200702Package.SECURE_CONVERSATION_TOKEN_TYPE: return createSecureConversationTokenType();
			case _200702Package.SE_PARTS_TYPE: return createSePartsType();
			case _200702Package.SER_ELEMENTS_TYPE: return createSerElementsType();
			case _200702Package.SPNEGO_CONTEXT_TOKEN_TYPE: return createSpnegoContextTokenType();
			case _200702Package.TOKEN_ASSERTION_TYPE: return createTokenAssertionType();
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
			case _200702Package.INCLUDE_TOKEN_TYPE:
				return createIncludeTokenTypeFromString(eDataType, initialValue);
			case _200702Package.INCLUDE_TOKEN_OPEN_TYPE:
				return createIncludeTokenOpenTypeFromString(eDataType, initialValue);
			case _200702Package.INCLUDE_TOKEN_TYPE_OBJECT:
				return createIncludeTokenTypeObjectFromString(eDataType, initialValue);
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
			case _200702Package.INCLUDE_TOKEN_TYPE:
				return convertIncludeTokenTypeToString(eDataType, instanceValue);
			case _200702Package.INCLUDE_TOKEN_OPEN_TYPE:
				return convertIncludeTokenOpenTypeToString(eDataType, instanceValue);
			case _200702Package.INCLUDE_TOKEN_TYPE_OBJECT:
				return convertIncludeTokenTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuedTokenType createIssuedTokenType() {
		IssuedTokenTypeImpl issuedTokenType = new IssuedTokenTypeImpl();
		return issuedTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueTokenType createKeyValueTokenType() {
		KeyValueTokenTypeImpl keyValueTokenType = new KeyValueTokenTypeImpl();
		return keyValueTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedPolicyType createNestedPolicyType() {
		NestedPolicyTypeImpl nestedPolicyType = new NestedPolicyTypeImpl();
		return nestedPolicyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QNameAssertionType createQNameAssertionType() {
		QNameAssertionTypeImpl qNameAssertionType = new QNameAssertionTypeImpl();
		return qNameAssertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenTemplateType createRequestSecurityTokenTemplateType() {
		RequestSecurityTokenTemplateTypeImpl requestSecurityTokenTemplateType = new RequestSecurityTokenTemplateTypeImpl();
		return requestSecurityTokenTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureConversationTokenType createSecureConversationTokenType() {
		SecureConversationTokenTypeImpl secureConversationTokenType = new SecureConversationTokenTypeImpl();
		return secureConversationTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SePartsType createSePartsType() {
		SePartsTypeImpl sePartsType = new SePartsTypeImpl();
		return sePartsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerElementsType createSerElementsType() {
		SerElementsTypeImpl serElementsType = new SerElementsTypeImpl();
		return serElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpnegoContextTokenType createSpnegoContextTokenType() {
		SpnegoContextTokenTypeImpl spnegoContextTokenType = new SpnegoContextTokenTypeImpl();
		return spnegoContextTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAssertionType createTokenAssertionType() {
		TokenAssertionTypeImpl tokenAssertionType = new TokenAssertionTypeImpl();
		return tokenAssertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeTokenType createIncludeTokenTypeFromString(EDataType eDataType, String initialValue) {
		IncludeTokenType result = IncludeTokenType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncludeTokenTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIncludeTokenOpenTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createIncludeTokenTypeFromString(_200702Package.Literals.INCLUDE_TOKEN_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncludeTokenOpenTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200702Package.Literals.INCLUDE_TOKEN_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertIncludeTokenTypeToString(_200702Package.Literals.INCLUDE_TOKEN_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeTokenType createIncludeTokenTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIncludeTokenTypeFromString(_200702Package.Literals.INCLUDE_TOKEN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncludeTokenTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIncludeTokenTypeToString(_200702Package.Literals.INCLUDE_TOKEN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200702Package get_200702Package() {
		return (_200702Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _200702Package getPackage() {
		return _200702Package.eINSTANCE;
	}

} //_200702FactoryImpl
