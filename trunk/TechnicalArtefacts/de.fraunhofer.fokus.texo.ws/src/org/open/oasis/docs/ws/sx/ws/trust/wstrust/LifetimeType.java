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

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.AttributedDateTime1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifetime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getCreated <em>Created</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getExpires <em>Expires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getLifetimeType()
 * @model extendedMetaData="name='LifetimeType' kind='elementOnly'"
 * @generated
 */
public interface LifetimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * This element allows a creation time to be applied anywhere element wildcards are present.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(AttributedDateTime1)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getLifetimeType_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Created' namespace='http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd'"
	 * @generated
	 */
	AttributedDateTime1 getCreated();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(AttributedDateTime1 value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * This element allows an expiration time to be applied anywhere element wildcards are present.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' containment reference.
	 * @see #setExpires(AttributedDateTime1)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getLifetimeType_Expires()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Expires' namespace='http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd'"
	 * @generated
	 */
	AttributedDateTime1 getExpires();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType#getExpires <em>Expires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' containment reference.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(AttributedDateTime1 value);

} // LifetimeType
