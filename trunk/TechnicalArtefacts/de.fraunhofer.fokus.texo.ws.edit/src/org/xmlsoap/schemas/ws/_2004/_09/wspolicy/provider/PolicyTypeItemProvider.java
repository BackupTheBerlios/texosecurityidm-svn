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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;
import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType;

/**
 * This is the item provider adapter for a {@link org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyTypeItemProvider
	extends OperatorContentTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolicyType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolicyType_id_feature", "_UI_PolicyType_type"),
				 PolicyPackage.Literals.POLICY_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolicyType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolicyType_name_feature", "_UI_PolicyType_type"),
				 PolicyPackage.Literals.POLICY_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PolicyPackage.Literals.POLICY_TYPE__ANY_ATTRIBUTE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PolicyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolicyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PolicyType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PolicyType_type") :
			getString("_UI_PolicyType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PolicyType.class)) {
			case PolicyPackage.POLICY_TYPE__ID:
			case PolicyPackage.POLICY_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PolicyPackage.POLICY_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__ALL ||
			childFeature == PolicyPackage.Literals.OPERATOR_CONTENT_TYPE__EXACTLY_ONE ||
			childFeature == EnvelopePackage.Literals.DOCUMENT_ROOT__BODY ||
			childFeature == EnvelopePackage.Literals.DOCUMENT_ROOT__ENVELOPE ||
			childFeature == EnvelopePackage.Literals.DOCUMENT_ROOT__FAULT ||
			childFeature == EnvelopePackage.Literals.DOCUMENT_ROOT__HEADER ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__EMBEDDED ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__PASSWORD ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__REFERENCE ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__SECURITY ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__NONCE1 ||
			childFeature == _0Package.Literals.DOCUMENT_ROOT__KEY_IDENTIFIER1 ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS ||
			childFeature == XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__TIMESTAMP ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__CREATED1 ||
			childFeature == org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.Literals.DOCUMENT_ROOT__EXPIRES1 ||
			childFeature == UtilityPackage.Literals.DOCUMENT_ROOT__CREATED ||
			childFeature == UtilityPackage.Literals.DOCUMENT_ROOT__EXPIRES ||
			childFeature == UtilityPackage.Literals.DOCUMENT_ROOT__TIMESTAMP ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__METADATA ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM1 ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO1 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC128 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC192 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC256 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__LAX ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__STRICT ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__XPATH10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__LAYOUT ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__TRUST13 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS10 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__WSS11 ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN ||
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
