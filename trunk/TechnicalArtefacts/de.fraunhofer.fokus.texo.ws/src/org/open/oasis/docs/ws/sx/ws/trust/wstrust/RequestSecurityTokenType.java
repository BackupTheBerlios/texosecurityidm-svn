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
 * A representation of the model object '<em><b>Request Security Token Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Actual content model is non-deterministic, hence wildcard. The following shows intended content model:
 * 
 *         &lt;xs:element ref='wst:TokenType' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:RequestType' /&gt;
 *         &lt;xs:element ref='wsp:AppliesTo' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Claims' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Entropy' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Lifetime' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:AllowPostdating' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Renewing' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:OnBehalfOf' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Issuer' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:AuthenticationType' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:KeyType' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:KeySize' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:SignatureAlgorithm' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Encryption' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:EncryptionAlgorithm' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:CanonicalizationAlgorithm' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:ProofEncryption' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:UseKey' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:SignWith' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:EncryptWith' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:DelegateTo' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Forwardable' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wst:Delegatable' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wsp:Policy' minOccurs='0' /&gt;
 *         &lt;xs:element ref='wsp:PolicyReference' minOccurs='0' /&gt;
 *         &lt;xs:any namespace='##other' processContents='lax' minOccurs='0' maxOccurs='unbounded' /&gt;
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getContext <em>Context</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenType()
 * @model extendedMetaData="name='RequestSecurityTokenType' kind='elementOnly'"
 * @generated
 */
public interface RequestSecurityTokenType extends EObject {
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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenType_Context()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='Context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

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
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getRequestSecurityTokenType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RequestSecurityTokenType
