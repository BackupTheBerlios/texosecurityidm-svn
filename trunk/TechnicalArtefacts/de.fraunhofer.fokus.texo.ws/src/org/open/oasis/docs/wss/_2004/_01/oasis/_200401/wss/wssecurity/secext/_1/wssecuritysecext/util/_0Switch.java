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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package
 * @generated
 */
public class _0Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.ATTRIBUTED_STRING: {
				AttributedString attributedString = (AttributedString)theEObject;
				T result = caseAttributedString(attributedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ATTRIBUTED_STRING1: {
				AttributedString1 attributedString1 = (AttributedString1)theEObject;
				T result = caseAttributedString1(attributedString1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BINARY_SECURITY_TOKEN_TYPE: {
				BinarySecurityTokenType binarySecurityTokenType = (BinarySecurityTokenType)theEObject;
				T result = caseBinarySecurityTokenType(binarySecurityTokenType);
				if (result == null) result = caseEncodedString(binarySecurityTokenType);
				if (result == null) result = caseAttributedString(binarySecurityTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BINARY_SECURITY_TOKEN_TYPE1: {
				BinarySecurityTokenType1 binarySecurityTokenType1 = (BinarySecurityTokenType1)theEObject;
				T result = caseBinarySecurityTokenType1(binarySecurityTokenType1);
				if (result == null) result = caseEncodedString1(binarySecurityTokenType1);
				if (result == null) result = caseAttributedString1(binarySecurityTokenType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.EMBEDDED_TYPE: {
				EmbeddedType embeddedType = (EmbeddedType)theEObject;
				T result = caseEmbeddedType(embeddedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.EMBEDDED_TYPE1: {
				EmbeddedType1 embeddedType1 = (EmbeddedType1)theEObject;
				T result = caseEmbeddedType1(embeddedType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ENCODED_STRING: {
				EncodedString encodedString = (EncodedString)theEObject;
				T result = caseEncodedString(encodedString);
				if (result == null) result = caseAttributedString(encodedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ENCODED_STRING1: {
				EncodedString1 encodedString1 = (EncodedString1)theEObject;
				T result = caseEncodedString1(encodedString1);
				if (result == null) result = caseAttributedString1(encodedString1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.KEY_IDENTIFIER_TYPE: {
				KeyIdentifierType keyIdentifierType = (KeyIdentifierType)theEObject;
				T result = caseKeyIdentifierType(keyIdentifierType);
				if (result == null) result = caseEncodedString(keyIdentifierType);
				if (result == null) result = caseAttributedString(keyIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.KEY_IDENTIFIER_TYPE1: {
				KeyIdentifierType1 keyIdentifierType1 = (KeyIdentifierType1)theEObject;
				T result = caseKeyIdentifierType1(keyIdentifierType1);
				if (result == null) result = caseEncodedString1(keyIdentifierType1);
				if (result == null) result = caseAttributedString1(keyIdentifierType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PASSWORD_STRING: {
				PasswordString passwordString = (PasswordString)theEObject;
				T result = casePasswordString(passwordString);
				if (result == null) result = caseAttributedString(passwordString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PASSWORD_STRING1: {
				PasswordString1 passwordString1 = (PasswordString1)theEObject;
				T result = casePasswordString1(passwordString1);
				if (result == null) result = caseAttributedString1(passwordString1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.REFERENCE_TYPE1: {
				ReferenceType1 referenceType1 = (ReferenceType1)theEObject;
				T result = caseReferenceType1(referenceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SECURITY_HEADER_TYPE: {
				SecurityHeaderType securityHeaderType = (SecurityHeaderType)theEObject;
				T result = caseSecurityHeaderType(securityHeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SECURITY_HEADER_TYPE1: {
				SecurityHeaderType1 securityHeaderType1 = (SecurityHeaderType1)theEObject;
				T result = caseSecurityHeaderType1(securityHeaderType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE: {
				SecurityTokenReferenceType securityTokenReferenceType = (SecurityTokenReferenceType)theEObject;
				T result = caseSecurityTokenReferenceType(securityTokenReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SECURITY_TOKEN_REFERENCE_TYPE1: {
				SecurityTokenReferenceType1 securityTokenReferenceType1 = (SecurityTokenReferenceType1)theEObject;
				T result = caseSecurityTokenReferenceType1(securityTokenReferenceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE: {
				TransformationParametersType transformationParametersType = (TransformationParametersType)theEObject;
				T result = caseTransformationParametersType(transformationParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TRANSFORMATION_PARAMETERS_TYPE1: {
				TransformationParametersType1 transformationParametersType1 = (TransformationParametersType1)theEObject;
				T result = caseTransformationParametersType1(transformationParametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.USERNAME_TOKEN_TYPE: {
				UsernameTokenType usernameTokenType = (UsernameTokenType)theEObject;
				T result = caseUsernameTokenType(usernameTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.USERNAME_TOKEN_TYPE1: {
				UsernameTokenType1 usernameTokenType1 = (UsernameTokenType1)theEObject;
				T result = caseUsernameTokenType1(usernameTokenType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributed String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributed String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributedString(AttributedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributed String1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributed String1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributedString1(AttributedString1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Security Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Security Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySecurityTokenType(BinarySecurityTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Security Token Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Security Token Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySecurityTokenType1(BinarySecurityTokenType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedType(EmbeddedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedType1(EmbeddedType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoded String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoded String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodedString(EncodedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoded String1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoded String1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodedString1(EncodedString1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIdentifierType(KeyIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Identifier Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Identifier Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIdentifierType1(KeyIdentifierType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordString(PasswordString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password String1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password String1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordString1(PasswordString1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType1(ReferenceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityHeaderType(SecurityHeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Header Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Header Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityHeaderType1(SecurityHeaderType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Token Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Token Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityTokenReferenceType(SecurityTokenReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Token Reference Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Token Reference Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityTokenReferenceType1(SecurityTokenReferenceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationParametersType(TransformationParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationParametersType1(TransformationParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Username Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Username Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsernameTokenType(UsernameTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Username Token Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Username Token Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsernameTokenType1(UsernameTokenType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch
