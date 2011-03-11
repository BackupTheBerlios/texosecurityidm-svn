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
package org.xmlsoap.schemas.ws._2004._09.wspolicy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1()
 * @model extendedMetaData="name='PolicyAttachment_._type' kind='elementOnly'"
 * @generated
 */
public interface PolicyAttachmentType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference.
	 * @see #setAppliesTo(AppliesToType1)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_AppliesTo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliesToType1 getAppliesTo();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyAttachmentType1#getAppliesTo <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' containment reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(AppliesToType1 value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PolicyType1> getPolicy();

	/**
	 * Returns the value of the '<em><b>Policy Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Reference</em>' containment reference list.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_PolicyReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PolicyReferenceType1> getPolicyReference();

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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyAttachmentType1_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PolicyAttachmentType1
