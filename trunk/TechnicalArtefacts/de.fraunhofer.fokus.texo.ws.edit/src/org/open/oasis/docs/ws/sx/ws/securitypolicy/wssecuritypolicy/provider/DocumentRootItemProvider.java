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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Factory;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.xmlsoap.schemas.soap.soapenvelope.provider.WssecurityEditPlugin;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

			addIncludeTokenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Include Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_includeToken_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_includeToken_feature", "_UI_DocumentRoot_type"),
				 _200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TOKEN,
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
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC128);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC192);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC256);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__LAX);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__LAYOUT);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__STRICT);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__TRUST13);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__XPATH10);
			childrenFeatures.add(_200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((DocumentRoot)object).getIncludeToken();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TOKEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _200702Package.DOCUMENT_ROOT__ABS_XPATH:
			case _200702Package.DOCUMENT_ROOT__ALGORITHM_SUITE:
			case _200702Package.DOCUMENT_ROOT__ASYMMETRIC_BINDING:
			case _200702Package.DOCUMENT_ROOT__BASIC128:
			case _200702Package.DOCUMENT_ROOT__BASIC128_RSA15:
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256:
			case _200702Package.DOCUMENT_ROOT__BASIC128_SHA256_RSA15:
			case _200702Package.DOCUMENT_ROOT__BASIC192:
			case _200702Package.DOCUMENT_ROOT__BASIC192_RSA15:
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256:
			case _200702Package.DOCUMENT_ROOT__BASIC192_SHA256_RSA15:
			case _200702Package.DOCUMENT_ROOT__BASIC256:
			case _200702Package.DOCUMENT_ROOT__BASIC256_RSA15:
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256:
			case _200702Package.DOCUMENT_ROOT__BASIC256_SHA256_RSA15:
			case _200702Package.DOCUMENT_ROOT__BOOTSTRAP_POLICY:
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING:
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS:
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_PARTS:
			case _200702Package.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__ENCRYPTION_TOKEN:
			case _200702Package.DOCUMENT_ROOT__ENCRYPT_SIGNATURE:
			case _200702Package.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__HASH_PASSWORD:
			case _200702Package.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION:
			case _200702Package.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION:
			case _200702Package.DOCUMENT_ROOT__HTTPS_TOKEN:
			case _200702Package.DOCUMENT_ROOT__INCLUDE_TIMESTAMP:
			case _200702Package.DOCUMENT_ROOT__INCLUSIVE_C14N:
			case _200702Package.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN:
			case _200702Package.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN:
			case _200702Package.DOCUMENT_ROOT__INITIATOR_TOKEN:
			case _200702Package.DOCUMENT_ROOT__ISSUED_TOKEN:
			case _200702Package.DOCUMENT_ROOT__KERBEROS_TOKEN:
			case _200702Package.DOCUMENT_ROOT__KEY_VALUE_TOKEN:
			case _200702Package.DOCUMENT_ROOT__LAX:
			case _200702Package.DOCUMENT_ROOT__LAX_TS_FIRST:
			case _200702Package.DOCUMENT_ROOT__LAX_TS_LAST:
			case _200702Package.DOCUMENT_ROOT__LAYOUT:
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND:
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL:
			case _200702Package.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT:
			case _200702Package.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE:
			case _200702Package.DOCUMENT_ROOT__NO_PASSWORD:
			case _200702Package.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY:
			case _200702Package.DOCUMENT_ROOT__PROTECTION_TOKEN:
			case _200702Package.DOCUMENT_ROOT__PROTECT_TOKENS:
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN:
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN:
			case _200702Package.DOCUMENT_ROOT__RECIPIENT_TOKEN:
			case _200702Package.DOCUMENT_ROOT__REL_TOKEN:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_APPIES_TO:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY:
			case _200702Package.DOCUMENT_ROOT__REQUIRED_ELEMENTS:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION:
			case _200702Package.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE:
			case _200702Package.DOCUMENT_ROOT__RSA_KEY_VALUE:
			case _200702Package.DOCUMENT_ROOT__SAML_TOKEN:
			case _200702Package.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN:
			case _200702Package.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN:
			case _200702Package.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN:
			case _200702Package.DOCUMENT_ROOT__SIGNATURE_TOKEN:
			case _200702Package.DOCUMENT_ROOT__SIGNED_ELEMENTS:
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__SIGNED_PARTS:
			case _200702Package.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__SOAP_NORMALIZATION10:
			case _200702Package.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN:
			case _200702Package.DOCUMENT_ROOT__STRICT:
			case _200702Package.DOCUMENT_ROOT__STR_TRANSFORM10:
			case _200702Package.DOCUMENT_ROOT__SUPPORTING_TOKENS:
			case _200702Package.DOCUMENT_ROOT__SYMMETRIC_BINDING:
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_BINDING:
			case _200702Package.DOCUMENT_ROOT__TRANSPORT_TOKEN:
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES:
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_RSA15:
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256:
			case _200702Package.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15:
			case _200702Package.DOCUMENT_ROOT__TRUST13:
			case _200702Package.DOCUMENT_ROOT__USERNAME_TOKEN:
			case _200702Package.DOCUMENT_ROOT__WSS10:
			case _200702Package.DOCUMENT_ROOT__WSS11:
			case _200702Package.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_X509V1_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN10:
			case _200702Package.DOCUMENT_ROOT__WSS_X509V3_TOKEN11:
			case _200702Package.DOCUMENT_ROOT__X509_TOKEN:
			case _200702Package.DOCUMENT_ROOT__XPATH10:
			case _200702Package.DOCUMENT_ROOT__XPATH_FILTER20:
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

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ABS_XPATH,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ALGORITHM_SUITE,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ASYMMETRIC_BINDING,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC128,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC128_SHA256_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC192,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC192_SHA256_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC256,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BASIC256_SHA256_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__BOOTSTRAP_POLICY,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_ELEMENTS,
				 _200702Factory.eINSTANCE.createSerElementsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_PARTS,
				 _200702Factory.eINSTANCE.createSePartsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPTION_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENCRYPT_SIGNATURE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__HASH_PASSWORD,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__HTTPS_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__INCLUDE_TIMESTAMP,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__INCLUSIVE_C14N,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__INITIATOR_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ISSUED_TOKEN,
				 _200702Factory.eINSTANCE.createIssuedTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__KERBEROS_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__KEY_VALUE_TOKEN,
				 _200702Factory.eINSTANCE.createKeyValueTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__LAX,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_FIRST,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__LAX_TS_LAST,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__LAYOUT,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_AMEND,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_NOT_SEND_RENEW,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__NO_PASSWORD,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__PROTECTION_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__PROTECT_TOKENS,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__RECIPIENT_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REL_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_APPIES_TO,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRED_ELEMENTS,
				 _200702Factory.eINSTANCE.createSerElementsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SAML_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN,
				 _200702Factory.eINSTANCE.createSecureConversationTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNATURE_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ELEMENTS,
				 _200702Factory.eINSTANCE.createSerElementsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_PARTS,
				 _200702Factory.eINSTANCE.createSePartsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SOAP_NORMALIZATION10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN,
				 _200702Factory.eINSTANCE.createSpnegoContextTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__STRICT,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__STR_TRANSFORM10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SUPPORTING_TOKENS,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__SYMMETRIC_BINDING,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_BINDING,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRANSPORT_TOKEN,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__TRUST13,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__USERNAME_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS10,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS11,
				 _200702Factory.eINSTANCE.createNestedPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V10_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_REL_V20_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_USERNAME_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V1_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__WSS_X509V3_TOKEN11,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN,
				 _200702Factory.eINSTANCE.createTokenAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__XPATH10,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200702Package.Literals.DOCUMENT_ROOT__XPATH_FILTER20,
				 _200702Factory.eINSTANCE.createQNameAssertionType()));
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

		boolean qualify =
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
			childFeature == _200702Package.Literals.DOCUMENT_ROOT__X509_TOKEN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WssecurityEditPlugin.INSTANCE;
	}

}
