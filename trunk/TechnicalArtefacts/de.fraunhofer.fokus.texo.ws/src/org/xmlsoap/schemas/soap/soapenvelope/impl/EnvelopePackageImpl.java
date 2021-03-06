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
package org.xmlsoap.schemas.soap.soapenvelope.impl;

import java.util.List;

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

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl._0PackageImpl;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl;

import org.xmlsoap.schemas.soap.soapenvelope.Body;
import org.xmlsoap.schemas.soap.soapenvelope.Detail;
import org.xmlsoap.schemas.soap.soapenvelope.DocumentRoot;
import org.xmlsoap.schemas.soap.soapenvelope.Envelope;
import org.xmlsoap.schemas.soap.soapenvelope.EnvelopeFactory;
import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;
import org.xmlsoap.schemas.soap.soapenvelope.Fault;
import org.xmlsoap.schemas.soap.soapenvelope.Header;

import org.xmlsoap.schemas.soap.soapenvelope.util.EnvelopeValidator;

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
public class EnvelopePackageImpl extends EPackageImpl implements EnvelopePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailEClass = null;

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
	private EClass envelopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingStyleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mustUnderstandTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mustUnderstandTypeObjectEDataType = null;

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
	 * @see org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnvelopePackageImpl() {
		super(eNS_URI, EnvelopeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnvelopePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnvelopePackage init() {
		if (isInited) return (EnvelopePackage)EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI);

		// Obtain or create and register package
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnvelopePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theUtilityPackage.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theUtilityPackage.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEnvelopePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EnvelopeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEnvelopePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnvelopePackage.eNS_URI, theEnvelopePackage);
		return theEnvelopePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Any() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_AnyAttribute() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetail() {
		return detailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetail_Any() {
		return (EAttribute)detailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetail_AnyAttribute() {
		return (EAttribute)detailEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_Body() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Envelope() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fault() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Header() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Actor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EncodingStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MustUnderstand() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvelope() {
		return envelopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelope_Header() {
		return (EReference)envelopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelope_Body() {
		return (EReference)envelopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelope_Any() {
		return (EAttribute)envelopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelope_AnyAttribute() {
		return (EAttribute)envelopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFault() {
		return faultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Faultcode() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Faultstring() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Faultactor() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFault_Detail() {
		return (EReference)faultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Any() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_AnyAttribute() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingStyle() {
		return encodingStyleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMustUnderstandType() {
		return mustUnderstandTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMustUnderstandTypeObject() {
		return mustUnderstandTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeFactory getEnvelopeFactory() {
		return (EnvelopeFactory)getEFactoryInstance();
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
		bodyEClass = createEClass(BODY);
		createEAttribute(bodyEClass, BODY__ANY);
		createEAttribute(bodyEClass, BODY__ANY_ATTRIBUTE);

		detailEClass = createEClass(DETAIL);
		createEAttribute(detailEClass, DETAIL__ANY);
		createEAttribute(detailEClass, DETAIL__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENVELOPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HEADER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENCODING_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MUST_UNDERSTAND);

		envelopeEClass = createEClass(ENVELOPE);
		createEReference(envelopeEClass, ENVELOPE__HEADER);
		createEReference(envelopeEClass, ENVELOPE__BODY);
		createEAttribute(envelopeEClass, ENVELOPE__ANY);
		createEAttribute(envelopeEClass, ENVELOPE__ANY_ATTRIBUTE);

		faultEClass = createEClass(FAULT);
		createEAttribute(faultEClass, FAULT__FAULTCODE);
		createEAttribute(faultEClass, FAULT__FAULTSTRING);
		createEAttribute(faultEClass, FAULT__FAULTACTOR);
		createEReference(faultEClass, FAULT__DETAIL);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__ANY);
		createEAttribute(headerEClass, HEADER__ANY_ATTRIBUTE);

		// Create data types
		encodingStyleEDataType = createEDataType(ENCODING_STYLE);
		mustUnderstandTypeEDataType = createEDataType(MUST_UNDERSTAND_TYPE);
		mustUnderstandTypeObjectEDataType = createEDataType(MUST_UNDERSTAND_TYPE_OBJECT);
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
		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBody_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailEClass, Detail.class, "Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetail_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetail_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Body(), this.getBody(), null, "body", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Envelope(), this.getEnvelope(), null, "envelope", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fault(), this.getFault(), null, "fault", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Header(), this.getHeader(), null, "header", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Actor(), theXMLTypePackage.getAnyURI(), "actor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EncodingStyle(), this.getEncodingStyle(), "encodingStyle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MustUnderstand(), this.getMustUnderstandType(), "mustUnderstand", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envelopeEClass, Envelope.class, "Envelope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvelope_Header(), this.getHeader(), null, "header", null, 0, 1, Envelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvelope_Body(), this.getBody(), null, "body", null, 1, 1, Envelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvelope_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Envelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvelope_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Envelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultEClass, Fault.class, "Fault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFault_Faultcode(), theXMLTypePackage.getQName(), "faultcode", null, 1, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFault_Faultstring(), theXMLTypePackage.getString(), "faultstring", null, 1, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFault_Faultactor(), theXMLTypePackage.getAnyURI(), "faultactor", null, 0, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFault_Detail(), this.getDetail(), null, "detail", null, 0, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(encodingStyleEDataType, List.class, "EncodingStyle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mustUnderstandTypeEDataType, boolean.class, "MustUnderstandType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mustUnderstandTypeObjectEDataType, Boolean.class, "MustUnderstandTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (bodyEClass, 
		   source, 
		   new String[] {
			 "name", "Body",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBody_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });			
		addAnnotation
		  (getBody_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (detailEClass, 
		   source, 
		   new String[] {
			 "name", "detail",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDetail_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getDetail_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
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
		  (getDocumentRoot_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Envelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Envelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fault(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fault",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Actor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EncodingStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encodingStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MustUnderstand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mustUnderstand",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (encodingStyleEDataType, 
		   source, 
		   new String[] {
			 "name", "encodingStyle",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (envelopeEClass, 
		   source, 
		   new String[] {
			 "name", "Envelope",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnvelope_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvelope_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvelope_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getEnvelope_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (faultEClass, 
		   source, 
		   new String[] {
			 "name", "Fault",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFault_Faultcode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "faultcode"
		   });		
		addAnnotation
		  (getFault_Faultstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "faultstring"
		   });		
		addAnnotation
		  (getFault_Faultactor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "faultactor"
		   });		
		addAnnotation
		  (getFault_Detail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "detail"
		   });		
		addAnnotation
		  (headerEClass, 
		   source, 
		   new String[] {
			 "name", "Header",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHeader_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getHeader_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (mustUnderstandTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "mustUnderstand_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean",
			 "pattern", "0|1"
		   });		
		addAnnotation
		  (mustUnderstandTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mustUnderstand_._type:Object",
			 "baseType", "mustUnderstand_._type"
		   });
	}

} //EnvelopePackageImpl
