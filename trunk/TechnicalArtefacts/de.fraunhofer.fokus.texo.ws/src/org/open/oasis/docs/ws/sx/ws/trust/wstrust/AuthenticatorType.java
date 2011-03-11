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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authenticator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getCombinedHash <em>Combined Hash</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getAuthenticatorType()
 * @model extendedMetaData="name='AuthenticatorType' kind='elementOnly'"
 * @generated
 */
public interface AuthenticatorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Combined Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Hash</em>' attribute.
	 * @see #setCombinedHash(byte[])
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getAuthenticatorType_CombinedHash()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='CombinedHash' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getCombinedHash();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType#getCombinedHash <em>Combined Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Hash</em>' attribute.
	 * @see #getCombinedHash()
	 * @generated
	 */
	void setCombinedHash(byte[] value);

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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getAuthenticatorType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AuthenticatorType