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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl;

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

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.w3._2005._08.wsaddressing.EndpointReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getAllowPostdating <em>Allow Postdating</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getAuthenticationType <em>Authentication Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getBinaryExchange <em>Binary Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getBinarySecret <em>Binary Secret</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getCancelTarget <em>Cancel Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getCanonicalizationAlgorithm <em>Canonicalization Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getChallenge <em>Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getCombinedHash <em>Combined Hash</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getComputedKey <em>Computed Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getComputedKeyAlgorithm <em>Computed Key Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#isDelegatable <em>Delegatable</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getDelegateTo <em>Delegate To</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getEncryptWith <em>Encrypt With</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getEntropy <em>Entropy</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#isForwardable <em>Forwardable</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getIssuedTokens <em>Issued Tokens</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getKeyExchangeToken <em>Key Exchange Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getKeySize <em>Key Size</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getKeyWrapAlgorithm <em>Key Wrap Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getProofEncryption <em>Proof Encryption</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRenewing <em>Renewing</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRenewTarget <em>Renew Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestedAttachedReference <em>Requested Attached Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestedProofToken <em>Requested Proof Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestedSecurityToken <em>Requested Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestedTokenCancelled <em>Requested Token Cancelled</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestedUnattachedReference <em>Requested Unattached Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestKET <em>Request KET</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestSecurityToken <em>Request Security Token</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestSecurityTokenCollection <em>Request Security Token Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestSecurityTokenResponse <em>Request Security Token Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestSecurityTokenResponseCollection <em>Request Security Token Response Collection</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getSignChallenge <em>Sign Challenge</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getSignChallengeResponse <em>Sign Challenge Response</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getSignWith <em>Sign With</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getTokenType <em>Token Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getUseKey <em>Use Key</em>}</li>
 *   <li>{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl.DocumentRootImpl#getValidateTarget <em>Validate Target</em>}</li>
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
	 * The default value of the '{@link #getAuthenticationType() <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCanonicalizationAlgorithm() <em>Canonicalization Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalizationAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICALIZATION_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getChallenge() <em>Challenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChallenge()
	 * @generated
	 * @ordered
	 */
	protected static final String CHALLENGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCombinedHash() <em>Combined Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedHash()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] COMBINED_HASH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComputedKey() <em>Computed Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMPUTED_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComputedKeyAlgorithm() <em>Computed Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedKeyAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTED_KEY_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDelegatable() <em>Delegatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELEGATABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEncryptWith() <em>Encrypt With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptWith()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPT_WITH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isForwardable() <em>Forwardable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForwardable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORWARDABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getKeySize() <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySize()
	 * @generated
	 * @ordered
	 */
	protected static final long KEY_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getKeyType() <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyWrapAlgorithm() <em>Key Wrap Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyWrapAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_WRAP_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final Object REQUEST_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSignWith() <em>Sign With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignWith()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_WITH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_TYPE_EDEFAULT = null;

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
		return _200512Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _200512Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowPostdatingType getAllowPostdating() {
		return (AllowPostdatingType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ALLOW_POSTDATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowPostdating(AllowPostdatingType newAllowPostdating, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ALLOW_POSTDATING, newAllowPostdating, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowPostdating(AllowPostdatingType newAllowPostdating) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ALLOW_POSTDATING, newAllowPostdating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationType() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationType(String newAuthenticationType) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATION_TYPE, newAuthenticationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticatorType getAuthenticator() {
		return (AuthenticatorType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticator(AuthenticatorType newAuthenticator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATOR, newAuthenticator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator(AuthenticatorType newAuthenticator) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATOR, newAuthenticator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExchangeType getBinaryExchange() {
		return (BinaryExchangeType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__BINARY_EXCHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryExchange(BinaryExchangeType newBinaryExchange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__BINARY_EXCHANGE, newBinaryExchange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryExchange(BinaryExchangeType newBinaryExchange) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__BINARY_EXCHANGE, newBinaryExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecretType getBinarySecret() {
		return (BinarySecretType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__BINARY_SECRET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySecret(BinarySecretType newBinarySecret, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__BINARY_SECRET, newBinarySecret, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinarySecret(BinarySecretType newBinarySecret) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__BINARY_SECRET, newBinarySecret);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTargetType getCancelTarget() {
		return (CancelTargetType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__CANCEL_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelTarget(CancelTargetType newCancelTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__CANCEL_TARGET, newCancelTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelTarget(CancelTargetType newCancelTarget) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__CANCEL_TARGET, newCancelTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanonicalizationAlgorithm() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalizationAlgorithm(String newCanonicalizationAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM, newCanonicalizationAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChallenge() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__CHALLENGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChallenge(String newChallenge) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__CHALLENGE, newChallenge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimsType getClaims() {
		return (ClaimsType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__CLAIMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaims(ClaimsType newClaims, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__CLAIMS, newClaims, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaims(ClaimsType newClaims) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__CLAIMS, newClaims);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getCombinedHash() {
		return (byte[])getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__COMBINED_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedHash(byte[] newCombinedHash) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__COMBINED_HASH, newCombinedHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComputedKey() {
		return getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedKey(Object newComputedKey) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY, newComputedKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputedKeyAlgorithm() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedKeyAlgorithm(String newComputedKeyAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM, newComputedKeyAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelegatable() {
		return (Boolean)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__DELEGATABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegatable(boolean newDelegatable) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__DELEGATABLE, newDelegatable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateToType getDelegateTo() {
		return (DelegateToType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__DELEGATE_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateTo(DelegateToType newDelegateTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__DELEGATE_TO, newDelegateTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateTo(DelegateToType newDelegateTo) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__DELEGATE_TO, newDelegateTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionType getEncryption() {
		return (EncryptionType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryption(EncryptionType newEncryption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION, newEncryption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryption(EncryptionType newEncryption) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION, newEncryption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptionAlgorithm() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionAlgorithm(String newEncryptionAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM, newEncryptionAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptWith() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPT_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptWith(String newEncryptWith) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPT_WITH, newEncryptWith);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntropyType getEntropy() {
		return (EntropyType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ENTROPY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntropy(EntropyType newEntropy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ENTROPY, newEntropy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntropy(EntropyType newEntropy) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ENTROPY, newEntropy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForwardable() {
		return (Boolean)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__FORWARDABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardable(boolean newForwardable) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__FORWARDABLE, newForwardable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenResponseCollectionType getIssuedTokens() {
		return (RequestSecurityTokenResponseCollectionType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuedTokens(RequestSecurityTokenResponseCollectionType newIssuedTokens, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS, newIssuedTokens, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedTokens(RequestSecurityTokenResponseCollectionType newIssuedTokens) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS, newIssuedTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getIssuer() {
		return (EndpointReferenceType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ISSUER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(EndpointReferenceType newIssuer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ISSUER, newIssuer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(EndpointReferenceType newIssuer) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ISSUER, newIssuer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyExchangeTokenType getKeyExchangeToken() {
		return (KeyExchangeTokenType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyExchangeToken(KeyExchangeTokenType newKeyExchangeToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN, newKeyExchangeToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyExchangeToken(KeyExchangeTokenType newKeyExchangeToken) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN, newKeyExchangeToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getKeySize() {
		return (Long)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__KEY_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeySize(long newKeySize) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__KEY_SIZE, newKeySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKeyType() {
		return getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__KEY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyType(Object newKeyType) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__KEY_TYPE, newKeyType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyWrapAlgorithm() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyWrapAlgorithm(String newKeyWrapAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM, newKeyWrapAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifetimeType getLifetime() {
		return (LifetimeType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__LIFETIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifetime(LifetimeType newLifetime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__LIFETIME, newLifetime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifetime(LifetimeType newLifetime) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__LIFETIME, newLifetime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnBehalfOfType getOnBehalfOf() {
		return (OnBehalfOfType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__ON_BEHALF_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOf(OnBehalfOfType newOnBehalfOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__ON_BEHALF_OF, newOnBehalfOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOf(OnBehalfOfType newOnBehalfOf) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__ON_BEHALF_OF, newOnBehalfOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantsType getParticipants() {
		return (ParticipantsType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__PARTICIPANTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipants(ParticipantsType newParticipants, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__PARTICIPANTS, newParticipants, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipants(ParticipantsType newParticipants) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__PARTICIPANTS, newParticipants);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofEncryptionType getProofEncryption() {
		return (ProofEncryptionType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__PROOF_ENCRYPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProofEncryption(ProofEncryptionType newProofEncryption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__PROOF_ENCRYPTION, newProofEncryption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProofEncryption(ProofEncryptionType newProofEncryption) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__PROOF_ENCRYPTION, newProofEncryption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewingType getRenewing() {
		return (RenewingType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__RENEWING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenewing(RenewingType newRenewing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__RENEWING, newRenewing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenewing(RenewingType newRenewing) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__RENEWING, newRenewing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewTargetType getRenewTarget() {
		return (RenewTargetType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__RENEW_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenewTarget(RenewTargetType newRenewTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__RENEW_TARGET, newRenewTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenewTarget(RenewTargetType newRenewTarget) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__RENEW_TARGET, newRenewTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedReferenceType getRequestedAttachedReference() {
		return (RequestedReferenceType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedAttachedReference(RequestedReferenceType newRequestedAttachedReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE, newRequestedAttachedReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedAttachedReference(RequestedReferenceType newRequestedAttachedReference) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE, newRequestedAttachedReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedProofTokenType getRequestedProofToken() {
		return (RequestedProofTokenType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedProofToken(RequestedProofTokenType newRequestedProofToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN, newRequestedProofToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedProofToken(RequestedProofTokenType newRequestedProofToken) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN, newRequestedProofToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedSecurityTokenType getRequestedSecurityToken() {
		return (RequestedSecurityTokenType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedSecurityToken(RequestedSecurityTokenType newRequestedSecurityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN, newRequestedSecurityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedSecurityToken(RequestedSecurityTokenType newRequestedSecurityToken) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN, newRequestedSecurityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedTokenCancelledType getRequestedTokenCancelled() {
		return (RequestedTokenCancelledType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedTokenCancelled(RequestedTokenCancelledType newRequestedTokenCancelled, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED, newRequestedTokenCancelled, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedTokenCancelled(RequestedTokenCancelledType newRequestedTokenCancelled) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED, newRequestedTokenCancelled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedReferenceType getRequestedUnattachedReference() {
		return (RequestedReferenceType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedUnattachedReference(RequestedReferenceType newRequestedUnattachedReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE, newRequestedUnattachedReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedUnattachedReference(RequestedReferenceType newRequestedUnattachedReference) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE, newRequestedUnattachedReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestKETType getRequestKET() {
		return (RequestKETType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_KET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestKET(RequestKETType newRequestKET, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_KET, newRequestKET, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestKET(RequestKETType newRequestKET) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_KET, newRequestKET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenType getRequestSecurityToken() {
		return (RequestSecurityTokenType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestSecurityToken(RequestSecurityTokenType newRequestSecurityToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN, newRequestSecurityToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestSecurityToken(RequestSecurityTokenType newRequestSecurityToken) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN, newRequestSecurityToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenCollectionType getRequestSecurityTokenCollection() {
		return (RequestSecurityTokenCollectionType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestSecurityTokenCollection(RequestSecurityTokenCollectionType newRequestSecurityTokenCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION, newRequestSecurityTokenCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestSecurityTokenCollection(RequestSecurityTokenCollectionType newRequestSecurityTokenCollection) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION, newRequestSecurityTokenCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenResponseType getRequestSecurityTokenResponse() {
		return (RequestSecurityTokenResponseType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestSecurityTokenResponse(RequestSecurityTokenResponseType newRequestSecurityTokenResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE, newRequestSecurityTokenResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestSecurityTokenResponse(RequestSecurityTokenResponseType newRequestSecurityTokenResponse) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE, newRequestSecurityTokenResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenResponseCollectionType getRequestSecurityTokenResponseCollection() {
		return (RequestSecurityTokenResponseCollectionType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestSecurityTokenResponseCollection(RequestSecurityTokenResponseCollectionType newRequestSecurityTokenResponseCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION, newRequestSecurityTokenResponseCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestSecurityTokenResponseCollection(RequestSecurityTokenResponseCollectionType newRequestSecurityTokenResponseCollection) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION, newRequestSecurityTokenResponseCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRequestType() {
		return getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestType(Object newRequestType) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_TYPE, newRequestType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureAlgorithm() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__SIGNATURE_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__SIGNATURE_ALGORITHM, newSignatureAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignChallengeType getSignChallenge() {
		return (SignChallengeType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignChallenge(SignChallengeType newSignChallenge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE, newSignChallenge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignChallenge(SignChallengeType newSignChallenge) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE, newSignChallenge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignChallengeType getSignChallengeResponse() {
		return (SignChallengeType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignChallengeResponse(SignChallengeType newSignChallengeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE, newSignChallengeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignChallengeResponse(SignChallengeType newSignChallengeResponse) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE, newSignChallengeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignWith() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__SIGN_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignWith(String newSignWith) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__SIGN_WITH, newSignWith);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return (StatusType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusType newStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__STATUS, newStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenType() {
		return (String)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__TOKEN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenType(String newTokenType) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__TOKEN_TYPE, newTokenType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseKeyType getUseKey() {
		return (UseKeyType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__USE_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseKey(UseKeyType newUseKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__USE_KEY, newUseKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseKey(UseKeyType newUseKey) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__USE_KEY, newUseKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateTargetType getValidateTarget() {
		return (ValidateTargetType)getMixed().get(_200512Package.Literals.DOCUMENT_ROOT__VALIDATE_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateTarget(ValidateTargetType newValidateTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_200512Package.Literals.DOCUMENT_ROOT__VALIDATE_TARGET, newValidateTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateTarget(ValidateTargetType newValidateTarget) {
		((FeatureMap.Internal)getMixed()).set(_200512Package.Literals.DOCUMENT_ROOT__VALIDATE_TARGET, newValidateTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _200512Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
				return basicSetAllowPostdating(null, msgs);
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
				return basicSetAuthenticator(null, msgs);
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
				return basicSetBinaryExchange(null, msgs);
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
				return basicSetBinarySecret(null, msgs);
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
				return basicSetCancelTarget(null, msgs);
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
				return basicSetClaims(null, msgs);
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
				return basicSetDelegateTo(null, msgs);
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
				return basicSetEncryption(null, msgs);
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
				return basicSetEntropy(null, msgs);
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
				return basicSetIssuedTokens(null, msgs);
			case _200512Package.DOCUMENT_ROOT__ISSUER:
				return basicSetIssuer(null, msgs);
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
				return basicSetKeyExchangeToken(null, msgs);
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
				return basicSetLifetime(null, msgs);
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
				return basicSetParticipants(null, msgs);
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
				return basicSetProofEncryption(null, msgs);
			case _200512Package.DOCUMENT_ROOT__RENEWING:
				return basicSetRenewing(null, msgs);
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
				return basicSetRenewTarget(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
				return basicSetRequestedAttachedReference(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
				return basicSetRequestedProofToken(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
				return basicSetRequestedSecurityToken(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
				return basicSetRequestedTokenCancelled(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
				return basicSetRequestedUnattachedReference(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
				return basicSetRequestKET(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
				return basicSetRequestSecurityToken(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
				return basicSetRequestSecurityTokenCollection(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
				return basicSetRequestSecurityTokenResponse(null, msgs);
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
				return basicSetRequestSecurityTokenResponseCollection(null, msgs);
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
				return basicSetSignChallenge(null, msgs);
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
				return basicSetSignChallengeResponse(null, msgs);
			case _200512Package.DOCUMENT_ROOT__STATUS:
				return basicSetStatus(null, msgs);
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
				return basicSetUseKey(null, msgs);
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
				return basicSetValidateTarget(null, msgs);
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
			case _200512Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
				return getAllowPostdating();
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATION_TYPE:
				return getAuthenticationType();
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
				return getAuthenticator();
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
				return getBinaryExchange();
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
				return getBinarySecret();
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
				return getCancelTarget();
			case _200512Package.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM:
				return getCanonicalizationAlgorithm();
			case _200512Package.DOCUMENT_ROOT__CHALLENGE:
				return getChallenge();
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
				return getClaims();
			case _200512Package.DOCUMENT_ROOT__COMBINED_HASH:
				return getCombinedHash();
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY:
				return getComputedKey();
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM:
				return getComputedKeyAlgorithm();
			case _200512Package.DOCUMENT_ROOT__DELEGATABLE:
				return isDelegatable();
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
				return getDelegateTo();
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
				return getEncryption();
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				return getEncryptionAlgorithm();
			case _200512Package.DOCUMENT_ROOT__ENCRYPT_WITH:
				return getEncryptWith();
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
				return getEntropy();
			case _200512Package.DOCUMENT_ROOT__FORWARDABLE:
				return isForwardable();
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
				return getIssuedTokens();
			case _200512Package.DOCUMENT_ROOT__ISSUER:
				return getIssuer();
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
				return getKeyExchangeToken();
			case _200512Package.DOCUMENT_ROOT__KEY_SIZE:
				return getKeySize();
			case _200512Package.DOCUMENT_ROOT__KEY_TYPE:
				return getKeyType();
			case _200512Package.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM:
				return getKeyWrapAlgorithm();
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
				return getLifetime();
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return getOnBehalfOf();
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
				return getParticipants();
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
				return getProofEncryption();
			case _200512Package.DOCUMENT_ROOT__RENEWING:
				return getRenewing();
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
				return getRenewTarget();
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
				return getRequestedAttachedReference();
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
				return getRequestedProofToken();
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
				return getRequestedSecurityToken();
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
				return getRequestedTokenCancelled();
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
				return getRequestedUnattachedReference();
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
				return getRequestKET();
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
				return getRequestSecurityToken();
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
				return getRequestSecurityTokenCollection();
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
				return getRequestSecurityTokenResponse();
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
				return getRequestSecurityTokenResponseCollection();
			case _200512Package.DOCUMENT_ROOT__REQUEST_TYPE:
				return getRequestType();
			case _200512Package.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
				return getSignChallenge();
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
				return getSignChallengeResponse();
			case _200512Package.DOCUMENT_ROOT__SIGN_WITH:
				return getSignWith();
			case _200512Package.DOCUMENT_ROOT__STATUS:
				return getStatus();
			case _200512Package.DOCUMENT_ROOT__TOKEN_TYPE:
				return getTokenType();
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
				return getUseKey();
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
				return getValidateTarget();
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
			case _200512Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
				setAllowPostdating((AllowPostdatingType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATION_TYPE:
				setAuthenticationType((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
				setAuthenticator((AuthenticatorType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
				setBinaryExchange((BinaryExchangeType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
				setBinarySecret((BinarySecretType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
				setCancelTarget((CancelTargetType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM:
				setCanonicalizationAlgorithm((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__CHALLENGE:
				setChallenge((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
				setClaims((ClaimsType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__COMBINED_HASH:
				setCombinedHash((byte[])newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY:
				setComputedKey(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM:
				setComputedKeyAlgorithm((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__DELEGATABLE:
				setDelegatable((Boolean)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
				setDelegateTo((DelegateToType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
				setEncryption((EncryptionType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPT_WITH:
				setEncryptWith((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
				setEntropy((EntropyType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__FORWARDABLE:
				setForwardable((Boolean)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
				setIssuedTokens((RequestSecurityTokenResponseCollectionType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ISSUER:
				setIssuer((EndpointReferenceType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
				setKeyExchangeToken((KeyExchangeTokenType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_SIZE:
				setKeySize((Long)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_TYPE:
				setKeyType(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM:
				setKeyWrapAlgorithm((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
				setLifetime((LifetimeType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				setOnBehalfOf((OnBehalfOfType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
				setParticipants((ParticipantsType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
				setProofEncryption((ProofEncryptionType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__RENEWING:
				setRenewing((RenewingType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
				setRenewTarget((RenewTargetType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
				setRequestedAttachedReference((RequestedReferenceType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
				setRequestedProofToken((RequestedProofTokenType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
				setRequestedSecurityToken((RequestedSecurityTokenType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
				setRequestedTokenCancelled((RequestedTokenCancelledType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
				setRequestedUnattachedReference((RequestedReferenceType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
				setRequestKET((RequestKETType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
				setRequestSecurityToken((RequestSecurityTokenType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
				setRequestSecurityTokenCollection((RequestSecurityTokenCollectionType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
				setRequestSecurityTokenResponse((RequestSecurityTokenResponseType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
				setRequestSecurityTokenResponseCollection((RequestSecurityTokenResponseCollectionType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_TYPE:
				setRequestType(newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
				setSignChallenge((SignChallengeType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
				setSignChallengeResponse((SignChallengeType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_WITH:
				setSignWith((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__STATUS:
				setStatus((StatusType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__TOKEN_TYPE:
				setTokenType((String)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
				setUseKey((UseKeyType)newValue);
				return;
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
				setValidateTarget((ValidateTargetType)newValue);
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
			case _200512Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
				setAllowPostdating((AllowPostdatingType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATION_TYPE:
				setAuthenticationType(AUTHENTICATION_TYPE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
				setAuthenticator((AuthenticatorType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
				setBinaryExchange((BinaryExchangeType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
				setBinarySecret((BinarySecretType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
				setCancelTarget((CancelTargetType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM:
				setCanonicalizationAlgorithm(CANONICALIZATION_ALGORITHM_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__CHALLENGE:
				setChallenge(CHALLENGE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
				setClaims((ClaimsType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__COMBINED_HASH:
				setCombinedHash(COMBINED_HASH_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY:
				setComputedKey(COMPUTED_KEY_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM:
				setComputedKeyAlgorithm(COMPUTED_KEY_ALGORITHM_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__DELEGATABLE:
				setDelegatable(DELEGATABLE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
				setDelegateTo((DelegateToType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
				setEncryption((EncryptionType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm(ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__ENCRYPT_WITH:
				setEncryptWith(ENCRYPT_WITH_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
				setEntropy((EntropyType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__FORWARDABLE:
				setForwardable(FORWARDABLE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
				setIssuedTokens((RequestSecurityTokenResponseCollectionType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__ISSUER:
				setIssuer((EndpointReferenceType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
				setKeyExchangeToken((KeyExchangeTokenType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_SIZE:
				setKeySize(KEY_SIZE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_TYPE:
				setKeyType(KEY_TYPE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM:
				setKeyWrapAlgorithm(KEY_WRAP_ALGORITHM_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
				setLifetime((LifetimeType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				setOnBehalfOf((OnBehalfOfType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
				setParticipants((ParticipantsType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
				setProofEncryption((ProofEncryptionType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__RENEWING:
				setRenewing((RenewingType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
				setRenewTarget((RenewTargetType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
				setRequestedAttachedReference((RequestedReferenceType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
				setRequestedProofToken((RequestedProofTokenType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
				setRequestedSecurityToken((RequestedSecurityTokenType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
				setRequestedTokenCancelled((RequestedTokenCancelledType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
				setRequestedUnattachedReference((RequestedReferenceType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
				setRequestKET((RequestKETType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
				setRequestSecurityToken((RequestSecurityTokenType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
				setRequestSecurityTokenCollection((RequestSecurityTokenCollectionType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
				setRequestSecurityTokenResponse((RequestSecurityTokenResponseType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
				setRequestSecurityTokenResponseCollection((RequestSecurityTokenResponseCollectionType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__REQUEST_TYPE:
				setRequestType(REQUEST_TYPE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
				setSignChallenge((SignChallengeType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
				setSignChallengeResponse((SignChallengeType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__SIGN_WITH:
				setSignWith(SIGN_WITH_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__STATUS:
				setStatus((StatusType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__TOKEN_TYPE:
				setTokenType(TOKEN_TYPE_EDEFAULT);
				return;
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
				setUseKey((UseKeyType)null);
				return;
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
				setValidateTarget((ValidateTargetType)null);
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
			case _200512Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _200512Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _200512Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
				return getAllowPostdating() != null;
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATION_TYPE:
				return AUTHENTICATION_TYPE_EDEFAULT == null ? getAuthenticationType() != null : !AUTHENTICATION_TYPE_EDEFAULT.equals(getAuthenticationType());
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
				return getAuthenticator() != null;
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
				return getBinaryExchange() != null;
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
				return getBinarySecret() != null;
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
				return getCancelTarget() != null;
			case _200512Package.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM:
				return CANONICALIZATION_ALGORITHM_EDEFAULT == null ? getCanonicalizationAlgorithm() != null : !CANONICALIZATION_ALGORITHM_EDEFAULT.equals(getCanonicalizationAlgorithm());
			case _200512Package.DOCUMENT_ROOT__CHALLENGE:
				return CHALLENGE_EDEFAULT == null ? getChallenge() != null : !CHALLENGE_EDEFAULT.equals(getChallenge());
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
				return getClaims() != null;
			case _200512Package.DOCUMENT_ROOT__COMBINED_HASH:
				return COMBINED_HASH_EDEFAULT == null ? getCombinedHash() != null : !COMBINED_HASH_EDEFAULT.equals(getCombinedHash());
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY:
				return COMPUTED_KEY_EDEFAULT == null ? getComputedKey() != null : !COMPUTED_KEY_EDEFAULT.equals(getComputedKey());
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM:
				return COMPUTED_KEY_ALGORITHM_EDEFAULT == null ? getComputedKeyAlgorithm() != null : !COMPUTED_KEY_ALGORITHM_EDEFAULT.equals(getComputedKeyAlgorithm());
			case _200512Package.DOCUMENT_ROOT__DELEGATABLE:
				return isDelegatable() != DELEGATABLE_EDEFAULT;
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
				return getDelegateTo() != null;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
				return getEncryption() != null;
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				return ENCRYPTION_ALGORITHM_EDEFAULT == null ? getEncryptionAlgorithm() != null : !ENCRYPTION_ALGORITHM_EDEFAULT.equals(getEncryptionAlgorithm());
			case _200512Package.DOCUMENT_ROOT__ENCRYPT_WITH:
				return ENCRYPT_WITH_EDEFAULT == null ? getEncryptWith() != null : !ENCRYPT_WITH_EDEFAULT.equals(getEncryptWith());
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
				return getEntropy() != null;
			case _200512Package.DOCUMENT_ROOT__FORWARDABLE:
				return isForwardable() != FORWARDABLE_EDEFAULT;
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
				return getIssuedTokens() != null;
			case _200512Package.DOCUMENT_ROOT__ISSUER:
				return getIssuer() != null;
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
				return getKeyExchangeToken() != null;
			case _200512Package.DOCUMENT_ROOT__KEY_SIZE:
				return getKeySize() != KEY_SIZE_EDEFAULT;
			case _200512Package.DOCUMENT_ROOT__KEY_TYPE:
				return KEY_TYPE_EDEFAULT == null ? getKeyType() != null : !KEY_TYPE_EDEFAULT.equals(getKeyType());
			case _200512Package.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM:
				return KEY_WRAP_ALGORITHM_EDEFAULT == null ? getKeyWrapAlgorithm() != null : !KEY_WRAP_ALGORITHM_EDEFAULT.equals(getKeyWrapAlgorithm());
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
				return getLifetime() != null;
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
				return getOnBehalfOf() != null;
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
				return getParticipants() != null;
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
				return getProofEncryption() != null;
			case _200512Package.DOCUMENT_ROOT__RENEWING:
				return getRenewing() != null;
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
				return getRenewTarget() != null;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
				return getRequestedAttachedReference() != null;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
				return getRequestedProofToken() != null;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
				return getRequestedSecurityToken() != null;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
				return getRequestedTokenCancelled() != null;
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
				return getRequestedUnattachedReference() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
				return getRequestKET() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
				return getRequestSecurityToken() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
				return getRequestSecurityTokenCollection() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
				return getRequestSecurityTokenResponse() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
				return getRequestSecurityTokenResponseCollection() != null;
			case _200512Package.DOCUMENT_ROOT__REQUEST_TYPE:
				return REQUEST_TYPE_EDEFAULT == null ? getRequestType() != null : !REQUEST_TYPE_EDEFAULT.equals(getRequestType());
			case _200512Package.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? getSignatureAlgorithm() != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(getSignatureAlgorithm());
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
				return getSignChallenge() != null;
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
				return getSignChallengeResponse() != null;
			case _200512Package.DOCUMENT_ROOT__SIGN_WITH:
				return SIGN_WITH_EDEFAULT == null ? getSignWith() != null : !SIGN_WITH_EDEFAULT.equals(getSignWith());
			case _200512Package.DOCUMENT_ROOT__STATUS:
				return getStatus() != null;
			case _200512Package.DOCUMENT_ROOT__TOKEN_TYPE:
				return TOKEN_TYPE_EDEFAULT == null ? getTokenType() != null : !TOKEN_TYPE_EDEFAULT.equals(getTokenType());
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
				return getUseKey() != null;
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
				return getValidateTarget() != null;
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
