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
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3._2000._09.xmldsig.CanonicalizationMethodType1;
import org.w3._2000._09.xmldsig.DSAKeyValueType;
import org.w3._2000._09.xmldsig.DSAKeyValueType1;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.DigestMethodType1;
import org.w3._2000._09.xmldsig.DocumentRoot;
import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.KeyInfoType1;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.KeyValueType1;
import org.w3._2000._09.xmldsig.ManifestType;
import org.w3._2000._09.xmldsig.ManifestType1;
import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.ObjectType1;
import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.PGPDataType1;
import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.RSAKeyValueType1;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.ReferenceType1;
import org.w3._2000._09.xmldsig.RetrievalMethodType;
import org.w3._2000._09.xmldsig.RetrievalMethodType1;
import org.w3._2000._09.xmldsig.SPKIDataType;
import org.w3._2000._09.xmldsig.SPKIDataType1;
import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.SignatureMethodType1;
import org.w3._2000._09.xmldsig.SignaturePropertiesType;
import org.w3._2000._09.xmldsig.SignaturePropertiesType1;
import org.w3._2000._09.xmldsig.SignaturePropertyType;
import org.w3._2000._09.xmldsig.SignaturePropertyType1;
import org.w3._2000._09.xmldsig.SignatureType;
import org.w3._2000._09.xmldsig.SignatureType1;
import org.w3._2000._09.xmldsig.SignatureValueType;
import org.w3._2000._09.xmldsig.SignatureValueType1;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.SignedInfoType1;
import org.w3._2000._09.xmldsig.TransformType;
import org.w3._2000._09.xmldsig.TransformType1;
import org.w3._2000._09.xmldsig.TransformsType;
import org.w3._2000._09.xmldsig.TransformsType1;
import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.X509DataType1;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getCanonicalizationMethod <em>Canonicalization Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestMethod <em>Digest Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestValue <em>Digest Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDSAKeyValue <em>DSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getMgmtData <em>Mgmt Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getPGPData <em>PGP Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRetrievalMethod <em>Retrieval Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRSAKeyValue <em>RSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureMethod <em>Signature Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperties <em>Signature Properties</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperty <em>Signature Property</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureValue <em>Signature Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignedInfo <em>Signed Info</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSPKIData <em>SPKI Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getX509Data <em>X509 Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getCanonicalizationMethod1 <em>Canonicalization Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestMethod1 <em>Digest Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestValue1 <em>Digest Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDSAKeyValue1 <em>DSA Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyInfo1 <em>Key Info1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyName1 <em>Key Name1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyValue1 <em>Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getManifest1 <em>Manifest1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getMgmtData1 <em>Mgmt Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getObject1 <em>Object1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getPGPData1 <em>PGP Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getReference1 <em>Reference1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRetrievalMethod1 <em>Retrieval Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRSAKeyValue1 <em>RSA Key Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignature1 <em>Signature1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureMethod1 <em>Signature Method1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperties1 <em>Signature Properties1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperty1 <em>Signature Property1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureValue1 <em>Signature Value1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignedInfo1 <em>Signed Info1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSPKIData1 <em>SPKI Data1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransform1 <em>Transform1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransforms1 <em>Transforms1</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getX509Data1 <em>X509 Data1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getDigestValue() <em>Digest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DIGEST_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMgmtData() <em>Mgmt Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgmtData()
	 * @generated
	 * @ordered
	 */
	protected static final String MGMT_DATA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDigestValue1() <em>Digest Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigestValue1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DIGEST_VALUE1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyName1() <em>Key Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName1()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMgmtData1() <em>Mgmt Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgmtData1()
	 * @generated
	 * @ordered
	 */
	protected static final String MGMT_DATA1_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType1 getCanonicalizationMethod() {
		return (CanonicalizationMethodType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanonicalizationMethod(CanonicalizationMethodType1 newCanonicalizationMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, newCanonicalizationMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalizationMethod(CanonicalizationMethodType1 newCanonicalizationMethod) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, newCanonicalizationMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestMethodType1 getDigestMethod() {
		return (DigestMethodType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigestMethod(DigestMethodType1 newDigestMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD, newDigestMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigestMethod(DigestMethodType1 newDigestMethod) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD, newDigestMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDigestValue() {
		return (byte[])getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigestValue(byte[] newDigestValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE, newDigestValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType1 getDSAKeyValue() {
		return (DSAKeyValueType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAKeyValue(DSAKeyValueType1 newDSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE, newDSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSAKeyValue(DSAKeyValueType1 newDSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE, newDSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType1 getKeyInfo() {
		return (KeyInfoType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType1 newKeyInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO, newKeyInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyInfo(KeyInfoType1 newKeyInfo) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO, newKeyInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName() {
		return (String)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME, newKeyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType1 getKeyValue() {
		return (KeyValueType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyValue(KeyValueType1 newKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE, newKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValue(KeyValueType1 newKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE, newKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType1 getManifest() {
		return (ManifestType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest(ManifestType1 newManifest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST, newManifest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest(ManifestType1 newManifest) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST, newManifest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMgmtData() {
		return (String)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMgmtData(String newMgmtData) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA, newMgmtData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType1 getObject() {
		return (ObjectType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectType1 newObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, newObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(ObjectType1 newObject) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, newObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPDataType1 getPGPData() {
		return (PGPDataType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPGPData(PGPDataType1 newPGPData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA, newPGPData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGPData(PGPDataType1 newPGPData) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA, newPGPData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 getReference() {
		return (ReferenceType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType1 newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE, newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceType1 newReference) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetrievalMethodType1 getRetrievalMethod() {
		return (RetrievalMethodType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetrievalMethod(RetrievalMethodType1 newRetrievalMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD, newRetrievalMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetrievalMethod(RetrievalMethodType1 newRetrievalMethod) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD, newRetrievalMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType1 getRSAKeyValue() {
		return (RSAKeyValueType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSAKeyValue(RSAKeyValueType1 newRSAKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, newRSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSAKeyValue(RSAKeyValueType1 newRSAKeyValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, newRSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType1 getSignature() {
		return (SignatureType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(SignatureType1 newSignature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE, newSignature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(SignatureType1 newSignature) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType1 getSignatureMethod() {
		return (SignatureMethodType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureMethod(SignatureMethodType1 newSignatureMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD, newSignatureMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureMethod(SignatureMethodType1 newSignatureMethod) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD, newSignatureMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertiesType1 getSignatureProperties() {
		return (SignaturePropertiesType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperties(SignaturePropertiesType1 newSignatureProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, newSignatureProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureProperties(SignaturePropertiesType1 newSignatureProperties) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, newSignatureProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertyType1 getSignatureProperty() {
		return (SignaturePropertyType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperty(SignaturePropertyType1 newSignatureProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, newSignatureProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureProperty(SignaturePropertyType1 newSignatureProperty) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, newSignatureProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType1 getSignatureValue() {
		return (SignatureValueType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureValue(SignatureValueType1 newSignatureValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE, newSignatureValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureValue(SignatureValueType1 newSignatureValue) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE, newSignatureValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType1 getSignedInfo() {
		return (SignedInfoType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedInfo(SignedInfoType1 newSignedInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO, newSignedInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedInfo(SignedInfoType1 newSignedInfo) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO, newSignedInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPKIDataType1 getSPKIData() {
		return (SPKIDataType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPKIData(SPKIDataType1 newSPKIData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA, newSPKIData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPKIData(SPKIDataType1 newSPKIData) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA, newSPKIData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType1 getTransform() {
		return (TransformType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(TransformType1 newTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(TransformType1 newTransform) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformsType1 getTransforms() {
		return (TransformsType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransforms(TransformsType1 newTransforms, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, newTransforms, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransforms(TransformsType1 newTransforms) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, newTransforms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509DataType1 getX509Data() {
		return (X509DataType1)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX509Data(X509DataType1 newX509Data, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA, newX509Data, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509Data(X509DataType1 newX509Data) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA, newX509Data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType getCanonicalizationMethod1() {
		return (CanonicalizationMethodType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanonicalizationMethod1(CanonicalizationMethodType newCanonicalizationMethod1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1, newCanonicalizationMethod1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalizationMethod1(CanonicalizationMethodType newCanonicalizationMethod1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD1, newCanonicalizationMethod1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestMethodType getDigestMethod1() {
		return (DigestMethodType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigestMethod1(DigestMethodType newDigestMethod1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1, newDigestMethod1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigestMethod1(DigestMethodType newDigestMethod1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD1, newDigestMethod1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDigestValue1() {
		return (byte[])getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigestValue1(byte[] newDigestValue1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE1, newDigestValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType getDSAKeyValue1() {
		return (DSAKeyValueType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAKeyValue1(DSAKeyValueType newDSAKeyValue1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1, newDSAKeyValue1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSAKeyValue1(DSAKeyValueType newDSAKeyValue1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE1, newDSAKeyValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType getKeyInfo1() {
		return (KeyInfoType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo1(KeyInfoType newKeyInfo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1, newKeyInfo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyInfo1(KeyInfoType newKeyInfo1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO1, newKeyInfo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName1() {
		return (String)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName1(String newKeyName1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME1, newKeyName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType getKeyValue1() {
		return (KeyValueType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyValue1(KeyValueType newKeyValue1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1, newKeyValue1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValue1(KeyValueType newKeyValue1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE1, newKeyValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType getManifest1() {
		return (ManifestType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest1(ManifestType newManifest1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1, newManifest1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest1(ManifestType newManifest1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST1, newManifest1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMgmtData1() {
		return (String)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMgmtData1(String newMgmtData1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA1, newMgmtData1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getObject1() {
		return (ObjectType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject1(ObjectType newObject1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1, newObject1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject1(ObjectType newObject1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT1, newObject1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPDataType getPGPData1() {
		return (PGPDataType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPGPData1(PGPDataType newPGPData1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1, newPGPData1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGPData1(PGPDataType newPGPData1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA1, newPGPData1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference1() {
		return (ReferenceType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference1(ReferenceType newReference1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1, newReference1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference1(ReferenceType newReference1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE1, newReference1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetrievalMethodType getRetrievalMethod1() {
		return (RetrievalMethodType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetrievalMethod1(RetrievalMethodType newRetrievalMethod1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1, newRetrievalMethod1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetrievalMethod1(RetrievalMethodType newRetrievalMethod1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD1, newRetrievalMethod1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType getRSAKeyValue1() {
		return (RSAKeyValueType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSAKeyValue1(RSAKeyValueType newRSAKeyValue1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1, newRSAKeyValue1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSAKeyValue1(RSAKeyValueType newRSAKeyValue1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE1, newRSAKeyValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType getSignature1() {
		return (SignatureType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature1(SignatureType newSignature1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1, newSignature1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature1(SignatureType newSignature1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE1, newSignature1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType getSignatureMethod1() {
		return (SignatureMethodType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureMethod1(SignatureMethodType newSignatureMethod1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1, newSignatureMethod1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureMethod1(SignatureMethodType newSignatureMethod1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD1, newSignatureMethod1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertiesType getSignatureProperties1() {
		return (SignaturePropertiesType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperties1(SignaturePropertiesType newSignatureProperties1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1, newSignatureProperties1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureProperties1(SignaturePropertiesType newSignatureProperties1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1, newSignatureProperties1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertyType getSignatureProperty1() {
		return (SignaturePropertyType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperty1(SignaturePropertyType newSignatureProperty1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1, newSignatureProperty1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureProperty1(SignaturePropertyType newSignatureProperty1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY1, newSignatureProperty1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType getSignatureValue1() {
		return (SignatureValueType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatureValue1(SignatureValueType newSignatureValue1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1, newSignatureValue1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureValue1(SignatureValueType newSignatureValue1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE1, newSignatureValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType getSignedInfo1() {
		return (SignedInfoType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignedInfo1(SignedInfoType newSignedInfo1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1, newSignedInfo1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedInfo1(SignedInfoType newSignedInfo1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO1, newSignedInfo1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPKIDataType getSPKIData1() {
		return (SPKIDataType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPKIData1(SPKIDataType newSPKIData1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1, newSPKIData1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPKIData1(SPKIDataType newSPKIData1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA1, newSPKIData1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType getTransform1() {
		return (TransformType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform1(TransformType newTransform1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1, newTransform1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform1(TransformType newTransform1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM1, newTransform1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformsType getTransforms1() {
		return (TransformsType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransforms1(TransformsType newTransforms1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1, newTransforms1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransforms1(TransformsType newTransforms1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS1, newTransforms1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509DataType getX509Data1() {
		return (X509DataType)getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX509Data1(X509DataType newX509Data1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1, newX509Data1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509Data1(X509DataType newX509Data1) {
		((FeatureMap.Internal)getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA1, newX509Data1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
				return basicSetCanonicalizationMethod(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
				return basicSetDigestMethod(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
				return basicSetDSAKeyValue(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
				return basicSetKeyInfo(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
				return basicSetKeyValue(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
				return basicSetManifest(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
				return basicSetObject(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
				return basicSetPGPData(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
				return basicSetReference(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
				return basicSetRetrievalMethod(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return basicSetRSAKeyValue(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
				return basicSetSignature(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
				return basicSetSignatureMethod(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
				return basicSetSignatureProperties(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
				return basicSetSignatureProperty(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
				return basicSetSignatureValue(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
				return basicSetSignedInfo(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
				return basicSetSPKIData(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
				return basicSetTransform(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
				return basicSetTransforms(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
				return basicSetX509Data(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
				return basicSetCanonicalizationMethod1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
				return basicSetDigestMethod1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
				return basicSetDSAKeyValue1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
				return basicSetKeyInfo1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
				return basicSetKeyValue1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
				return basicSetManifest1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
				return basicSetObject1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
				return basicSetPGPData1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
				return basicSetReference1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
				return basicSetRetrievalMethod1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
				return basicSetRSAKeyValue1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
				return basicSetSignature1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
				return basicSetSignatureMethod1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
				return basicSetSignatureProperties1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
				return basicSetSignatureProperty1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
				return basicSetSignatureValue1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
				return basicSetSignedInfo1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
				return basicSetSPKIData1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
				return basicSetTransform1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
				return basicSetTransforms1(null, msgs);
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
				return basicSetX509Data1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmldsigPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
				return getCanonicalizationMethod();
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
				return getDigestMethod();
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
				return getDigestValue();
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
				return getDSAKeyValue();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
				return getKeyInfo();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
				return getKeyName();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
				return getKeyValue();
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
				return getManifest();
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
				return getMgmtData();
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
				return getObject();
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
				return getPGPData();
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
				return getRetrievalMethod();
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return getRSAKeyValue();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
				return getSignature();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
				return getSignatureMethod();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
				return getSignatureProperties();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
				return getSignatureProperty();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
				return getSignatureValue();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
				return getSignedInfo();
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
				return getSPKIData();
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
				return getTransforms();
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
				return getX509Data();
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
				return getCanonicalizationMethod1();
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
				return getDigestMethod1();
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE1:
				return getDigestValue1();
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
				return getDSAKeyValue1();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
				return getKeyInfo1();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME1:
				return getKeyName1();
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
				return getKeyValue1();
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
				return getManifest1();
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA1:
				return getMgmtData1();
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
				return getObject1();
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
				return getPGPData1();
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
				return getReference1();
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
				return getRetrievalMethod1();
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
				return getRSAKeyValue1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
				return getSignature1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
				return getSignatureMethod1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
				return getSignatureProperties1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
				return getSignatureProperty1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
				return getSignatureValue1();
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
				return getSignedInfo1();
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
				return getSPKIData1();
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
				return getTransform1();
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
				return getTransforms1();
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
				return getX509Data1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmldsigPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
				setCanonicalizationMethod((CanonicalizationMethodType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
				setDigestMethod((DigestMethodType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
				setDigestValue((byte[])newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
				setKeyInfo((KeyInfoType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
				setKeyName((String)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
				setKeyValue((KeyValueType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
				setManifest((ManifestType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
				setMgmtData((String)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
				setObject((ObjectType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
				setPGPData((PGPDataType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
				setRetrievalMethod((RetrievalMethodType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
				setSignature((SignatureType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
				setSignatureMethod((SignatureMethodType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
				setSignatureProperties((SignaturePropertiesType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
				setSignatureProperty((SignaturePropertyType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
				setSignatureValue((SignatureValueType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
				setSignedInfo((SignedInfoType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
				setSPKIData((SPKIDataType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
				setTransforms((TransformsType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
				setX509Data((X509DataType1)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
				setCanonicalizationMethod1((CanonicalizationMethodType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
				setDigestMethod1((DigestMethodType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE1:
				setDigestValue1((byte[])newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
				setDSAKeyValue1((DSAKeyValueType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
				setKeyInfo1((KeyInfoType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME1:
				setKeyName1((String)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
				setKeyValue1((KeyValueType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
				setManifest1((ManifestType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA1:
				setMgmtData1((String)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
				setObject1((ObjectType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
				setPGPData1((PGPDataType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
				setReference1((ReferenceType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
				setRetrievalMethod1((RetrievalMethodType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
				setRSAKeyValue1((RSAKeyValueType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
				setSignature1((SignatureType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
				setSignatureMethod1((SignatureMethodType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
				setSignatureProperties1((SignaturePropertiesType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
				setSignatureProperty1((SignaturePropertyType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
				setSignatureValue1((SignatureValueType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
				setSignedInfo1((SignedInfoType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
				setSPKIData1((SPKIDataType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
				setTransform1((TransformType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
				setTransforms1((TransformsType)newValue);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
				setX509Data1((X509DataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmldsigPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
				setCanonicalizationMethod((CanonicalizationMethodType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
				setDigestMethod((DigestMethodType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
				setDigestValue(DIGEST_VALUE_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
				setDSAKeyValue((DSAKeyValueType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
				setKeyInfo((KeyInfoType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
				setKeyName(KEY_NAME_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
				setKeyValue((KeyValueType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
				setManifest((ManifestType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
				setMgmtData(MGMT_DATA_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
				setObject((ObjectType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
				setPGPData((PGPDataType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
				setRetrievalMethod((RetrievalMethodType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
				setRSAKeyValue((RSAKeyValueType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
				setSignature((SignatureType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
				setSignatureMethod((SignatureMethodType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
				setSignatureProperties((SignaturePropertiesType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
				setSignatureProperty((SignaturePropertyType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
				setSignatureValue((SignatureValueType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
				setSignedInfo((SignedInfoType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
				setSPKIData((SPKIDataType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
				setTransforms((TransformsType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
				setX509Data((X509DataType1)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
				setCanonicalizationMethod1((CanonicalizationMethodType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
				setDigestMethod1((DigestMethodType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE1:
				setDigestValue1(DIGEST_VALUE1_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
				setDSAKeyValue1((DSAKeyValueType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
				setKeyInfo1((KeyInfoType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME1:
				setKeyName1(KEY_NAME1_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
				setKeyValue1((KeyValueType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
				setManifest1((ManifestType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA1:
				setMgmtData1(MGMT_DATA1_EDEFAULT);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
				setObject1((ObjectType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
				setPGPData1((PGPDataType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
				setReference1((ReferenceType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
				setRetrievalMethod1((RetrievalMethodType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
				setRSAKeyValue1((RSAKeyValueType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
				setSignature1((SignatureType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
				setSignatureMethod1((SignatureMethodType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
				setSignatureProperties1((SignaturePropertiesType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
				setSignatureProperty1((SignaturePropertyType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
				setSignatureValue1((SignatureValueType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
				setSignedInfo1((SignedInfoType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
				setSPKIData1((SPKIDataType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
				setTransform1((TransformType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
				setTransforms1((TransformsType)null);
				return;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
				setX509Data1((X509DataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmldsigPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
				return getCanonicalizationMethod() != null;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
				return getDigestMethod() != null;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
				return DIGEST_VALUE_EDEFAULT == null ? getDigestValue() != null : !DIGEST_VALUE_EDEFAULT.equals(getDigestValue());
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
				return getDSAKeyValue() != null;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
				return getKeyInfo() != null;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? getKeyName() != null : !KEY_NAME_EDEFAULT.equals(getKeyName());
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
				return getKeyValue() != null;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
				return getManifest() != null;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
				return MGMT_DATA_EDEFAULT == null ? getMgmtData() != null : !MGMT_DATA_EDEFAULT.equals(getMgmtData());
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
				return getObject() != null;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
				return getPGPData() != null;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference() != null;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
				return getRetrievalMethod() != null;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
				return getRSAKeyValue() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
				return getSignature() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
				return getSignatureMethod() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
				return getSignatureProperties() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
				return getSignatureProperty() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
				return getSignatureValue() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
				return getSignedInfo() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
				return getSPKIData() != null;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform() != null;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
				return getTransforms() != null;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
				return getX509Data() != null;
			case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD1:
				return getCanonicalizationMethod1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD1:
				return getDigestMethod1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE1:
				return DIGEST_VALUE1_EDEFAULT == null ? getDigestValue1() != null : !DIGEST_VALUE1_EDEFAULT.equals(getDigestValue1());
			case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE1:
				return getDSAKeyValue1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO1:
				return getKeyInfo1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME1:
				return KEY_NAME1_EDEFAULT == null ? getKeyName1() != null : !KEY_NAME1_EDEFAULT.equals(getKeyName1());
			case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE1:
				return getKeyValue1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__MANIFEST1:
				return getManifest1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA1:
				return MGMT_DATA1_EDEFAULT == null ? getMgmtData1() != null : !MGMT_DATA1_EDEFAULT.equals(getMgmtData1());
			case XmldsigPackage.DOCUMENT_ROOT__OBJECT1:
				return getObject1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA1:
				return getPGPData1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__REFERENCE1:
				return getReference1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD1:
				return getRetrievalMethod1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE1:
				return getRSAKeyValue1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE1:
				return getSignature1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD1:
				return getSignatureMethod1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES1:
				return getSignatureProperties1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY1:
				return getSignatureProperty1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE1:
				return getSignatureValue1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO1:
				return getSignedInfo1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA1:
				return getSPKIData1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM1:
				return getTransform1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS1:
				return getTransforms1() != null;
			case XmldsigPackage.DOCUMENT_ROOT__X509_DATA1:
				return getX509Data1() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
