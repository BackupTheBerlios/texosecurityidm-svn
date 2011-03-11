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
 * A representation of the model object '<em><b>Operator Content Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAll <em>All</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getExactlyOne <em>Exactly One</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1()
 * @model extendedMetaData="name='OperatorContentType' kind='elementOnly'"
 * @generated
 */
public interface OperatorContentType1 extends EObject {
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PolicyType1> getPolicy();

	/**
	 * Returns the value of the '<em><b>All</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' containment reference list.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_All()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='All' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OperatorContentType1> getAll();

	/**
	 * Returns the value of the '<em><b>Exactly One</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.OperatorContentType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exactly One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exactly One</em>' containment reference list.
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_ExactlyOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExactlyOne' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OperatorContentType1> getExactlyOne();

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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_PolicyReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace' group='#group:0'"
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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getOperatorContentType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // OperatorContentType1
