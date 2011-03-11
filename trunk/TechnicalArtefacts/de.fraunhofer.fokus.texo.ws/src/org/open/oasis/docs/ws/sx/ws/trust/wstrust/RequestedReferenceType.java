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

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requested Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType#getSecurityTokenReference <em>Security Token Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestedReferenceType()
 * @model extendedMetaData="name='RequestedReferenceType' kind='elementOnly'"
 * @generated
 */
public interface RequestedReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Token Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the wsse:SecurityTokenReference per Section 4.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Token Reference</em>' containment reference.
	 * @see #setSecurityTokenReference(SecurityTokenReferenceType)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestedReferenceType_SecurityTokenReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecurityTokenReference' namespace='http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd'"
	 * @generated
	 */
	SecurityTokenReferenceType getSecurityTokenReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType#getSecurityTokenReference <em>Security Token Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token Reference</em>' containment reference.
	 * @see #getSecurityTokenReference()
	 * @generated
	 */
	void setSecurityTokenReference(SecurityTokenReferenceType value);

} // RequestedReferenceType
