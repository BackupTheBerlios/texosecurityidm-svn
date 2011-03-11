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
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.BinarySecurityTokenType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.BinarySecurityTokenType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EmbeddedType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EmbeddedType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EncodedString;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EncodedString1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.KeyIdentifierType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.KeyIdentifierType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.PasswordString;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.PasswordString1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.ReferenceType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.ReferenceType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityHeaderType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityHeaderType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TransformationParametersType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TransformationParametersType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.UsernameTokenType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.UsernameTokenType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getBinarySecurityToken <em>Binary Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getKeyIdentifier <em>Key Identifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getNonce <em>Nonce</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getSecurityTokenReference <em>Security Token Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getTransformationParameters <em>Transformation Parameters</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getUsernameToken <em>Username Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getBinarySecurityToken1 <em>Binary Security Token1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getEmbedded1 <em>Embedded1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getKeyIdentifier1 <em>Key Identifier1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getNonce1 <em>Nonce1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getPassword1 <em>Password1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getReference1 <em>Reference1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getSecurity1 <em>Security1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getSecurityTokenReference1 <em>Security Token Reference1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getTransformationParameters1 <em>Transformation Parameters1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getUsernameToken1 <em>Username Token1</em>}</li>
 *   <li>{@link org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl.DocumentRootImpl#getUsage1 <em>Usage1</em>}</li>
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
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected List<String> usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage1() <em>Usage1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> USAGE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage1() <em>Usage1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage1()
	 * @generated
	 * @ordered
	 */
	protected List<String> usage1 = USAGE1_EDEFAULT;

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
		return _0Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _0Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecurityTokenType1 getBinarySecurityToken() {
		return (BinarySecurityTokenType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySecurityToken(BinarySecurityTokenType1 newBinarySecurityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN, newBinarySecurityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinarySecurityToken(BinarySecurityTokenType1 newBinarySecurityToken) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN, newBinarySecurityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedType1 getEmbedded() {
		return (EmbeddedType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbedded(EmbeddedType1 newEmbedded, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED, newEmbedded, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded(EmbeddedType1 newEmbedded) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED, newEmbedded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIdentifierType1 getKeyIdentifier() {
		return (KeyIdentifierType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyIdentifier(KeyIdentifierType1 newKeyIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER, newKeyIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyIdentifier(KeyIdentifierType1 newKeyIdentifier) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER, newKeyIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedString1 getNonce() {
		return (EncodedString1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__NONCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonce(EncodedString1 newNonce, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__NONCE, newNonce, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonce(EncodedString1 newNonce) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__NONCE, newNonce);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordString1 getPassword() {
		return (PasswordString1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(PasswordString1 newPassword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__PASSWORD, newPassword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(PasswordString1 newPassword) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__PASSWORD, newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 getReference() {
		return (ReferenceType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType1 newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__REFERENCE, newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceType1 newReference) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityHeaderType1 getSecurity() {
		return (SecurityHeaderType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SECURITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(SecurityHeaderType1 newSecurity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SECURITY, newSecurity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(SecurityHeaderType1 newSecurity) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SECURITY, newSecurity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenReferenceType1 getSecurityTokenReference() {
		return (SecurityTokenReferenceType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityTokenReference(SecurityTokenReferenceType1 newSecurityTokenReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE, newSecurityTokenReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityTokenReference(SecurityTokenReferenceType1 newSecurityTokenReference) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE, newSecurityTokenReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationParametersType1 getTransformationParameters() {
		return (TransformationParametersType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationParameters(TransformationParametersType1 newTransformationParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS, newTransformationParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationParameters(TransformationParametersType1 newTransformationParameters) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS, newTransformationParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsernameTokenType1 getUsernameToken() {
		return (UsernameTokenType1)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsernameToken(UsernameTokenType1 newUsernameToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, newUsernameToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsernameToken(UsernameTokenType1 newUsernameToken) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN, newUsernameToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(List<String> newUsage) {
		List<String> oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecurityTokenType getBinarySecurityToken1() {
		return (BinarySecurityTokenType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySecurityToken1(BinarySecurityTokenType newBinarySecurityToken1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1, newBinarySecurityToken1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinarySecurityToken1(BinarySecurityTokenType newBinarySecurityToken1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1, newBinarySecurityToken1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedType getEmbedded1() {
		return (EmbeddedType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbedded1(EmbeddedType newEmbedded1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1, newEmbedded1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded1(EmbeddedType newEmbedded1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__EMBEDDED1, newEmbedded1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyIdentifierType getKeyIdentifier1() {
		return (KeyIdentifierType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyIdentifier1(KeyIdentifierType newKeyIdentifier1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1, newKeyIdentifier1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyIdentifier1(KeyIdentifierType newKeyIdentifier1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1, newKeyIdentifier1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodedString getNonce1() {
		return (EncodedString)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__NONCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonce1(EncodedString newNonce1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__NONCE1, newNonce1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonce1(EncodedString newNonce1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__NONCE1, newNonce1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordString getPassword1() {
		return (PasswordString)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword1(PasswordString newPassword1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1, newPassword1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword1(PasswordString newPassword1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__PASSWORD1, newPassword1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference1() {
		return (ReferenceType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference1(ReferenceType newReference1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1, newReference1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference1(ReferenceType newReference1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__REFERENCE1, newReference1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityHeaderType getSecurity1() {
		return (SecurityHeaderType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SECURITY1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity1(SecurityHeaderType newSecurity1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SECURITY1, newSecurity1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity1(SecurityHeaderType newSecurity1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SECURITY1, newSecurity1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTokenReferenceType getSecurityTokenReference1() {
		return (SecurityTokenReferenceType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityTokenReference1(SecurityTokenReferenceType newSecurityTokenReference1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1, newSecurityTokenReference1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityTokenReference1(SecurityTokenReferenceType newSecurityTokenReference1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1, newSecurityTokenReference1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationParametersType getTransformationParameters1() {
		return (TransformationParametersType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationParameters1(TransformationParametersType newTransformationParameters1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1, newTransformationParameters1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationParameters1(TransformationParametersType newTransformationParameters1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1, newTransformationParameters1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsernameTokenType getUsernameToken1() {
		return (UsernameTokenType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsernameToken1(UsernameTokenType newUsernameToken1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1, newUsernameToken1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsernameToken1(UsernameTokenType newUsernameToken1) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN1, newUsernameToken1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUsage1() {
		return usage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage1(List<String> newUsage1) {
		List<String> oldUsage1 = usage1;
		usage1 = newUsage1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DOCUMENT_ROOT__USAGE1, oldUsage1, usage1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
				return basicSetBinarySecurityToken(null, msgs);
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
				return basicSetEmbedded(null, msgs);
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
				return basicSetKeyIdentifier(null, msgs);
			case _0Package.DOCUMENT_ROOT__NONCE:
				return basicSetNonce(null, msgs);
			case _0Package.DOCUMENT_ROOT__PASSWORD:
				return basicSetPassword(null, msgs);
			case _0Package.DOCUMENT_ROOT__REFERENCE:
				return basicSetReference(null, msgs);
			case _0Package.DOCUMENT_ROOT__SECURITY:
				return basicSetSecurity(null, msgs);
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
				return basicSetSecurityTokenReference(null, msgs);
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
				return basicSetTransformationParameters(null, msgs);
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return basicSetUsernameToken(null, msgs);
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
				return basicSetBinarySecurityToken1(null, msgs);
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
				return basicSetEmbedded1(null, msgs);
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
				return basicSetKeyIdentifier1(null, msgs);
			case _0Package.DOCUMENT_ROOT__NONCE1:
				return basicSetNonce1(null, msgs);
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
				return basicSetPassword1(null, msgs);
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
				return basicSetReference1(null, msgs);
			case _0Package.DOCUMENT_ROOT__SECURITY1:
				return basicSetSecurity1(null, msgs);
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
				return basicSetSecurityTokenReference1(null, msgs);
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
				return basicSetTransformationParameters1(null, msgs);
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
				return basicSetUsernameToken1(null, msgs);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
				return getBinarySecurityToken();
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
				return getEmbedded();
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
				return getKeyIdentifier();
			case _0Package.DOCUMENT_ROOT__NONCE:
				return getNonce();
			case _0Package.DOCUMENT_ROOT__PASSWORD:
				return getPassword();
			case _0Package.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case _0Package.DOCUMENT_ROOT__SECURITY:
				return getSecurity();
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
				return getSecurityTokenReference();
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
				return getTransformationParameters();
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return getUsernameToken();
			case _0Package.DOCUMENT_ROOT__USAGE:
				return getUsage();
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
				return getBinarySecurityToken1();
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
				return getEmbedded1();
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
				return getKeyIdentifier1();
			case _0Package.DOCUMENT_ROOT__NONCE1:
				return getNonce1();
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
				return getPassword1();
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
				return getReference1();
			case _0Package.DOCUMENT_ROOT__SECURITY1:
				return getSecurity1();
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
				return getSecurityTokenReference1();
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
				return getTransformationParameters1();
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
				return getUsernameToken1();
			case _0Package.DOCUMENT_ROOT__USAGE1:
				return getUsage1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
				setBinarySecurityToken((BinarySecurityTokenType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
				setEmbedded((EmbeddedType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
				setKeyIdentifier((KeyIdentifierType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__NONCE:
				setNonce((EncodedString1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__PASSWORD:
				setPassword((PasswordString1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY:
				setSecurity((SecurityHeaderType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
				setSecurityTokenReference((SecurityTokenReferenceType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
				setTransformationParameters((TransformationParametersType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				setUsernameToken((UsernameTokenType1)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__USAGE:
				setUsage((List<String>)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
				setBinarySecurityToken1((BinarySecurityTokenType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
				setEmbedded1((EmbeddedType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
				setKeyIdentifier1((KeyIdentifierType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__NONCE1:
				setNonce1((EncodedString)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
				setPassword1((PasswordString)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
				setReference1((ReferenceType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY1:
				setSecurity1((SecurityHeaderType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
				setSecurityTokenReference1((SecurityTokenReferenceType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
				setTransformationParameters1((TransformationParametersType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
				setUsernameToken1((UsernameTokenType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__USAGE1:
				setUsage1((List<String>)newValue);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
				setBinarySecurityToken((BinarySecurityTokenType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
				setEmbedded((EmbeddedType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
				setKeyIdentifier((KeyIdentifierType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__NONCE:
				setNonce((EncodedString1)null);
				return;
			case _0Package.DOCUMENT_ROOT__PASSWORD:
				setPassword((PasswordString1)null);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY:
				setSecurity((SecurityHeaderType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
				setSecurityTokenReference((SecurityTokenReferenceType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
				setTransformationParameters((TransformationParametersType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				setUsernameToken((UsernameTokenType1)null);
				return;
			case _0Package.DOCUMENT_ROOT__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
				setBinarySecurityToken1((BinarySecurityTokenType)null);
				return;
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
				setEmbedded1((EmbeddedType)null);
				return;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
				setKeyIdentifier1((KeyIdentifierType)null);
				return;
			case _0Package.DOCUMENT_ROOT__NONCE1:
				setNonce1((EncodedString)null);
				return;
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
				setPassword1((PasswordString)null);
				return;
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
				setReference1((ReferenceType)null);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY1:
				setSecurity1((SecurityHeaderType)null);
				return;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
				setSecurityTokenReference1((SecurityTokenReferenceType)null);
				return;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
				setTransformationParameters1((TransformationParametersType)null);
				return;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
				setUsernameToken1((UsernameTokenType)null);
				return;
			case _0Package.DOCUMENT_ROOT__USAGE1:
				setUsage1(USAGE1_EDEFAULT);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN:
				return getBinarySecurityToken() != null;
			case _0Package.DOCUMENT_ROOT__EMBEDDED:
				return getEmbedded() != null;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER:
				return getKeyIdentifier() != null;
			case _0Package.DOCUMENT_ROOT__NONCE:
				return getNonce() != null;
			case _0Package.DOCUMENT_ROOT__PASSWORD:
				return getPassword() != null;
			case _0Package.DOCUMENT_ROOT__REFERENCE:
				return getReference() != null;
			case _0Package.DOCUMENT_ROOT__SECURITY:
				return getSecurity() != null;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE:
				return getSecurityTokenReference() != null;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS:
				return getTransformationParameters() != null;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN:
				return getUsernameToken() != null;
			case _0Package.DOCUMENT_ROOT__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case _0Package.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1:
				return getBinarySecurityToken1() != null;
			case _0Package.DOCUMENT_ROOT__EMBEDDED1:
				return getEmbedded1() != null;
			case _0Package.DOCUMENT_ROOT__KEY_IDENTIFIER1:
				return getKeyIdentifier1() != null;
			case _0Package.DOCUMENT_ROOT__NONCE1:
				return getNonce1() != null;
			case _0Package.DOCUMENT_ROOT__PASSWORD1:
				return getPassword1() != null;
			case _0Package.DOCUMENT_ROOT__REFERENCE1:
				return getReference1() != null;
			case _0Package.DOCUMENT_ROOT__SECURITY1:
				return getSecurity1() != null;
			case _0Package.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1:
				return getSecurityTokenReference1() != null;
			case _0Package.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1:
				return getTransformationParameters1() != null;
			case _0Package.DOCUMENT_ROOT__USERNAME_TOKEN1:
				return getUsernameToken1() != null;
			case _0Package.DOCUMENT_ROOT__USAGE1:
				return USAGE1_EDEFAULT == null ? usage1 != null : !USAGE1_EDEFAULT.equals(usage1);
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
		result.append(", usage: ");
		result.append(usage);
		result.append(", usage1: ");
		result.append(usage1);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
