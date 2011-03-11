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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _200512FactoryImpl extends EFactoryImpl implements _200512Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _200512Factory init() {
		try {
			_200512Factory the_200512Factory = (_200512Factory)EPackage.Registry.INSTANCE.getEFactory("http://docs.oasis-open.org/ws-sx/ws-trust/200512/"); 
			if (the_200512Factory != null) {
				return the_200512Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _200512FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _200512Package.ALLOW_POSTDATING_TYPE: return createAllowPostdatingType();
			case _200512Package.AUTHENTICATOR_TYPE: return createAuthenticatorType();
			case _200512Package.BINARY_EXCHANGE_TYPE: return createBinaryExchangeType();
			case _200512Package.BINARY_SECRET_TYPE: return createBinarySecretType();
			case _200512Package.CANCEL_TARGET_TYPE: return createCancelTargetType();
			case _200512Package.CLAIMS_TYPE: return createClaimsType();
			case _200512Package.DELEGATE_TO_TYPE: return createDelegateToType();
			case _200512Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _200512Package.ENCRYPTION_TYPE: return createEncryptionType();
			case _200512Package.ENTROPY_TYPE: return createEntropyType();
			case _200512Package.KEY_EXCHANGE_TOKEN_TYPE: return createKeyExchangeTokenType();
			case _200512Package.LIFETIME_TYPE: return createLifetimeType();
			case _200512Package.ON_BEHALF_OF_TYPE: return createOnBehalfOfType();
			case _200512Package.PARTICIPANTS_TYPE: return createParticipantsType();
			case _200512Package.PARTICIPANT_TYPE: return createParticipantType();
			case _200512Package.PROOF_ENCRYPTION_TYPE: return createProofEncryptionType();
			case _200512Package.RENEWING_TYPE: return createRenewingType();
			case _200512Package.RENEW_TARGET_TYPE: return createRenewTargetType();
			case _200512Package.REQUESTED_PROOF_TOKEN_TYPE: return createRequestedProofTokenType();
			case _200512Package.REQUESTED_REFERENCE_TYPE: return createRequestedReferenceType();
			case _200512Package.REQUESTED_SECURITY_TOKEN_TYPE: return createRequestedSecurityTokenType();
			case _200512Package.REQUESTED_TOKEN_CANCELLED_TYPE: return createRequestedTokenCancelledType();
			case _200512Package.REQUEST_KET_TYPE: return createRequestKETType();
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE: return createRequestSecurityTokenCollectionType();
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE: return createRequestSecurityTokenResponseCollectionType();
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_TYPE: return createRequestSecurityTokenResponseType();
			case _200512Package.REQUEST_SECURITY_TOKEN_TYPE: return createRequestSecurityTokenType();
			case _200512Package.SIGN_CHALLENGE_TYPE: return createSignChallengeType();
			case _200512Package.STATUS_TYPE: return createStatusType();
			case _200512Package.USE_KEY_TYPE: return createUseKeyType();
			case _200512Package.VALIDATE_TARGET_TYPE: return createValidateTargetType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _200512Package.BINARY_SECRET_TYPE_ENUM:
				return createBinarySecretTypeEnumFromString(eDataType, initialValue);
			case _200512Package.COMPUTED_KEY_ENUM:
				return createComputedKeyEnumFromString(eDataType, initialValue);
			case _200512Package.KEY_TYPE_ENUM:
				return createKeyTypeEnumFromString(eDataType, initialValue);
			case _200512Package.REQUEST_TYPE_ENUM:
				return createRequestTypeEnumFromString(eDataType, initialValue);
			case _200512Package.STATUS_CODE_ENUM:
				return createStatusCodeEnumFromString(eDataType, initialValue);
			case _200512Package.BINARY_SECRET_TYPE_ENUM_OBJECT:
				return createBinarySecretTypeEnumObjectFromString(eDataType, initialValue);
			case _200512Package.BINARY_SECRET_TYPE_OPEN_ENUM:
				return createBinarySecretTypeOpenEnumFromString(eDataType, initialValue);
			case _200512Package.COMPUTED_KEY_ENUM_OBJECT:
				return createComputedKeyEnumObjectFromString(eDataType, initialValue);
			case _200512Package.COMPUTED_KEY_OPEN_ENUM:
				return createComputedKeyOpenEnumFromString(eDataType, initialValue);
			case _200512Package.KEY_TYPE_ENUM_OBJECT:
				return createKeyTypeEnumObjectFromString(eDataType, initialValue);
			case _200512Package.KEY_TYPE_OPEN_ENUM:
				return createKeyTypeOpenEnumFromString(eDataType, initialValue);
			case _200512Package.REQUEST_TYPE_ENUM_OBJECT:
				return createRequestTypeEnumObjectFromString(eDataType, initialValue);
			case _200512Package.REQUEST_TYPE_OPEN_ENUM:
				return createRequestTypeOpenEnumFromString(eDataType, initialValue);
			case _200512Package.STATUS_CODE_ENUM_OBJECT:
				return createStatusCodeEnumObjectFromString(eDataType, initialValue);
			case _200512Package.STATUS_CODE_OPEN_ENUM:
				return createStatusCodeOpenEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _200512Package.BINARY_SECRET_TYPE_ENUM:
				return convertBinarySecretTypeEnumToString(eDataType, instanceValue);
			case _200512Package.COMPUTED_KEY_ENUM:
				return convertComputedKeyEnumToString(eDataType, instanceValue);
			case _200512Package.KEY_TYPE_ENUM:
				return convertKeyTypeEnumToString(eDataType, instanceValue);
			case _200512Package.REQUEST_TYPE_ENUM:
				return convertRequestTypeEnumToString(eDataType, instanceValue);
			case _200512Package.STATUS_CODE_ENUM:
				return convertStatusCodeEnumToString(eDataType, instanceValue);
			case _200512Package.BINARY_SECRET_TYPE_ENUM_OBJECT:
				return convertBinarySecretTypeEnumObjectToString(eDataType, instanceValue);
			case _200512Package.BINARY_SECRET_TYPE_OPEN_ENUM:
				return convertBinarySecretTypeOpenEnumToString(eDataType, instanceValue);
			case _200512Package.COMPUTED_KEY_ENUM_OBJECT:
				return convertComputedKeyEnumObjectToString(eDataType, instanceValue);
			case _200512Package.COMPUTED_KEY_OPEN_ENUM:
				return convertComputedKeyOpenEnumToString(eDataType, instanceValue);
			case _200512Package.KEY_TYPE_ENUM_OBJECT:
				return convertKeyTypeEnumObjectToString(eDataType, instanceValue);
			case _200512Package.KEY_TYPE_OPEN_ENUM:
				return convertKeyTypeOpenEnumToString(eDataType, instanceValue);
			case _200512Package.REQUEST_TYPE_ENUM_OBJECT:
				return convertRequestTypeEnumObjectToString(eDataType, instanceValue);
			case _200512Package.REQUEST_TYPE_OPEN_ENUM:
				return convertRequestTypeOpenEnumToString(eDataType, instanceValue);
			case _200512Package.STATUS_CODE_ENUM_OBJECT:
				return convertStatusCodeEnumObjectToString(eDataType, instanceValue);
			case _200512Package.STATUS_CODE_OPEN_ENUM:
				return convertStatusCodeOpenEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowPostdatingType createAllowPostdatingType() {
		AllowPostdatingTypeImpl allowPostdatingType = new AllowPostdatingTypeImpl();
		return allowPostdatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticatorType createAuthenticatorType() {
		AuthenticatorTypeImpl authenticatorType = new AuthenticatorTypeImpl();
		return authenticatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExchangeType createBinaryExchangeType() {
		BinaryExchangeTypeImpl binaryExchangeType = new BinaryExchangeTypeImpl();
		return binaryExchangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecretType createBinarySecretType() {
		BinarySecretTypeImpl binarySecretType = new BinarySecretTypeImpl();
		return binarySecretType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelTargetType createCancelTargetType() {
		CancelTargetTypeImpl cancelTargetType = new CancelTargetTypeImpl();
		return cancelTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimsType createClaimsType() {
		ClaimsTypeImpl claimsType = new ClaimsTypeImpl();
		return claimsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateToType createDelegateToType() {
		DelegateToTypeImpl delegateToType = new DelegateToTypeImpl();
		return delegateToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionType createEncryptionType() {
		EncryptionTypeImpl encryptionType = new EncryptionTypeImpl();
		return encryptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntropyType createEntropyType() {
		EntropyTypeImpl entropyType = new EntropyTypeImpl();
		return entropyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyExchangeTokenType createKeyExchangeTokenType() {
		KeyExchangeTokenTypeImpl keyExchangeTokenType = new KeyExchangeTokenTypeImpl();
		return keyExchangeTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifetimeType createLifetimeType() {
		LifetimeTypeImpl lifetimeType = new LifetimeTypeImpl();
		return lifetimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnBehalfOfType createOnBehalfOfType() {
		OnBehalfOfTypeImpl onBehalfOfType = new OnBehalfOfTypeImpl();
		return onBehalfOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantsType createParticipantsType() {
		ParticipantsTypeImpl participantsType = new ParticipantsTypeImpl();
		return participantsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantType createParticipantType() {
		ParticipantTypeImpl participantType = new ParticipantTypeImpl();
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofEncryptionType createProofEncryptionType() {
		ProofEncryptionTypeImpl proofEncryptionType = new ProofEncryptionTypeImpl();
		return proofEncryptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewingType createRenewingType() {
		RenewingTypeImpl renewingType = new RenewingTypeImpl();
		return renewingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewTargetType createRenewTargetType() {
		RenewTargetTypeImpl renewTargetType = new RenewTargetTypeImpl();
		return renewTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedProofTokenType createRequestedProofTokenType() {
		RequestedProofTokenTypeImpl requestedProofTokenType = new RequestedProofTokenTypeImpl();
		return requestedProofTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedReferenceType createRequestedReferenceType() {
		RequestedReferenceTypeImpl requestedReferenceType = new RequestedReferenceTypeImpl();
		return requestedReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedSecurityTokenType createRequestedSecurityTokenType() {
		RequestedSecurityTokenTypeImpl requestedSecurityTokenType = new RequestedSecurityTokenTypeImpl();
		return requestedSecurityTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedTokenCancelledType createRequestedTokenCancelledType() {
		RequestedTokenCancelledTypeImpl requestedTokenCancelledType = new RequestedTokenCancelledTypeImpl();
		return requestedTokenCancelledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestKETType createRequestKETType() {
		RequestKETTypeImpl requestKETType = new RequestKETTypeImpl();
		return requestKETType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenCollectionType createRequestSecurityTokenCollectionType() {
		RequestSecurityTokenCollectionTypeImpl requestSecurityTokenCollectionType = new RequestSecurityTokenCollectionTypeImpl();
		return requestSecurityTokenCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenResponseCollectionType createRequestSecurityTokenResponseCollectionType() {
		RequestSecurityTokenResponseCollectionTypeImpl requestSecurityTokenResponseCollectionType = new RequestSecurityTokenResponseCollectionTypeImpl();
		return requestSecurityTokenResponseCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenResponseType createRequestSecurityTokenResponseType() {
		RequestSecurityTokenResponseTypeImpl requestSecurityTokenResponseType = new RequestSecurityTokenResponseTypeImpl();
		return requestSecurityTokenResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSecurityTokenType createRequestSecurityTokenType() {
		RequestSecurityTokenTypeImpl requestSecurityTokenType = new RequestSecurityTokenTypeImpl();
		return requestSecurityTokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignChallengeType createSignChallengeType() {
		SignChallengeTypeImpl signChallengeType = new SignChallengeTypeImpl();
		return signChallengeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusType() {
		StatusTypeImpl statusType = new StatusTypeImpl();
		return statusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseKeyType createUseKeyType() {
		UseKeyTypeImpl useKeyType = new UseKeyTypeImpl();
		return useKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateTargetType createValidateTargetType() {
		ValidateTargetTypeImpl validateTargetType = new ValidateTargetTypeImpl();
		return validateTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecretTypeEnum createBinarySecretTypeEnumFromString(EDataType eDataType, String initialValue) {
		BinarySecretTypeEnum result = BinarySecretTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinarySecretTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedKeyEnum createComputedKeyEnumFromString(EDataType eDataType, String initialValue) {
		ComputedKeyEnum result = ComputedKeyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputedKeyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTypeEnum createKeyTypeEnumFromString(EDataType eDataType, String initialValue) {
		KeyTypeEnum result = KeyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeEnum createRequestTypeEnumFromString(EDataType eDataType, String initialValue) {
		RequestTypeEnum result = RequestTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCodeEnum createStatusCodeEnumFromString(EDataType eDataType, String initialValue) {
		StatusCodeEnum result = StatusCodeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySecretTypeEnum createBinarySecretTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createBinarySecretTypeEnumFromString(_200512Package.Literals.BINARY_SECRET_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinarySecretTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBinarySecretTypeEnumToString(_200512Package.Literals.BINARY_SECRET_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBinarySecretTypeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBinarySecretTypeEnumFromString(_200512Package.Literals.BINARY_SECRET_TYPE_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinarySecretTypeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200512Package.Literals.BINARY_SECRET_TYPE_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertBinarySecretTypeEnumToString(_200512Package.Literals.BINARY_SECRET_TYPE_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedKeyEnum createComputedKeyEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createComputedKeyEnumFromString(_200512Package.Literals.COMPUTED_KEY_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputedKeyEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComputedKeyEnumToString(_200512Package.Literals.COMPUTED_KEY_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createComputedKeyOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createComputedKeyEnumFromString(_200512Package.Literals.COMPUTED_KEY_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputedKeyOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200512Package.Literals.COMPUTED_KEY_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertComputedKeyEnumToString(_200512Package.Literals.COMPUTED_KEY_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTypeEnum createKeyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyTypeEnumFromString(_200512Package.Literals.KEY_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyTypeEnumToString(_200512Package.Literals.KEY_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createKeyTypeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createKeyTypeEnumFromString(_200512Package.Literals.KEY_TYPE_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200512Package.Literals.KEY_TYPE_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertKeyTypeEnumToString(_200512Package.Literals.KEY_TYPE_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeEnum createRequestTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestTypeEnumFromString(_200512Package.Literals.REQUEST_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestTypeEnumToString(_200512Package.Literals.REQUEST_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRequestTypeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRequestTypeEnumFromString(_200512Package.Literals.REQUEST_TYPE_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200512Package.Literals.REQUEST_TYPE_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertRequestTypeEnumToString(_200512Package.Literals.REQUEST_TYPE_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCodeEnum createStatusCodeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusCodeEnumFromString(_200512Package.Literals.STATUS_CODE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusCodeEnumToString(_200512Package.Literals.STATUS_CODE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStatusCodeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStatusCodeEnumFromString(_200512Package.Literals.STATUS_CODE_ENUM, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_200512Package.Literals.STATUS_CODE_ENUM.isInstance(instanceValue)) {
			try {
				String value = convertStatusCodeEnumToString(_200512Package.Literals.STATUS_CODE_ENUM, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512Package get_200512Package() {
		return (_200512Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _200512Package getPackage() {
		return _200512Package.eINSTANCE;
	}

} //_200512FactoryImpl
