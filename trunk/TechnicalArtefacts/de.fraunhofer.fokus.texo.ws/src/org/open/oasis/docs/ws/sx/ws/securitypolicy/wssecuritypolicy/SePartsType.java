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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Se Parts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getBody <em>Body</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getHeader <em>Header</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType()
 * @model extendedMetaData="name='SePartsType' kind='elementOnly'"
 * @generated
 */
public interface SePartsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(EmptyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getBody();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HeaderType> getHeader();

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference.
	 * @see #setAttachments(EmptyType)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType_Attachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attachments' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getAttachments();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType#getAttachments <em>Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachments</em>' containment reference.
	 * @see #getAttachments()
	 * @generated
	 */
	void setAttachments(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getSePartsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SePartsType
