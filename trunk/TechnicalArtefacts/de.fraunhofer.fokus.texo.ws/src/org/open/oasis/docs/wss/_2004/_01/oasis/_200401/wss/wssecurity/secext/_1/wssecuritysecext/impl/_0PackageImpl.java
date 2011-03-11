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
package org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.AttributedString;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.AttributedString1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.BinarySecurityTokenType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.BinarySecurityTokenType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.DocumentRoot;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EmbeddedType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EmbeddedType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EncodedString;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.EncodedString1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.KeyIdentifierType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.KeyIdentifierType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.PasswordString;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.PasswordString1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.ReferenceType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.ReferenceType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityHeaderType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityHeaderType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.SecurityTokenReferenceType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TransformationParametersType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.TransformationParametersType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.UsernameTokenType;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.UsernameTokenType1;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Factory;
import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.util._0Validator;

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
public class _0PackageImpl extends EPackageImpl implements _0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedString1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySecurityTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySecurityTokenType1EClass = null;

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
	private EClass embeddedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodedString1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIdentifierType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordString1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityHeaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityHeaderType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityTokenReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityTokenReferenceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationParametersType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usernameTokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usernameTokenType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultcodeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType faultcodeEnum1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tUsageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tUsage1EDataType = null;

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
	 * @see org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _0PackageImpl() {
		super(eNS_URI, _0Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _0Package init() {
		if (isInited) return (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);

		// Obtain or create and register package
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _0PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) : EnvelopePackage.eINSTANCE);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		the_0Package.createPackageContents();
		theEnvelopePackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		the_0Package.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_0Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _0Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_0Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_0Package.eNS_URI, the_0Package);
		return the_0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedString() {
		return attributedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString_Value() {
		return (EAttribute)attributedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString_Id() {
		return (EAttribute)attributedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString_AnyAttribute() {
		return (EAttribute)attributedStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedString1() {
		return attributedString1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString1_Value() {
		return (EAttribute)attributedString1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString1_Id() {
		return (EAttribute)attributedString1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedString1_AnyAttribute() {
		return (EAttribute)attributedString1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinarySecurityTokenType() {
		return binarySecurityTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinarySecurityTokenType_ValueType() {
		return (EAttribute)binarySecurityTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinarySecurityTokenType1() {
		return binarySecurityTokenType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinarySecurityTokenType1_ValueType() {
		return (EAttribute)binarySecurityTokenType1EClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_BinarySecurityToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Embedded() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyIdentifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Nonce() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Password() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Security() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecurityTokenReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformationParameters() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsernameToken() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Usage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinarySecurityToken1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Embedded1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyIdentifier1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Nonce1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Password1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Security1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecurityTokenReference1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformationParameters1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsernameToken1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Usage1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedType() {
		return embeddedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType_Group() {
		return (EAttribute)embeddedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType_Any() {
		return (EAttribute)embeddedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType_ValueType() {
		return (EAttribute)embeddedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType_AnyAttribute() {
		return (EAttribute)embeddedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedType1() {
		return embeddedType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType1_Group() {
		return (EAttribute)embeddedType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType1_Any() {
		return (EAttribute)embeddedType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType1_ValueType() {
		return (EAttribute)embeddedType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedType1_AnyAttribute() {
		return (EAttribute)embeddedType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncodedString() {
		return encodedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodedString_EncodingType() {
		return (EAttribute)encodedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncodedString1() {
		return encodedString1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodedString1_EncodingType() {
		return (EAttribute)encodedString1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIdentifierType() {
		return keyIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIdentifierType_ValueType() {
		return (EAttribute)keyIdentifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIdentifierType1() {
		return keyIdentifierType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIdentifierType1_ValueType() {
		return (EAttribute)keyIdentifierType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordString() {
		return passwordStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordString_Type() {
		return (EAttribute)passwordStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordString1() {
		return passwordString1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordString1_Type() {
		return (EAttribute)passwordString1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_URI() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_ValueType() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_AnyAttribute() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType1() {
		return referenceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_URI() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_ValueType() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_AnyAttribute() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityHeaderType() {
		return securityHeaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityHeaderType_Any() {
		return (EAttribute)securityHeaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityHeaderType_AnyAttribute() {
		return (EAttribute)securityHeaderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityHeaderType1() {
		return securityHeaderType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityHeaderType1_Any() {
		return (EAttribute)securityHeaderType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityHeaderType1_AnyAttribute() {
		return (EAttribute)securityHeaderType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityTokenReferenceType() {
		return securityTokenReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType_Group() {
		return (EAttribute)securityTokenReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType_Any() {
		return (EAttribute)securityTokenReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType_Id() {
		return (EAttribute)securityTokenReferenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType_Usage() {
		return (EAttribute)securityTokenReferenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType_AnyAttribute() {
		return (EAttribute)securityTokenReferenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityTokenReferenceType1() {
		return securityTokenReferenceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType1_Group() {
		return (EAttribute)securityTokenReferenceType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType1_Any() {
		return (EAttribute)securityTokenReferenceType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType1_Id() {
		return (EAttribute)securityTokenReferenceType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType1_Usage() {
		return (EAttribute)securityTokenReferenceType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityTokenReferenceType1_AnyAttribute() {
		return (EAttribute)securityTokenReferenceType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationParametersType() {
		return transformationParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationParametersType_Any() {
		return (EAttribute)transformationParametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationParametersType_AnyAttribute() {
		return (EAttribute)transformationParametersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationParametersType1() {
		return transformationParametersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationParametersType1_Any() {
		return (EAttribute)transformationParametersType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationParametersType1_AnyAttribute() {
		return (EAttribute)transformationParametersType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsernameTokenType() {
		return usernameTokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsernameTokenType_Username() {
		return (EReference)usernameTokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType_Any() {
		return (EAttribute)usernameTokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType_Id() {
		return (EAttribute)usernameTokenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType_AnyAttribute() {
		return (EAttribute)usernameTokenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsernameTokenType1() {
		return usernameTokenType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsernameTokenType1_Username() {
		return (EReference)usernameTokenType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType1_Any() {
		return (EAttribute)usernameTokenType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType1_Id() {
		return (EAttribute)usernameTokenType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsernameTokenType1_AnyAttribute() {
		return (EAttribute)usernameTokenType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultcodeEnum() {
		return faultcodeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFaultcodeEnum1() {
		return faultcodeEnum1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTUsage() {
		return tUsageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTUsage1() {
		return tUsage1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Factory get_0Factory() {
		return (_0Factory)getEFactoryInstance();
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
		attributedStringEClass = createEClass(ATTRIBUTED_STRING);
		createEAttribute(attributedStringEClass, ATTRIBUTED_STRING__VALUE);
		createEAttribute(attributedStringEClass, ATTRIBUTED_STRING__ID);
		createEAttribute(attributedStringEClass, ATTRIBUTED_STRING__ANY_ATTRIBUTE);

		attributedString1EClass = createEClass(ATTRIBUTED_STRING1);
		createEAttribute(attributedString1EClass, ATTRIBUTED_STRING1__VALUE);
		createEAttribute(attributedString1EClass, ATTRIBUTED_STRING1__ID);
		createEAttribute(attributedString1EClass, ATTRIBUTED_STRING1__ANY_ATTRIBUTE);

		binarySecurityTokenTypeEClass = createEClass(BINARY_SECURITY_TOKEN_TYPE);
		createEAttribute(binarySecurityTokenTypeEClass, BINARY_SECURITY_TOKEN_TYPE__VALUE_TYPE);

		binarySecurityTokenType1EClass = createEClass(BINARY_SECURITY_TOKEN_TYPE1);
		createEAttribute(binarySecurityTokenType1EClass, BINARY_SECURITY_TOKEN_TYPE1__VALUE_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_SECURITY_TOKEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMBEDDED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NONCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PASSWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USERNAME_TOKEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_SECURITY_TOKEN1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMBEDDED1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_IDENTIFIER1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NONCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PASSWORD1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECURITY_TOKEN_REFERENCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMATION_PARAMETERS1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USERNAME_TOKEN1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USAGE1);

		embeddedTypeEClass = createEClass(EMBEDDED_TYPE);
		createEAttribute(embeddedTypeEClass, EMBEDDED_TYPE__GROUP);
		createEAttribute(embeddedTypeEClass, EMBEDDED_TYPE__ANY);
		createEAttribute(embeddedTypeEClass, EMBEDDED_TYPE__VALUE_TYPE);
		createEAttribute(embeddedTypeEClass, EMBEDDED_TYPE__ANY_ATTRIBUTE);

		embeddedType1EClass = createEClass(EMBEDDED_TYPE1);
		createEAttribute(embeddedType1EClass, EMBEDDED_TYPE1__GROUP);
		createEAttribute(embeddedType1EClass, EMBEDDED_TYPE1__ANY);
		createEAttribute(embeddedType1EClass, EMBEDDED_TYPE1__VALUE_TYPE);
		createEAttribute(embeddedType1EClass, EMBEDDED_TYPE1__ANY_ATTRIBUTE);

		encodedStringEClass = createEClass(ENCODED_STRING);
		createEAttribute(encodedStringEClass, ENCODED_STRING__ENCODING_TYPE);

		encodedString1EClass = createEClass(ENCODED_STRING1);
		createEAttribute(encodedString1EClass, ENCODED_STRING1__ENCODING_TYPE);

		keyIdentifierTypeEClass = createEClass(KEY_IDENTIFIER_TYPE);
		createEAttribute(keyIdentifierTypeEClass, KEY_IDENTIFIER_TYPE__VALUE_TYPE);

		keyIdentifierType1EClass = createEClass(KEY_IDENTIFIER_TYPE1);
		createEAttribute(keyIdentifierType1EClass, KEY_IDENTIFIER_TYPE1__VALUE_TYPE);

		passwordStringEClass = createEClass(PASSWORD_STRING);
		createEAttribute(passwordStringEClass, PASSWORD_STRING__TYPE);

		passwordString1EClass = createEClass(PASSWORD_STRING1);
		createEAttribute(passwordString1EClass, PASSWORD_STRING1__TYPE);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__URI);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__VALUE_TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ANY_ATTRIBUTE);

		referenceType1EClass = createEClass(REFERENCE_TYPE1);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__URI);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__VALUE_TYPE);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__ANY_ATTRIBUTE);

		securityHeaderTypeEClass = createEClass(SECURITY_HEADER_TYPE);
		createEAttribute(securityHeaderTypeEClass, SECURITY_HEADER_TYPE__ANY);
		createEAttribute(securityHeaderTypeEClass, SECURITY_HEADER_TYPE__ANY_ATTRIBUTE);

		securityHeaderType1EClass = createEClass(SECURITY_HEADER_TYPE1);
		createEAttribute(securityHeaderType1EClass, SECURITY_HEADER_TYPE1__ANY);
		createEAttribute(securityHeaderType1EClass, SECURITY_HEADER_TYPE1__ANY_ATTRIBUTE);

		securityTokenReferenceTypeEClass = createEClass(SECURITY_TOKEN_REFERENCE_TYPE);
		createEAttribute(securityTokenReferenceTypeEClass, SECURITY_TOKEN_REFERENCE_TYPE__GROUP);
		createEAttribute(securityTokenReferenceTypeEClass, SECURITY_TOKEN_REFERENCE_TYPE__ANY);
		createEAttribute(securityTokenReferenceTypeEClass, SECURITY_TOKEN_REFERENCE_TYPE__ID);
		createEAttribute(securityTokenReferenceTypeEClass, SECURITY_TOKEN_REFERENCE_TYPE__USAGE);
		createEAttribute(securityTokenReferenceTypeEClass, SECURITY_TOKEN_REFERENCE_TYPE__ANY_ATTRIBUTE);

		securityTokenReferenceType1EClass = createEClass(SECURITY_TOKEN_REFERENCE_TYPE1);
		createEAttribute(securityTokenReferenceType1EClass, SECURITY_TOKEN_REFERENCE_TYPE1__GROUP);
		createEAttribute(securityTokenReferenceType1EClass, SECURITY_TOKEN_REFERENCE_TYPE1__ANY);
		createEAttribute(securityTokenReferenceType1EClass, SECURITY_TOKEN_REFERENCE_TYPE1__ID);
		createEAttribute(securityTokenReferenceType1EClass, SECURITY_TOKEN_REFERENCE_TYPE1__USAGE);
		createEAttribute(securityTokenReferenceType1EClass, SECURITY_TOKEN_REFERENCE_TYPE1__ANY_ATTRIBUTE);

		transformationParametersTypeEClass = createEClass(TRANSFORMATION_PARAMETERS_TYPE);
		createEAttribute(transformationParametersTypeEClass, TRANSFORMATION_PARAMETERS_TYPE__ANY);
		createEAttribute(transformationParametersTypeEClass, TRANSFORMATION_PARAMETERS_TYPE__ANY_ATTRIBUTE);

		transformationParametersType1EClass = createEClass(TRANSFORMATION_PARAMETERS_TYPE1);
		createEAttribute(transformationParametersType1EClass, TRANSFORMATION_PARAMETERS_TYPE1__ANY);
		createEAttribute(transformationParametersType1EClass, TRANSFORMATION_PARAMETERS_TYPE1__ANY_ATTRIBUTE);

		usernameTokenTypeEClass = createEClass(USERNAME_TOKEN_TYPE);
		createEReference(usernameTokenTypeEClass, USERNAME_TOKEN_TYPE__USERNAME);
		createEAttribute(usernameTokenTypeEClass, USERNAME_TOKEN_TYPE__ANY);
		createEAttribute(usernameTokenTypeEClass, USERNAME_TOKEN_TYPE__ID);
		createEAttribute(usernameTokenTypeEClass, USERNAME_TOKEN_TYPE__ANY_ATTRIBUTE);

		usernameTokenType1EClass = createEClass(USERNAME_TOKEN_TYPE1);
		createEReference(usernameTokenType1EClass, USERNAME_TOKEN_TYPE1__USERNAME);
		createEAttribute(usernameTokenType1EClass, USERNAME_TOKEN_TYPE1__ANY);
		createEAttribute(usernameTokenType1EClass, USERNAME_TOKEN_TYPE1__ID);
		createEAttribute(usernameTokenType1EClass, USERNAME_TOKEN_TYPE1__ANY_ATTRIBUTE);

		// Create data types
		faultcodeEnumEDataType = createEDataType(FAULTCODE_ENUM);
		faultcodeEnum1EDataType = createEDataType(FAULTCODE_ENUM1);
		tUsageEDataType = createEDataType(TUSAGE);
		tUsage1EDataType = createEDataType(TUSAGE1);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binarySecurityTokenTypeEClass.getESuperTypes().add(this.getEncodedString());
		binarySecurityTokenType1EClass.getESuperTypes().add(this.getEncodedString1());
		encodedStringEClass.getESuperTypes().add(this.getAttributedString());
		encodedString1EClass.getESuperTypes().add(this.getAttributedString1());
		keyIdentifierTypeEClass.getESuperTypes().add(this.getEncodedString());
		keyIdentifierType1EClass.getESuperTypes().add(this.getEncodedString1());
		passwordStringEClass.getESuperTypes().add(this.getAttributedString());
		passwordString1EClass.getESuperTypes().add(this.getAttributedString1());

		// Initialize classes and features; add operations and parameters
		initEClass(attributedStringEClass, AttributedString.class, "AttributedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AttributedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AttributedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedString_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedString1EClass, AttributedString1.class, "AttributedString1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedString1_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AttributedString1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedString1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AttributedString1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedString1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedString1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binarySecurityTokenTypeEClass, BinarySecurityTokenType.class, "BinarySecurityTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinarySecurityTokenType_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, BinarySecurityTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binarySecurityTokenType1EClass, BinarySecurityTokenType1.class, "BinarySecurityTokenType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinarySecurityTokenType1_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, BinarySecurityTokenType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BinarySecurityToken(), this.getBinarySecurityTokenType1(), null, "binarySecurityToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Embedded(), this.getEmbeddedType1(), null, "embedded", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyIdentifier(), this.getKeyIdentifierType1(), null, "keyIdentifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Nonce(), this.getEncodedString1(), null, "nonce", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Password(), this.getPasswordString1(), null, "password", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference(), this.getReferenceType1(), null, "reference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Security(), this.getSecurityHeaderType1(), null, "security", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SecurityTokenReference(), this.getSecurityTokenReferenceType1(), null, "securityTokenReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransformationParameters(), this.getTransformationParametersType1(), null, "transformationParameters", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsernameToken(), this.getUsernameTokenType1(), null, "usernameToken", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Usage(), this.getTUsage1(), "usage", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BinarySecurityToken1(), this.getBinarySecurityTokenType(), null, "binarySecurityToken1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Embedded1(), this.getEmbeddedType(), null, "embedded1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyIdentifier1(), this.getKeyIdentifierType(), null, "keyIdentifier1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Nonce1(), this.getEncodedString(), null, "nonce1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Password1(), this.getPasswordString(), null, "password1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference1(), this.getReferenceType(), null, "reference1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Security1(), this.getSecurityHeaderType(), null, "security1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SecurityTokenReference1(), this.getSecurityTokenReferenceType(), null, "securityTokenReference1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransformationParameters1(), this.getTransformationParametersType(), null, "transformationParameters1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UsernameToken1(), this.getUsernameTokenType(), null, "usernameToken1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Usage1(), this.getTUsage(), "usage1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedTypeEClass, EmbeddedType.class, "EmbeddedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EmbeddedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EmbeddedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, EmbeddedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EmbeddedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedType1EClass, EmbeddedType1.class, "EmbeddedType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EmbeddedType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EmbeddedType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType1_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, EmbeddedType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EmbeddedType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodedStringEClass, EncodedString.class, "EncodedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncodedString_EncodingType(), theXMLTypePackage.getAnyURI(), "encodingType", null, 0, 1, EncodedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodedString1EClass, EncodedString1.class, "EncodedString1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncodedString1_EncodingType(), theXMLTypePackage.getAnyURI(), "encodingType", null, 0, 1, EncodedString1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIdentifierTypeEClass, KeyIdentifierType.class, "KeyIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIdentifierType_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, KeyIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIdentifierType1EClass, KeyIdentifierType1.class, "KeyIdentifierType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIdentifierType1_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, KeyIdentifierType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordStringEClass, PasswordString.class, "PasswordString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPasswordString_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, PasswordString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordString1EClass, PasswordString1.class, "PasswordString1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPasswordString1_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, PasswordString1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceType1EClass, ReferenceType1.class, "ReferenceType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceType1_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_ValueType(), theXMLTypePackage.getAnyURI(), "valueType", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityHeaderTypeEClass, SecurityHeaderType.class, "SecurityHeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityHeaderType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SecurityHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityHeaderType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SecurityHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityHeaderType1EClass, SecurityHeaderType1.class, "SecurityHeaderType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityHeaderType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SecurityHeaderType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityHeaderType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SecurityHeaderType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityTokenReferenceTypeEClass, SecurityTokenReferenceType.class, "SecurityTokenReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityTokenReferenceType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SecurityTokenReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SecurityTokenReferenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityTokenReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType_Usage(), this.getTUsage(), "usage", null, 0, 1, SecurityTokenReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SecurityTokenReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityTokenReferenceType1EClass, SecurityTokenReferenceType1.class, "SecurityTokenReferenceType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityTokenReferenceType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SecurityTokenReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SecurityTokenReferenceType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SecurityTokenReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType1_Usage(), this.getTUsage1(), "usage", null, 0, 1, SecurityTokenReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityTokenReferenceType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SecurityTokenReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationParametersTypeEClass, TransformationParametersType.class, "TransformationParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationParametersType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformationParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationParametersType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TransformationParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationParametersType1EClass, TransformationParametersType1.class, "TransformationParametersType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationParametersType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformationParametersType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformationParametersType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TransformationParametersType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usernameTokenTypeEClass, UsernameTokenType.class, "UsernameTokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsernameTokenType_Username(), this.getAttributedString(), null, "username", null, 1, 1, UsernameTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, UsernameTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UsernameTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UsernameTokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usernameTokenType1EClass, UsernameTokenType1.class, "UsernameTokenType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsernameTokenType1_Username(), this.getAttributedString1(), null, "username", null, 1, 1, UsernameTokenType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, UsernameTokenType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UsernameTokenType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsernameTokenType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UsernameTokenType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(faultcodeEnumEDataType, QName.class, "FaultcodeEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(faultcodeEnum1EDataType, QName.class, "FaultcodeEnum1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tUsageEDataType, List.class, "TUsage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tUsage1EDataType, List.class, "TUsage1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (attributedStringEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedString_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAttributedString_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getAttributedString_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (attributedString1EClass, 
		   source, 
		   new String[] {
			 "name", "AttributedString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedString1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAttributedString1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getAttributedString1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (binarySecurityTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BinarySecurityTokenType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinarySecurityTokenType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });			
		addAnnotation
		  (binarySecurityTokenType1EClass, 
		   source, 
		   new String[] {
			 "name", "BinarySecurityTokenType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBinarySecurityTokenType1_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
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
		  (getDocumentRoot_BinarySecurityToken(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinarySecurityToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Embedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Embedded",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_KeyIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Nonce(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Nonce",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Password(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Password",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Security(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Security",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityTokenReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityTokenReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TransformationParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransformationParameters",
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
		  (getDocumentRoot_Usage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Usage",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_BinarySecurityToken1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinarySecurityToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Embedded1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Embedded",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_KeyIdentifier1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Nonce1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Nonce",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Password1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Password",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Reference1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Security1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Security",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SecurityTokenReference1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SecurityTokenReference",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TransformationParameters1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransformationParameters",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_UsernameToken1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UsernameToken",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Usage1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Usage",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (embeddedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EmbeddedType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddedType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEmbeddedType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEmbeddedType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getEmbeddedType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (embeddedType1EClass, 
		   source, 
		   new String[] {
			 "name", "EmbeddedType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddedType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEmbeddedType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEmbeddedType1_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getEmbeddedType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (encodedStringEClass, 
		   source, 
		   new String[] {
			 "name", "EncodedString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getEncodedString_EncodingType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EncodingType"
		   });			
		addAnnotation
		  (encodedString1EClass, 
		   source, 
		   new String[] {
			 "name", "EncodedString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getEncodedString1_EncodingType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EncodingType"
		   });		
		addAnnotation
		  (faultcodeEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "FaultcodeEnum",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedSecurityToken {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedAlgorithm {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurity {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurityToken {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedAuthentication {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedCheck {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenUnavailable"
		   });		
		addAnnotation
		  (faultcodeEnum1EDataType, 
		   source, 
		   new String[] {
			 "name", "FaultcodeEnum",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedSecurityToken {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UnsupportedAlgorithm {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurity {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}InvalidSecurityToken {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedAuthentication {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}FailedCheck {http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenUnavailable"
		   });			
		addAnnotation
		  (keyIdentifierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyIdentifierType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getKeyIdentifierType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });			
		addAnnotation
		  (keyIdentifierType1EClass, 
		   source, 
		   new String[] {
			 "name", "KeyIdentifierType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getKeyIdentifierType1_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });			
		addAnnotation
		  (passwordStringEClass, 
		   source, 
		   new String[] {
			 "name", "PasswordString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPasswordString_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });			
		addAnnotation
		  (passwordString1EClass, 
		   source, 
		   new String[] {
			 "name", "PasswordString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPasswordString1_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });			
		addAnnotation
		  (referenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getReferenceType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (getReferenceType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getReferenceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (referenceType1EClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getReferenceType1_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (getReferenceType1_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getReferenceType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });			
		addAnnotation
		  (securityHeaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SecurityHeaderType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSecurityHeaderType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSecurityHeaderType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (securityHeaderType1EClass, 
		   source, 
		   new String[] {
			 "name", "SecurityHeaderType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSecurityHeaderType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getSecurityHeaderType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (securityTokenReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SecurityTokenReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getSecurityTokenReferenceType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });			
		addAnnotation
		  (getSecurityTokenReferenceType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });			
		addAnnotation
		  (securityTokenReferenceType1EClass, 
		   source, 
		   new String[] {
			 "name", "SecurityTokenReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getSecurityTokenReferenceType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });			
		addAnnotation
		  (getSecurityTokenReferenceType1_Usage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecurityTokenReferenceType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });			
		addAnnotation
		  (transformationParametersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransformationParametersType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTransformationParametersType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getTransformationParametersType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (transformationParametersType1EClass, 
		   source, 
		   new String[] {
			 "name", "TransformationParametersType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTransformationParametersType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getTransformationParametersType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (tUsageEDataType, 
		   source, 
		   new String[] {
			 "name", "tUsage",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });			
		addAnnotation
		  (tUsage1EDataType, 
		   source, 
		   new String[] {
			 "name", "tUsage",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });			
		addAnnotation
		  (usernameTokenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UsernameTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUsernameTokenType_Username(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Username",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUsernameTokenType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getUsernameTokenType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getUsernameTokenType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (usernameTokenType1EClass, 
		   source, 
		   new String[] {
			 "name", "UsernameTokenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUsernameTokenType1_Username(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Username",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUsernameTokenType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getUsernameTokenType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
		   });		
		addAnnotation
		  (getUsernameTokenType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
