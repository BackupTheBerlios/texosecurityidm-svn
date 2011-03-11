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
package org.open.oasis.docs.ws.sx.ws.trust.wstrust;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Computed Key Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getComputedKeyEnum()
 * @model extendedMetaData="name='ComputedKeyEnum'"
 * @generated
 */
public enum ComputedKeyEnum implements Enumerator {
	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKPSHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1(0, "httpDocsOasisOpenOrgWsSxWsTrust200512CKPSHA1", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/CK/PSHA1"),

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKHASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH(1, "httpDocsOasisOpenOrgWsSxWsTrust200512CKHASH", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/CK/HASH");

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKPSHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKPSHA1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1
	 * @model name="httpDocsOasisOpenOrgWsSxWsTrust200512CKPSHA1" literal="http://docs.oasis-open.org/ws-sx/ws-trust/200512/CK/PSHA1"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1_VALUE = 0;

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKHASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 CKHASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH
	 * @model name="httpDocsOasisOpenOrgWsSxWsTrust200512CKHASH" literal="http://docs.oasis-open.org/ws-sx/ws-trust/200512/CK/HASH"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Computed Key Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComputedKeyEnum[] VALUES_ARRAY =
		new ComputedKeyEnum[] {
			HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1,
			HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH,
		};

	/**
	 * A public read-only list of all the '<em><b>Computed Key Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComputedKeyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Computed Key Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputedKeyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputedKeyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computed Key Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputedKeyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputedKeyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computed Key Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputedKeyEnum get(int value) {
		switch (value) {
			case HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1_VALUE: return HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKPSHA1;
			case HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH_VALUE: return HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_CKHASH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComputedKeyEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ComputedKeyEnum
