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
package org.xmlsoap.schemas.ws._2003._06.wsutility.impl;

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

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext._0Package;

import org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.secext._1.wssecuritysecext.impl._0PackageImpl;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2005._08.wsaddressing.AddressingPackage;

import org.w3._2005._08.wsaddressing.impl.AddressingPackageImpl;

import org.xmlsoap.schemas.soap.soapenvelope.EnvelopePackage;

import org.xmlsoap.schemas.soap.soapenvelope.impl.EnvelopePackageImpl;

import org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedDateTime;
import org.xmlsoap.schemas.ws._2003._06.wsutility.AttributedURI;
import org.xmlsoap.schemas.ws._2003._06.wsutility.DocumentRoot;
import org.xmlsoap.schemas.ws._2003._06.wsutility.TimestampType;
import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityFactory;
import org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage;

import org.xmlsoap.schemas.ws._2003._06.wsutility.util.UtilityValidator;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.PolicyPackage;

import org.xmlsoap.schemas.ws._2004._09.wspolicy.impl.PolicyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityPackageImpl extends EPackageImpl implements UtilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedURIEClass = null;

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
	private EClass timestampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTimestampFaultEDataType = null;

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
	 * @see org.xmlsoap.schemas.ws._2003._06.wsutility.UtilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilityPackageImpl() {
		super(eNS_URI, UtilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilityPackage init() {
		if (isInited) return (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);

		// Obtain or create and register package
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnvelopePackageImpl theEnvelopePackage = (EnvelopePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) instanceof EnvelopePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvelopePackage.eNS_URI) : EnvelopePackage.eINSTANCE);
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl the_0Package_1 = (org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) instanceof org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eNS_URI) : org.open.oasis.docs.wss._2004._01.oasis._200401.wss.wssecurity.utility._1.wssecurityutility._0Package.eINSTANCE);
		AddressingPackageImpl theAddressingPackage = (AddressingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) instanceof AddressingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressingPackage.eNS_URI) : AddressingPackage.eINSTANCE);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		_200702PackageImpl the_200702Package = (_200702PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) instanceof _200702PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200702Package.eNS_URI) : _200702Package.eINSTANCE);
		_200512PackageImpl the_200512Package = (_200512PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) instanceof _200512PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_200512Package.eNS_URI) : _200512Package.eINSTANCE);

		// Create package meta-data objects
		theUtilityPackage.createPackageContents();
		theEnvelopePackage.createPackageContents();
		the_0Package.createPackageContents();
		theXmldsigPackage.createPackageContents();
		the_0Package_1.createPackageContents();
		theAddressingPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		the_200702Package.createPackageContents();
		the_200512Package.createPackageContents();

		// Initialize created meta-data
		theUtilityPackage.initializePackageContents();
		theEnvelopePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		the_0Package_1.initializePackageContents();
		theAddressingPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		the_200702Package.initializePackageContents();
		the_200512Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUtilityPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UtilityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUtilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilityPackage.eNS_URI, theUtilityPackage);
		return theUtilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedDateTime() {
		return attributedDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedDateTime_Value() {
		return (EAttribute)attributedDateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedDateTime_Id() {
		return (EAttribute)attributedDateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedDateTime_ValueType() {
		return (EAttribute)attributedDateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedDateTime_AnyAttribute() {
		return (EAttribute)attributedDateTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributedURI() {
		return attributedURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURI_Value() {
		return (EAttribute)attributedURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURI_Id() {
		return (EAttribute)attributedURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributedURI_AnyAttribute() {
		return (EAttribute)attributedURIEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_Created() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Expires() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Timestamp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestampType() {
		return timestampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimestampType_Created() {
		return (EReference)timestampTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimestampType_Expires() {
		return (EReference)timestampTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestampType_Group() {
		return (EAttribute)timestampTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestampType_Any() {
		return (EAttribute)timestampTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestampType_Id() {
		return (EAttribute)timestampTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestampType_AnyAttribute() {
		return (EAttribute)timestampTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTTimestampFault() {
		return tTimestampFaultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityFactory getUtilityFactory() {
		return (UtilityFactory)getEFactoryInstance();
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
		attributedDateTimeEClass = createEClass(ATTRIBUTED_DATE_TIME);
		createEAttribute(attributedDateTimeEClass, ATTRIBUTED_DATE_TIME__VALUE);
		createEAttribute(attributedDateTimeEClass, ATTRIBUTED_DATE_TIME__ID);
		createEAttribute(attributedDateTimeEClass, ATTRIBUTED_DATE_TIME__VALUE_TYPE);
		createEAttribute(attributedDateTimeEClass, ATTRIBUTED_DATE_TIME__ANY_ATTRIBUTE);

		attributedURIEClass = createEClass(ATTRIBUTED_URI);
		createEAttribute(attributedURIEClass, ATTRIBUTED_URI__VALUE);
		createEAttribute(attributedURIEClass, ATTRIBUTED_URI__ID);
		createEAttribute(attributedURIEClass, ATTRIBUTED_URI__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXPIRES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIMESTAMP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);

		timestampTypeEClass = createEClass(TIMESTAMP_TYPE);
		createEReference(timestampTypeEClass, TIMESTAMP_TYPE__CREATED);
		createEReference(timestampTypeEClass, TIMESTAMP_TYPE__EXPIRES);
		createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__GROUP);
		createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__ANY);
		createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__ID);
		createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__ANY_ATTRIBUTE);

		// Create data types
		tTimestampFaultEDataType = createEDataType(TTIMESTAMP_FAULT);
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
		initEClass(attributedDateTimeEClass, AttributedDateTime.class, "AttributedDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedDateTime_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AttributedDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedDateTime_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AttributedDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedDateTime_ValueType(), theXMLTypePackage.getQName(), "valueType", null, 0, 1, AttributedDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedDateTime_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedURIEClass, AttributedURI.class, "AttributedURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributedURI_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, AttributedURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedURI_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AttributedURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributedURI_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AttributedURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Created(), this.getAttributedDateTime(), null, "created", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Expires(), this.getAttributedDateTime(), null, "expires", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Timestamp(), this.getTimestampType(), null, "timestamp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestampTypeEClass, TimestampType.class, "TimestampType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimestampType_Created(), this.getAttributedDateTime(), null, "created", null, 0, 1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimestampType_Expires(), this.getAttributedDateTime(), null, "expires", null, 0, 1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestampType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestampType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TimestampType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestampType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimestampType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(tTimestampFaultEDataType, QName.class, "TTimestampFault", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (attributedDateTimeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedDateTime",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedDateTime_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAttributedDateTime_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAttributedDateTime_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueType"
		   });		
		addAnnotation
		  (getAttributedDateTime_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });			
		addAnnotation
		  (attributedURIEClass, 
		   source, 
		   new String[] {
			 "name", "AttributedURI",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributedURI_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAttributedURI_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributedURI_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
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
		  (getDocumentRoot_Created(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Created",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Expires(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Expires",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Timestamp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (timestampTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimestampType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTimestampType_Created(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Created",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTimestampType_Expires(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Expires",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimestampType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getTimestampType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getTimestampType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimestampType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (tTimestampFaultEDataType, 
		   source, 
		   new String[] {
			 "name", "tTimestampFault",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#QName",
			 "enumeration", "{http://schemas.xmlsoap.org/ws/2003/06/utility}MessageExpired"
		   });
	}

} //UtilityPackageImpl
