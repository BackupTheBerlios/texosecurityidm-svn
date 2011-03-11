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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Security Token Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The RequestSecurityTokenCollection (RSTC) element is used to provide multiple RST requests. 
 *         One or more RSTR elements in an RSTRC element are returned in the response to the RequestSecurityTokenCollection.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType#getRequestSecurityToken <em>Request Security Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenCollectionType()
 * @model extendedMetaData="name='RequestSecurityTokenCollectionType' kind='elementOnly'"
 * @generated
 */
public interface RequestSecurityTokenCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Security Token</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token</em>' containment reference list.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenCollectionType_RequestSecurityToken()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='RequestSecurityToken' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestSecurityTokenType> getRequestSecurityToken();

} // RequestSecurityTokenCollectionType
