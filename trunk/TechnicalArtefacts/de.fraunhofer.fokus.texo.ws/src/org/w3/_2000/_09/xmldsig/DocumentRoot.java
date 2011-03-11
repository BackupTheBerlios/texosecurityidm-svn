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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod <em>Canonicalization Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod <em>Digest Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue <em>Digest Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue <em>DSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData <em>Mgmt Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData <em>PGP Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod <em>Retrieval Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue <em>RSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod <em>Signature Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties <em>Signature Properties</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty <em>Signature Property</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue <em>Signature Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo <em>Signed Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData <em>SPKI Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data <em>X509 Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod1 <em>Canonicalization Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod1 <em>Digest Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue1 <em>Digest Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue1 <em>DSA Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo1 <em>Key Info1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName1 <em>Key Name1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue1 <em>Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest1 <em>Manifest1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData1 <em>Mgmt Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject1 <em>Object1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData1 <em>PGP Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference1 <em>Reference1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod1 <em>Retrieval Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue1 <em>RSA Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature1 <em>Signature1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod1 <em>Signature Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties1 <em>Signature Properties1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty1 <em>Signature Property1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue1 <em>Signature Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo1 <em>Signed Info1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData1 <em>SPKI Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform1 <em>Transform1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms1 <em>Transforms1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data1 <em>X509 Data1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Canonicalization Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonicalization Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #setCanonicalizationMethod(CanonicalizationMethodType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_CanonicalizationMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CanonicalizationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CanonicalizationMethodType1 getCanonicalizationMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod <em>Canonicalization Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #getCanonicalizationMethod()
	 * @generated
	 */
	void setCanonicalizationMethod(CanonicalizationMethodType1 value);

	/**
	 * Returns the value of the '<em><b>Digest Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Method</em>' containment reference.
	 * @see #setDigestMethod(DigestMethodType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	DigestMethodType1 getDigestMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod <em>Digest Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Method</em>' containment reference.
	 * @see #getDigestMethod()
	 * @generated
	 */
	void setDigestMethod(DigestMethodType1 value);

	/**
	 * Returns the value of the '<em><b>Digest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Value</em>' attribute.
	 * @see #setDigestValue(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestValue()
	 * @model unique="false" dataType="org.w3._2000._09.xmldsig.DigestValueType1" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestValue' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getDigestValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue <em>Digest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Value</em>' attribute.
	 * @see #getDigestValue()
	 * @generated
	 */
	void setDigestValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>DSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSA Key Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #setDSAKeyValue(DSAKeyValueType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DSAKeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAKeyValueType1 getDSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue <em>DSA Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #getDSAKeyValue()
	 * @generated
	 */
	void setDSAKeyValue(DSAKeyValueType1 value);

	/**
	 * Returns the value of the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Info</em>' containment reference.
	 * @see #setKeyInfo(KeyInfoType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType1 getKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType1 value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value</em>' containment reference.
	 * @see #setKeyValue(KeyValueType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyValueType1 getKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue <em>Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value</em>' containment reference.
	 * @see #getKeyValue()
	 * @generated
	 */
	void setKeyValue(KeyValueType1 value);

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(ManifestType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Manifest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Manifest' namespace='##targetNamespace'"
	 * @generated
	 */
	ManifestType1 getManifest();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(ManifestType1 value);

	/**
	 * Returns the value of the '<em><b>Mgmt Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mgmt Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgmt Data</em>' attribute.
	 * @see #setMgmtData(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_MgmtData()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MgmtData' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMgmtData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData <em>Mgmt Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgmt Data</em>' attribute.
	 * @see #getMgmtData()
	 * @generated
	 */
	void setMgmtData(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Object()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType1 getObject();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType1 value);

	/**
	 * Returns the value of the '<em><b>PGP Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Data</em>' containment reference.
	 * @see #setPGPData(PGPDataType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_PGPData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PGPData' namespace='##targetNamespace'"
	 * @generated
	 */
	PGPDataType1 getPGPData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData <em>PGP Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Data</em>' containment reference.
	 * @see #getPGPData()
	 * @generated
	 */
	void setPGPData(PGPDataType1 value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Reference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType1 getReference();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Retrieval Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieval Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieval Method</em>' containment reference.
	 * @see #setRetrievalMethod(RetrievalMethodType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RetrievalMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetrievalMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	RetrievalMethodType1 getRetrievalMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod <em>Retrieval Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retrieval Method</em>' containment reference.
	 * @see #getRetrievalMethod()
	 * @generated
	 */
	void setRetrievalMethod(RetrievalMethodType1 value);

	/**
	 * Returns the value of the '<em><b>RSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSA Key Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #setRSAKeyValue(RSAKeyValueType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RSAKeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RSAKeyValueType1 getRSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue <em>RSA Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #getRSAKeyValue()
	 * @generated
	 */
	void setRSAKeyValue(RSAKeyValueType1 value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(SignatureType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Signature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureType1 getSignature();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(SignatureType1 value);

	/**
	 * Returns the value of the '<em><b>Signature Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Method</em>' containment reference.
	 * @see #setSignatureMethod(SignatureMethodType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureMethodType1 getSignatureMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod <em>Signature Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Method</em>' containment reference.
	 * @see #getSignatureMethod()
	 * @generated
	 */
	void setSignatureMethod(SignatureMethodType1 value);

	/**
	 * Returns the value of the '<em><b>Signature Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Properties</em>' containment reference.
	 * @see #setSignatureProperties(SignaturePropertiesType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertiesType1 getSignatureProperties();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties <em>Signature Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Properties</em>' containment reference.
	 * @see #getSignatureProperties()
	 * @generated
	 */
	void setSignatureProperties(SignaturePropertiesType1 value);

	/**
	 * Returns the value of the '<em><b>Signature Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Property</em>' containment reference.
	 * @see #setSignatureProperty(SignaturePropertyType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertyType1 getSignatureProperty();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty <em>Signature Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Property</em>' containment reference.
	 * @see #getSignatureProperty()
	 * @generated
	 */
	void setSignatureProperty(SignaturePropertyType1 value);

	/**
	 * Returns the value of the '<em><b>Signature Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Value</em>' containment reference.
	 * @see #setSignatureValue(SignatureValueType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureValueType1 getSignatureValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue <em>Signature Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Value</em>' containment reference.
	 * @see #getSignatureValue()
	 * @generated
	 */
	void setSignatureValue(SignatureValueType1 value);

	/**
	 * Returns the value of the '<em><b>Signed Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Info</em>' containment reference.
	 * @see #setSignedInfo(SignedInfoType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignedInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedInfoType1 getSignedInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo <em>Signed Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Info</em>' containment reference.
	 * @see #getSignedInfo()
	 * @generated
	 */
	void setSignedInfo(SignedInfoType1 value);

	/**
	 * Returns the value of the '<em><b>SPKI Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPKI Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPKI Data</em>' containment reference.
	 * @see #setSPKIData(SPKIDataType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SPKIData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPKIData' namespace='##targetNamespace'"
	 * @generated
	 */
	SPKIDataType1 getSPKIData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData <em>SPKI Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPKI Data</em>' containment reference.
	 * @see #getSPKIData()
	 * @generated
	 */
	void setSPKIData(SPKIDataType1 value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(TransformType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformType1 getTransform();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(TransformType1 value);

	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transforms()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType1 getTransforms();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType1 value);

	/**
	 * Returns the value of the '<em><b>X509 Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Data</em>' containment reference.
	 * @see #setX509Data(X509DataType1)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_X509Data()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Data' namespace='##targetNamespace'"
	 * @generated
	 */
	X509DataType1 getX509Data();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data <em>X509 Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Data</em>' containment reference.
	 * @see #getX509Data()
	 * @generated
	 */
	void setX509Data(X509DataType1 value);

	/**
	 * Returns the value of the '<em><b>Canonicalization Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonicalization Method1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonicalization Method1</em>' containment reference.
	 * @see #setCanonicalizationMethod1(CanonicalizationMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_CanonicalizationMethod1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CanonicalizationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CanonicalizationMethodType getCanonicalizationMethod1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod1 <em>Canonicalization Method1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization Method1</em>' containment reference.
	 * @see #getCanonicalizationMethod1()
	 * @generated
	 */
	void setCanonicalizationMethod1(CanonicalizationMethodType value);

	/**
	 * Returns the value of the '<em><b>Digest Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Method1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Method1</em>' containment reference.
	 * @see #setDigestMethod1(DigestMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestMethod1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	DigestMethodType getDigestMethod1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod1 <em>Digest Method1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Method1</em>' containment reference.
	 * @see #getDigestMethod1()
	 * @generated
	 */
	void setDigestMethod1(DigestMethodType value);

	/**
	 * Returns the value of the '<em><b>Digest Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Value1</em>' attribute.
	 * @see #setDigestValue1(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestValue1()
	 * @model unique="false" dataType="org.w3._2000._09.xmldsig.DigestValueType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestValue' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getDigestValue1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue1 <em>Digest Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Value1</em>' attribute.
	 * @see #getDigestValue1()
	 * @generated
	 */
	void setDigestValue1(byte[] value);

	/**
	 * Returns the value of the '<em><b>DSA Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSA Key Value1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSA Key Value1</em>' containment reference.
	 * @see #setDSAKeyValue1(DSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DSAKeyValue1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAKeyValueType getDSAKeyValue1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue1 <em>DSA Key Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSA Key Value1</em>' containment reference.
	 * @see #getDSAKeyValue1()
	 * @generated
	 */
	void setDSAKeyValue1(DSAKeyValueType value);

	/**
	 * Returns the value of the '<em><b>Key Info1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Info1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Info1</em>' containment reference.
	 * @see #setKeyInfo1(KeyInfoType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyInfo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType getKeyInfo1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo1 <em>Key Info1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Info1</em>' containment reference.
	 * @see #getKeyInfo1()
	 * @generated
	 */
	void setKeyInfo1(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Key Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name1</em>' attribute.
	 * @see #setKeyName1(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyName1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyName1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName1 <em>Key Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name1</em>' attribute.
	 * @see #getKeyName1()
	 * @generated
	 */
	void setKeyName1(String value);

	/**
	 * Returns the value of the '<em><b>Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value1</em>' containment reference.
	 * @see #setKeyValue1(KeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyValue1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyValueType getKeyValue1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue1 <em>Key Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value1</em>' containment reference.
	 * @see #getKeyValue1()
	 * @generated
	 */
	void setKeyValue1(KeyValueType value);

	/**
	 * Returns the value of the '<em><b>Manifest1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest1</em>' containment reference.
	 * @see #setManifest1(ManifestType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Manifest1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Manifest' namespace='##targetNamespace'"
	 * @generated
	 */
	ManifestType getManifest1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest1 <em>Manifest1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest1</em>' containment reference.
	 * @see #getManifest1()
	 * @generated
	 */
	void setManifest1(ManifestType value);

	/**
	 * Returns the value of the '<em><b>Mgmt Data1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mgmt Data1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgmt Data1</em>' attribute.
	 * @see #setMgmtData1(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_MgmtData1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MgmtData' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMgmtData1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData1 <em>Mgmt Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgmt Data1</em>' attribute.
	 * @see #getMgmtData1()
	 * @generated
	 */
	void setMgmtData1(String value);

	/**
	 * Returns the value of the '<em><b>Object1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object1</em>' containment reference.
	 * @see #setObject1(ObjectType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Object1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject1 <em>Object1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object1</em>' containment reference.
	 * @see #getObject1()
	 * @generated
	 */
	void setObject1(ObjectType value);

	/**
	 * Returns the value of the '<em><b>PGP Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Data1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Data1</em>' containment reference.
	 * @see #setPGPData1(PGPDataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_PGPData1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PGPData' namespace='##targetNamespace'"
	 * @generated
	 */
	PGPDataType getPGPData1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData1 <em>PGP Data1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Data1</em>' containment reference.
	 * @see #getPGPData1()
	 * @generated
	 */
	void setPGPData1(PGPDataType value);

	/**
	 * Returns the value of the '<em><b>Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference1</em>' containment reference.
	 * @see #setReference1(ReferenceType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Reference1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference1 <em>Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference1</em>' containment reference.
	 * @see #getReference1()
	 * @generated
	 */
	void setReference1(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Retrieval Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieval Method1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieval Method1</em>' containment reference.
	 * @see #setRetrievalMethod1(RetrievalMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RetrievalMethod1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetrievalMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	RetrievalMethodType getRetrievalMethod1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod1 <em>Retrieval Method1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retrieval Method1</em>' containment reference.
	 * @see #getRetrievalMethod1()
	 * @generated
	 */
	void setRetrievalMethod1(RetrievalMethodType value);

	/**
	 * Returns the value of the '<em><b>RSA Key Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSA Key Value1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSA Key Value1</em>' containment reference.
	 * @see #setRSAKeyValue1(RSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RSAKeyValue1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RSAKeyValueType getRSAKeyValue1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue1 <em>RSA Key Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSA Key Value1</em>' containment reference.
	 * @see #getRSAKeyValue1()
	 * @generated
	 */
	void setRSAKeyValue1(RSAKeyValueType value);

	/**
	 * Returns the value of the '<em><b>Signature1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature1</em>' containment reference.
	 * @see #setSignature1(SignatureType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Signature1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureType getSignature1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature1 <em>Signature1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature1</em>' containment reference.
	 * @see #getSignature1()
	 * @generated
	 */
	void setSignature1(SignatureType value);

	/**
	 * Returns the value of the '<em><b>Signature Method1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Method1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Method1</em>' containment reference.
	 * @see #setSignatureMethod1(SignatureMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureMethod1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureMethodType getSignatureMethod1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod1 <em>Signature Method1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Method1</em>' containment reference.
	 * @see #getSignatureMethod1()
	 * @generated
	 */
	void setSignatureMethod1(SignatureMethodType value);

	/**
	 * Returns the value of the '<em><b>Signature Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Properties1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Properties1</em>' containment reference.
	 * @see #setSignatureProperties1(SignaturePropertiesType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperties1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertiesType getSignatureProperties1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties1 <em>Signature Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Properties1</em>' containment reference.
	 * @see #getSignatureProperties1()
	 * @generated
	 */
	void setSignatureProperties1(SignaturePropertiesType value);

	/**
	 * Returns the value of the '<em><b>Signature Property1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Property1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Property1</em>' containment reference.
	 * @see #setSignatureProperty1(SignaturePropertyType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperty1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertyType getSignatureProperty1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty1 <em>Signature Property1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Property1</em>' containment reference.
	 * @see #getSignatureProperty1()
	 * @generated
	 */
	void setSignatureProperty1(SignaturePropertyType value);

	/**
	 * Returns the value of the '<em><b>Signature Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Value1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Value1</em>' containment reference.
	 * @see #setSignatureValue1(SignatureValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureValue1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureValueType getSignatureValue1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue1 <em>Signature Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Value1</em>' containment reference.
	 * @see #getSignatureValue1()
	 * @generated
	 */
	void setSignatureValue1(SignatureValueType value);

	/**
	 * Returns the value of the '<em><b>Signed Info1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed Info1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Info1</em>' containment reference.
	 * @see #setSignedInfo1(SignedInfoType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignedInfo1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedInfoType getSignedInfo1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo1 <em>Signed Info1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed Info1</em>' containment reference.
	 * @see #getSignedInfo1()
	 * @generated
	 */
	void setSignedInfo1(SignedInfoType value);

	/**
	 * Returns the value of the '<em><b>SPKI Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPKI Data1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPKI Data1</em>' containment reference.
	 * @see #setSPKIData1(SPKIDataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SPKIData1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPKIData' namespace='##targetNamespace'"
	 * @generated
	 */
	SPKIDataType getSPKIData1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData1 <em>SPKI Data1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPKI Data1</em>' containment reference.
	 * @see #getSPKIData1()
	 * @generated
	 */
	void setSPKIData1(SPKIDataType value);

	/**
	 * Returns the value of the '<em><b>Transform1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform1</em>' containment reference.
	 * @see #setTransform1(TransformType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transform1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformType getTransform1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform1 <em>Transform1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform1</em>' containment reference.
	 * @see #getTransform1()
	 * @generated
	 */
	void setTransform1(TransformType value);

	/**
	 * Returns the value of the '<em><b>Transforms1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms1</em>' containment reference.
	 * @see #setTransforms1(TransformsType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transforms1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType getTransforms1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms1 <em>Transforms1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms1</em>' containment reference.
	 * @see #getTransforms1()
	 * @generated
	 */
	void setTransforms1(TransformsType value);

	/**
	 * Returns the value of the '<em><b>X509 Data1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Data1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Data1</em>' containment reference.
	 * @see #setX509Data1(X509DataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_X509Data1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Data' namespace='##targetNamespace'"
	 * @generated
	 */
	X509DataType getX509Data1();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data1 <em>X509 Data1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Data1</em>' containment reference.
	 * @see #getX509Data1()
	 * @generated
	 */
	void setX509Data1(X509DataType value);

} // DocumentRoot
