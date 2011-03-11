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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Security Token Response Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The &lt;wst:RequestSecurityTokenResponseCollection&gt; element (RSTRC) MUST be used to return a security token or 
 *         response to a security token request on the final response.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenResponseCollectionType()
 * @model extendedMetaData="name='RequestSecurityTokenResponseCollectionType' kind='elementOnly'"
 * @generated
 */
public interface RequestSecurityTokenResponseCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Security Token Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Security Token Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Security Token Response</em>' containment reference list.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RequestSecurityTokenResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestSecurityTokenResponseType> getRequestSecurityTokenResponse();

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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenResponseCollectionType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RequestSecurityTokenResponseCollectionType
