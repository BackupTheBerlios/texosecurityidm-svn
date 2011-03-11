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
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod <em>Canonicalization Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod <em>Signature Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType()
 * @model extendedMetaData="name='SignedInfoType' kind='elementOnly'"
 * @generated
 */
public interface SignedInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonicalization Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #setCanonicalizationMethod(CanonicalizationMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_CanonicalizationMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CanonicalizationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CanonicalizationMethodType getCanonicalizationMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #getCanonicalizationMethod()
	 * @generated
	 */
	void setCanonicalizationMethod(CanonicalizationMethodType value);

	/**
	 * Returns the value of the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Method</em>' containment reference.
	 * @see #setSignatureMethod(SignatureMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_SignatureMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignatureMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureMethodType getSignatureMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Method</em>' containment reference.
	 * @see #getSignatureMethod()
	 * @generated
	 */
	void setSignatureMethod(SignatureMethodType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceType> getReference();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignedInfoType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignedInfoType
