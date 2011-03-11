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
 * A representation of the literals of the enumeration '<em><b>Key Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ws.sx.ws.trust.wstrust._200512Package#getKeyTypeEnum()
 * @model extendedMetaData="name='KeyTypeEnum'"
 * @generated
 */
public enum KeyTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Public Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY(0, "httpDocsOasisOpenOrgWsSxWsTrust200512PublicKey", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/PublicKey"),

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Symmetric Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY(1, "httpDocsOasisOpenOrgWsSxWsTrust200512SymmetricKey", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey"),

	/**
	 * The '<em><b>Http Docs Oasis Open Org Wssx Wstrust200512 Bearer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER(2, "httpDocsOasisOpenOrgWssxWstrust200512Bearer", "http://docs.oasis-open.org/wssx/wstrust/200512/Bearer");

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Public Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Public Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY
	 * @model name="httpDocsOasisOpenOrgWsSxWsTrust200512PublicKey" literal="http://docs.oasis-open.org/ws-sx/ws-trust/200512/PublicKey"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY_VALUE = 0;

	/**
	 * The '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Symmetric Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Http Docs Oasis Open Org Ws Sx Ws Trust200512 Symmetric Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY
	 * @model name="httpDocsOasisOpenOrgWsSxWsTrust200512SymmetricKey" literal="http://docs.oasis-open.org/ws-sx/ws-trust/200512/SymmetricKey"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY_VALUE = 1;

	/**
	 * The '<em><b>Http Docs Oasis Open Org Wssx Wstrust200512 Bearer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Http Docs Oasis Open Org Wssx Wstrust200512 Bearer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER
	 * @model name="httpDocsOasisOpenOrgWssxWstrust200512Bearer" literal="http://docs.oasis-open.org/wssx/wstrust/200512/Bearer"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Key Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyTypeEnum[] VALUES_ARRAY =
		new KeyTypeEnum[] {
			HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY,
			HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY,
			HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyTypeEnum get(int value) {
		switch (value) {
			case HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY_VALUE: return HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_PUBLIC_KEY;
			case HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY_VALUE: return HTTP_DOCS_OASIS_OPEN_ORG_WS_SX_WS_TRUST200512_SYMMETRIC_KEY;
			case HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER_VALUE: return HTTP_DOCS_OASIS_OPEN_ORG_WSSX_WSTRUST200512_BEARER;
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
	private KeyTypeEnum(int value, String name, String literal) {
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
	
} //KeyTypeEnum
