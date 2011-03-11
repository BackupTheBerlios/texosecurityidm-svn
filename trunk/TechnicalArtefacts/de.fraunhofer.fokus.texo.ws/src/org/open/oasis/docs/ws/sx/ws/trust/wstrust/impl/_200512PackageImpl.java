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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.AllowPostdatingType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.AuthenticatorType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinaryExchangeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.BinarySecretTypeEnum;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.CancelTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ClaimsType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ComputedKeyEnum;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.DelegateToType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.EncryptionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.EntropyType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyExchangeTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.KeyTypeEnum;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.LifetimeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.OnBehalfOfType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ParticipantsType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ProofEncryptionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RenewingType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestKETType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseCollectionType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenResponseType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestSecurityTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestTypeEnum;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedProofTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedReferenceType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedSecurityTokenType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.RequestedTokenCancelledType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.SignChallengeType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusCodeEnum;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.StatusType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.UseKeyType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust.ValidateTargetType;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Factory;
import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.util._200512Validator;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl._0PackageImpl;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.soap.soapenvelope.impl.EnvelopePackageImpl;

import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2003._06.wsutility.impl.UtilityPackageImpl;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _200512PackageImpl extends EPackageImpl implements _200512Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowPostdatingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExchangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySecretTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entropyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyExchangeTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifetimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onBehalfOfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proofEncryptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renewingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renewTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedProofTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedSecurityTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestedTokenCancelledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestKETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSecurityTokenCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSecurityTokenResponseCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSecurityTokenResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSecurityTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signChallengeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binarySecretTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computedKeyEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusCodeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binarySecretTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binarySecretTypeOpenEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType computedKeyEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType computedKeyOpenEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyTypeOpenEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestTypeOpenEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusCodeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusCodeOpenEnumEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _200512PackageImpl() {
		super(eNS_URI, _200512Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _200512Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _200512Package init() {
		if (isInited) return (_200512Package)EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI);

		// Obtain or create and register package
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _200512PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) : EnvelopePackage.eINSTANCE);
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);

		// Create package meta-data objects
		the_200512Package.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();

		// Initialize created meta-data
		the_200512Package.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_200512Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _200512Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_200512Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_200512Package.eNS_URI, the_200512Package);
		return the_200512Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowPostdatingType() {
		return allowPostdatingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticatorType() {
		return authenticatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticatorType_CombinedHash() {
		return (EAttribute)authenticatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticatorType_Any() {
		return (EAttribute)authenticatorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExchangeType() {
		return binaryExchangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExchangeType_Value() {
		return (EAttribute)binaryExchangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExchangeType_EncodingType() {
		return (EAttribute)binaryExchangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExchangeType_ValueType() {
		return (EAttribute)binaryExchangeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExchangeType_AnyAttribute() {
		return (EAttribute)binaryExchangeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinarySecretType() {
		return binarySecretTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinarySecretType_Value() {
		return (EAttribute)binarySecretTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinarySecretType_Type() {
		return (EAttribute)binarySecretTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinarySecretType_AnyAttribute() {
		return (EAttribute)binarySecretTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelTargetType() {
		return cancelTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelTargetType_Any() {
		return (EAttribute)cancelTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimsType() {
		return claimsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimsType_Any() {
		return (EAttribute)claimsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimsType_Dialect() {
		return (EAttribute)claimsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimsType_AnyAttribute() {
		return (EAttribute)claimsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegateToType() {
		return delegateToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateToType_Any() {
		return (EAttribute)delegateToTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AllowPostdating() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AuthenticationType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Authenticator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryExchange() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinarySecret() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CancelTarget() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CanonicalizationAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Challenge() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Claims() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CombinedHash() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ComputedKey() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ComputedKeyAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Delegatable() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DelegateTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Encryption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EncryptionAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EncryptWith() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entropy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Forwardable() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IssuedTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Issuer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyExchangeToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeySize() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeyType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeyWrapAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lifetime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OnBehalfOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Participants() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProofEncryption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Renewing() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RenewTarget() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestedAttachedReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestedProofToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestedSecurityToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestedTokenCancelled() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestedUnattachedReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestKET() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestSecurityToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestSecurityTokenCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestSecurityTokenResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestSecurityTokenResponseCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RequestType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SignatureAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignChallenge() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignChallengeResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SignWith() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Status() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TokenType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UseKey() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidateTarget() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryptionType() {
		return encryptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptionType_Any() {
		return (EAttribute)encryptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntropyType() {
		return entropyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntropyType_Any() {
		return (EAttribute)entropyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntropyType_AnyAttribute() {
		return (EAttribute)entropyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyExchangeTokenType() {
		return keyExchangeTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyExchangeTokenType_Any() {
		return (EAttribute)keyExchangeTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifetimeType() {
		return lifetimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifetimeType_Created() {
		return (EReference)lifetimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifetimeType_Expires() {
		return (EReference)lifetimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnBehalfOfType() {
		return onBehalfOfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnBehalfOfType_Any() {
		return (EAttribute)onBehalfOfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantsType() {
		return participantsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantsType_Primary() {
		return (EReference)participantsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantsType_Participant() {
		return (EReference)participantsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantsType_Any() {
		return (EAttribute)participantsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantType() {
		return participantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantType_Any() {
		return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProofEncryptionType() {
		return proofEncryptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProofEncryptionType_Any() {
		return (EAttribute)proofEncryptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenewingType() {
		return renewingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenewingType_Allow() {
		return (EAttribute)renewingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenewingType_OK() {
		return (EAttribute)renewingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenewTargetType() {
		return renewTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenewTargetType_Any() {
		return (EAttribute)renewTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedProofTokenType() {
		return requestedProofTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestedProofTokenType_Any() {
		return (EAttribute)requestedProofTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedReferenceType() {
		return requestedReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestedReferenceType_SecurityTokenReference() {
		return (EReference)requestedReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedSecurityTokenType() {
		return requestedSecurityTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestedSecurityTokenType_Any() {
		return (EAttribute)requestedSecurityTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestedTokenCancelledType() {
		return requestedTokenCancelledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestKETType() {
		return requestKETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSecurityTokenCollectionType() {
		return requestSecurityTokenCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestSecurityTokenCollectionType_RequestSecurityToken() {
		return (EReference)requestSecurityTokenCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSecurityTokenResponseCollectionType() {
		return requestSecurityTokenResponseCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse() {
		return (EReference)requestSecurityTokenResponseCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenResponseCollectionType_AnyAttribute() {
		return (EAttribute)requestSecurityTokenResponseCollectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSecurityTokenResponseType() {
		return requestSecurityTokenResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenResponseType_Any() {
		return (EAttribute)requestSecurityTokenResponseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenResponseType_Context() {
		return (EAttribute)requestSecurityTokenResponseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenResponseType_AnyAttribute() {
		return (EAttribute)requestSecurityTokenResponseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSecurityTokenType() {
		return requestSecurityTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenType_Any() {
		return (EAttribute)requestSecurityTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenType_Context() {
		return (EAttribute)requestSecurityTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenType_AnyAttribute() {
		return (EAttribute)requestSecurityTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignChallengeType() {
		return signChallengeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignChallengeType_Challenge() {
		return (EAttribute)signChallengeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignChallengeType_Any() {
		return (EAttribute)signChallengeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignChallengeType_AnyAttribute() {
		return (EAttribute)signChallengeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusType() {
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_Code() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_Reason() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseKeyType() {
		return useKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseKeyType_Any() {
		return (EAttribute)useKeyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseKeyType_Sig() {
		return (EAttribute)useKeyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidateTargetType() {
		return validateTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidateTargetType_Any() {
		return (EAttribute)validateTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinarySecretTypeEnum() {
		return binarySecretTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComputedKeyEnum() {
		return computedKeyEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyTypeEnum() {
		return keyTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestTypeEnum() {
		return requestTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusCodeEnum() {
		return statusCodeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBinarySecretTypeEnumObject() {
		return binarySecretTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBinarySecretTypeOpenEnum() {
		return binarySecretTypeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComputedKeyEnumObject() {
		return computedKeyEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComputedKeyOpenEnum() {
		return computedKeyOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeyTypeEnumObject() {
		return keyTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeyTypeOpenEnum() {
		return keyTypeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequestTypeEnumObject() {
		return requestTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequestTypeOpenEnum() {
		return requestTypeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusCodeEnumObject() {
		return statusCodeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusCodeOpenEnum() {
		return statusCodeOpenEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200512Factory get_200512Factory() {
		return (_200512Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allowPostdatingTypeEClass = createEClass(ALLOW_POSTDATING_TYPE);

		authenticatorTypeEClass = createEClass(AUTHENTICATOR_TYPE);
		createEAttribute(authenticatorTypeEClass, AUTHENTICATOR_TYPE__COMBINED_HASH);
		createEAttribute(authenticatorTypeEClass, AUTHENTICATOR_TYPE__ANY);

		binaryExchangeTypeEClass = createEClass(BINARY_EXCHANGE_TYPE);
		createEAttribute(binaryExchangeTypeEClass, BINARY_EXCHANGE_TYPE__VALUE);
		createEAttribute(binaryExchangeTypeEClass, BINARY_EXCHANGE_TYPE__ENCODING_TYPE);
		createEAttribute(binaryExchangeTypeEClass, BINARY_EXCHANGE_TYPE__VALUE_TYPE);
		createEAttribute(binaryExchangeTypeEClass, BINARY_EXCHANGE_TYPE__ANY_ATTRIBUTE);

		binarySecretTypeEClass = createEClass(BINARY_SECRET_TYPE);
		createEAttribute(binarySecretTypeEClass, BINARY_SECRET_TYPE__VALUE);
		createEAttribute(binarySecretTypeEClass, BINARY_SECRET_TYPE__TYPE);
		createEAttribute(binarySecretTypeEClass, BINARY_SECRET_TYPE__ANY_ATTRIBUTE);

		cancelTargetTypeEClass = createEClass(CANCEL_TARGET_TYPE);
		createEAttribute(cancelTargetTypeEClass, CANCEL_TARGET_TYPE__ANY);

		claimsTypeEClass = createEClass(CLAIMS_TYPE);
		createEAttribute(claimsTypeEClass, CLAIMS_TYPE__ANY);
		createEAttribute(claimsTypeEClass, CLAIMS_TYPE__DIALECT);
		createEAttribute(claimsTypeEClass, CLAIMS_TYPE__ANY_ATTRIBUTE);

		delegateToTypeEClass = createEClass(DELEGATE_TO_TYPE);
		createEAttribute(delegateToTypeEClass, DELEGATE_TO_TYPE__ANY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALLOW_POSTDATING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTHENTICATION_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHENTICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_EXCHANGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_SECRET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANCEL_TARGET);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CANONICALIZATION_ALGORITHM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CHALLENGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLAIMS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMBINED_HASH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMPUTED_KEY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMPUTED_KEY_ALGORITHM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DELEGATABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELEGATE_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION_ALGORITHM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENCRYPT_WITH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTROPY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORWARDABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISSUED_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISSUER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_EXCHANGE_TOKEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_SIZE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_WRAP_ALGORITHM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIFETIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ON_BEHALF_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARTICIPANTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROOF_ENCRYPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RENEWING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RENEW_TARGET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTED_ATTACHED_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTED_PROOF_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTED_SECURITY_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTED_TOKEN_CANCELLED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTED_UNATTACHED_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_KET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REQUEST_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_ALGORITHM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGN_CHALLENGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGN_CHALLENGE_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIGN_WITH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATUS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TOKEN_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE_KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDATE_TARGET);

		encryptionTypeEClass = createEClass(ENCRYPTION_TYPE);
		createEAttribute(encryptionTypeEClass, ENCRYPTION_TYPE__ANY);

		entropyTypeEClass = createEClass(ENTROPY_TYPE);
		createEAttribute(entropyTypeEClass, ENTROPY_TYPE__ANY);
		createEAttribute(entropyTypeEClass, ENTROPY_TYPE__ANY_ATTRIBUTE);

		keyExchangeTokenTypeEClass = createEClass(KEY_EXCHANGE_TOKEN_TYPE);
		createEAttribute(keyExchangeTokenTypeEClass, KEY_EXCHANGE_TOKEN_TYPE__ANY);

		lifetimeTypeEClass = createEClass(LIFETIME_TYPE);
		createEReference(lifetimeTypeEClass, LIFETIME_TYPE__CREATED);
		createEReference(lifetimeTypeEClass, LIFETIME_TYPE__EXPIRES);

		onBehalfOfTypeEClass = createEClass(ON_BEHALF_OF_TYPE);
		createEAttribute(onBehalfOfTypeEClass, ON_BEHALF_OF_TYPE__ANY);

		participantsTypeEClass = createEClass(PARTICIPANTS_TYPE);
		createEReference(participantsTypeEClass, PARTICIPANTS_TYPE__PRIMARY);
		createEReference(participantsTypeEClass, PARTICIPANTS_TYPE__PARTICIPANT);
		createEAttribute(participantsTypeEClass, PARTICIPANTS_TYPE__ANY);

		participantTypeEClass = createEClass(PARTICIPANT_TYPE);
		createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__ANY);

		proofEncryptionTypeEClass = createEClass(PROOF_ENCRYPTION_TYPE);
		createEAttribute(proofEncryptionTypeEClass, PROOF_ENCRYPTION_TYPE__ANY);

		renewingTypeEClass = createEClass(RENEWING_TYPE);
		createEAttribute(renewingTypeEClass, RENEWING_TYPE__ALLOW);
		createEAttribute(renewingTypeEClass, RENEWING_TYPE__OK);

		renewTargetTypeEClass = createEClass(RENEW_TARGET_TYPE);
		createEAttribute(renewTargetTypeEClass, RENEW_TARGET_TYPE__ANY);

		requestedProofTokenTypeEClass = createEClass(REQUESTED_PROOF_TOKEN_TYPE);
		createEAttribute(requestedProofTokenTypeEClass, REQUESTED_PROOF_TOKEN_TYPE__ANY);

		requestedReferenceTypeEClass = createEClass(REQUESTED_REFERENCE_TYPE);
		createEReference(requestedReferenceTypeEClass, REQUESTED_REFERENCE_TYPE__SECURITY_TOKEN_REFERENCE);

		requestedSecurityTokenTypeEClass = createEClass(REQUESTED_SECURITY_TOKEN_TYPE);
		createEAttribute(requestedSecurityTokenTypeEClass, REQUESTED_SECURITY_TOKEN_TYPE__ANY);

		requestedTokenCancelledTypeEClass = createEClass(REQUESTED_TOKEN_CANCELLED_TYPE);

		requestKETTypeEClass = createEClass(REQUEST_KET_TYPE);

		requestSecurityTokenCollectionTypeEClass = createEClass(REQUEST_SECURITY_TOKEN_COLLECTION_TYPE);
		createEReference(requestSecurityTokenCollectionTypeEClass, REQUEST_SECURITY_TOKEN_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN);

		requestSecurityTokenResponseCollectionTypeEClass = createEClass(REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE);
		createEReference(requestSecurityTokenResponseCollectionTypeEClass, REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__REQUEST_SECURITY_TOKEN_RESPONSE);
		createEAttribute(requestSecurityTokenResponseCollectionTypeEClass, REQUEST_SECURITY_TOKEN_RESPONSE_COLLECTION_TYPE__ANY_ATTRIBUTE);

		requestSecurityTokenResponseTypeEClass = createEClass(REQUEST_SECURITY_TOKEN_RESPONSE_TYPE);
		createEAttribute(requestSecurityTokenResponseTypeEClass, REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY);
		createEAttribute(requestSecurityTokenResponseTypeEClass, REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__CONTEXT);
		createEAttribute(requestSecurityTokenResponseTypeEClass, REQUEST_SECURITY_TOKEN_RESPONSE_TYPE__ANY_ATTRIBUTE);

		requestSecurityTokenTypeEClass = createEClass(REQUEST_SECURITY_TOKEN_TYPE);
		createEAttribute(requestSecurityTokenTypeEClass, REQUEST_SECURITY_TOKEN_TYPE__ANY);
		createEAttribute(requestSecurityTokenTypeEClass, REQUEST_SECURITY_TOKEN_TYPE__CONTEXT);
		createEAttribute(requestSecurityTokenTypeEClass, REQUEST_SECURITY_TOKEN_TYPE__ANY_ATTRIBUTE);

		signChallengeTypeEClass = createEClass(SIGN_CHALLENGE_TYPE);
		createEAttribute(signChallengeTypeEClass, SIGN_CHALLENGE_TYPE__CHALLENGE);
		createEAttribute(signChallengeTypeEClass, SIGN_CHALLENGE_TYPE__ANY);
		createEAttribute(signChallengeTypeEClass, SIGN_CHALLENGE_TYPE__ANY_ATTRIBUTE);

		statusTypeEClass = createEClass(STATUS_TYPE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__CODE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__REASON);

		useKeyTypeEClass = createEClass(USE_KEY_TYPE);
		createEAttribute(useKeyTypeEClass, USE_KEY_TYPE__ANY);
		createEAttribute(useKeyTypeEClass, USE_KEY_TYPE__SIG);

		validateTargetTypeEClass = createEClass(VALIDATE_TARGET_TYPE);
		createEAttribute(validateTargetTypeEClass, VALIDATE_TARGET_TYPE__ANY);

		// Create enums
		binarySecretTypeEnumEEnum = createEEnum(BINARY_SECRET_TYPE_ENUM);
		computedKeyEnumEEnum = createEEnum(COMPUTED_KEY_ENUM);
		keyTypeEnumEEnum = createEEnum(KEY_TYPE_ENUM);
		requestTypeEnumEEnum = createEEnum(REQUEST_TYPE_ENUM);
		statusCodeEnumEEnum = createEEnum(STATUS_CODE_ENUM);

		// Create data types
		binarySecretTypeEnumObjectEDataType = createEDataType(BINARY_SECRET_TYPE_ENUM_OBJECT);
		binarySecretTypeOpenEnumEDataType = createEDataType(BINARY_SECRET_TYPE_OPEN_ENUM);
		computedKeyEnumObjectEDataType = createEDataType(COMPUTED_KEY_ENUM_OBJECT);
		computedKeyOpenEnumEDataType = createEDataType(COMPUTED_KEY_OPEN_ENUM);
		keyTypeEnumObjectEDataType = createEDataType(KEY_TYPE_ENUM_OBJECT);
		keyTypeOpenEnumEDataType = createEDataType(KEY_TYPE_OPEN_ENUM);
		requestTypeEnumObjectEDataType = createEDataType(REQUEST_TYPE_ENUM_OBJECT);
		requestTypeOpenEnumEDataType = createEDataType(REQUEST_TYPE_OPEN_ENUM);
		statusCodeEnumObjectEDataType = createEDataType(STATUS_CODE_ENUM_OBJECT);
		statusCodeOpenEnumEDataType = createEDataType(STATUS_CODE_OPEN_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AddressingPackage theAddressingPackage = (AddressingPackage)EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package)EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI);
		_0Package the_0Package = (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(allowPostdatingTypeEClass, AllowPostdatingType.class, "AllowPostdatingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticatorTypeEClass, AuthenticatorType.class, "AuthenticatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticatorType_CombinedHash(), theXMLTypePackage.getBase64Binary(), "combinedHash", null, 0, 1, AuthenticatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticatorType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AuthenticatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExchangeTypeEClass, BinaryExchangeType.class, "BinaryExchangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExchangeType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, BinaryExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExchangeType_EncodingType(), theXMLTypePackage.getAnyURI(), "encodingType", null, 1, 1, BinaryExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExchangeType_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 1, 1, BinaryExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExchangeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, BinaryExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binarySecretTypeEClass, BinarySecretType.class, "BinarySecretType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinarySecretType_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, BinarySecretType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinarySecretType_Type(), this.getBinarySecretTypeOpenEnum(), "type", null, 0, 1, BinarySecretType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinarySecretType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, BinarySecretType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelTargetTypeEClass, CancelTargetType.class, "CancelTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancelTargetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, CancelTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimsTypeEClass, ClaimsType.class, "ClaimsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaimsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ClaimsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimsType_Dialect(), theXMLTypePackage.getAnyURI(), "dialect", null, 0, 1, ClaimsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ClaimsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegateToTypeEClass, DelegateToType.class, "DelegateToType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelegateToType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, DelegateToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AllowPostdating(), this.getAllowPostdatingType(), null, "allowPostdating", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AuthenticationType(), theXMLTypePackage.getAnyURI(), "authenticationType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Authenticator(), this.getAuthenticatorType(), null, "authenticator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BinaryExchange(), this.getBinaryExchangeType(), null, "binaryExchange", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BinarySecret(), this.getBinarySecretType(), null, "binarySecret", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CancelTarget(), this.getCancelTargetType(), null, "cancelTarget", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CanonicalizationAlgorithm(), theXMLTypePackage.getAnyURI(), "canonicalizationAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Challenge(), theXMLTypePackage.getString(), "challenge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Claims(), this.getClaimsType(), null, "claims", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CombinedHash(), theXMLTypePackage.getBase64Binary(), "combinedHash", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ComputedKey(), this.getComputedKeyOpenEnum(), "computedKey", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ComputedKeyAlgorithm(), theXMLTypePackage.getAnyURI(), "computedKeyAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Delegatable(), theXMLTypePackage.getBoolean(), "delegatable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DelegateTo(), this.getDelegateToType(), null, "delegateTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Encryption(), this.getEncryptionType(), null, "encryption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EncryptionAlgorithm(), theXMLTypePackage.getAnyURI(), "encryptionAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EncryptWith(), theXMLTypePackage.getAnyURI(), "encryptWith", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entropy(), this.getEntropyType(), null, "entropy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Forwardable(), theXMLTypePackage.getBoolean(), "forwardable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IssuedTokens(), this.getRequestSecurityTokenResponseCollectionType(), null, "issuedTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Issuer(), theAddressingPackage.getEndpointReferenceType(), null, "issuer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyExchangeToken(), this.getKeyExchangeTokenType(), null, "keyExchangeToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeySize(), theXMLTypePackage.getUnsignedInt(), "keySize", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeyType(), this.getKeyTypeOpenEnum(), "keyType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeyWrapAlgorithm(), theXMLTypePackage.getAnyURI(), "keyWrapAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Lifetime(), this.getLifetimeType(), null, "lifetime", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OnBehalfOf(), this.getOnBehalfOfType(), null, "onBehalfOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Participants(), this.getParticipantsType(), null, "participants", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProofEncryption(), this.getProofEncryptionType(), null, "proofEncryption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Renewing(), this.getRenewingType(), null, "renewing", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RenewTarget(), this.getRenewTargetType(), null, "renewTarget", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestedAttachedReference(), this.getRequestedReferenceType(), null, "requestedAttachedReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestedProofToken(), this.getRequestedProofTokenType(), null, "requestedProofToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestedSecurityToken(), this.getRequestedSecurityTokenType(), null, "requestedSecurityToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestedTokenCancelled(), this.getRequestedTokenCancelledType(), null, "requestedTokenCancelled", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestedUnattachedReference(), this.getRequestedReferenceType(), null, "requestedUnattachedReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestKET(), this.getRequestKETType(), null, "requestKET", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestSecurityToken(), this.getRequestSecurityTokenType(), null, "requestSecurityToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestSecurityTokenCollection(), this.getRequestSecurityTokenCollectionType(), null, "requestSecurityTokenCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestSecurityTokenResponse(), this.getRequestSecurityTokenResponseType(), null, "requestSecurityTokenResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestSecurityTokenResponseCollection(), this.getRequestSecurityTokenResponseCollectionType(), null, "requestSecurityTokenResponseCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RequestType(), this.getRequestTypeOpenEnum(), "requestType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SignatureAlgorithm(), theXMLTypePackage.getAnyURI(), "signatureAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignChallenge(), this.getSignChallengeType(), null, "signChallenge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignChallengeResponse(), this.getSignChallengeType(), null, "signChallengeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SignWith(), theXMLTypePackage.getAnyURI(), "signWith", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Status(), this.getStatusType(), null, "status", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TokenType(), theXMLTypePackage.getAnyURI(), "tokenType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UseKey(), this.getUseKeyType(), null, "useKey", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidateTarget(), this.getValidateTargetType(), null, "validateTarget", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(encryptionTypeEClass, EncryptionType.class, "EncryptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, EncryptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entropyTypeEClass, EntropyType.class, "EntropyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntropyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EntropyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntropyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EntropyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyExchangeTokenTypeEClass, KeyExchangeTokenType.class, "KeyExchangeTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyExchangeTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyExchangeTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifetimeTypeEClass, LifetimeType.class, "LifetimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifetimeType_Created(), the_0Package_1.getAttributedDateTime1(), null, "created", null, 0, 1, LifetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifetimeType_Expires(), the_0Package_1.getAttributedDateTime1(), null, "expires", null, 0, 1, LifetimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onBehalfOfTypeEClass, OnBehalfOfType.class, "OnBehalfOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnBehalfOfType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, OnBehalfOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantsTypeEClass, ParticipantsType.class, "ParticipantsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantsType_Primary(), this.getParticipantType(), null, "primary", null, 0, 1, ParticipantsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipantsType_Participant(), this.getParticipantType(), null, "participant", null, 0, -1, ParticipantsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ParticipantsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantTypeEClass, ParticipantType.class, "ParticipantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipantType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proofEncryptionTypeEClass, ProofEncryptionType.class, "ProofEncryptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProofEncryptionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ProofEncryptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renewingTypeEClass, RenewingType.class, "RenewingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenewingType_Allow(), theXMLTypePackage.getBoolean(), "allow", null, 0, 1, RenewingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenewingType_OK(), theXMLTypePackage.getBoolean(), "oK", null, 0, 1, RenewingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renewTargetTypeEClass, RenewTargetType.class, "RenewTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenewTargetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, RenewTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestedProofTokenTypeEClass, RequestedProofTokenType.class, "RequestedProofTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestedProofTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, RequestedProofTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestedReferenceTypeEClass, RequestedReferenceType.class, "RequestedReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestedReferenceType_SecurityTokenReference(), the_0Package.getSecurityTokenReferenceType(), null, "securityTokenReference", null, 1, 1, RequestedReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestedSecurityTokenTypeEClass, RequestedSecurityTokenType.class, "RequestedSecurityTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestedSecurityTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, RequestedSecurityTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestedTokenCancelledTypeEClass, RequestedTokenCancelledType.class, "RequestedTokenCancelledType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestKETTypeEClass, RequestKETType.class, "RequestKETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestSecurityTokenCollectionTypeEClass, RequestSecurityTokenCollectionType.class, "RequestSecurityTokenCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestSecurityTokenCollectionType_RequestSecurityToken(), this.getRequestSecurityTokenType(), null, "requestSecurityToken", null, 2, -1, RequestSecurityTokenCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSecurityTokenResponseCollectionTypeEClass, RequestSecurityTokenResponseCollectionType.class, "RequestSecurityTokenResponseCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse(), this.getRequestSecurityTokenResponseType(), null, "requestSecurityTokenResponse", null, 1, -1, RequestSecurityTokenResponseCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenResponseCollectionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RequestSecurityTokenResponseCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSecurityTokenResponseTypeEClass, RequestSecurityTokenResponseType.class, "RequestSecurityTokenResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestSecurityTokenResponseType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RequestSecurityTokenResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenResponseType_Context(), theXMLTypePackage.getAnyURI(), "context", null, 0, 1, RequestSecurityTokenResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenResponseType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RequestSecurityTokenResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSecurityTokenTypeEClass, RequestSecurityTokenType.class, "RequestSecurityTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestSecurityTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RequestSecurityTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenType_Context(), theXMLTypePackage.getAnyURI(), "context", null, 0, 1, RequestSecurityTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RequestSecurityTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signChallengeTypeEClass, SignChallengeType.class, "SignChallengeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignChallengeType_Challenge(), theXMLTypePackage.getString(), "challenge", null, 1, 1, SignChallengeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignChallengeType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignChallengeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignChallengeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SignChallengeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusTypeEClass, StatusType.class, "StatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusType_Code(), this.getStatusCodeOpenEnum(), "code", null, 1, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusType_Reason(), theXMLTypePackage.getString(), "reason", null, 0, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useKeyTypeEClass, UseKeyType.class, "UseKeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseKeyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, UseKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseKeyType_Sig(), theXMLTypePackage.getAnyURI(), "sig", null, 0, 1, UseKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validateTargetTypeEClass, ValidateTargetType.class, "ValidateTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidateTargetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ValidateTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binarySecretTypeEnumEEnum, BinarySecretTypeEnum.class, "BinarySecretTypeEnum");
		addEEnumLiteral(binarySecretTypeEnumEEnum, BinarySecretTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_ASYMMETRIC_KEY);
		addEEnumLiteral(binarySecretTypeEnumEEnum, BinarySecretTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY);
		addEEnumLiteral(binarySecretTypeEnumEEnum, BinarySecretTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_NONCE);

		initEEnum(computedKeyEnumEEnum, ComputedKeyEnum.class, "ComputedKeyEnum");
		addEEnumLiteral(computedKeyEnumEEnum, ComputedKeyEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1);
		addEEnumLiteral(computedKeyEnumEEnum, ComputedKeyEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH);

		initEEnum(keyTypeEnumEEnum, KeyTypeEnum.class, "KeyTypeEnum");
		addEEnumLiteral(keyTypeEnumEEnum, KeyTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY);
		addEEnumLiteral(keyTypeEnumEEnum, KeyTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY);
		addEEnumLiteral(keyTypeEnumEEnum, KeyTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER);

		initEEnum(requestTypeEnumEEnum, RequestTypeEnum.class, "RequestTypeEnum");
		addEEnumLiteral(requestTypeEnumEEnum, RequestTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_ISSUE);
		addEEnumLiteral(requestTypeEnumEEnum, RequestTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_RENEW);
		addEEnumLiteral(requestTypeEnumEEnum, RequestTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CANCEL);
		addEEnumLiteral(requestTypeEnumEEnum, RequestTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_STS_CANCEL);
		addEEnumLiteral(requestTypeEnumEEnum, RequestTypeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_VALIDATE);

		initEEnum(statusCodeEnumEEnum, StatusCodeEnum.class, "StatusCodeEnum");
		addEEnumLiteral(statusCodeEnumEEnum, StatusCodeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_STATUS_VALID);
		addEEnumLiteral(statusCodeEnumEEnum, StatusCodeEnum.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_STATUS_INVALID);

		// Initialize data types
		initEDataType(binarySecretTypeEnumObjectEDataType, BinarySecretTypeEnum.class, "BinarySecretTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(binarySecretTypeOpenEnumEDataType, Object.class, "BinarySecretTypeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(computedKeyEnumObjectEDataType, ComputedKeyEnum.class, "ComputedKeyEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(computedKeyOpenEnumEDataType, Object.class, "ComputedKeyOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(keyTypeEnumObjectEDataType, KeyTypeEnum.class, "KeyTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(keyTypeOpenEnumEDataType, Object.class, "KeyTypeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requestTypeEnumObjectEDataType, RequestTypeEnum.class, "RequestTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requestTypeOpenEnumEDataType, Object.class, "RequestTypeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusCodeEnumObjectEDataType, StatusCodeEnum.class, "StatusCodeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusCodeOpenEnumEDataType, Object.class, "StatusCodeOpenEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (allowPostdatingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AllowPostdatingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (authenticatorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuthenticatorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthenticatorType_CombinedHash(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CombinedHash",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthenticatorType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (binaryExchangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BinaryExchangeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinaryExchangeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinaryExchangeType_EncodingType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EncodingType"
		   });		
		addAnnotation
		  (getBinaryExchangeType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getBinaryExchangeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (binarySecretTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BinarySecretType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinarySecretType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinarySecretType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getBinarySecretType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (binarySecretTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "BinarySecretTypeEnum"
		   });		
		addAnnotation
		  (binarySecretTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "BinarySecretTypeEnum:Object",
			 "baseType", "BinarySecretTypeEnum"
		   });		
		addAnnotation
		  (binarySecretTypeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "BinarySecretTypeOpenEnum",
			 "memberTypes", "BinarySecretTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (cancelTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CancelTargetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCancelTargetType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "strict"
		   });		
		addAnnotation
		  (claimsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClaimsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClaimsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getClaimsType_Dialect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Dialect"
		   });		
		addAnnotation
		  (getClaimsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (computedKeyEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "ComputedKeyEnum"
		   });		
		addAnnotation
		  (computedKeyEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ComputedKeyEnum:Object",
			 "baseType", "ComputedKeyEnum"
		   });		
		addAnnotation
		  (computedKeyOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "ComputedKeyOpenEnum",
			 "memberTypes", "ComputedKeyEnum http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (delegateToTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DelegateToType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDelegateToType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_AllowPostdating(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AllowPostdating",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuthenticationType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuthenticationType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Authenticator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Authenticator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BinaryExchange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinaryExchange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BinarySecret(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinarySecret",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CancelTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CancelTarget",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CanonicalizationAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Challenge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Challenge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Claims(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Claims",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CombinedHash(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CombinedHash",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ComputedKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ComputedKey",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ComputedKeyAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ComputedKeyAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Delegatable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Delegatable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DelegateTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DelegateTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Encryption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Encryption",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EncryptionAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptionAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EncryptWith(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptWith",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Entropy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Entropy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Forwardable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Forwardable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IssuedTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuedTokens",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Issuer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Issuer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyExchangeToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyExchangeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeySize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeySize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyWrapAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyWrapAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Lifetime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Lifetime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OnBehalfOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OnBehalfOf",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Participants(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Participants",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProofEncryption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProofEncryption",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Renewing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Renewing",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RenewTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RenewTarget",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestedAttachedReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestedAttachedReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestedProofToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestedProofToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestedSecurityToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestedSecurityToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestedTokenCancelled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestedTokenCancelled",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestedUnattachedReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestedUnattachedReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestKET(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestKET",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestSecurityToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestSecurityTokenCollection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityTokenCollection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestSecurityTokenResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityTokenResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestSecurityTokenResponseCollection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityTokenResponseCollection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequestType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignChallenge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignChallenge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignChallengeResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignChallengeResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignWith(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignWith",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TokenType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TokenType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UseKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UseKey",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ValidateTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidateTarget",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (encryptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EncryptionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEncryptionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (entropyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntropyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntropyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEntropyType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (keyExchangeTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyExchangeTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeyExchangeTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (keyTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "KeyTypeEnum"
		   });		
		addAnnotation
		  (keyTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "KeyTypeEnum:Object",
			 "baseType", "KeyTypeEnum"
		   });		
		addAnnotation
		  (keyTypeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "KeyTypeOpenEnum",
			 "memberTypes", "KeyTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (lifetimeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LifetimeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLifetimeType_Created(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Created",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });			
		addAnnotation
		  (getLifetimeType_Expires(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Expires",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (onBehalfOfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OnBehalfOfType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOnBehalfOfType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (participantsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ParticipantsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParticipantsType_Primary(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Primary",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParticipantsType_Participant(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Participant",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParticipantsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (participantTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ParticipantType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParticipantType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (proofEncryptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProofEncryptionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProofEncryptionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (renewingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RenewingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRenewingType_Allow(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Allow"
		   });		
		addAnnotation
		  (getRenewingType_OK(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "OK"
		   });		
		addAnnotation
		  (renewTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RenewTargetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRenewTargetType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "strict"
		   });		
		addAnnotation
		  (requestedProofTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestedProofTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestedProofTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (requestedReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestedReferenceType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRequestedReferenceType_SecurityTokenReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityTokenReference",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
		   });		
		addAnnotation
		  (requestedSecurityTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestedSecurityTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestedSecurityTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (requestedTokenCancelledTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestedTokenCancelledType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (requestKETTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestKETType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (requestSecurityTokenCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestSecurityTokenCollectionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestSecurityTokenCollectionType_RequestSecurityToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (requestSecurityTokenResponseCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestSecurityTokenResponseCollectionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestSecurityTokenResponseCollectionType_RequestSecurityTokenResponse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityTokenResponse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRequestSecurityTokenResponseCollectionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (requestSecurityTokenResponseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestSecurityTokenResponseType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestSecurityTokenResponseType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getRequestSecurityTokenResponseType_Context(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Context"
		   });		
		addAnnotation
		  (getRequestSecurityTokenResponseType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (requestSecurityTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestSecurityTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestSecurityTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getRequestSecurityTokenType_Context(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Context"
		   });		
		addAnnotation
		  (getRequestSecurityTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (requestTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "RequestTypeEnum"
		   });		
		addAnnotation
		  (requestTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RequestTypeEnum:Object",
			 "baseType", "RequestTypeEnum"
		   });		
		addAnnotation
		  (requestTypeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "RequestTypeOpenEnum",
			 "memberTypes", "RequestTypeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (signChallengeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignChallengeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignChallengeType_Challenge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Challenge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignChallengeType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSignChallengeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (statusCodeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "StatusCodeEnum"
		   });		
		addAnnotation
		  (statusCodeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "StatusCodeEnum:Object",
			 "baseType", "StatusCodeEnum"
		   });		
		addAnnotation
		  (statusCodeOpenEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "StatusCodeOpenEnum",
			 "memberTypes", "StatusCodeEnum http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (statusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StatusType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStatusType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStatusType_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (useKeyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UseKeyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUseKeyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getUseKeyType_Sig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Sig"
		   });		
		addAnnotation
		  (validateTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValidateTargetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getValidateTargetType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "strict"
		   });
	}

} //_200512PackageImpl
