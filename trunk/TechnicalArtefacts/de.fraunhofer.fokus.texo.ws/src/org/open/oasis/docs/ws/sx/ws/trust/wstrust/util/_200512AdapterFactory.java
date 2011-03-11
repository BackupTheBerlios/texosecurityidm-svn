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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package
 * @generated
 */
public class _200512AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _200512Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _200512Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _200512Switch<Adapter> modelSwitch =
		new _200512Switch<Adapter>() {
			@Override
			public Adapter caseAllowPostdatingType(AllowPostdatingType object) {
				return createAllowPostdatingTypeAdapter();
			}
			@Override
			public Adapter caseAuthenticatorType(AuthenticatorType object) {
				return createAuthenticatorTypeAdapter();
			}
			@Override
			public Adapter caseBinaryExchangeType(BinaryExchangeType object) {
				return createBinaryExchangeTypeAdapter();
			}
			@Override
			public Adapter caseBinarySecretType(BinarySecretType object) {
				return createBinarySecretTypeAdapter();
			}
			@Override
			public Adapter caseCancelTargetType(CancelTargetType object) {
				return createCancelTargetTypeAdapter();
			}
			@Override
			public Adapter caseClaimsType(ClaimsType object) {
				return createClaimsTypeAdapter();
			}
			@Override
			public Adapter caseDelegateToType(DelegateToType object) {
				return createDelegateToTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEncryptionType(EncryptionType object) {
				return createEncryptionTypeAdapter();
			}
			@Override
			public Adapter caseEntropyType(EntropyType object) {
				return createEntropyTypeAdapter();
			}
			@Override
			public Adapter caseKeyExchangeTokenType(KeyExchangeTokenType object) {
				return createKeyExchangeTokenTypeAdapter();
			}
			@Override
			public Adapter caseLifetimeType(LifetimeType object) {
				return createLifetimeTypeAdapter();
			}
			@Override
			public Adapter caseOnBehalfOfType(OnBehalfOfType object) {
				return createOnBehalfOfTypeAdapter();
			}
			@Override
			public Adapter caseParticipantsType(ParticipantsType object) {
				return createParticipantsTypeAdapter();
			}
			@Override
			public Adapter caseParticipantType(ParticipantType object) {
				return createParticipantTypeAdapter();
			}
			@Override
			public Adapter caseProofEncryptionType(ProofEncryptionType object) {
				return createProofEncryptionTypeAdapter();
			}
			@Override
			public Adapter caseRenewingType(RenewingType object) {
				return createRenewingTypeAdapter();
			}
			@Override
			public Adapter caseRenewTargetType(RenewTargetType object) {
				return createRenewTargetTypeAdapter();
			}
			@Override
			public Adapter caseRequestedProofTokenType(RequestedProofTokenType object) {
				return createRequestedProofTokenTypeAdapter();
			}
			@Override
			public Adapter caseRequestedReferenceType(RequestedReferenceType object) {
				return createRequestedReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRequestedSecurityTokenType(RequestedSecurityTokenType object) {
				return createRequestedSecurityTokenTypeAdapter();
			}
			@Override
			public Adapter caseRequestedTokenCancelledType(RequestedTokenCancelledType object) {
				return createRequestedTokenCancelledTypeAdapter();
			}
			@Override
			public Adapter caseRequestKETType(RequestKETType object) {
				return createRequestKETTypeAdapter();
			}
			@Override
			public Adapter caseRequestSecurityTokenCollectionType(RequestSecurityTokenCollectionType object) {
				return createRequestSecurityTokenCollectionTypeAdapter();
			}
			@Override
			public Adapter caseRequestSecurityTokenResponseCollectionType(RequestSecurityTokenResponseCollectionType object) {
				return createRequestSecurityTokenResponseCollectionTypeAdapter();
			}
			@Override
			public Adapter caseRequestSecurityTokenResponseType(RequestSecurityTokenResponseType object) {
				return createRequestSecurityTokenResponseTypeAdapter();
			}
			@Override
			public Adapter caseRequestSecurityTokenType(RequestSecurityTokenType object) {
				return createRequestSecurityTokenTypeAdapter();
			}
			@Override
			public Adapter caseSignChallengeType(SignChallengeType object) {
				return createSignChallengeTypeAdapter();
			}
			@Override
			public Adapter caseStatusType(StatusType object) {
				return createStatusTypeAdapter();
			}
			@Override
			public Adapter caseUseKeyType(UseKeyType object) {
				return createUseKeyTypeAdapter();
			}
			@Override
			public Adapter caseValidateTargetType(ValidateTargetType object) {
				return createValidateTargetTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType <em>Allow Postdating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType
	 * @generated
	 */
	public Adapter createAllowPostdatingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType <em>Authenticator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType
	 * @generated
	 */
	public Adapter createAuthenticatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType <em>Binary Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType
	 * @generated
	 */
	public Adapter createBinaryExchangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType <em>Binary Secret Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType
	 * @generated
	 */
	public Adapter createBinarySecretTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType <em>Cancel Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType
	 * @generated
	 */
	public Adapter createCancelTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType <em>Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType
	 * @generated
	 */
	public Adapter createClaimsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType <em>Delegate To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType
	 * @generated
	 */
	public Adapter createDelegateToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType <em>Encryption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType
	 * @generated
	 */
	public Adapter createEncryptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType <em>Entropy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType
	 * @generated
	 */
	public Adapter createEntropyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType <em>Key Exchange Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType
	 * @generated
	 */
	public Adapter createKeyExchangeTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType <em>Lifetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType
	 * @generated
	 */
	public Adapter createLifetimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType <em>On Behalf Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType
	 * @generated
	 */
	public Adapter createOnBehalfOfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType <em>Participants Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType
	 * @generated
	 */
	public Adapter createParticipantsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType
	 * @generated
	 */
	public Adapter createParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType <em>Proof Encryption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType
	 * @generated
	 */
	public Adapter createProofEncryptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType <em>Renewing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType
	 * @generated
	 */
	public Adapter createRenewingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType <em>Renew Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType
	 * @generated
	 */
	public Adapter createRenewTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType <em>Requested Proof Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType
	 * @generated
	 */
	public Adapter createRequestedProofTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType <em>Requested Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType
	 * @generated
	 */
	public Adapter createRequestedReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType <em>Requested Security Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType
	 * @generated
	 */
	public Adapter createRequestedSecurityTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType <em>Requested Token Cancelled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType
	 * @generated
	 */
	public Adapter createRequestedTokenCancelledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType <em>Request KET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType
	 * @generated
	 */
	public Adapter createRequestKETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType <em>Request Security Token Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType
	 * @generated
	 */
	public Adapter createRequestSecurityTokenCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType <em>Request Security Token Response Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType
	 * @generated
	 */
	public Adapter createRequestSecurityTokenResponseCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType <em>Request Security Token Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType
	 * @generated
	 */
	public Adapter createRequestSecurityTokenResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType <em>Request Security Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType
	 * @generated
	 */
	public Adapter createRequestSecurityTokenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType <em>Sign Challenge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType
	 * @generated
	 */
	public Adapter createSignChallengeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType
	 * @generated
	 */
	public Adapter createStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType <em>Use Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType
	 * @generated
	 */
	public Adapter createUseKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType <em>Validate Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType
	 * @generated
	 */
	public Adapter createValidateTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_200512AdapterFactory
