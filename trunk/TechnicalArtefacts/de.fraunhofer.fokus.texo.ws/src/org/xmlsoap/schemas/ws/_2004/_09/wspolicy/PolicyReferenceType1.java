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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm <em>Digest Algorithm</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getURI <em>URI</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyReferenceType1()
 * @model extendedMetaData="name='PolicyReference_._type' kind='empty'"
 * @generated
 */
public interface PolicyReferenceType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest</em>' attribute.
	 * @see #setDigest(byte[])
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyReferenceType1_Digest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='attribute' name='Digest'"
	 * @generated
	 */
	byte[] getDigest();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigest <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest</em>' attribute.
	 * @see #getDigest()
	 * @generated
	 */
	void setDigest(byte[] value);

	/**
	 * Returns the value of the '<em><b>Digest Algorithm</b></em>' attribute.
	 * The default value is <code>"http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #isSetDigestAlgorithm()
	 * @see #unsetDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyReferenceType1_DigestAlgorithm()
	 * @model default="http://schemas.xmlsoap.org/ws/2004/09/policy/Sha1Exc" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='DigestAlgorithm'"
	 * @generated
	 */
	String getDigestAlgorithm();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Algorithm</em>' attribute.
	 * @see #isSetDigestAlgorithm()
	 * @see #unsetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @generated
	 */
	void setDigestAlgorithm(String value);

	/**
	 * Unsets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @generated
	 */
	void unsetDigestAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getDigestAlgorithm <em>Digest Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Digest Algorithm</em>' attribute is set.
	 * @see #unsetDigestAlgorithm()
	 * @see #getDigestAlgorithm()
	 * @see #setDigestAlgorithm(String)
	 * @generated
	 */
	boolean isSetDigestAlgorithm();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyReferenceType1_URI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyReferenceType1#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

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
	 * @see org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage#getPolicyReferenceType1_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PolicyReferenceType1
