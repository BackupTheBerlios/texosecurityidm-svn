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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGP Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyID <em>PGP Key ID</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket <em>PGP Key Packet</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket1 <em>PGP Key Packet1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType1#getAny1 <em>Any1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1()
 * @model extendedMetaData="name='PGPDataType' kind='elementOnly'"
 * @generated
 */
public interface PGPDataType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>PGP Key ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Key ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Key ID</em>' attribute.
	 * @see #setPGPKeyID(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1_PGPKeyID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PGPKeyID' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPGPKeyID();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyID <em>PGP Key ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Key ID</em>' attribute.
	 * @see #getPGPKeyID()
	 * @generated
	 */
	void setPGPKeyID(byte[] value);

	/**
	 * Returns the value of the '<em><b>PGP Key Packet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Key Packet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Key Packet</em>' attribute.
	 * @see #setPGPKeyPacket(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1_PGPKeyPacket()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PGPKeyPacket' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPGPKeyPacket();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket <em>PGP Key Packet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Key Packet</em>' attribute.
	 * @see #getPGPKeyPacket()
	 * @generated
	 */
	void setPGPKeyPacket(byte[] value);

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>PGP Key Packet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Key Packet1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Key Packet1</em>' attribute.
	 * @see #setPGPKeyPacket1(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1_PGPKeyPacket1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='PGPKeyPacket' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPGPKeyPacket1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.PGPDataType1#getPGPKeyPacket1 <em>PGP Key Packet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Key Packet1</em>' attribute.
	 * @see #getPGPKeyPacket1()
	 * @generated
	 */
	void setPGPKeyPacket1(byte[] value);

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType1_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny1();

} // PGPDataType1
