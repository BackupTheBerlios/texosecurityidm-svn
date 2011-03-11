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

package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package
 * @generated
 */
public interface _200702Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_200702Factory eINSTANCE = org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Empty Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Type</em>'.
	 * @generated
	 */
	EmptyType createEmptyType();

	/**
	 * Returns a new object of class '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Type</em>'.
	 * @generated
	 */
	HeaderType createHeaderType();

	/**
	 * Returns a new object of class '<em>Issued Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issued Token Type</em>'.
	 * @generated
	 */
	IssuedTokenType createIssuedTokenType();

	/**
	 * Returns a new object of class '<em>Key Value Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Token Type</em>'.
	 * @generated
	 */
	KeyValueTokenType createKeyValueTokenType();

	/**
	 * Returns a new object of class '<em>Nested Policy Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Policy Type</em>'.
	 * @generated
	 */
	NestedPolicyType createNestedPolicyType();

	/**
	 * Returns a new object of class '<em>QName Assertion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QName Assertion Type</em>'.
	 * @generated
	 */
	QNameAssertionType createQNameAssertionType();

	/**
	 * Returns a new object of class '<em>Request Security Token Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Security Token Template Type</em>'.
	 * @generated
	 */
	RequestSecurityTokenTemplateType createRequestSecurityTokenTemplateType();

	/**
	 * Returns a new object of class '<em>Secure Conversation Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Conversation Token Type</em>'.
	 * @generated
	 */
	SecureConversationTokenType createSecureConversationTokenType();

	/**
	 * Returns a new object of class '<em>Se Parts Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Se Parts Type</em>'.
	 * @generated
	 */
	SePartsType createSePartsType();

	/**
	 * Returns a new object of class '<em>Ser Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ser Elements Type</em>'.
	 * @generated
	 */
	SerElementsType createSerElementsType();

	/**
	 * Returns a new object of class '<em>Spnego Context Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spnego Context Token Type</em>'.
	 * @generated
	 */
	SpnegoContextTokenType createSpnegoContextTokenType();

	/**
	 * Returns a new object of class '<em>Token Assertion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Assertion Type</em>'.
	 * @generated
	 */
	TokenAssertionType createTokenAssertionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_200702Package get_200702Package();

} //_200702Factory
