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
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package
 * @generated
 */
public class _0Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _0Validator INSTANCE = new _0Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _0Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _0Package.ATTRIBUTED_STRING:
				return validateAttributedString((AttributedString)value, diagnostics, context);
			case _0Package.ATTRIBUTED_STRING1:
				return validateAttributedString1((AttributedString1)value, diagnostics, context);
			case _0Package.BINARY_SECURITY_TOKEN_TYPE:
				return validateBinarySecurityTokenType((BinarySecurityTokenType)value, diagnostics, context);
			case _0Package.BINARY_SECURITY_TOKEN_TYPE1:
				return validateBinarySecurityTokenType1((BinarySecurityTokenType1)value, diagnostics, context);
			case _0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _0Package.EMBEDDED_TYPE:
				return validateEmbeddedType((EmbeddedType)value, diagnostics, context);
			case _0Package.EMBEDDED_TYPE1:
				return validateEmbeddedType1((EmbeddedType1)value, diagnostics, context);
			case _0Package.ENCODED_STRING:
				return validateEncodedString((EncodedString)value, diagnostics, context);
			case _0Package.ENCODED_STRING1:
				return validateEncodedString1((EncodedString1)value, diagnostics, context);
			case _0Package.KEY_IDENTIFIER_TYPE:
				return validateKeyIdentifierType((KeyIdentifierType)value, diagnostics, context);
			case _0Package.KEY_IDENTIFIER_TYPE1:
				return validateKeyIdentifierType1((KeyIdentifierType1)value, diagnostics, context);
			case _0Package.PASSWORD_STRING:
				return validatePasswordString((PasswordString)value, diagnostics, context);
			case _0Package.PASSWORD_STRING1:
				return validatePasswordString1((PasswordString1)value, diagnostics, context);
			case _0Package.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case _0Package.REFERENCE_TYPE1:
				return validateReferenceType1((ReferenceType1)value, diagnostics, context);
			case _0Package.SECURITY_HEADER_TYPE:
				return validateSecurityHeaderType((SecurityHeaderType)value, diagnostics, context);
			case _0Package.SECURITY_HEADER_TYPE1:
				return validateSecurityHeaderType1((SecurityHeaderType1)value, diagnostics, context);
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE:
				return validateSecurityTokenReferenceType((SecurityTokenReferenceType)value, diagnostics, context);
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE1:
				return validateSecurityTokenReferenceType1((SecurityTokenReferenceType1)value, diagnostics, context);
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE:
				return validateTransformationParametersType((TransformationParametersType)value, diagnostics, context);
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE1:
				return validateTransformationParametersType1((TransformationParametersType1)value, diagnostics, context);
			case _0Package.USERNAME_TOKEN_TYPE:
				return validateUsernameTokenType((UsernameTokenType)value, diagnostics, context);
			case _0Package.USERNAME_TOKEN_TYPE1:
				return validateUsernameTokenType1((UsernameTokenType1)value, diagnostics, context);
			case _0Package.FAULTCODE_ENUM:
				return validateFaultcodeEnum((QName)value, diagnostics, context);
			case _0Package.FAULTCODE_ENUM1:
				return validateFaultcodeEnum1((QName)value, diagnostics, context);
			case _0Package.TUSAGE:
				return validateTUsage((List<?>)value, diagnostics, context);
			case _0Package.TUSAGE1:
				return validateTUsage1((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedString(AttributedString attributedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedString1(AttributedString1 attributedString1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedString1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecurityTokenType(BinarySecurityTokenType binarySecurityTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binarySecurityTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecurityTokenType1(BinarySecurityTokenType1 binarySecurityTokenType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binarySecurityTokenType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedType(EmbeddedType embeddedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(embeddedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedType1(EmbeddedType1 embeddedType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(embeddedType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodedString(EncodedString encodedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encodedString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodedString1(EncodedString1 encodedString1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encodedString1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyIdentifierType(KeyIdentifierType keyIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyIdentifierType1(KeyIdentifierType1 keyIdentifierType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyIdentifierType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePasswordString(PasswordString passwordString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passwordString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePasswordString1(PasswordString1 passwordString1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passwordString1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType1(ReferenceType1 referenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityHeaderType(SecurityHeaderType securityHeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityHeaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityHeaderType1(SecurityHeaderType1 securityHeaderType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityHeaderType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityTokenReferenceType(SecurityTokenReferenceType securityTokenReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityTokenReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityTokenReferenceType1(SecurityTokenReferenceType1 securityTokenReferenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityTokenReferenceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationParametersType(TransformationParametersType transformationParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformationParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationParametersType1(TransformationParametersType1 transformationParametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformationParametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsernameTokenType(UsernameTokenType usernameTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usernameTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsernameTokenType1(UsernameTokenType1 usernameTokenType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usernameTokenType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultcodeEnum(QName faultcodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultcodeEnum_Enumeration(faultcodeEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFaultcodeEnum_Enumeration
	 */
	public static final Collection<Object> FAULTCODE_ENUM__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedSecurityToken"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedAlgorithm"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurity"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurityToken"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedAuthentication"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedCheck"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenUnavailable")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Faultcode Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultcodeEnum_Enumeration(QName faultcodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = FAULTCODE_ENUM__ENUMERATION__VALUES.contains(faultcodeEnum);
		if (!result && diagnostics != null)
			reportEnumerationViolation(_0Package.Literals.FAULTCODE_ENUM, faultcodeEnum, FAULTCODE_ENUM__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultcodeEnum1(QName faultcodeEnum1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultcodeEnum1_Enumeration(faultcodeEnum1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFaultcodeEnum1_Enumeration
	 */
	public static final Collection<Object> FAULTCODE_ENUM1__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedSecurityToken"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedAlgorithm"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurity"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurityToken"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedAuthentication"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedCheck"),
				 _0Factory.eINSTANCE.createFromString(_0Package.eINSTANCE.getFaultcodeEnum1(), "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenUnavailable")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Faultcode Enum1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultcodeEnum1_Enumeration(QName faultcodeEnum1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = FAULTCODE_ENUM1__ENUMERATION__VALUES.contains(faultcodeEnum1);
		if (!result && diagnostics != null)
			reportEnumerationViolation(_0Package.Literals.FAULTCODE_ENUM1, faultcodeEnum1, FAULTCODE_ENUM1__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUsage(List<?> tUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTUsage_ItemType(tUsage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>TUsage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUsage_ItemType(List<?> tUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = tUsage.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUsage1(List<?> tUsage1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTUsage1_ItemType(tUsage1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>TUsage1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUsage1_ItemType(List<?> tUsage1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = tUsage1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_0Validator
