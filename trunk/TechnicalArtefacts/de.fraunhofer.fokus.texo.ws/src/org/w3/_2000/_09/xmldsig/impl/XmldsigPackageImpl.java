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
package org.w3._2000._09.xmldsig.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy._200702Package;

import org.open.oasis.docs.ws.sx.ws.securitypolicy.wssecuritypolicy.impl._200702PackageImpl;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package;

import org.open.oasis.docs.ws.sx.ws.trust.wstrust.impl._200512PackageImpl;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl._0PackageImpl;

import org.w3._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3._2000._09.xmldsig.CanonicalizationMethodType1;
import org.w3._2000._09.xmldsig.DSAKeyValueType;
import org.w3._2000._09.xmldsig.DSAKeyValueType1;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.DigestMethodType1;
import org.w3._2000._09.xmldsig.DocumentRoot;
import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.KeyInfoType1;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.KeyValueType1;
import org.w3._2000._09.xmldsig.ManifestType;
import org.w3._2000._09.xmldsig.ManifestType1;
import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.ObjectType1;
import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.PGPDataType1;
import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.RSAKeyValueType1;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.ReferenceType1;
import org.w3._2000._09.xmldsig.RetrievalMethodType;
import org.w3._2000._09.xmldsig.RetrievalMethodType1;
import org.w3._2000._09.xmldsig.SPKIDataType;
import org.w3._2000._09.xmldsig.SPKIDataType1;
import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.SignatureMethodType1;
import org.w3._2000._09.xmldsig.SignaturePropertiesType;
import org.w3._2000._09.xmldsig.SignaturePropertiesType1;
import org.w3._2000._09.xmldsig.SignaturePropertyType;
import org.w3._2000._09.xmldsig.SignaturePropertyType1;
import org.w3._2000._09.xmldsig.SignatureType;
import org.w3._2000._09.xmldsig.SignatureType1;
import org.w3._2000._09.xmldsig.SignatureValueType;
import org.w3._2000._09.xmldsig.SignatureValueType1;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.SignedInfoType1;
import org.w3._2000._09.xmldsig.TransformType;
import org.w3._2000._09.xmldsig.TransformType1;
import org.w3._2000._09.xmldsig.TransformsType;
import org.w3._2000._09.xmldsig.TransformsType1;
import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.X509DataType1;
import org.w3._2000._09.xmldsig.X509IssuerSerialType;
import org.w3._2000._09.xmldsig.X509IssuerSerialType1;
import org.w3._2000._09.xmldsig.XmldsigFactory;
import org.w3._2000._09.xmldsig.XmldsigPackage;

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
public class XmldsigPackageImpl extends EPackageImpl implements XmldsigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalizationMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalizationMethodType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestMethodType1EClass = null;

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
	private EClass dsaKeyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaKeyValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyInfoType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pgpDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pgpDataType1EClass = null;

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
	private EClass retrievalMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrievalMethodType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaKeyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaKeyValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureMethodType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertiesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertyType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedInfoType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spkiDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spkiDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509DataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509DataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509IssuerSerialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509IssuerSerialType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cryptoBinaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cryptoBinary1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType digestValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType digestValueType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hmacOutputLengthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hmacOutputLengthType1EDataType = null;

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmldsigPackageImpl() {
		super(eNS_URI, XmldsigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XmldsigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmldsigPackage init() {
		if (isInited) return (XmldsigPackage)EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);

		// Obtain or create and register package
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmldsigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) : EnvelopePackage.eINSTANCE);
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		theXmldsigPackage.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		theXmldsigPackage.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmldsigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmldsigPackage.eNS_URI, theXmldsigPackage);
		return theXmldsigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanonicalizationMethodType() {
		return canonicalizationMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType_Mixed() {
		return (EAttribute)canonicalizationMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType_Any() {
		return (EAttribute)canonicalizationMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType_Algorithm() {
		return (EAttribute)canonicalizationMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanonicalizationMethodType1() {
		return canonicalizationMethodType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType1_Mixed() {
		return (EAttribute)canonicalizationMethodType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType1_Any() {
		return (EAttribute)canonicalizationMethodType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType1_Algorithm() {
		return (EAttribute)canonicalizationMethodType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigestMethodType() {
		return digestMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType_Mixed() {
		return (EAttribute)digestMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType_Any() {
		return (EAttribute)digestMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType_Algorithm() {
		return (EAttribute)digestMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigestMethodType1() {
		return digestMethodType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType1_Mixed() {
		return (EAttribute)digestMethodType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType1_Any() {
		return (EAttribute)digestMethodType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType1_Algorithm() {
		return (EAttribute)digestMethodType1EClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_CanonicalizationMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DigestMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DigestValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DSAKeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeyName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Manifest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MgmtData() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PGPData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetrievalMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RSAKeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Signature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SPKIData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transform() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transforms() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509Data() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CanonicalizationMethod1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DigestMethod1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DigestValue1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DSAKeyValue1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyInfo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeyName1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyValue1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Manifest1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MgmtData1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PGPData1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetrievalMethod1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RSAKeyValue1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Signature1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureMethod1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperties1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperty1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureValue1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedInfo1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SPKIData1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transform1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transforms1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509Data1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAKeyValueType() {
		return dsaKeyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_P() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Q() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_G() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Y() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_J() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Seed() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_PgenCounter() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAKeyValueType1() {
		return dsaKeyValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_P() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_Q() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_G() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_Y() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_J() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_Seed() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType1_PgenCounter() {
		return (EAttribute)dsaKeyValueType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyInfoType() {
		return keyInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Mixed() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Group() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_KeyName() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_KeyValue() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_RetrievalMethod() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_X509Data() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_PGPData() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_SPKIData() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_MgmtData() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Any() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Id() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyInfoType1() {
		return keyInfoType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_Mixed() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_Group() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_KeyName() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType1_KeyValue() {
		return (EReference)keyInfoType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType1_RetrievalMethod() {
		return (EReference)keyInfoType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType1_X509Data() {
		return (EReference)keyInfoType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType1_PGPData() {
		return (EReference)keyInfoType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType1_SPKIData() {
		return (EReference)keyInfoType1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_MgmtData() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_Any() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType1_Id() {
		return (EAttribute)keyInfoType1EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueType() {
		return keyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Mixed() {
		return (EAttribute)keyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType_DSAKeyValue() {
		return (EReference)keyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType_RSAKeyValue() {
		return (EReference)keyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Any() {
		return (EAttribute)keyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueType1() {
		return keyValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType1_Mixed() {
		return (EAttribute)keyValueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType1_DSAKeyValue() {
		return (EReference)keyValueType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType1_RSAKeyValue() {
		return (EReference)keyValueType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType1_Any() {
		return (EAttribute)keyValueType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestType() {
		return manifestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType_Reference() {
		return (EReference)manifestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestType_Id() {
		return (EAttribute)manifestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestType1() {
		return manifestType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType1_Reference() {
		return (EReference)manifestType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestType1_Id() {
		return (EAttribute)manifestType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Mixed() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Group() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Any() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Encoding() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Id() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_MimeType() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType1() {
		return objectType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_Mixed() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_Group() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_Any() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_Encoding() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_Id() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType1_MimeType() {
		return (EAttribute)objectType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGPDataType() {
		return pgpDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_PGPKeyID() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_PGPKeyPacket() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_Any() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_PGPKeyPacket1() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_Any1() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGPDataType1() {
		return pgpDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType1_PGPKeyID() {
		return (EAttribute)pgpDataType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType1_PGPKeyPacket() {
		return (EAttribute)pgpDataType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType1_Any() {
		return (EAttribute)pgpDataType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType1_PGPKeyPacket1() {
		return (EAttribute)pgpDataType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType1_Any1() {
		return (EAttribute)pgpDataType1EClass.getEStructuralFeatures().get(4);
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
	public EReference getReferenceType_Transforms() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_DigestMethod() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_DigestValue() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Id() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Type() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_URI() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getReferenceType1_Transforms() {
		return (EReference)referenceType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType1_DigestMethod() {
		return (EReference)referenceType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_DigestValue() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_Id() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_Type() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType1_URI() {
		return (EAttribute)referenceType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetrievalMethodType() {
		return retrievalMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetrievalMethodType_Transforms() {
		return (EReference)retrievalMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType_Type() {
		return (EAttribute)retrievalMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType_URI() {
		return (EAttribute)retrievalMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetrievalMethodType1() {
		return retrievalMethodType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetrievalMethodType1_Transforms() {
		return (EReference)retrievalMethodType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType1_Type() {
		return (EAttribute)retrievalMethodType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType1_URI() {
		return (EAttribute)retrievalMethodType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSAKeyValueType() {
		return rsaKeyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType_Modulus() {
		return (EAttribute)rsaKeyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType_Exponent() {
		return (EAttribute)rsaKeyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSAKeyValueType1() {
		return rsaKeyValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType1_Modulus() {
		return (EAttribute)rsaKeyValueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType1_Exponent() {
		return (EAttribute)rsaKeyValueType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureMethodType() {
		return signatureMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_Mixed() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_HMACOutputLength() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_Any() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_Algorithm() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureMethodType1() {
		return signatureMethodType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType1_Mixed() {
		return (EAttribute)signatureMethodType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType1_HMACOutputLength() {
		return (EAttribute)signatureMethodType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType1_Any() {
		return (EAttribute)signatureMethodType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType1_Algorithm() {
		return (EAttribute)signatureMethodType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertiesType() {
		return signaturePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignaturePropertiesType_SignatureProperty() {
		return (EReference)signaturePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertiesType_Id() {
		return (EAttribute)signaturePropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertiesType1() {
		return signaturePropertiesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignaturePropertiesType1_SignatureProperty() {
		return (EReference)signaturePropertiesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertiesType1_Id() {
		return (EAttribute)signaturePropertiesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertyType() {
		return signaturePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Mixed() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Group() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Any() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Id() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Target() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertyType1() {
		return signaturePropertyType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType1_Mixed() {
		return (EAttribute)signaturePropertyType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType1_Group() {
		return (EAttribute)signaturePropertyType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType1_Any() {
		return (EAttribute)signaturePropertyType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType1_Id() {
		return (EAttribute)signaturePropertyType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType1_Target() {
		return (EAttribute)signaturePropertyType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureType() {
		return signatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_SignedInfo() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_SignatureValue() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_KeyInfo() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_Object() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureType_Id() {
		return (EAttribute)signatureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureType1() {
		return signatureType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType1_SignedInfo() {
		return (EReference)signatureType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType1_SignatureValue() {
		return (EReference)signatureType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType1_KeyInfo() {
		return (EReference)signatureType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType1_Object() {
		return (EReference)signatureType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureType1_Id() {
		return (EAttribute)signatureType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureValueType() {
		return signatureValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureValueType_Value() {
		return (EAttribute)signatureValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureValueType_Id() {
		return (EAttribute)signatureValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureValueType1() {
		return signatureValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureValueType1_Value() {
		return (EAttribute)signatureValueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureValueType1_Id() {
		return (EAttribute)signatureValueType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedInfoType() {
		return signedInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_CanonicalizationMethod() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_SignatureMethod() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_Reference() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedInfoType_Id() {
		return (EAttribute)signedInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedInfoType1() {
		return signedInfoType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType1_CanonicalizationMethod() {
		return (EReference)signedInfoType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType1_SignatureMethod() {
		return (EReference)signedInfoType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType1_Reference() {
		return (EReference)signedInfoType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedInfoType1_Id() {
		return (EAttribute)signedInfoType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPKIDataType() {
		return spkiDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType_Group() {
		return (EAttribute)spkiDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType_SPKISexp() {
		return (EAttribute)spkiDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType_Any() {
		return (EAttribute)spkiDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPKIDataType1() {
		return spkiDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType1_Group() {
		return (EAttribute)spkiDataType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType1_SPKISexp() {
		return (EAttribute)spkiDataType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPKIDataType1_Any() {
		return (EAttribute)spkiDataType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformsType() {
		return transformsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformsType_Transform() {
		return (EReference)transformsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformsType1() {
		return transformsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformsType1_Transform() {
		return (EReference)transformsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType() {
		return transformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Mixed() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Group() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Any() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_XPath() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Algorithm() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType1() {
		return transformType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType1_Mixed() {
		return (EAttribute)transformType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType1_Group() {
		return (EAttribute)transformType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType1_Any() {
		return (EAttribute)transformType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType1_XPath() {
		return (EAttribute)transformType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType1_Algorithm() {
		return (EAttribute)transformType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509DataType() {
		return x509DataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_Group() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX509DataType_X509IssuerSerial() {
		return (EReference)x509DataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509SKI() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509SubjectName() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509Certificate() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509CRL() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_Any() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509DataType1() {
		return x509DataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_Group() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX509DataType1_X509IssuerSerial() {
		return (EReference)x509DataType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_X509SKI() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_X509SubjectName() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_X509Certificate() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_X509CRL() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType1_Any() {
		return (EAttribute)x509DataType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509IssuerSerialType() {
		return x509IssuerSerialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType_X509IssuerName() {
		return (EAttribute)x509IssuerSerialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType_X509SerialNumber() {
		return (EAttribute)x509IssuerSerialTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509IssuerSerialType1() {
		return x509IssuerSerialType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType1_X509IssuerName() {
		return (EAttribute)x509IssuerSerialType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType1_X509SerialNumber() {
		return (EAttribute)x509IssuerSerialType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCryptoBinary() {
		return cryptoBinaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCryptoBinary1() {
		return cryptoBinary1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDigestValueType() {
		return digestValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDigestValueType1() {
		return digestValueType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHMACOutputLengthType() {
		return hmacOutputLengthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHMACOutputLengthType1() {
		return hmacOutputLengthType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigFactory getXmldsigFactory() {
		return (XmldsigFactory)getEFactoryInstance();
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
		canonicalizationMethodTypeEClass = createEClass(CANONICALIZATION_METHOD_TYPE);
		createEAttribute(canonicalizationMethodTypeEClass, CANONICALIZATION_METHOD_TYPE__MIXED);
		createEAttribute(canonicalizationMethodTypeEClass, CANONICALIZATION_METHOD_TYPE__ANY);
		createEAttribute(canonicalizationMethodTypeEClass, CANONICALIZATION_METHOD_TYPE__ALGORITHM);

		canonicalizationMethodType1EClass = createEClass(CANONICALIZATION_METHOD_TYPE1);
		createEAttribute(canonicalizationMethodType1EClass, CANONICALIZATION_METHOD_TYPE1__MIXED);
		createEAttribute(canonicalizationMethodType1EClass, CANONICALIZATION_METHOD_TYPE1__ANY);
		createEAttribute(canonicalizationMethodType1EClass, CANONICALIZATION_METHOD_TYPE1__ALGORITHM);

		digestMethodTypeEClass = createEClass(DIGEST_METHOD_TYPE);
		createEAttribute(digestMethodTypeEClass, DIGEST_METHOD_TYPE__MIXED);
		createEAttribute(digestMethodTypeEClass, DIGEST_METHOD_TYPE__ANY);
		createEAttribute(digestMethodTypeEClass, DIGEST_METHOD_TYPE__ALGORITHM);

		digestMethodType1EClass = createEClass(DIGEST_METHOD_TYPE1);
		createEAttribute(digestMethodType1EClass, DIGEST_METHOD_TYPE1__MIXED);
		createEAttribute(digestMethodType1EClass, DIGEST_METHOD_TYPE1__ANY);
		createEAttribute(digestMethodType1EClass, DIGEST_METHOD_TYPE1__ALGORITHM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANONICALIZATION_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIGEST_METHOD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIGEST_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSA_KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_INFO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MANIFEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MGMT_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PGP_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRIEVAL_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSA_KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPKI_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X509_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANONICALIZATION_METHOD1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIGEST_METHOD1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIGEST_VALUE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSA_KEY_VALUE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_INFO1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_NAME1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_VALUE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MANIFEST1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MGMT_DATA1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PGP_DATA1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRIEVAL_METHOD1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSA_KEY_VALUE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_METHOD1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTIES1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTY1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_VALUE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_INFO1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPKI_DATA1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMS1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X509_DATA1);

		dsaKeyValueTypeEClass = createEClass(DSA_KEY_VALUE_TYPE);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__P);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__Q);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__G);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__Y);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__J);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__SEED);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__PGEN_COUNTER);

		dsaKeyValueType1EClass = createEClass(DSA_KEY_VALUE_TYPE1);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__P);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__Q);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__G);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__Y);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__J);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__SEED);
		createEAttribute(dsaKeyValueType1EClass, DSA_KEY_VALUE_TYPE1__PGEN_COUNTER);

		keyInfoTypeEClass = createEClass(KEY_INFO_TYPE);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__MIXED);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__GROUP);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__KEY_NAME);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__KEY_VALUE);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__RETRIEVAL_METHOD);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__X509_DATA);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__PGP_DATA);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__SPKI_DATA);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__MGMT_DATA);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__ANY);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__ID);

		keyInfoType1EClass = createEClass(KEY_INFO_TYPE1);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__MIXED);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__GROUP);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__KEY_NAME);
		createEReference(keyInfoType1EClass, KEY_INFO_TYPE1__KEY_VALUE);
		createEReference(keyInfoType1EClass, KEY_INFO_TYPE1__RETRIEVAL_METHOD);
		createEReference(keyInfoType1EClass, KEY_INFO_TYPE1__X509_DATA);
		createEReference(keyInfoType1EClass, KEY_INFO_TYPE1__PGP_DATA);
		createEReference(keyInfoType1EClass, KEY_INFO_TYPE1__SPKI_DATA);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__MGMT_DATA);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__ANY);
		createEAttribute(keyInfoType1EClass, KEY_INFO_TYPE1__ID);

		keyValueTypeEClass = createEClass(KEY_VALUE_TYPE);
		createEAttribute(keyValueTypeEClass, KEY_VALUE_TYPE__MIXED);
		createEReference(keyValueTypeEClass, KEY_VALUE_TYPE__DSA_KEY_VALUE);
		createEReference(keyValueTypeEClass, KEY_VALUE_TYPE__RSA_KEY_VALUE);
		createEAttribute(keyValueTypeEClass, KEY_VALUE_TYPE__ANY);

		keyValueType1EClass = createEClass(KEY_VALUE_TYPE1);
		createEAttribute(keyValueType1EClass, KEY_VALUE_TYPE1__MIXED);
		createEReference(keyValueType1EClass, KEY_VALUE_TYPE1__DSA_KEY_VALUE);
		createEReference(keyValueType1EClass, KEY_VALUE_TYPE1__RSA_KEY_VALUE);
		createEAttribute(keyValueType1EClass, KEY_VALUE_TYPE1__ANY);

		manifestTypeEClass = createEClass(MANIFEST_TYPE);
		createEReference(manifestTypeEClass, MANIFEST_TYPE__REFERENCE);
		createEAttribute(manifestTypeEClass, MANIFEST_TYPE__ID);

		manifestType1EClass = createEClass(MANIFEST_TYPE1);
		createEReference(manifestType1EClass, MANIFEST_TYPE1__REFERENCE);
		createEAttribute(manifestType1EClass, MANIFEST_TYPE1__ID);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__MIXED);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__GROUP);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ANY);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ENCODING);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ID);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__MIME_TYPE);

		objectType1EClass = createEClass(OBJECT_TYPE1);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__MIXED);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__GROUP);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__ANY);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__ENCODING);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__ID);
		createEAttribute(objectType1EClass, OBJECT_TYPE1__MIME_TYPE);

		pgpDataTypeEClass = createEClass(PGP_DATA_TYPE);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__PGP_KEY_ID);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__PGP_KEY_PACKET);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__ANY);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__PGP_KEY_PACKET1);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__ANY1);

		pgpDataType1EClass = createEClass(PGP_DATA_TYPE1);
		createEAttribute(pgpDataType1EClass, PGP_DATA_TYPE1__PGP_KEY_ID);
		createEAttribute(pgpDataType1EClass, PGP_DATA_TYPE1__PGP_KEY_PACKET);
		createEAttribute(pgpDataType1EClass, PGP_DATA_TYPE1__ANY);
		createEAttribute(pgpDataType1EClass, PGP_DATA_TYPE1__PGP_KEY_PACKET1);
		createEAttribute(pgpDataType1EClass, PGP_DATA_TYPE1__ANY1);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__TRANSFORMS);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__DIGEST_METHOD);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__DIGEST_VALUE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ID);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__URI);

		referenceType1EClass = createEClass(REFERENCE_TYPE1);
		createEReference(referenceType1EClass, REFERENCE_TYPE1__TRANSFORMS);
		createEReference(referenceType1EClass, REFERENCE_TYPE1__DIGEST_METHOD);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__DIGEST_VALUE);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__ID);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__TYPE);
		createEAttribute(referenceType1EClass, REFERENCE_TYPE1__URI);

		retrievalMethodTypeEClass = createEClass(RETRIEVAL_METHOD_TYPE);
		createEReference(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__TRANSFORMS);
		createEAttribute(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__TYPE);
		createEAttribute(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__URI);

		retrievalMethodType1EClass = createEClass(RETRIEVAL_METHOD_TYPE1);
		createEReference(retrievalMethodType1EClass, RETRIEVAL_METHOD_TYPE1__TRANSFORMS);
		createEAttribute(retrievalMethodType1EClass, RETRIEVAL_METHOD_TYPE1__TYPE);
		createEAttribute(retrievalMethodType1EClass, RETRIEVAL_METHOD_TYPE1__URI);

		rsaKeyValueTypeEClass = createEClass(RSA_KEY_VALUE_TYPE);
		createEAttribute(rsaKeyValueTypeEClass, RSA_KEY_VALUE_TYPE__MODULUS);
		createEAttribute(rsaKeyValueTypeEClass, RSA_KEY_VALUE_TYPE__EXPONENT);

		rsaKeyValueType1EClass = createEClass(RSA_KEY_VALUE_TYPE1);
		createEAttribute(rsaKeyValueType1EClass, RSA_KEY_VALUE_TYPE1__MODULUS);
		createEAttribute(rsaKeyValueType1EClass, RSA_KEY_VALUE_TYPE1__EXPONENT);

		signatureMethodTypeEClass = createEClass(SIGNATURE_METHOD_TYPE);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__MIXED);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__HMAC_OUTPUT_LENGTH);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__ANY);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__ALGORITHM);

		signatureMethodType1EClass = createEClass(SIGNATURE_METHOD_TYPE1);
		createEAttribute(signatureMethodType1EClass, SIGNATURE_METHOD_TYPE1__MIXED);
		createEAttribute(signatureMethodType1EClass, SIGNATURE_METHOD_TYPE1__HMAC_OUTPUT_LENGTH);
		createEAttribute(signatureMethodType1EClass, SIGNATURE_METHOD_TYPE1__ANY);
		createEAttribute(signatureMethodType1EClass, SIGNATURE_METHOD_TYPE1__ALGORITHM);

		signaturePropertiesTypeEClass = createEClass(SIGNATURE_PROPERTIES_TYPE);
		createEReference(signaturePropertiesTypeEClass, SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY);
		createEAttribute(signaturePropertiesTypeEClass, SIGNATURE_PROPERTIES_TYPE__ID);

		signaturePropertiesType1EClass = createEClass(SIGNATURE_PROPERTIES_TYPE1);
		createEReference(signaturePropertiesType1EClass, SIGNATURE_PROPERTIES_TYPE1__SIGNATURE_PROPERTY);
		createEAttribute(signaturePropertiesType1EClass, SIGNATURE_PROPERTIES_TYPE1__ID);

		signaturePropertyTypeEClass = createEClass(SIGNATURE_PROPERTY_TYPE);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__MIXED);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__GROUP);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__ANY);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__ID);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__TARGET);

		signaturePropertyType1EClass = createEClass(SIGNATURE_PROPERTY_TYPE1);
		createEAttribute(signaturePropertyType1EClass, SIGNATURE_PROPERTY_TYPE1__MIXED);
		createEAttribute(signaturePropertyType1EClass, SIGNATURE_PROPERTY_TYPE1__GROUP);
		createEAttribute(signaturePropertyType1EClass, SIGNATURE_PROPERTY_TYPE1__ANY);
		createEAttribute(signaturePropertyType1EClass, SIGNATURE_PROPERTY_TYPE1__ID);
		createEAttribute(signaturePropertyType1EClass, SIGNATURE_PROPERTY_TYPE1__TARGET);

		signatureTypeEClass = createEClass(SIGNATURE_TYPE);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__SIGNED_INFO);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__SIGNATURE_VALUE);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__KEY_INFO);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__OBJECT);
		createEAttribute(signatureTypeEClass, SIGNATURE_TYPE__ID);

		signatureType1EClass = createEClass(SIGNATURE_TYPE1);
		createEReference(signatureType1EClass, SIGNATURE_TYPE1__SIGNED_INFO);
		createEReference(signatureType1EClass, SIGNATURE_TYPE1__SIGNATURE_VALUE);
		createEReference(signatureType1EClass, SIGNATURE_TYPE1__KEY_INFO);
		createEReference(signatureType1EClass, SIGNATURE_TYPE1__OBJECT);
		createEAttribute(signatureType1EClass, SIGNATURE_TYPE1__ID);

		signatureValueTypeEClass = createEClass(SIGNATURE_VALUE_TYPE);
		createEAttribute(signatureValueTypeEClass, SIGNATURE_VALUE_TYPE__VALUE);
		createEAttribute(signatureValueTypeEClass, SIGNATURE_VALUE_TYPE__ID);

		signatureValueType1EClass = createEClass(SIGNATURE_VALUE_TYPE1);
		createEAttribute(signatureValueType1EClass, SIGNATURE_VALUE_TYPE1__VALUE);
		createEAttribute(signatureValueType1EClass, SIGNATURE_VALUE_TYPE1__ID);

		signedInfoTypeEClass = createEClass(SIGNED_INFO_TYPE);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__CANONICALIZATION_METHOD);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__SIGNATURE_METHOD);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__REFERENCE);
		createEAttribute(signedInfoTypeEClass, SIGNED_INFO_TYPE__ID);

		signedInfoType1EClass = createEClass(SIGNED_INFO_TYPE1);
		createEReference(signedInfoType1EClass, SIGNED_INFO_TYPE1__CANONICALIZATION_METHOD);
		createEReference(signedInfoType1EClass, SIGNED_INFO_TYPE1__SIGNATURE_METHOD);
		createEReference(signedInfoType1EClass, SIGNED_INFO_TYPE1__REFERENCE);
		createEAttribute(signedInfoType1EClass, SIGNED_INFO_TYPE1__ID);

		spkiDataTypeEClass = createEClass(SPKI_DATA_TYPE);
		createEAttribute(spkiDataTypeEClass, SPKI_DATA_TYPE__GROUP);
		createEAttribute(spkiDataTypeEClass, SPKI_DATA_TYPE__SPKI_SEXP);
		createEAttribute(spkiDataTypeEClass, SPKI_DATA_TYPE__ANY);

		spkiDataType1EClass = createEClass(SPKI_DATA_TYPE1);
		createEAttribute(spkiDataType1EClass, SPKI_DATA_TYPE1__GROUP);
		createEAttribute(spkiDataType1EClass, SPKI_DATA_TYPE1__SPKI_SEXP);
		createEAttribute(spkiDataType1EClass, SPKI_DATA_TYPE1__ANY);

		transformsTypeEClass = createEClass(TRANSFORMS_TYPE);
		createEReference(transformsTypeEClass, TRANSFORMS_TYPE__TRANSFORM);

		transformsType1EClass = createEClass(TRANSFORMS_TYPE1);
		createEReference(transformsType1EClass, TRANSFORMS_TYPE1__TRANSFORM);

		transformTypeEClass = createEClass(TRANSFORM_TYPE);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__MIXED);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__GROUP);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ANY);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__XPATH);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ALGORITHM);

		transformType1EClass = createEClass(TRANSFORM_TYPE1);
		createEAttribute(transformType1EClass, TRANSFORM_TYPE1__MIXED);
		createEAttribute(transformType1EClass, TRANSFORM_TYPE1__GROUP);
		createEAttribute(transformType1EClass, TRANSFORM_TYPE1__ANY);
		createEAttribute(transformType1EClass, TRANSFORM_TYPE1__XPATH);
		createEAttribute(transformType1EClass, TRANSFORM_TYPE1__ALGORITHM);

		x509DataTypeEClass = createEClass(X509_DATA_TYPE);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__GROUP);
		createEReference(x509DataTypeEClass, X509_DATA_TYPE__X509_ISSUER_SERIAL);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_SKI);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_SUBJECT_NAME);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_CERTIFICATE);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_CRL);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__ANY);

		x509DataType1EClass = createEClass(X509_DATA_TYPE1);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__GROUP);
		createEReference(x509DataType1EClass, X509_DATA_TYPE1__X509_ISSUER_SERIAL);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__X509_SKI);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__X509_SUBJECT_NAME);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__X509_CERTIFICATE);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__X509_CRL);
		createEAttribute(x509DataType1EClass, X509_DATA_TYPE1__ANY);

		x509IssuerSerialTypeEClass = createEClass(X509_ISSUER_SERIAL_TYPE);
		createEAttribute(x509IssuerSerialTypeEClass, X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME);
		createEAttribute(x509IssuerSerialTypeEClass, X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER);

		x509IssuerSerialType1EClass = createEClass(X509_ISSUER_SERIAL_TYPE1);
		createEAttribute(x509IssuerSerialType1EClass, X509_ISSUER_SERIAL_TYPE1__X509_ISSUER_NAME);
		createEAttribute(x509IssuerSerialType1EClass, X509_ISSUER_SERIAL_TYPE1__X509_SERIAL_NUMBER);

		// Create data types
		cryptoBinaryEDataType = createEDataType(CRYPTO_BINARY);
		cryptoBinary1EDataType = createEDataType(CRYPTO_BINARY1);
		digestValueTypeEDataType = createEDataType(DIGEST_VALUE_TYPE);
		digestValueType1EDataType = createEDataType(DIGEST_VALUE_TYPE1);
		hmacOutputLengthTypeEDataType = createEDataType(HMAC_OUTPUT_LENGTH_TYPE);
		hmacOutputLengthType1EDataType = createEDataType(HMAC_OUTPUT_LENGTH_TYPE1);
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

		// Initialize classes and features; add operations and parameters
		initEClass(canonicalizationMethodTypeEClass, CanonicalizationMethodType.class, "CanonicalizationMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanonicalizationMethodType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CanonicalizationMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanonicalizationMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, CanonicalizationMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanonicalizationMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, CanonicalizationMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canonicalizationMethodType1EClass, CanonicalizationMethodType1.class, "CanonicalizationMethodType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanonicalizationMethodType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CanonicalizationMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanonicalizationMethodType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, CanonicalizationMethodType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanonicalizationMethodType1_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, CanonicalizationMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestMethodTypeEClass, DigestMethodType.class, "DigestMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestMethodType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DigestMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DigestMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, DigestMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestMethodType1EClass, DigestMethodType1.class, "DigestMethodType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestMethodType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DigestMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestMethodType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DigestMethodType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestMethodType1_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, DigestMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CanonicalizationMethod(), this.getCanonicalizationMethodType1(), null, "canonicalizationMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DigestMethod(), this.getDigestMethodType1(), null, "digestMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DigestValue(), this.getDigestValueType1(), "digestValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DSAKeyValue(), this.getDSAKeyValueType1(), null, "dSAKeyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyInfo(), this.getKeyInfoType1(), null, "keyInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeyName(), theXMLTypePackage.getString(), "keyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyValue(), this.getKeyValueType1(), null, "keyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Manifest(), this.getManifestType1(), null, "manifest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MgmtData(), theXMLTypePackage.getString(), "mgmtData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Object(), this.getObjectType1(), null, "object", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PGPData(), this.getPGPDataType1(), null, "pGPData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference(), this.getReferenceType1(), null, "reference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetrievalMethod(), this.getRetrievalMethodType1(), null, "retrievalMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RSAKeyValue(), this.getRSAKeyValueType1(), null, "rSAKeyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Signature(), this.getSignatureType1(), null, "signature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureMethod(), this.getSignatureMethodType1(), null, "signatureMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperties(), this.getSignaturePropertiesType1(), null, "signatureProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperty(), this.getSignaturePropertyType1(), null, "signatureProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureValue(), this.getSignatureValueType1(), null, "signatureValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedInfo(), this.getSignedInfoType1(), null, "signedInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SPKIData(), this.getSPKIDataType1(), null, "sPKIData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transform(), this.getTransformType1(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transforms(), this.getTransformsType1(), null, "transforms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X509Data(), this.getX509DataType1(), null, "x509Data", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CanonicalizationMethod1(), this.getCanonicalizationMethodType(), null, "canonicalizationMethod1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DigestMethod1(), this.getDigestMethodType(), null, "digestMethod1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DigestValue1(), this.getDigestValueType(), "digestValue1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DSAKeyValue1(), this.getDSAKeyValueType(), null, "dSAKeyValue1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyInfo1(), this.getKeyInfoType(), null, "keyInfo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeyName1(), theXMLTypePackage.getString(), "keyName1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyValue1(), this.getKeyValueType(), null, "keyValue1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Manifest1(), this.getManifestType(), null, "manifest1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MgmtData1(), theXMLTypePackage.getString(), "mgmtData1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Object1(), this.getObjectType(), null, "object1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PGPData1(), this.getPGPDataType(), null, "pGPData1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference1(), this.getReferenceType(), null, "reference1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetrievalMethod1(), this.getRetrievalMethodType(), null, "retrievalMethod1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RSAKeyValue1(), this.getRSAKeyValueType(), null, "rSAKeyValue1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Signature1(), this.getSignatureType(), null, "signature1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureMethod1(), this.getSignatureMethodType(), null, "signatureMethod1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperties1(), this.getSignaturePropertiesType(), null, "signatureProperties1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperty1(), this.getSignaturePropertyType(), null, "signatureProperty1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureValue1(), this.getSignatureValueType(), null, "signatureValue1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedInfo1(), this.getSignedInfoType(), null, "signedInfo1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SPKIData1(), this.getSPKIDataType(), null, "sPKIData1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transform1(), this.getTransformType(), null, "transform1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transforms1(), this.getTransformsType(), null, "transforms1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X509Data1(), this.getX509DataType(), null, "x509Data1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dsaKeyValueTypeEClass, DSAKeyValueType.class, "DSAKeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSAKeyValueType_P(), this.getCryptoBinary(), "p", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Q(), this.getCryptoBinary(), "q", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_G(), this.getCryptoBinary(), "g", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Y(), this.getCryptoBinary(), "y", null, 1, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_J(), this.getCryptoBinary(), "j", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Seed(), this.getCryptoBinary(), "seed", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_PgenCounter(), this.getCryptoBinary(), "pgenCounter", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsaKeyValueType1EClass, DSAKeyValueType1.class, "DSAKeyValueType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSAKeyValueType1_P(), this.getCryptoBinary1(), "p", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_Q(), this.getCryptoBinary1(), "q", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_G(), this.getCryptoBinary1(), "g", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_Y(), this.getCryptoBinary1(), "y", null, 1, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_J(), this.getCryptoBinary1(), "j", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_Seed(), this.getCryptoBinary1(), "seed", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType1_PgenCounter(), this.getCryptoBinary1(), "pgenCounter", null, 0, 1, DSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyInfoTypeEClass, KeyInfoType.class, "KeyInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyInfoType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, KeyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_KeyName(), theXMLTypePackage.getString(), "keyName", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_KeyValue(), this.getKeyValueType(), null, "keyValue", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_RetrievalMethod(), this.getRetrievalMethodType(), null, "retrievalMethod", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_X509Data(), this.getX509DataType(), null, "x509Data", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_PGPData(), this.getPGPDataType(), null, "pGPData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_SPKIData(), this.getSPKIDataType(), null, "sPKIData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_MgmtData(), theXMLTypePackage.getString(), "mgmtData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, KeyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyInfoType1EClass, KeyInfoType1.class, "KeyInfoType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyInfoType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, KeyInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType1_KeyName(), theXMLTypePackage.getString(), "keyName", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType1_KeyValue(), this.getKeyValueType1(), null, "keyValue", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType1_RetrievalMethod(), this.getRetrievalMethodType1(), null, "retrievalMethod", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType1_X509Data(), this.getX509DataType1(), null, "x509Data", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType1_PGPData(), this.getPGPDataType1(), null, "pGPData", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType1_SPKIData(), this.getSPKIDataType1(), null, "sPKIData", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType1_MgmtData(), theXMLTypePackage.getString(), "mgmtData", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyInfoType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, KeyInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueTypeEClass, KeyValueType.class, "KeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, KeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType_DSAKeyValue(), this.getDSAKeyValueType(), null, "dSAKeyValue", null, 0, 1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType_RSAKeyValue(), this.getRSAKeyValueType(), null, "rSAKeyValue", null, 0, 1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValueType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(keyValueType1EClass, KeyValueType1.class, "KeyValueType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, KeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType1_DSAKeyValue(), this.getDSAKeyValueType1(), null, "dSAKeyValue", null, 0, 1, KeyValueType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType1_RSAKeyValue(), this.getRSAKeyValueType1(), null, "rSAKeyValue", null, 0, 1, KeyValueType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValueType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, KeyValueType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(manifestTypeEClass, ManifestType.class, "ManifestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManifestType_Reference(), this.getReferenceType(), null, "reference", null, 1, -1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestType1EClass, ManifestType1.class, "ManifestType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManifestType1_Reference(), this.getReferenceType1(), null, "reference", null, 1, -1, ManifestType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ManifestType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Encoding(), theXMLTypePackage.getAnyURI(), "encoding", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_MimeType(), theXMLTypePackage.getString(), "mimeType", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectType1EClass, ObjectType1.class, "ObjectType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ObjectType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ObjectType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType1_Encoding(), theXMLTypePackage.getAnyURI(), "encoding", null, 0, 1, ObjectType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ObjectType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType1_MimeType(), theXMLTypePackage.getString(), "mimeType", null, 0, 1, ObjectType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pgpDataTypeEClass, PGPDataType.class, "PGPDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPGPDataType_PGPKeyID(), theXMLTypePackage.getBase64Binary(), "pGPKeyID", null, 0, 1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_PGPKeyPacket(), theXMLTypePackage.getBase64Binary(), "pGPKeyPacket", null, 0, 1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_PGPKeyPacket1(), theXMLTypePackage.getBase64Binary(), "pGPKeyPacket1", null, 0, 1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pgpDataType1EClass, PGPDataType1.class, "PGPDataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPGPDataType1_PGPKeyID(), theXMLTypePackage.getBase64Binary(), "pGPKeyID", null, 0, 1, PGPDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType1_PGPKeyPacket(), theXMLTypePackage.getBase64Binary(), "pGPKeyPacket", null, 0, 1, PGPDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PGPDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType1_PGPKeyPacket1(), theXMLTypePackage.getBase64Binary(), "pGPKeyPacket1", null, 0, 1, PGPDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType1_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PGPDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceType_DigestMethod(), this.getDigestMethodType(), null, "digestMethod", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_DigestValue(), this.getDigestValueType(), "digestValue", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceType1EClass, ReferenceType1.class, "ReferenceType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType1_Transforms(), this.getTransformsType1(), null, "transforms", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceType1_DigestMethod(), this.getDigestMethodType1(), null, "digestMethod", null, 1, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_DigestValue(), this.getDigestValueType1(), "digestValue", null, 1, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType1_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, ReferenceType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retrievalMethodTypeEClass, RetrievalMethodType.class, "RetrievalMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetrievalMethodType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retrievalMethodType1EClass, RetrievalMethodType1.class, "RetrievalMethodType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetrievalMethodType1_Transforms(), this.getTransformsType1(), null, "transforms", null, 0, 1, RetrievalMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType1_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, RetrievalMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType1_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, RetrievalMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsaKeyValueTypeEClass, RSAKeyValueType.class, "RSAKeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRSAKeyValueType_Modulus(), this.getCryptoBinary(), "modulus", null, 1, 1, RSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSAKeyValueType_Exponent(), this.getCryptoBinary(), "exponent", null, 1, 1, RSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsaKeyValueType1EClass, RSAKeyValueType1.class, "RSAKeyValueType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRSAKeyValueType1_Modulus(), this.getCryptoBinary1(), "modulus", null, 1, 1, RSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSAKeyValueType1_Exponent(), this.getCryptoBinary1(), "exponent", null, 1, 1, RSAKeyValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureMethodTypeEClass, SignatureMethodType.class, "SignatureMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignatureMethodType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SignatureMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType_HMACOutputLength(), this.getHMACOutputLengthType(), "hMACOutputLength", null, 0, 1, SignatureMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignatureMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, SignatureMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureMethodType1EClass, SignatureMethodType1.class, "SignatureMethodType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignatureMethodType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SignatureMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType1_HMACOutputLength(), this.getHMACOutputLengthType1(), "hMACOutputLength", null, 0, 1, SignatureMethodType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignatureMethodType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType1_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, SignatureMethodType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertiesTypeEClass, SignaturePropertiesType.class, "SignaturePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignaturePropertiesType_SignatureProperty(), this.getSignaturePropertyType(), null, "signatureProperty", null, 1, -1, SignaturePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertiesType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertiesType1EClass, SignaturePropertiesType1.class, "SignaturePropertiesType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignaturePropertiesType1_SignatureProperty(), this.getSignaturePropertyType1(), null, "signatureProperty", null, 1, -1, SignaturePropertiesType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertiesType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertiesType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertyTypeEClass, SignaturePropertyType.class, "SignaturePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignaturePropertyType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SignaturePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignaturePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Target(), theXMLTypePackage.getAnyURI(), "target", null, 1, 1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertyType1EClass, SignaturePropertyType1.class, "SignaturePropertyType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignaturePropertyType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SignaturePropertyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SignaturePropertyType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignaturePropertyType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType1_Target(), theXMLTypePackage.getAnyURI(), "target", null, 1, 1, SignaturePropertyType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureTypeEClass, SignatureType.class, "SignatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureType_SignedInfo(), this.getSignedInfoType(), null, "signedInfo", null, 1, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType_SignatureValue(), this.getSignatureValueType(), null, "signatureValue", null, 1, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType_KeyInfo(), this.getKeyInfoType(), null, "keyInfo", null, 0, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType_Object(), this.getObjectType(), null, "object", null, 0, -1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureType1EClass, SignatureType1.class, "SignatureType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureType1_SignedInfo(), this.getSignedInfoType1(), null, "signedInfo", null, 1, 1, SignatureType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType1_SignatureValue(), this.getSignatureValueType1(), null, "signatureValue", null, 1, 1, SignatureType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType1_KeyInfo(), this.getKeyInfoType1(), null, "keyInfo", null, 0, 1, SignatureType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType1_Object(), this.getObjectType1(), null, "object", null, 0, -1, SignatureType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignatureType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureValueTypeEClass, SignatureValueType.class, "SignatureValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignatureValueType_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, SignatureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureValueType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignatureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureValueType1EClass, SignatureValueType1.class, "SignatureValueType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignatureValueType1_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, SignatureValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureValueType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignatureValueType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signedInfoTypeEClass, SignedInfoType.class, "SignedInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignedInfoType_CanonicalizationMethod(), this.getCanonicalizationMethodType(), null, "canonicalizationMethod", null, 1, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType_SignatureMethod(), this.getSignatureMethodType(), null, "signatureMethod", null, 1, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType_Reference(), this.getReferenceType(), null, "reference", null, 1, -1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedInfoType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signedInfoType1EClass, SignedInfoType1.class, "SignedInfoType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignedInfoType1_CanonicalizationMethod(), this.getCanonicalizationMethodType1(), null, "canonicalizationMethod", null, 1, 1, SignedInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType1_SignatureMethod(), this.getSignatureMethodType1(), null, "signatureMethod", null, 1, 1, SignedInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType1_Reference(), this.getReferenceType1(), null, "reference", null, 1, -1, SignedInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedInfoType1_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignedInfoType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spkiDataTypeEClass, SPKIDataType.class, "SPKIDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPKIDataType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPKIDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPKIDataType_SPKISexp(), theXMLTypePackage.getBase64Binary(), "sPKISexp", null, 1, -1, SPKIDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPKIDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SPKIDataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spkiDataType1EClass, SPKIDataType1.class, "SPKIDataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPKIDataType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPKIDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPKIDataType1_SPKISexp(), theXMLTypePackage.getBase64Binary(), "sPKISexp", null, 1, -1, SPKIDataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPKIDataType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SPKIDataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(transformsTypeEClass, TransformsType.class, "TransformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformsType_Transform(), this.getTransformType(), null, "transform", null, 1, -1, TransformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformsType1EClass, TransformsType1.class, "TransformsType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformsType1_Transform(), this.getTransformType1(), null, "transform", null, 1, -1, TransformsType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformTypeEClass, TransformType.class, "TransformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_XPath(), theXMLTypePackage.getString(), "xPath", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformType1EClass, TransformType1.class, "TransformType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformType1_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TransformType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransformType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType1_XPath(), theXMLTypePackage.getString(), "xPath", null, 0, -1, TransformType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType1_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, TransformType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x509DataTypeEClass, X509DataType.class, "X509DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509DataType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, X509DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getX509DataType_X509IssuerSerial(), this.getX509IssuerSerialType(), null, "x509IssuerSerial", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509SKI(), theXMLTypePackage.getBase64Binary(), "x509SKI", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509SubjectName(), theXMLTypePackage.getString(), "x509SubjectName", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509Certificate(), theXMLTypePackage.getBase64Binary(), "x509Certificate", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509CRL(), theXMLTypePackage.getBase64Binary(), "x509CRL", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(x509DataType1EClass, X509DataType1.class, "X509DataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509DataType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, X509DataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getX509DataType1_X509IssuerSerial(), this.getX509IssuerSerialType1(), null, "x509IssuerSerial", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType1_X509SKI(), theXMLTypePackage.getBase64Binary(), "x509SKI", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType1_X509SubjectName(), theXMLTypePackage.getString(), "x509SubjectName", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType1_X509Certificate(), theXMLTypePackage.getBase64Binary(), "x509Certificate", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType1_X509CRL(), theXMLTypePackage.getBase64Binary(), "x509CRL", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, X509DataType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(x509IssuerSerialTypeEClass, X509IssuerSerialType.class, "X509IssuerSerialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509IssuerSerialType_X509IssuerName(), theXMLTypePackage.getString(), "x509IssuerName", null, 1, 1, X509IssuerSerialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509IssuerSerialType_X509SerialNumber(), theXMLTypePackage.getInteger(), "x509SerialNumber", null, 1, 1, X509IssuerSerialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x509IssuerSerialType1EClass, X509IssuerSerialType1.class, "X509IssuerSerialType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509IssuerSerialType1_X509IssuerName(), theXMLTypePackage.getString(), "x509IssuerName", null, 1, 1, X509IssuerSerialType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509IssuerSerialType1_X509SerialNumber(), theXMLTypePackage.getInteger(), "x509SerialNumber", null, 1, 1, X509IssuerSerialType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(cryptoBinaryEDataType, byte[].class, "CryptoBinary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cryptoBinary1EDataType, byte[].class, "CryptoBinary1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(digestValueTypeEDataType, byte[].class, "DigestValueType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(digestValueType1EDataType, byte[].class, "DigestValueType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hmacOutputLengthTypeEDataType, BigInteger.class, "HMACOutputLengthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hmacOutputLengthType1EDataType, BigInteger.class, "HMACOutputLengthType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (canonicalizationMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CanonicalizationMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (canonicalizationMethodType1EClass, 
		   source, 
		   new String[] {
			 "name", "CanonicalizationMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType1_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (cryptoBinaryEDataType, 
		   source, 
		   new String[] {
			 "name", "CryptoBinary",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary"
		   });		
		addAnnotation
		  (cryptoBinary1EDataType, 
		   source, 
		   new String[] {
			 "name", "CryptoBinary",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary"
		   });		
		addAnnotation
		  (digestMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DigestMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDigestMethodType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDigestMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getDigestMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (digestMethodType1EClass, 
		   source, 
		   new String[] {
			 "name", "DigestMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDigestMethodType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDigestMethodType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getDigestMethodType1_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (digestValueTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "DigestValueType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary"
		   });		
		addAnnotation
		  (digestValueType1EDataType, 
		   source, 
		   new String[] {
			 "name", "DigestValueType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary"
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
		  (getDocumentRoot_CanonicalizationMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Manifest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Manifest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MgmtData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MgmtData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PGPData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
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
		  (getDocumentRoot_RetrievalMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Signature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Signature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SPKIData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X509Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CanonicalizationMethod1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestMethod1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestValue1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DSAKeyValue1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyInfo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyName1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyValue1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Manifest1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Manifest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MgmtData1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MgmtData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Object1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PGPData1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
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
		  (getDocumentRoot_RetrievalMethod1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RSAKeyValue1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Signature1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Signature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureMethod1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperties1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperty1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureValue1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignedInfo1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SPKIData1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transform1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transforms1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X509Data1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dsaKeyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DSAKeyValueType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDSAKeyValueType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "P",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Q",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_G(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "G",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_J(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "J",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Seed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Seed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_PgenCounter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PgenCounter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dsaKeyValueType1EClass, 
		   source, 
		   new String[] {
			 "name", "DSAKeyValueType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "P",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Q",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_G(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "G",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_J(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "J",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_Seed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Seed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType1_PgenCounter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PgenCounter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hmacOutputLengthTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "HMACOutputLengthType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });		
		addAnnotation
		  (hmacOutputLengthType1EDataType, 
		   source, 
		   new String[] {
			 "name", "HMACOutputLengthType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });		
		addAnnotation
		  (keyInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyInfoType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKeyInfoType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getKeyInfoType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_KeyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyName",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_KeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_RetrievalMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_X509Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_PGPData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_SPKIData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_MgmtData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MgmtData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":9",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (keyInfoType1EClass, 
		   source, 
		   new String[] {
			 "name", "KeyInfoType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKeyInfoType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getKeyInfoType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_KeyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyName",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_KeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_RetrievalMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_X509Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_PGPData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_SPKIData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_MgmtData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MgmtData",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":9",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getKeyInfoType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (keyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyValueType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKeyValueType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getKeyValueType_DSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueType_RSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (keyValueType1EClass, 
		   source, 
		   new String[] {
			 "name", "KeyValueType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKeyValueType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getKeyValueType1_DSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueType1_RSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (manifestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ManifestType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getManifestType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManifestType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (manifestType1EClass, 
		   source, 
		   new String[] {
			 "name", "ManifestType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getManifestType1_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManifestType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getObjectType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getObjectType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getObjectType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Encoding"
		   });		
		addAnnotation
		  (getObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getObjectType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MimeType"
		   });		
		addAnnotation
		  (objectType1EClass, 
		   source, 
		   new String[] {
			 "name", "ObjectType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getObjectType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getObjectType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getObjectType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType1_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Encoding"
		   });		
		addAnnotation
		  (getObjectType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getObjectType1_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MimeType"
		   });		
		addAnnotation
		  (pgpDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PGPDataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPGPDataType_PGPKeyID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType_PGPKeyPacket(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyPacket",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getPGPDataType_PGPKeyPacket1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyPacket",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (pgpDataType1EClass, 
		   source, 
		   new String[] {
			 "name", "PGPDataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPGPDataType1_PGPKeyID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType1_PGPKeyPacket(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyPacket",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getPGPDataType1_PGPKeyPacket1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyPacket",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType1_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (referenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceType_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_DigestMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_DigestValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getReferenceType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getReferenceType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (referenceType1EClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceType1_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType1_DigestMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType1_DigestValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getReferenceType1_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getReferenceType1_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (retrievalMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RetrievalMethodType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRetrievalMethodType_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRetrievalMethodType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getRetrievalMethodType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (retrievalMethodType1EClass, 
		   source, 
		   new String[] {
			 "name", "RetrievalMethodType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRetrievalMethodType1_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRetrievalMethodType1_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getRetrievalMethodType1_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (rsaKeyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RSAKeyValueType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRSAKeyValueType_Modulus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Modulus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRSAKeyValueType_Exponent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Exponent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rsaKeyValueType1EClass, 
		   source, 
		   new String[] {
			 "name", "RSAKeyValueType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRSAKeyValueType1_Modulus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Modulus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRSAKeyValueType1_Exponent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Exponent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (signatureMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSignatureMethodType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSignatureMethodType_HMACOutputLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HMACOutputLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getSignatureMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (signatureMethodType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignatureMethodType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSignatureMethodType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSignatureMethodType1_HMACOutputLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HMACOutputLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureMethodType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getSignatureMethodType1_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (signaturePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignaturePropertiesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignaturePropertiesType_SignatureProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignaturePropertiesType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signaturePropertiesType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignaturePropertiesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignaturePropertiesType1_SignatureProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignaturePropertiesType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signaturePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignaturePropertyType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Target"
		   });		
		addAnnotation
		  (signaturePropertyType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignaturePropertyType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getSignaturePropertyType1_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Target"
		   });		
		addAnnotation
		  (signatureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignatureType_SignedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_SignatureValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signatureType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignatureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignatureType1_SignedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType1_SignatureValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType1_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType1_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signatureValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureValueType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSignatureValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSignatureValueType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signatureValueType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignatureValueType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSignatureValueType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSignatureValueType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signedInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignedInfoType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignedInfoType_CanonicalizationMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_SignatureMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signedInfoType1EClass, 
		   source, 
		   new String[] {
			 "name", "SignedInfoType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignedInfoType1_CanonicalizationMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType1_SignatureMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType1_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType1_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (spkiDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPKIDataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPKIDataType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPKIDataType_SPKISexp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKISexp",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPKIDataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (spkiDataType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPKIDataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPKIDataType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPKIDataType1_SPKISexp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKISexp",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPKIDataType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (transformsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransformsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformsType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transformsType1EClass, 
		   source, 
		   new String[] {
			 "name", "TransformsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformsType1_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transformTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransformType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTransformType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTransformType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getTransformType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getTransformType_XPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPath",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getTransformType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (transformType1EClass, 
		   source, 
		   new String[] {
			 "name", "TransformType",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTransformType1_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTransformType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getTransformType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getTransformType1_XPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPath",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getTransformType1_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (x509DataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "X509DataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509DataType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509IssuerSerial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerSerial",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509SKI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SKI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509SubjectName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SubjectName",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Certificate",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509CRL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509CRL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (x509DataType1EClass, 
		   source, 
		   new String[] {
			 "name", "X509DataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509DataType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getX509DataType1_X509IssuerSerial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerSerial",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType1_X509SKI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SKI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType1_X509SubjectName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SubjectName",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType1_X509Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Certificate",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType1_X509CRL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509CRL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (x509IssuerSerialTypeEClass, 
		   source, 
		   new String[] {
			 "name", "X509IssuerSerialType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509IssuerSerialType_X509IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX509IssuerSerialType_X509SerialNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SerialNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (x509IssuerSerialType1EClass, 
		   source, 
		   new String[] {
			 "name", "X509IssuerSerialType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509IssuerSerialType1_X509IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX509IssuerSerialType1_X509SerialNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SerialNumber",
			 "namespace", "##targetNamespace"
		   });
	}

} //XmldsigPackageImpl
