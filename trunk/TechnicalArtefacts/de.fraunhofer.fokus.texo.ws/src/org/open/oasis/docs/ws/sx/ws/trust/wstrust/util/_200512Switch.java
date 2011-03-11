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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package
 * @generated
 */
public class _200512Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _200512Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512Switch() {
		if (modelPackage == null) {
			modelPackage = _200512Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _200512Package.ALLOW_POSTDATING_TYPE: {
				AllowPostdatingType allowPostdatingType = (AllowPostdatingType)theEObject;
				T result = caseAllowPostdatingType(allowPostdatingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.AUTHENTICATOR_TYPE: {
				AuthenticatorType authenticatorType = (AuthenticatorType)theEObject;
				T result = caseAuthenticatorType(authenticatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.BINARY_EXCHANGE_TYPE: {
				BinaryExchangeType binaryExchangeType = (BinaryExchangeType)theEObject;
				T result = caseBinaryExchangeType(binaryExchangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.BINARY_SECRET_TYPE: {
				BinarySecretType binarySecretType = (BinarySecretType)theEObject;
				T result = caseBinarySecretType(binarySecretType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.CANCEL_TARGET_TYPE: {
				CancelTargetType cancelTargetType = (CancelTargetType)theEObject;
				T result = caseCancelTargetType(cancelTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.CLAIMS_TYPE: {
				ClaimsType claimsType = (ClaimsType)theEObject;
				T result = caseClaimsType(claimsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.DELEGATE_TO_TYPE: {
				DelegateToType delegateToType = (DelegateToType)theEObject;
				T result = caseDelegateToType(delegateToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.ENCRYPTION_TYPE: {
				EncryptionType encryptionType = (EncryptionType)theEObject;
				T result = caseEncryptionType(encryptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.ENTROPY_TYPE: {
				EntropyType entropyType = (EntropyType)theEObject;
				T result = caseEntropyType(entropyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.KEY_EXCHANGE_TOKEN_TYPE: {
				KeyExchangeTokenType keyExchangeTokenType = (KeyExchangeTokenType)theEObject;
				T result = caseKeyExchangeTokenType(keyExchangeTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.LIFETIME_TYPE: {
				LifetimeType lifetimeType = (LifetimeType)theEObject;
				T result = caseLifetimeType(lifetimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.ON_BEHALF_OF_TYPE: {
				OnBehalfOfType onBehalfOfType = (OnBehalfOfType)theEObject;
				T result = caseOnBehalfOfType(onBehalfOfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.PARTICIPANTS_TYPE: {
				ParticipantsType participantsType = (ParticipantsType)theEObject;
				T result = caseParticipantsType(participantsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.PARTICIPANT_TYPE: {
				ParticipantType participantType = (ParticipantType)theEObject;
				T result = caseParticipantType(participantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.PROOF_ENCRYPTION_TYPE: {
				ProofEncryptionType proofEncryptionType = (ProofEncryptionType)theEObject;
				T result = caseProofEncryptionType(proofEncryptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.RENEWING_TYPE: {
				RenewingType renewingType = (RenewingType)theEObject;
				T result = caseRenewingType(renewingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.RENEW_TARGET_TYPE: {
				RenewTargetType renewTargetType = (RenewTargetType)theEObject;
				T result = caseRenewTargetType(renewTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUESTED_PROOF_TOKEN_TYPE: {
				RequestedProofTokenType requestedProofTokenType = (RequestedProofTokenType)theEObject;
				T result = caseRequestedProofTokenType(requestedProofTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUESTED_REFERENCE_TYPE: {
				RequestedReferenceType requestedReferenceType = (RequestedReferenceType)theEObject;
				T result = caseRequestedReferenceType(requestedReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUESTED_SECURITY_TOKEN_TYPE: {
				RequestedSecurityTokenType requestedSecurityTokenType = (RequestedSecurityTokenType)theEObject;
				T result = caseRequestedSecurityTokenType(requestedSecurityTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUESTED_TOKEN_CANCELLED_TYPE: {
				RequestedTokenCancelledType requestedTokenCancelledType = (RequestedTokenCancelledType)theEObject;
				T result = caseRequestedTokenCancelledType(requestedTokenCancelledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUEST_KET_TYPE: {
				RequestKETType requestKETType = (RequestKETType)theEObject;
				T result = caseRequestKETType(requestKETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE: {
				RequestSecurityTokenCollectionType requestSecurityTokenCollectionType = (RequestSecurityTokenCollectionType)theEObject;
				T result = caseRequestSecurityTokenCollectionType(requestSecurityTokenCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE: {
				RequestSecurityTokenResponseCollectionType requestSecurityTokenResponseCollectionType = (RequestSecurityTokenResponseCollectionType)theEObject;
				T result = caseRequestSecurityTokenResponseCollectionType(requestSecurityTokenResponseCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_TYPE: {
				RequestSecurityTokenResponseType requestSecurityTokenResponseType = (RequestSecurityTokenResponseType)theEObject;
				T result = caseRequestSecurityTokenResponseType(requestSecurityTokenResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.REQUEST_SECURITY_TOKEN_TYPE: {
				RequestSecurityTokenType requestSecurityTokenType = (RequestSecurityTokenType)theEObject;
				T result = caseRequestSecurityTokenType(requestSecurityTokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.SIGN_CHALLENGE_TYPE: {
				SignChallengeType signChallengeType = (SignChallengeType)theEObject;
				T result = caseSignChallengeType(signChallengeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.USE_KEY_TYPE: {
				UseKeyType useKeyType = (UseKeyType)theEObject;
				T result = caseUseKeyType(useKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _200512Package.VALIDATE_TARGET_TYPE: {
				ValidateTargetType validateTargetType = (ValidateTargetType)theEObject;
				T result = caseValidateTargetType(validateTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allow Postdating Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allow Postdating Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowPostdatingType(AllowPostdatingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticatorType(AuthenticatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Exchange Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Exchange Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExchangeType(BinaryExchangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Secret Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Secret Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySecretType(BinarySecretType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelTargetType(CancelTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claims Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claims Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimsType(ClaimsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegate To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegate To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegateToType(DelegateToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionType(EncryptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entropy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entropy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntropyType(EntropyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Exchange Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Exchange Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyExchangeTokenType(KeyExchangeTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifetime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifetime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifetimeType(LifetimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Behalf Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Behalf Of Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnBehalfOfType(OnBehalfOfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participants Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participants Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantsType(ParticipantsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantType(ParticipantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proof Encryption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proof Encryption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProofEncryptionType(ProofEncryptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renewing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renewing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenewingType(RenewingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renew Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renew Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenewTargetType(RenewTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requested Proof Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requested Proof Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestedProofTokenType(RequestedProofTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requested Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requested Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestedReferenceType(RequestedReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requested Security Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requested Security Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestedSecurityTokenType(RequestedSecurityTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requested Token Cancelled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requested Token Cancelled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestedTokenCancelledType(RequestedTokenCancelledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request KET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request KET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestKETType(RequestKETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Security Token Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Security Token Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSecurityTokenCollectionType(RequestSecurityTokenCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Security Token Response Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Security Token Response Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSecurityTokenResponseCollectionType(RequestSecurityTokenResponseCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Security Token Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Security Token Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSecurityTokenResponseType(RequestSecurityTokenResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Security Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Security Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestSecurityTokenType(RequestSecurityTokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sign Challenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sign Challenge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignChallengeType(SignChallengeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusType(StatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseKeyType(UseKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateTargetType(ValidateTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //_200512Switch
