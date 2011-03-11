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
package org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl;

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

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.DocumentRoot;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.EmptyType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.HeaderType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IncludeTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.IssuedTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.KeyValueTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.NestedPolicyType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.QNameAssertionType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.RequestSecurityTokenTemplateType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SePartsType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SecureConversationTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SerElementsType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.SpnegoContextTokenType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.TokenAssertionType;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Factory;
import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.util._200702Validator;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl;

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
public class _200702PackageImpl extends EPackageImpl implements _200702Package {
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
	private EClass emptyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issuedTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedPolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qNameAssertionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestSecurityTokenTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureConversationTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sePartsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spnegoContextTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenAssertionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum includeTokenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType includeTokenOpenTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType includeTokenTypeObjectEDataType = null;

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
	 * @see org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _200702PackageImpl() {
		super(eNS_URI, _200702Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _200702Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _200702Package init() {
		if (isInited) return (_200702Package)EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI);

		// Obtain or create and register package
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _200702PackageImpl());

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
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		the_200702Package.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		the_200702Package.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_200702Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _200702Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_200702Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_200702Package.eNS_URI, the_200702Package);
		return the_200702Package;
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
	public EReference getDocumentRoot_AbsXPath() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlgorithmSuite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AsymmetricBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic128() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic128Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic128Sha256() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic128Sha256Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic192() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic192Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic192Sha256() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic192Sha256Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic256() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic256Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic256Sha256() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic256Sha256Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BootstrapPolicy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptBeforeSigning() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptedElements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptedParts() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptedSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptionToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptSignature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndorsingEncryptedSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndorsingSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HashPassword() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HttpBasicAuthentication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HttpDigestAuthentication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HttpsToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncludeTimestamp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InclusiveC14N() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InitiatorEncryptionToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InitiatorSignatureToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InitiatorToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IssuedToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KerberosToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyValueToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lax() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LaxTsFirst() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LaxTsLast() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Layout() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustNotSendAmend() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustNotSendCancel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustNotSendRenew() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportClientChallenge() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportIssuedTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefEmbeddedToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefEncryptedKey() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefExternalURI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefIssuerSerial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefKeyIdentifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportRefThumbprint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MustSupportServerChallenge() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoPassword() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OnlySignEntireHeadersAndBody() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProtectionToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProtectTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RecipientEncryptionToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RecipientSignatureToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RecipientToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireAppiesTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireClientCertificate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireClientEntropy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequiredElements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireDerivedKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireEmbeddedTokenReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireExplicitDerivedKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireExternalReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireExternalUriReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireImpliedDerivedKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireInternalReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireIssuerSerialReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireKeyIdentifierReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireRequestSecurityTokenCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireServerEntropy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireSignatureConfirmation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequireThumbprintReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RsaKeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SamlToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SC13SecurityContextToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecureConversationToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecurityContextToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedElements() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedEncryptedSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedEndorsingEncryptedSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedEndorsingSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedParts() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedSupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SOAPNormalization10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpnegoContextToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Strict() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_STRTransform10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupportingTokens() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SymmetricBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TripleDes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TripleDesRsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TripleDesSha256() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TripleDesSha256Rsa15() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Trust13() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsernameToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Wss10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Wss11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssGssKerberosV5ApReqToken11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssKerberosV5ApReqToken11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssRelV10Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssRelV10Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssRelV20Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssRelV20Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssSamlV11Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssSamlV11Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssSamlV20Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssUsernameToken10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssUsernameToken11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509Pkcs7Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509Pkcs7Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509PkiPathV1Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509PkiPathV1Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509V1Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509V3Token10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WssX509V3Token11() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509Token() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XPath10() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XPathFilter20() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IncludeToken() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		return emptyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Name() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Namespace() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_AnyAttribute() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssuedTokenType() {
		return issuedTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssuedTokenType_Issuer() {
		return (EReference)issuedTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedTokenType_IssuerName() {
		return (EAttribute)issuedTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssuedTokenType_RequestSecurityTokenTemplate() {
		return (EReference)issuedTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedTokenType_Any() {
		return (EAttribute)issuedTokenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedTokenType_IncludeToken() {
		return (EAttribute)issuedTokenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuedTokenType_AnyAttribute() {
		return (EAttribute)issuedTokenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueTokenType() {
		return keyValueTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueTokenType_Any() {
		return (EAttribute)keyValueTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueTokenType_IncludeToken() {
		return (EAttribute)keyValueTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueTokenType_AnyAttribute() {
		return (EAttribute)keyValueTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedPolicyType() {
		return nestedPolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedPolicyType_Any() {
		return (EAttribute)nestedPolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedPolicyType_AnyAttribute() {
		return (EAttribute)nestedPolicyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQNameAssertionType() {
		return qNameAssertionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQNameAssertionType_AnyAttribute() {
		return (EAttribute)qNameAssertionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestSecurityTokenTemplateType() {
		return requestSecurityTokenTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenTemplateType_Any() {
		return (EAttribute)requestSecurityTokenTemplateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenTemplateType_TrustVersion() {
		return (EAttribute)requestSecurityTokenTemplateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestSecurityTokenTemplateType_AnyAttribute() {
		return (EAttribute)requestSecurityTokenTemplateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureConversationTokenType() {
		return secureConversationTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureConversationTokenType_Issuer() {
		return (EReference)secureConversationTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConversationTokenType_IssuerName() {
		return (EAttribute)secureConversationTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConversationTokenType_Any() {
		return (EAttribute)secureConversationTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConversationTokenType_IncludeToken() {
		return (EAttribute)secureConversationTokenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConversationTokenType_AnyAttribute() {
		return (EAttribute)secureConversationTokenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSePartsType() {
		return sePartsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSePartsType_Body() {
		return (EReference)sePartsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSePartsType_Header() {
		return (EReference)sePartsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSePartsType_Attachments() {
		return (EReference)sePartsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSePartsType_Any() {
		return (EAttribute)sePartsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSePartsType_AnyAttribute() {
		return (EAttribute)sePartsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerElementsType() {
		return serElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerElementsType_XPath() {
		return (EAttribute)serElementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerElementsType_Any() {
		return (EAttribute)serElementsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerElementsType_XPathVersion() {
		return (EAttribute)serElementsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerElementsType_AnyAttribute() {
		return (EAttribute)serElementsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpnegoContextTokenType() {
		return spnegoContextTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpnegoContextTokenType_Issuer() {
		return (EReference)spnegoContextTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpnegoContextTokenType_IssuerName() {
		return (EAttribute)spnegoContextTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpnegoContextTokenType_Any() {
		return (EAttribute)spnegoContextTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpnegoContextTokenType_IncludeToken() {
		return (EAttribute)spnegoContextTokenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpnegoContextTokenType_AnyAttribute() {
		return (EAttribute)spnegoContextTokenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenAssertionType() {
		return tokenAssertionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenAssertionType_Issuer() {
		return (EReference)tokenAssertionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAssertionType_IssuerName() {
		return (EAttribute)tokenAssertionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAssertionType_Any() {
		return (EAttribute)tokenAssertionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAssertionType_IncludeToken() {
		return (EAttribute)tokenAssertionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenAssertionType_AnyAttribute() {
		return (EAttribute)tokenAssertionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIncludeTokenType() {
		return includeTokenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIncludeTokenOpenType() {
		return includeTokenOpenTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIncludeTokenTypeObject() {
		return includeTokenTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _200702Factory get_200702Factory() {
		return (_200702Factory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABS_XPATH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALGORITHM_SUITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASYMMETRIC_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC128);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC128_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC128_SHA256);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC128_SHA256_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC192);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC192_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC192_SHA256);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC192_SHA256_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC256);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC256_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC256_SHA256);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASIC256_SHA256_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOTSTRAP_POLICY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPT_BEFORE_SIGNING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTED_ELEMENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTED_PARTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTED_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENCRYPT_SIGNATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDORSING_ENCRYPTED_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDORSING_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HASH_PASSWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HTTP_BASIC_AUTHENTICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HTTP_DIGEST_AUTHENTICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HTTPS_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE_TIMESTAMP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUSIVE_C14N);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INITIATOR_ENCRYPTION_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INITIATOR_SIGNATURE_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INITIATOR_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISSUED_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KERBEROS_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_VALUE_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAX_TS_FIRST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAX_TS_LAST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAYOUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_NOT_SEND_AMEND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_NOT_SEND_CANCEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_NOT_SEND_RENEW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_CLIENT_CHALLENGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_ISSUED_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_EMBEDDED_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_ENCRYPTED_KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_EXTERNAL_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_ISSUER_SERIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_KEY_IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_REF_THUMBPRINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MUST_SUPPORT_SERVER_CHALLENGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NO_PASSWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ONLY_SIGN_ENTIRE_HEADERS_AND_BODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROTECTION_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROTECT_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECIPIENT_ENCRYPTION_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECIPIENT_SIGNATURE_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECIPIENT_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REL_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_APPIES_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_CLIENT_CERTIFICATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_CLIENT_ENTROPY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRED_ELEMENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_DERIVED_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_EMBEDDED_TOKEN_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_EXPLICIT_DERIVED_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_EXTERNAL_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_EXTERNAL_URI_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_IMPLIED_DERIVED_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_INTERNAL_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_ISSUER_SERIAL_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_KEY_IDENTIFIER_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_REQUEST_SECURITY_TOKEN_COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_SERVER_ENTROPY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_SIGNATURE_CONFIRMATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRE_THUMBPRINT_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSA_KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SAML_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SC13_SECURITY_CONTEXT_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURE_CONVERSATION_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY_CONTEXT_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_ELEMENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_ENCRYPTED_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_ENDORSING_ENCRYPTED_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_ENDORSING_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_PARTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOAP_NORMALIZATION10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPNEGO_CONTEXT_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRICT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STR_TRANSFORM10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUPPORTING_TOKENS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYMMETRIC_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORT_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORT_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIPLE_DES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIPLE_DES_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIPLE_DES_SHA256);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIPLE_DES_SHA256_RSA15);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRUST13);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USERNAME_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_GSS_KERBEROS_V5_AP_REQ_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_KERBEROS_V5_AP_REQ_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_REL_V10_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_REL_V10_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_REL_V20_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_REL_V20_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_SAML_V11_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_SAML_V11_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_SAML_V20_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_USERNAME_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_USERNAME_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509_PKCS7_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509_PKI_PATH_V1_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509V1_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509V3_TOKEN10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WSS_X509V3_TOKEN11);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X509_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XPATH10);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XPATH_FILTER20);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INCLUDE_TOKEN);

		emptyTypeEClass = createEClass(EMPTY_TYPE);

		headerTypeEClass = createEClass(HEADER_TYPE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__NAME);
		createEAttribute(headerTypeEClass, HEADER_TYPE__NAMESPACE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__ANY_ATTRIBUTE);

		issuedTokenTypeEClass = createEClass(ISSUED_TOKEN_TYPE);
		createEReference(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__ISSUER);
		createEAttribute(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__ISSUER_NAME);
		createEReference(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__REQUEST_SECURITY_TOKEN_TEMPLATE);
		createEAttribute(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__ANY);
		createEAttribute(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__INCLUDE_TOKEN);
		createEAttribute(issuedTokenTypeEClass, ISSUED_TOKEN_TYPE__ANY_ATTRIBUTE);

		keyValueTokenTypeEClass = createEClass(KEY_VALUE_TOKEN_TYPE);
		createEAttribute(keyValueTokenTypeEClass, KEY_VALUE_TOKEN_TYPE__ANY);
		createEAttribute(keyValueTokenTypeEClass, KEY_VALUE_TOKEN_TYPE__INCLUDE_TOKEN);
		createEAttribute(keyValueTokenTypeEClass, KEY_VALUE_TOKEN_TYPE__ANY_ATTRIBUTE);

		nestedPolicyTypeEClass = createEClass(NESTED_POLICY_TYPE);
		createEAttribute(nestedPolicyTypeEClass, NESTED_POLICY_TYPE__ANY);
		createEAttribute(nestedPolicyTypeEClass, NESTED_POLICY_TYPE__ANY_ATTRIBUTE);

		qNameAssertionTypeEClass = createEClass(QNAME_ASSERTION_TYPE);
		createEAttribute(qNameAssertionTypeEClass, QNAME_ASSERTION_TYPE__ANY_ATTRIBUTE);

		requestSecurityTokenTemplateTypeEClass = createEClass(REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE);
		createEAttribute(requestSecurityTokenTemplateTypeEClass, REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY);
		createEAttribute(requestSecurityTokenTemplateTypeEClass, REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__TRUST_VERSION);
		createEAttribute(requestSecurityTokenTemplateTypeEClass, REQUEST_SECURITY_TOKEN_TEMPLATE_TYPE__ANY_ATTRIBUTE);

		secureConversationTokenTypeEClass = createEClass(SECURE_CONVERSATION_TOKEN_TYPE);
		createEReference(secureConversationTokenTypeEClass, SECURE_CONVERSATION_TOKEN_TYPE__ISSUER);
		createEAttribute(secureConversationTokenTypeEClass, SECURE_CONVERSATION_TOKEN_TYPE__ISSUER_NAME);
		createEAttribute(secureConversationTokenTypeEClass, SECURE_CONVERSATION_TOKEN_TYPE__ANY);
		createEAttribute(secureConversationTokenTypeEClass, SECURE_CONVERSATION_TOKEN_TYPE__INCLUDE_TOKEN);
		createEAttribute(secureConversationTokenTypeEClass, SECURE_CONVERSATION_TOKEN_TYPE__ANY_ATTRIBUTE);

		sePartsTypeEClass = createEClass(SE_PARTS_TYPE);
		createEReference(sePartsTypeEClass, SE_PARTS_TYPE__BODY);
		createEReference(sePartsTypeEClass, SE_PARTS_TYPE__HEADER);
		createEReference(sePartsTypeEClass, SE_PARTS_TYPE__ATTACHMENTS);
		createEAttribute(sePartsTypeEClass, SE_PARTS_TYPE__ANY);
		createEAttribute(sePartsTypeEClass, SE_PARTS_TYPE__ANY_ATTRIBUTE);

		serElementsTypeEClass = createEClass(SER_ELEMENTS_TYPE);
		createEAttribute(serElementsTypeEClass, SER_ELEMENTS_TYPE__XPATH);
		createEAttribute(serElementsTypeEClass, SER_ELEMENTS_TYPE__ANY);
		createEAttribute(serElementsTypeEClass, SER_ELEMENTS_TYPE__XPATH_VERSION);
		createEAttribute(serElementsTypeEClass, SER_ELEMENTS_TYPE__ANY_ATTRIBUTE);

		spnegoContextTokenTypeEClass = createEClass(SPNEGO_CONTEXT_TOKEN_TYPE);
		createEReference(spnegoContextTokenTypeEClass, SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER);
		createEAttribute(spnegoContextTokenTypeEClass, SPNEGO_CONTEXT_TOKEN_TYPE__ISSUER_NAME);
		createEAttribute(spnegoContextTokenTypeEClass, SPNEGO_CONTEXT_TOKEN_TYPE__ANY);
		createEAttribute(spnegoContextTokenTypeEClass, SPNEGO_CONTEXT_TOKEN_TYPE__INCLUDE_TOKEN);
		createEAttribute(spnegoContextTokenTypeEClass, SPNEGO_CONTEXT_TOKEN_TYPE__ANY_ATTRIBUTE);

		tokenAssertionTypeEClass = createEClass(TOKEN_ASSERTION_TYPE);
		createEReference(tokenAssertionTypeEClass, TOKEN_ASSERTION_TYPE__ISSUER);
		createEAttribute(tokenAssertionTypeEClass, TOKEN_ASSERTION_TYPE__ISSUER_NAME);
		createEAttribute(tokenAssertionTypeEClass, TOKEN_ASSERTION_TYPE__ANY);
		createEAttribute(tokenAssertionTypeEClass, TOKEN_ASSERTION_TYPE__INCLUDE_TOKEN);
		createEAttribute(tokenAssertionTypeEClass, TOKEN_ASSERTION_TYPE__ANY_ATTRIBUTE);

		// Create enums
		includeTokenTypeEEnum = createEEnum(INCLUDE_TOKEN_TYPE);

		// Create data types
		includeTokenOpenTypeEDataType = createEDataType(INCLUDE_TOKEN_OPEN_TYPE);
		includeTokenTypeObjectEDataType = createEDataType(INCLUDE_TOKEN_TYPE_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbsXPath(), this.getQNameAssertionType(), null, "absXPath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AlgorithmSuite(), this.getNestedPolicyType(), null, "algorithmSuite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AsymmetricBinding(), this.getNestedPolicyType(), null, "asymmetricBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic128(), this.getQNameAssertionType(), null, "basic128", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic128Rsa15(), this.getQNameAssertionType(), null, "basic128Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic128Sha256(), this.getQNameAssertionType(), null, "basic128Sha256", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic128Sha256Rsa15(), this.getQNameAssertionType(), null, "basic128Sha256Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic192(), this.getQNameAssertionType(), null, "basic192", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic192Rsa15(), this.getQNameAssertionType(), null, "basic192Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic192Sha256(), this.getQNameAssertionType(), null, "basic192Sha256", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic192Sha256Rsa15(), this.getQNameAssertionType(), null, "basic192Sha256Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic256(), this.getQNameAssertionType(), null, "basic256", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic256Rsa15(), this.getQNameAssertionType(), null, "basic256Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic256Sha256(), this.getQNameAssertionType(), null, "basic256Sha256", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Basic256Sha256Rsa15(), this.getQNameAssertionType(), null, "basic256Sha256Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BootstrapPolicy(), this.getNestedPolicyType(), null, "bootstrapPolicy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptBeforeSigning(), this.getQNameAssertionType(), null, "encryptBeforeSigning", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptedElements(), this.getSerElementsType(), null, "encryptedElements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptedParts(), this.getSePartsType(), null, "encryptedParts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptedSupportingTokens(), this.getNestedPolicyType(), null, "encryptedSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptionToken(), this.getNestedPolicyType(), null, "encryptionToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EncryptSignature(), this.getQNameAssertionType(), null, "encryptSignature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EndorsingEncryptedSupportingTokens(), this.getNestedPolicyType(), null, "endorsingEncryptedSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EndorsingSupportingTokens(), this.getNestedPolicyType(), null, "endorsingSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HashPassword(), this.getQNameAssertionType(), null, "hashPassword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HttpBasicAuthentication(), this.getQNameAssertionType(), null, "httpBasicAuthentication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HttpDigestAuthentication(), this.getQNameAssertionType(), null, "httpDigestAuthentication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HttpsToken(), this.getTokenAssertionType(), null, "httpsToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IncludeTimestamp(), this.getQNameAssertionType(), null, "includeTimestamp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InclusiveC14N(), this.getQNameAssertionType(), null, "inclusiveC14N", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InitiatorEncryptionToken(), this.getNestedPolicyType(), null, "initiatorEncryptionToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InitiatorSignatureToken(), this.getNestedPolicyType(), null, "initiatorSignatureToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InitiatorToken(), this.getNestedPolicyType(), null, "initiatorToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IssuedToken(), this.getIssuedTokenType(), null, "issuedToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KerberosToken(), this.getTokenAssertionType(), null, "kerberosToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyValueToken(), this.getKeyValueTokenType(), null, "keyValueToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Lax(), this.getQNameAssertionType(), null, "lax", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LaxTsFirst(), this.getQNameAssertionType(), null, "laxTsFirst", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LaxTsLast(), this.getQNameAssertionType(), null, "laxTsLast", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Layout(), this.getNestedPolicyType(), null, "layout", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustNotSendAmend(), this.getQNameAssertionType(), null, "mustNotSendAmend", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustNotSendCancel(), this.getQNameAssertionType(), null, "mustNotSendCancel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustNotSendRenew(), this.getQNameAssertionType(), null, "mustNotSendRenew", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportClientChallenge(), this.getQNameAssertionType(), null, "mustSupportClientChallenge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportIssuedTokens(), this.getQNameAssertionType(), null, "mustSupportIssuedTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefEmbeddedToken(), this.getQNameAssertionType(), null, "mustSupportRefEmbeddedToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefEncryptedKey(), this.getQNameAssertionType(), null, "mustSupportRefEncryptedKey", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefExternalURI(), this.getQNameAssertionType(), null, "mustSupportRefExternalURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefIssuerSerial(), this.getQNameAssertionType(), null, "mustSupportRefIssuerSerial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefKeyIdentifier(), this.getQNameAssertionType(), null, "mustSupportRefKeyIdentifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportRefThumbprint(), this.getQNameAssertionType(), null, "mustSupportRefThumbprint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MustSupportServerChallenge(), this.getQNameAssertionType(), null, "mustSupportServerChallenge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NoPassword(), this.getQNameAssertionType(), null, "noPassword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OnlySignEntireHeadersAndBody(), this.getQNameAssertionType(), null, "onlySignEntireHeadersAndBody", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProtectionToken(), this.getNestedPolicyType(), null, "protectionToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProtectTokens(), this.getQNameAssertionType(), null, "protectTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RecipientEncryptionToken(), this.getNestedPolicyType(), null, "recipientEncryptionToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RecipientSignatureToken(), this.getNestedPolicyType(), null, "recipientSignatureToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RecipientToken(), this.getNestedPolicyType(), null, "recipientToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelToken(), this.getTokenAssertionType(), null, "relToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireAppiesTo(), this.getQNameAssertionType(), null, "requireAppiesTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireClientCertificate(), this.getQNameAssertionType(), null, "requireClientCertificate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireClientEntropy(), this.getQNameAssertionType(), null, "requireClientEntropy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequiredElements(), this.getSerElementsType(), null, "requiredElements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireDerivedKeys(), this.getQNameAssertionType(), null, "requireDerivedKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireEmbeddedTokenReference(), this.getQNameAssertionType(), null, "requireEmbeddedTokenReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireExplicitDerivedKeys(), this.getQNameAssertionType(), null, "requireExplicitDerivedKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireExternalReference(), this.getQNameAssertionType(), null, "requireExternalReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireExternalUriReference(), this.getQNameAssertionType(), null, "requireExternalUriReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireImpliedDerivedKeys(), this.getQNameAssertionType(), null, "requireImpliedDerivedKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireInternalReference(), this.getQNameAssertionType(), null, "requireInternalReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireIssuerSerialReference(), this.getQNameAssertionType(), null, "requireIssuerSerialReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireKeyIdentifierReference(), this.getQNameAssertionType(), null, "requireKeyIdentifierReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireRequestSecurityTokenCollection(), this.getQNameAssertionType(), null, "requireRequestSecurityTokenCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireServerEntropy(), this.getQNameAssertionType(), null, "requireServerEntropy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireSignatureConfirmation(), this.getQNameAssertionType(), null, "requireSignatureConfirmation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequireThumbprintReference(), this.getQNameAssertionType(), null, "requireThumbprintReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RsaKeyValue(), this.getQNameAssertionType(), null, "rsaKeyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SamlToken(), this.getTokenAssertionType(), null, "samlToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SC13SecurityContextToken(), this.getQNameAssertionType(), null, "sC13SecurityContextToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SecureConversationToken(), this.getSecureConversationTokenType(), null, "secureConversationToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SecurityContextToken(), this.getTokenAssertionType(), null, "securityContextToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureToken(), this.getNestedPolicyType(), null, "signatureToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedElements(), this.getSerElementsType(), null, "signedElements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedEncryptedSupportingTokens(), this.getNestedPolicyType(), null, "signedEncryptedSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedEndorsingEncryptedSupportingTokens(), this.getNestedPolicyType(), null, "signedEndorsingEncryptedSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedEndorsingSupportingTokens(), this.getNestedPolicyType(), null, "signedEndorsingSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedParts(), this.getSePartsType(), null, "signedParts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedSupportingTokens(), this.getNestedPolicyType(), null, "signedSupportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SOAPNormalization10(), this.getQNameAssertionType(), null, "sOAPNormalization10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpnegoContextToken(), this.getSpnegoContextTokenType(), null, "spnegoContextToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Strict(), this.getQNameAssertionType(), null, "strict", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_STRTransform10(), this.getQNameAssertionType(), null, "sTRTransform10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SupportingTokens(), this.getNestedPolicyType(), null, "supportingTokens", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SymmetricBinding(), this.getNestedPolicyType(), null, "symmetricBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransportBinding(), this.getNestedPolicyType(), null, "transportBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransportToken(), this.getNestedPolicyType(), null, "transportToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TripleDes(), this.getQNameAssertionType(), null, "tripleDes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TripleDesRsa15(), this.getQNameAssertionType(), null, "tripleDesRsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TripleDesSha256(), this.getQNameAssertionType(), null, "tripleDesSha256", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TripleDesSha256Rsa15(), this.getQNameAssertionType(), null, "tripleDesSha256Rsa15", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Trust13(), this.getNestedPolicyType(), null, "trust13", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsernameToken(), this.getTokenAssertionType(), null, "usernameToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Wss10(), this.getNestedPolicyType(), null, "wss10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Wss11(), this.getNestedPolicyType(), null, "wss11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssGssKerberosV5ApReqToken11(), this.getQNameAssertionType(), null, "wssGssKerberosV5ApReqToken11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssKerberosV5ApReqToken11(), this.getQNameAssertionType(), null, "wssKerberosV5ApReqToken11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssRelV10Token10(), this.getQNameAssertionType(), null, "wssRelV10Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssRelV10Token11(), this.getQNameAssertionType(), null, "wssRelV10Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssRelV20Token10(), this.getQNameAssertionType(), null, "wssRelV20Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssRelV20Token11(), this.getQNameAssertionType(), null, "wssRelV20Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssSamlV11Token10(), this.getQNameAssertionType(), null, "wssSamlV11Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssSamlV11Token11(), this.getQNameAssertionType(), null, "wssSamlV11Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssSamlV20Token11(), this.getQNameAssertionType(), null, "wssSamlV20Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssUsernameToken10(), this.getQNameAssertionType(), null, "wssUsernameToken10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssUsernameToken11(), this.getQNameAssertionType(), null, "wssUsernameToken11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509Pkcs7Token10(), this.getQNameAssertionType(), null, "wssX509Pkcs7Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509Pkcs7Token11(), this.getQNameAssertionType(), null, "wssX509Pkcs7Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509PkiPathV1Token10(), this.getQNameAssertionType(), null, "wssX509PkiPathV1Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509PkiPathV1Token11(), this.getQNameAssertionType(), null, "wssX509PkiPathV1Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509V1Token11(), this.getQNameAssertionType(), null, "wssX509V1Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509V3Token10(), this.getQNameAssertionType(), null, "wssX509V3Token10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WssX509V3Token11(), this.getQNameAssertionType(), null, "wssX509V3Token11", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X509Token(), this.getTokenAssertionType(), null, "x509Token", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XPath10(), this.getQNameAssertionType(), null, "xPath10", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XPathFilter20(), this.getQNameAssertionType(), null, "xPathFilter20", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyTypeEClass, EmptyType.class, "EmptyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerTypeEClass, HeaderType.class, "HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderType_Name(), theXMLTypePackage.getQName(), "name", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issuedTokenTypeEClass, IssuedTokenType.class, "IssuedTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssuedTokenType_Issuer(), theAddressingPackage.getEndpointReferenceType(), null, "issuer", null, 0, 1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssuedTokenType_IssuerName(), theXMLTypePackage.getAnyURI(), "issuerName", null, 0, 1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssuedTokenType_RequestSecurityTokenTemplate(), this.getRequestSecurityTokenTemplateType(), null, "requestSecurityTokenTemplate", null, 1, 1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssuedTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssuedTokenType_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssuedTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, IssuedTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueTokenTypeEClass, KeyValueTokenType.class, "KeyValueTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyValueTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValueTokenType_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, KeyValueTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValueTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, KeyValueTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedPolicyTypeEClass, NestedPolicyType.class, "NestedPolicyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNestedPolicyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, NestedPolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNestedPolicyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NestedPolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qNameAssertionTypeEClass, QNameAssertionType.class, "QNameAssertionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQNameAssertionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, QNameAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestSecurityTokenTemplateTypeEClass, RequestSecurityTokenTemplateType.class, "RequestSecurityTokenTemplateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestSecurityTokenTemplateType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RequestSecurityTokenTemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenTemplateType_TrustVersion(), theXMLTypePackage.getAnyURI(), "trustVersion", null, 0, 1, RequestSecurityTokenTemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestSecurityTokenTemplateType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RequestSecurityTokenTemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secureConversationTokenTypeEClass, SecureConversationTokenType.class, "SecureConversationTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecureConversationTokenType_Issuer(), theAddressingPackage.getEndpointReferenceType(), null, "issuer", null, 0, 1, SecureConversationTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConversationTokenType_IssuerName(), theXMLTypePackage.getAnyURI(), "issuerName", null, 0, 1, SecureConversationTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConversationTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SecureConversationTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConversationTokenType_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, SecureConversationTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConversationTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SecureConversationTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sePartsTypeEClass, SePartsType.class, "SePartsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSePartsType_Body(), this.getEmptyType(), null, "body", null, 0, 1, SePartsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSePartsType_Header(), this.getHeaderType(), null, "header", null, 0, -1, SePartsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSePartsType_Attachments(), this.getEmptyType(), null, "attachments", null, 0, 1, SePartsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSePartsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SePartsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSePartsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SePartsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serElementsTypeEClass, SerElementsType.class, "SerElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerElementsType_XPath(), theXMLTypePackage.getString(), "xPath", null, 1, -1, SerElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerElementsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SerElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerElementsType_XPathVersion(), theXMLTypePackage.getAnyURI(), "xPathVersion", null, 0, 1, SerElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerElementsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SerElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spnegoContextTokenTypeEClass, SpnegoContextTokenType.class, "SpnegoContextTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpnegoContextTokenType_Issuer(), theAddressingPackage.getEndpointReferenceType(), null, "issuer", null, 0, 1, SpnegoContextTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpnegoContextTokenType_IssuerName(), theXMLTypePackage.getAnyURI(), "issuerName", null, 0, 1, SpnegoContextTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpnegoContextTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SpnegoContextTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpnegoContextTokenType_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, SpnegoContextTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpnegoContextTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SpnegoContextTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenAssertionTypeEClass, TokenAssertionType.class, "TokenAssertionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenAssertionType_Issuer(), theAddressingPackage.getEndpointReferenceType(), null, "issuer", null, 0, 1, TokenAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAssertionType_IssuerName(), theXMLTypePackage.getAnyURI(), "issuerName", null, 0, 1, TokenAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAssertionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TokenAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAssertionType_IncludeToken(), this.getIncludeTokenOpenType(), "includeToken", null, 0, 1, TokenAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenAssertionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TokenAssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(includeTokenTypeEEnum, IncludeTokenType.class, "IncludeTokenType");
		addEEnumLiteral(includeTokenTypeEEnum, IncludeTokenType.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200702_WS_SECURITYPOLICY_INCLUDE_TOKEN_NEVER);
		addEEnumLiteral(includeTokenTypeEEnum, IncludeTokenType.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200702_WS_SECURITYPOLICY_INCLUDE_TOKEN_ONCE);
		addEEnumLiteral(includeTokenTypeEEnum, IncludeTokenType.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200702_WS_SECURITYPOLICY_INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT);
		addEEnumLiteral(includeTokenTypeEEnum, IncludeTokenType.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200702_WS_SECURITYPOLICY_INCLUDE_TOKEN_ALWAYS_TO_INITIATOR);
		addEEnumLiteral(includeTokenTypeEEnum, IncludeTokenType.HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200702_WS_SECURITYPOLICY_INCLUDE_TOKEN_ALWAYS);

		// Initialize data types
		initEDataType(includeTokenOpenTypeEDataType, Object.class, "IncludeTokenOpenType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(includeTokenTypeObjectEDataType, IncludeTokenType.class, "IncludeTokenTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getDocumentRoot_AbsXPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AbsXPath",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AlgorithmSuite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AlgorithmSuite",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AsymmetricBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AsymmetricBinding",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic128(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic128",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic128Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic128Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic128Sha256(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic128Sha256",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic128Sha256Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic128Sha256Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic192(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic192",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic192Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic192Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic192Sha256(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic192Sha256",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic192Sha256Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic192Sha256Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic256(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic256",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic256Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic256Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic256Sha256(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic256Sha256",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Basic256Sha256Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Basic256Sha256Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_BootstrapPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BootstrapPolicy",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptBeforeSigning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptBeforeSigning",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptedElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptedElements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptedParts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptedParts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptedSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptedSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptionToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptionToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EncryptSignature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptSignature",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EndorsingEncryptedSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndorsingEncryptedSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EndorsingSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndorsingSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_HashPassword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HashPassword",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_HttpBasicAuthentication(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HttpBasicAuthentication",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_HttpDigestAuthentication(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HttpDigestAuthentication",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_HttpsToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HttpsToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IncludeTimestamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IncludeTimestamp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InclusiveC14N(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InclusiveC14N",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InitiatorEncryptionToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InitiatorEncryptionToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InitiatorSignatureToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InitiatorSignatureToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InitiatorToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InitiatorToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IssuedToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuedToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_KerberosToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KerberosToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_KeyValueToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValueToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Lax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Lax",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LaxTsFirst(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LaxTsFirst",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LaxTsLast(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LaxTsLast",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Layout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Layout",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustNotSendAmend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustNotSendAmend",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustNotSendCancel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustNotSendCancel",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustNotSendRenew(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustNotSendRenew",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportClientChallenge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportClientChallenge",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportIssuedTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportIssuedTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefEmbeddedToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefEmbeddedToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefEncryptedKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefEncryptedKey",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefExternalURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefExternalURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefIssuerSerial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefIssuerSerial",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefKeyIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefKeyIdentifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportRefThumbprint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportRefThumbprint",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MustSupportServerChallenge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MustSupportServerChallenge",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_NoPassword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NoPassword",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_OnlySignEntireHeadersAndBody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OnlySignEntireHeadersAndBody",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ProtectionToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProtectionToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ProtectTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProtectTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RecipientEncryptionToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RecipientEncryptionToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RecipientSignatureToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RecipientSignatureToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RecipientToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RecipientToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RelToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireAppiesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireAppiesTo",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireClientCertificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireClientCertificate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireClientEntropy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireClientEntropy",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequiredElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequiredElements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireDerivedKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireDerivedKeys",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireEmbeddedTokenReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireEmbeddedTokenReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireExplicitDerivedKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireExplicitDerivedKeys",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireExternalReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireExternalReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireExternalUriReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireExternalUriReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireImpliedDerivedKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireImpliedDerivedKeys",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireInternalReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireInternalReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireIssuerSerialReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireIssuerSerialReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireKeyIdentifierReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireKeyIdentifierReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireRequestSecurityTokenCollection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireRequestSecurityTokenCollection",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireServerEntropy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireServerEntropy",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireSignatureConfirmation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireSignatureConfirmation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RequireThumbprintReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequireThumbprintReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RsaKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RsaKeyValue",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SamlToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SamlToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SC13SecurityContextToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SC13SecurityContextToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecureConversationToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecureConversationToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityContextToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityContextToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignatureToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedElements",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedEncryptedSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedEncryptedSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedEndorsingEncryptedSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedEndorsingEncryptedSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedEndorsingSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedEndorsingSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedParts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedParts",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SignedSupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedSupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SOAPNormalization10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOAPNormalization10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SpnegoContextToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpnegoContextToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Strict(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Strict",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_STRTransform10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "STRTransform10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SupportingTokens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupportingTokens",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SymmetricBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SymmetricBinding",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TransportBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransportBinding",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TransportToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransportToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TripleDes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TripleDes",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TripleDesRsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TripleDesRsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TripleDesSha256(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TripleDesSha256",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TripleDesSha256Rsa15(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TripleDesSha256Rsa15",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Trust13(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trust13",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UsernameToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsernameToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Wss10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Wss10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Wss11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Wss11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssGssKerberosV5ApReqToken11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssGssKerberosV5ApReqToken11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssKerberosV5ApReqToken11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssKerberosV5ApReqToken11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssRelV10Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssRelV10Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssRelV10Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssRelV10Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssRelV20Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssRelV20Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssRelV20Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssRelV20Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssSamlV11Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssSamlV11Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssSamlV11Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssSamlV11Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssSamlV20Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssSamlV20Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssUsernameToken10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssUsernameToken10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssUsernameToken11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssUsernameToken11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509Pkcs7Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509Pkcs7Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509Pkcs7Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509Pkcs7Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509PkiPathV1Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509PkiPathV1Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509PkiPathV1Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509PkiPathV1Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509V1Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509V1Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509V3Token10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509V3Token10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WssX509V3Token11(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WssX509V3Token11",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_X509Token(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Token",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_XPath10(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPath10",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_XPathFilter20(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPathFilter20",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (emptyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EmptyType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (headerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "HeaderType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHeaderType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (getHeaderType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Namespace"
		   });		
		addAnnotation
		  (getHeaderType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (includeTokenOpenTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IncludeTokenOpenType",
			 "memberTypes", "IncludeTokenType http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (includeTokenTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "IncludeTokenType"
		   });		
		addAnnotation
		  (includeTokenTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "IncludeTokenType:Object",
			 "baseType", "IncludeTokenType"
		   });		
		addAnnotation
		  (issuedTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IssuedTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIssuedTokenType_Issuer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Issuer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIssuedTokenType_IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIssuedTokenType_RequestSecurityTokenTemplate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestSecurityTokenTemplate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIssuedTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getIssuedTokenType_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIssuedTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
		   });		
		addAnnotation
		  (keyValueTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyValueTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeyValueTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getKeyValueTokenType_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (nestedPolicyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NestedPolicyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNestedPolicyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getNestedPolicyType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (qNameAssertionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QNameAssertionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getQNameAssertionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (requestSecurityTokenTemplateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestSecurityTokenTemplateType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestSecurityTokenTemplateType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getRequestSecurityTokenTemplateType_TrustVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TrustVersion"
		   });		
		addAnnotation
		  (getRequestSecurityTokenTemplateType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (secureConversationTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SecureConversationTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSecureConversationTokenType_Issuer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Issuer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecureConversationTokenType_IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecureConversationTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getSecureConversationTokenType_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecureConversationTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (sePartsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SePartsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSePartsType_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSePartsType_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSePartsType_Attachments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attachments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSePartsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSePartsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (serElementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SerElementsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSerElementsType_XPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPath",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSerElementsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSerElementsType_XPathVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "XPathVersion"
		   });		
		addAnnotation
		  (getSerElementsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (spnegoContextTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SpnegoContextTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpnegoContextTokenType_Issuer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Issuer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpnegoContextTokenType_IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpnegoContextTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getSpnegoContextTokenType_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpnegoContextTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (tokenAssertionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TokenAssertionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTokenAssertionType_Issuer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Issuer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTokenAssertionType_IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTokenAssertionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getTokenAssertionType_IncludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeToken",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTokenAssertionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
		   });
	}

} //_200702PackageImpl
