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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Token Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getIncludeToken <em>Include Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getKeyValueTokenType()
 * @model extendedMetaData="name='KeyValueTokenType' kind='elementOnly'"
 * @generated
 */
public interface KeyValueTokenType extends EObject {
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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getKeyValueTokenType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Include Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         5.1 Token Inclusion
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Token</em>' attribute.
	 * @see #setIncludeToken(Object)
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getKeyValueTokenType_IncludeToken()
	 * @model dataType="org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenOpenType"
	 *        extendedMetaData="kind='attribute' name='IncludeToken' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIncludeToken();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType#getIncludeToken <em>Include Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Token</em>' attribute.
	 * @see #getIncludeToken()
	 * @generated
	 */
	void setIncludeToken(Object value);

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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#getKeyValueTokenType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // KeyValueTokenType
