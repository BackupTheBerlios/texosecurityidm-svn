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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package
 * @generated
 */
public class _200512Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _200512Validator INSTANCE = new _200512Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.ws.sx.ws.trust.wstrust";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _200512Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _200512Package.ALLOW_POSTDATING_TYPE:
				return validateAllowPostdatingType((AllowPostdatingType)value, diagnostics, context);
			case _200512Package.AUTHENTICATOR_TYPE:
				return validateAuthenticatorType((AuthenticatorType)value, diagnostics, context);
			case _200512Package.BINARY_EXCHANGE_TYPE:
				return validateBinaryExchangeType((BinaryExchangeType)value, diagnostics, context);
			case _200512Package.BINARY_SECRET_TYPE:
				return validateBinarySecretType((BinarySecretType)value, diagnostics, context);
			case _200512Package.CANCEL_TARGET_TYPE:
				return validateCancelTargetType((CancelTargetType)value, diagnostics, context);
			case _200512Package.CLAIMS_TYPE:
				return validateClaimsType((ClaimsType)value, diagnostics, context);
			case _200512Package.DELEGATE_TO_TYPE:
				return validateDelegateToType((DelegateToType)value, diagnostics, context);
			case _200512Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _200512Package.ENCRYPTION_TYPE:
				return validateEncryptionType((EncryptionType)value, diagnostics, context);
			case _200512Package.ENTROPY_TYPE:
				return validateEntropyType((EntropyType)value, diagnostics, context);
			case _200512Package.KEY_EXCHANGE_TOKEN_TYPE:
				return validateKeyExchangeTokenType((KeyExchangeTokenType)value, diagnostics, context);
			case _200512Package.LIFETIME_TYPE:
				return validateLifetimeType((LifetimeType)value, diagnostics, context);
			case _200512Package.ON_BEHALF_OF_TYPE:
				return validateOnBehalfOfType((OnBehalfOfType)value, diagnostics, context);
			case _200512Package.PARTICIPANTS_TYPE:
				return validateParticipantsType((ParticipantsType)value, diagnostics, context);
			case _200512Package.PARTICIPANT_TYPE:
				return validateParticipantType((ParticipantType)value, diagnostics, context);
			case _200512Package.PROOF_ENCRYPTION_TYPE:
				return validateProofEncryptionType((ProofEncryptionType)value, diagnostics, context);
			case _200512Package.RENEWING_TYPE:
				return validateRenewingType((RenewingType)value, diagnostics, context);
			case _200512Package.RENEW_TARGET_TYPE:
				return validateRenewTargetType((RenewTargetType)value, diagnostics, context);
			case _200512Package.REQUESTED_PROOF_TOKEN_TYPE:
				return validateRequestedProofTokenType((RequestedProofTokenType)value, diagnostics, context);
			case _200512Package.REQUESTED_REFERENCE_TYPE:
				return validateRequestedReferenceType((RequestedReferenceType)value, diagnostics, context);
			case _200512Package.REQUESTED_SECURITY_TOKEN_TYPE:
				return validateRequestedSecurityTokenType((RequestedSecurityTokenType)value, diagnostics, context);
			case _200512Package.REQUESTED_TOKEN_CANCELLED_TYPE:
				return validateRequestedTokenCancelledType((RequestedTokenCancelledType)value, diagnostics, context);
			case _200512Package.REQUEST_KET_TYPE:
				return validateRequestKETType((RequestKETType)value, diagnostics, context);
			case _200512Package.REQUEST_SECURITY_TOKEN_COLLECTION_TYPE:
				return validateRequestSecurityTokenCollectionType((RequestSecurityTokenCollectionType)value, diagnostics, context);
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE:
				return validateRequestSecurityTokenResponseCollectionType((RequestSecurityTokenResponseCollectionType)value, diagnostics, context);
			case _200512Package.REQUEST_SECURITY_TOKEN_RESPONSE_TYPE:
				return validateRequestSecurityTokenResponseType((RequestSecurityTokenResponseType)value, diagnostics, context);
			case _200512Package.REQUEST_SECURITY_TOKEN_TYPE:
				return validateRequestSecurityTokenType((RequestSecurityTokenType)value, diagnostics, context);
			case _200512Package.SIGN_CHALLENGE_TYPE:
				return validateSignChallengeType((SignChallengeType)value, diagnostics, context);
			case _200512Package.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case _200512Package.USE_KEY_TYPE:
				return validateUseKeyType((UseKeyType)value, diagnostics, context);
			case _200512Package.VALIDATE_TARGET_TYPE:
				return validateValidateTargetType((ValidateTargetType)value, diagnostics, context);
			case _200512Package.BINARY_SECRET_TYPE_ENUM:
				return validateBinarySecretTypeEnum((BinarySecretTypeEnum)value, diagnostics, context);
			case _200512Package.COMPUTED_KEY_ENUM:
				return validateComputedKeyEnum((ComputedKeyEnum)value, diagnostics, context);
			case _200512Package.KEY_TYPE_ENUM:
				return validateKeyTypeEnum((KeyTypeEnum)value, diagnostics, context);
			case _200512Package.REQUEST_TYPE_ENUM:
				return validateRequestTypeEnum((RequestTypeEnum)value, diagnostics, context);
			case _200512Package.STATUS_CODE_ENUM:
				return validateStatusCodeEnum((StatusCodeEnum)value, diagnostics, context);
			case _200512Package.BINARY_SECRET_TYPE_ENUM_OBJECT:
				return validateBinarySecretTypeEnumObject((BinarySecretTypeEnum)value, diagnostics, context);
			case _200512Package.BINARY_SECRET_TYPE_OPEN_ENUM:
				return validateBinarySecretTypeOpenEnum(value, diagnostics, context);
			case _200512Package.COMPUTED_KEY_ENUM_OBJECT:
				return validateComputedKeyEnumObject((ComputedKeyEnum)value, diagnostics, context);
			case _200512Package.COMPUTED_KEY_OPEN_ENUM:
				return validateComputedKeyOpenEnum(value, diagnostics, context);
			case _200512Package.KEY_TYPE_ENUM_OBJECT:
				return validateKeyTypeEnumObject((KeyTypeEnum)value, diagnostics, context);
			case _200512Package.KEY_TYPE_OPEN_ENUM:
				return validateKeyTypeOpenEnum(value, diagnostics, context);
			case _200512Package.REQUEST_TYPE_ENUM_OBJECT:
				return validateRequestTypeEnumObject((RequestTypeEnum)value, diagnostics, context);
			case _200512Package.REQUEST_TYPE_OPEN_ENUM:
				return validateRequestTypeOpenEnum(value, diagnostics, context);
			case _200512Package.STATUS_CODE_ENUM_OBJECT:
				return validateStatusCodeEnumObject((StatusCodeEnum)value, diagnostics, context);
			case _200512Package.STATUS_CODE_OPEN_ENUM:
				return validateStatusCodeOpenEnum(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowPostdatingType(AllowPostdatingType allowPostdatingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allowPostdatingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticatorType(AuthenticatorType authenticatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authenticatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryExchangeType(BinaryExchangeType binaryExchangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryExchangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecretType(BinarySecretType binarySecretType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binarySecretType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelTargetType(CancelTargetType cancelTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimsType(ClaimsType claimsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegateToType(DelegateToType delegateToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegateToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncryptionType(EncryptionType encryptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encryptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntropyType(EntropyType entropyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entropyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyExchangeTokenType(KeyExchangeTokenType keyExchangeTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyExchangeTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifetimeType(LifetimeType lifetimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifetimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnBehalfOfType(OnBehalfOfType onBehalfOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onBehalfOfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantsType(ParticipantsType participantsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantType(ParticipantType participantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProofEncryptionType(ProofEncryptionType proofEncryptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proofEncryptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenewingType(RenewingType renewingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renewingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenewTargetType(RenewTargetType renewTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renewTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedProofTokenType(RequestedProofTokenType requestedProofTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestedProofTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedReferenceType(RequestedReferenceType requestedReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestedReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedSecurityTokenType(RequestedSecurityTokenType requestedSecurityTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestedSecurityTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedTokenCancelledType(RequestedTokenCancelledType requestedTokenCancelledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestedTokenCancelledType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestKETType(RequestKETType requestKETType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestKETType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestSecurityTokenCollectionType(RequestSecurityTokenCollectionType requestSecurityTokenCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestSecurityTokenCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestSecurityTokenResponseCollectionType(RequestSecurityTokenResponseCollectionType requestSecurityTokenResponseCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestSecurityTokenResponseCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestSecurityTokenResponseType(RequestSecurityTokenResponseType requestSecurityTokenResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestSecurityTokenResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestSecurityTokenType(RequestSecurityTokenType requestSecurityTokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestSecurityTokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignChallengeType(SignChallengeType signChallengeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signChallengeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseKeyType(UseKeyType useKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useKeyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidateTargetType(ValidateTargetType validateTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validateTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecretTypeEnum(BinarySecretTypeEnum binarySecretTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputedKeyEnum(ComputedKeyEnum computedKeyEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyTypeEnum(KeyTypeEnum keyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeEnum(RequestTypeEnum requestTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCodeEnum(StatusCodeEnum statusCodeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecretTypeEnumObject(BinarySecretTypeEnum binarySecretTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecretTypeOpenEnum(Object binarySecretTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBinarySecretTypeOpenEnum_MemberTypes(binarySecretTypeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Binary Secret Type Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySecretTypeOpenEnum_MemberTypes(Object binarySecretTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_200512Package.Literals.BINARY_SECRET_TYPE_ENUM.isInstance(binarySecretTypeOpenEnum)) {
				if (validateBinarySecretTypeEnum((BinarySecretTypeEnum)binarySecretTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(binarySecretTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)binarySecretTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_200512Package.Literals.BINARY_SECRET_TYPE_ENUM.isInstance(binarySecretTypeOpenEnum)) {
				if (validateBinarySecretTypeEnum((BinarySecretTypeEnum)binarySecretTypeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(binarySecretTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)binarySecretTypeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputedKeyEnumObject(ComputedKeyEnum computedKeyEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputedKeyOpenEnum(Object computedKeyOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateComputedKeyOpenEnum_MemberTypes(computedKeyOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Computed Key Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputedKeyOpenEnum_MemberTypes(Object computedKeyOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_200512Package.Literals.COMPUTED_KEY_ENUM.isInstance(computedKeyOpenEnum)) {
				if (validateComputedKeyEnum((ComputedKeyEnum)computedKeyOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(computedKeyOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)computedKeyOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_200512Package.Literals.COMPUTED_KEY_ENUM.isInstance(computedKeyOpenEnum)) {
				if (validateComputedKeyEnum((ComputedKeyEnum)computedKeyOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(computedKeyOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)computedKeyOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyTypeEnumObject(KeyTypeEnum keyTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyTypeOpenEnum(Object keyTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKeyTypeOpenEnum_MemberTypes(keyTypeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Key Type Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyTypeOpenEnum_MemberTypes(Object keyTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_200512Package.Literals.KEY_TYPE_ENUM.isInstance(keyTypeOpenEnum)) {
				if (validateKeyTypeEnum((KeyTypeEnum)keyTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(keyTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)keyTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_200512Package.Literals.KEY_TYPE_ENUM.isInstance(keyTypeOpenEnum)) {
				if (validateKeyTypeEnum((KeyTypeEnum)keyTypeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(keyTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)keyTypeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeEnumObject(RequestTypeEnum requestTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeOpenEnum(Object requestTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRequestTypeOpenEnum_MemberTypes(requestTypeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Request Type Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeOpenEnum_MemberTypes(Object requestTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_200512Package.Literals.REQUEST_TYPE_ENUM.isInstance(requestTypeOpenEnum)) {
				if (validateRequestTypeEnum((RequestTypeEnum)requestTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(requestTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)requestTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_200512Package.Literals.REQUEST_TYPE_ENUM.isInstance(requestTypeOpenEnum)) {
				if (validateRequestTypeEnum((RequestTypeEnum)requestTypeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(requestTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)requestTypeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCodeEnumObject(StatusCodeEnum statusCodeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCodeOpenEnum(Object statusCodeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStatusCodeOpenEnum_MemberTypes(statusCodeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Status Code Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCodeOpenEnum_MemberTypes(Object statusCodeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_200512Package.Literals.STATUS_CODE_ENUM.isInstance(statusCodeOpenEnum)) {
				if (validateStatusCodeEnum((StatusCodeEnum)statusCodeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(statusCodeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)statusCodeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_200512Package.Literals.STATUS_CODE_ENUM.isInstance(statusCodeOpenEnum)) {
				if (validateStatusCodeEnum((StatusCodeEnum)statusCodeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(statusCodeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)statusCodeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_200512Validator
