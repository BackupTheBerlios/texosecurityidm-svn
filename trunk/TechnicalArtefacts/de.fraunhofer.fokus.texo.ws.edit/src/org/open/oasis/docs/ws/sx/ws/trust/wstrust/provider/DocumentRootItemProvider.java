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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust.provider;


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

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Factory;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.w3._2005._08.wsaddressing.AddressingFactory;

import org.xmlsoap.schemas.soap.soapenvelope.provider.WssecurityEditPlugin;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot} object.
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

			addAuthenticationTypePropertyDescriptor(object);
			addCanonicalizationAlgorithmPropertyDescriptor(object);
			addChallengePropertyDescriptor(object);
			addCombinedHashPropertyDescriptor(object);
			addComputedKeyPropertyDescriptor(object);
			addComputedKeyAlgorithmPropertyDescriptor(object);
			addDelegatablePropertyDescriptor(object);
			addEncryptionAlgorithmPropertyDescriptor(object);
			addEncryptWithPropertyDescriptor(object);
			addForwardablePropertyDescriptor(object);
			addKeySizePropertyDescriptor(object);
			addKeyTypePropertyDescriptor(object);
			addKeyWrapAlgorithmPropertyDescriptor(object);
			addRequestTypePropertyDescriptor(object);
			addSignatureAlgorithmPropertyDescriptor(object);
			addSignWithPropertyDescriptor(object);
			addTokenTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authentication Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_authenticationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_authenticationType_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Canonicalization Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanonicalizationAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_canonicalizationAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_canonicalizationAlgorithm_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Challenge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChallengePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_challenge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_challenge_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__CHALLENGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combined Hash feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinedHashPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_combinedHash_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_combinedHash_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__COMBINED_HASH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computed Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputedKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_computedKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_computedKey_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computed Key Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputedKeyAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_computedKeyAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_computedKeyAlgorithm_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delegatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_delegatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_delegatable_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__DELEGATABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encryption Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_encryptionAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_encryptionAlgorithm_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encrypt With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_encryptWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_encryptWith_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__ENCRYPT_WITH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forwardable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForwardablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_forwardable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_forwardable_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__FORWARDABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_keySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_keySize_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__KEY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_keyType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_keyType_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__KEY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Wrap Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyWrapAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_keyWrapAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_keyWrapAlgorithm_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Request Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_requestType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_requestType_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__REQUEST_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignatureAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_signatureAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_signatureAlgorithm_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__SIGNATURE_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sign With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_signWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_signWith_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__SIGN_WITH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Token Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokenTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_tokenType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_tokenType_feature", "_UI_DocumentRoot_type"),
				 _200512Package.Literals.DOCUMENT_ROOT__TOKEN_TYPE,
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
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ALLOW_POSTDATING);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATOR);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__BINARY_EXCHANGE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__BINARY_SECRET);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__CANCEL_TARGET);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__CLAIMS);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__DELEGATE_TO);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ENTROPY);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ISSUER);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__LIFETIME);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__ON_BEHALF_OF);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__PARTICIPANTS);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__PROOF_ENCRYPTION);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__RENEWING);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__RENEW_TARGET);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_KET);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__STATUS);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__USE_KEY);
			childrenFeatures.add(_200512Package.Literals.DOCUMENT_ROOT__VALIDATE_TARGET);
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
		String label = ((DocumentRoot)object).getAuthenticationType();
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
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATION_TYPE:
			case _200512Package.DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM:
			case _200512Package.DOCUMENT_ROOT__CHALLENGE:
			case _200512Package.DOCUMENT_ROOT__COMBINED_HASH:
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY:
			case _200512Package.DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM:
			case _200512Package.DOCUMENT_ROOT__DELEGATABLE:
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
			case _200512Package.DOCUMENT_ROOT__ENCRYPT_WITH:
			case _200512Package.DOCUMENT_ROOT__FORWARDABLE:
			case _200512Package.DOCUMENT_ROOT__KEY_SIZE:
			case _200512Package.DOCUMENT_ROOT__KEY_TYPE:
			case _200512Package.DOCUMENT_ROOT__KEY_WRAP_ALGORITHM:
			case _200512Package.DOCUMENT_ROOT__REQUEST_TYPE:
			case _200512Package.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
			case _200512Package.DOCUMENT_ROOT__SIGN_WITH:
			case _200512Package.DOCUMENT_ROOT__TOKEN_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _200512Package.DOCUMENT_ROOT__ALLOW_POSTDATING:
			case _200512Package.DOCUMENT_ROOT__AUTHENTICATOR:
			case _200512Package.DOCUMENT_ROOT__BINARY_EXCHANGE:
			case _200512Package.DOCUMENT_ROOT__BINARY_SECRET:
			case _200512Package.DOCUMENT_ROOT__CANCEL_TARGET:
			case _200512Package.DOCUMENT_ROOT__CLAIMS:
			case _200512Package.DOCUMENT_ROOT__DELEGATE_TO:
			case _200512Package.DOCUMENT_ROOT__ENCRYPTION:
			case _200512Package.DOCUMENT_ROOT__ENTROPY:
			case _200512Package.DOCUMENT_ROOT__ISSUED_TOKENS:
			case _200512Package.DOCUMENT_ROOT__ISSUER:
			case _200512Package.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN:
			case _200512Package.DOCUMENT_ROOT__LIFETIME:
			case _200512Package.DOCUMENT_ROOT__ON_BEHALF_OF:
			case _200512Package.DOCUMENT_ROOT__PARTICIPANTS:
			case _200512Package.DOCUMENT_ROOT__PROOF_ENCRYPTION:
			case _200512Package.DOCUMENT_ROOT__RENEWING:
			case _200512Package.DOCUMENT_ROOT__RENEW_TARGET:
			case _200512Package.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE:
			case _200512Package.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN:
			case _200512Package.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN:
			case _200512Package.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED:
			case _200512Package.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE:
			case _200512Package.DOCUMENT_ROOT__REQUEST_KET:
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN:
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION:
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE:
			case _200512Package.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION:
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE:
			case _200512Package.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE:
			case _200512Package.DOCUMENT_ROOT__STATUS:
			case _200512Package.DOCUMENT_ROOT__USE_KEY:
			case _200512Package.DOCUMENT_ROOT__VALIDATE_TARGET:
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
				(_200512Package.Literals.DOCUMENT_ROOT__ALLOW_POSTDATING,
				 _200512Factory.eINSTANCE.createAllowPostdatingType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__AUTHENTICATOR,
				 _200512Factory.eINSTANCE.createAuthenticatorType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__BINARY_EXCHANGE,
				 _200512Factory.eINSTANCE.createBinaryExchangeType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__BINARY_SECRET,
				 _200512Factory.eINSTANCE.createBinarySecretType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__CANCEL_TARGET,
				 _200512Factory.eINSTANCE.createCancelTargetType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__CLAIMS,
				 _200512Factory.eINSTANCE.createClaimsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__DELEGATE_TO,
				 _200512Factory.eINSTANCE.createDelegateToType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__ENCRYPTION,
				 _200512Factory.eINSTANCE.createEncryptionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__ENTROPY,
				 _200512Factory.eINSTANCE.createEntropyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS,
				 _200512Factory.eINSTANCE.createRequestSecurityTokenResponseCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__ISSUER,
				 AddressingFactory.eINSTANCE.createEndpointReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN,
				 _200512Factory.eINSTANCE.createKeyExchangeTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__LIFETIME,
				 _200512Factory.eINSTANCE.createLifetimeType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__ON_BEHALF_OF,
				 _200512Factory.eINSTANCE.createOnBehalfOfType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__PARTICIPANTS,
				 _200512Factory.eINSTANCE.createParticipantsType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__PROOF_ENCRYPTION,
				 _200512Factory.eINSTANCE.createProofEncryptionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__RENEWING,
				 _200512Factory.eINSTANCE.createRenewingType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__RENEW_TARGET,
				 _200512Factory.eINSTANCE.createRenewTargetType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE,
				 _200512Factory.eINSTANCE.createRequestedReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN,
				 _200512Factory.eINSTANCE.createRequestedProofTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN,
				 _200512Factory.eINSTANCE.createRequestedSecurityTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED,
				 _200512Factory.eINSTANCE.createRequestedTokenCancelledType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE,
				 _200512Factory.eINSTANCE.createRequestedReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_KET,
				 _200512Factory.eINSTANCE.createRequestKETType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN,
				 _200512Factory.eINSTANCE.createRequestSecurityTokenType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION,
				 _200512Factory.eINSTANCE.createRequestSecurityTokenCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE,
				 _200512Factory.eINSTANCE.createRequestSecurityTokenResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION,
				 _200512Factory.eINSTANCE.createRequestSecurityTokenResponseCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE,
				 _200512Factory.eINSTANCE.createSignChallengeType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE,
				 _200512Factory.eINSTANCE.createSignChallengeType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__STATUS,
				 _200512Factory.eINSTANCE.createStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__USE_KEY,
				 _200512Factory.eINSTANCE.createUseKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(_200512Package.Literals.DOCUMENT_ROOT__VALIDATE_TARGET,
				 _200512Factory.eINSTANCE.createValidateTargetType()));
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
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__ISSUED_TOKENS ||
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION ||
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE ||
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE ||
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE ||
			childFeature == _200512Package.Literals.DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE;

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
