/**
 * This file is part of SecurityPolicyGenerator.
 * Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
 * Authors: Tom Sattler
 * 
 * SecurityPolicyGenerator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * SecurityPolicyGenerator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with SecurityPolicyGenerator.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * For more information, please contact Fraunhofer FOKUS at this
 * address: elankontakt [at] fokus [dot] fraunhofer [dot] de
 * http://www.fokus.fraunhofer.de
 */
package de.fraunhofer.fokus.texo.usdltowspolicy.handlers;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * @see http
 *      ://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702/ws-securitypolicy
 *      -1.2-spec-os.html
 */
public class PolicyTemplates {

	public static final ResourceBundle CONFIG = ResourceBundle.getBundle("config");
	
	/**
	 * Gets a policy header.
	 * 
	 * @param policyId
	 * @return
	 */
	public static String getPOLICYBEGIN(String profile_url, String policyId) {
		final ResourceBundle POL = ResourceBundle
				.getBundle(CONFIG.getString("policy_begin_end"));
		Object[] messageArguments = { profile_url, policyId };
		MessageFormat formatter = new MessageFormat("");
		formatter.applyPattern(POL.getString("policy_begin"));
		return formatter.format(messageArguments);
	}

	/**
	 * Gets a supporting token element holding a issued token. Given
	 * registration and authentication requirements are set within claims.
	 * 
	 * @param kindOfRegistration
	 * @param kindOfAuthentication
	 * @param sts
	 *            - adress of security token server
	 * @return
	 */
	public static String getSUPPORTINGTOKEN(String profile_url, String[] kindOfRegistration,
			String[] kindOfAuthentication, String sts) {
		final ResourceBundle SUPPORTING = ResourceBundle
		.getBundle(CONFIG.getString("supporting_token"));
		MessageFormat formatter = new MessageFormat("");
		int caseLength = checkAuthenticationRegistrationAttributes(
				kindOfRegistration, kindOfAuthentication);
		String supportingToken = "";
		Object[] messageArguments = null;
		if (caseLength > 1) {
			supportingToken = SUPPORTING.getString("token_begin");
			if (caseLength == 4) {
				for (String regMethod : kindOfRegistration) {
					for (String authMethod : kindOfAuthentication) {
						if (SUPPORTING.containsKey("sts")){
							messageArguments = new Object[]{profile_url, sts};
							formatter.applyPattern(SUPPORTING.getString("sts"));
							supportingToken += formatter.format(messageArguments);
						}
						if (SUPPORTING.containsKey("registration_claim")){
							messageArguments = new Object[]{regMethod};	
							formatter.applyPattern(SUPPORTING.getString("registration_claim"));
							supportingToken += formatter.format(messageArguments);
						}
						if (SUPPORTING.containsKey("authentication_claim")){
							messageArguments = new Object[]{authMethod};	
							formatter.applyPattern(SUPPORTING.getString("authentication_claim"));
							supportingToken += formatter.format(messageArguments);
						}
						if (SUPPORTING.containsKey("sectemplate")){
							supportingToken += SUPPORTING.getString("sectemplate");
						}
					}
				}
			} else if (caseLength == 3) {
				for (String regMethod : kindOfRegistration) {
					if (SUPPORTING.containsKey("sts")){
						messageArguments = new Object[]{profile_url, sts};
						formatter.applyPattern(SUPPORTING.getString("sts"));
						supportingToken += formatter.format(messageArguments);
					}
					if (SUPPORTING.containsKey("registration_claim")){
						messageArguments = new Object[]{regMethod};	
						formatter.applyPattern(SUPPORTING.getString("registration_claim"));
						supportingToken += formatter.format(messageArguments);
					}
					if (SUPPORTING.containsKey("sectemplate")){
						supportingToken += SUPPORTING.getString("sectemplate");
					}
				}
			} else if (caseLength == 2) {
				for (String authMethod : kindOfAuthentication) {
					if (SUPPORTING.containsKey("sts")){
						messageArguments = new Object[]{profile_url, sts};
						formatter.applyPattern(SUPPORTING.getString("sts"));
						supportingToken += formatter.format(messageArguments);
					}
					if (SUPPORTING.containsKey("authentication_claim")){
						messageArguments = new Object[]{authMethod};	
						formatter.applyPattern(SUPPORTING.getString("authentication_claim"));
						supportingToken += formatter.format(messageArguments);
					}
					if (SUPPORTING.containsKey("sectemplate")){
						supportingToken += SUPPORTING.getString("sectemplate");
					}
				}
			}
			supportingToken += SUPPORTING.getString("token_end");
		}
		return supportingToken;
	}

	/**
	 * Gets the encrypted elements only in case the given encryption element is
	 * "HeaderBody", "Header" or "Body".
	 * 
	 * @param encryptionElement
	 * @return
	 */
	public static String getENCRYPTEDELEMENTS(String encryptionElement) {
		if (!encryptionElement.equals("")){
			final ResourceBundle ENCRYPTED = ResourceBundle
			.getBundle(CONFIG.getString("encrypted_parts_elements"));
			if (ENCRYPTED.containsKey("begin")){
			String encryptedElements = ENCRYPTED.getString("begin");
			encryptedElements += encryptionElement.equalsIgnoreCase("HeaderBody") ?
				ENCRYPTED.getString("encrypted_parts_header") + ENCRYPTED.getString("encrypted_parts_body") :
					(encryptionElement.equalsIgnoreCase("Header") ? ENCRYPTED.getString("encrypted_parts_header") :
						(encryptionElement.equalsIgnoreCase("Body") ? ENCRYPTED.getString("encrypted_parts_body") : "")); 
			encryptedElements += ENCRYPTED.getString("end"); 
			return encryptedElements;
			} else if (ENCRYPTED.containsKey("element_begin")){
				String encryptedElements = ENCRYPTED.getString("element_begin");
				if (ENCRYPTED.containsKey("encrypted_elements"))
					encryptedElements += ENCRYPTED.getString("encrypted_elements");
				encryptedElements += ENCRYPTED.getString("element_end");
				return encryptedElements;
			}
		}
		return "";
	}

	/**
	 * Gets the signed elements only in case the given signed element is 
	 * "HeaderBody", "Header" or "Body".
	 * 
	 * @param signature
	 * @return
	 */
	public static String getSIGNEDELEMENTS(String signature) {
		if (!signature.equals("")) {
			final ResourceBundle SIGNED = ResourceBundle
			.getBundle(CONFIG.getString("signed_parts_elements"));
			if (SIGNED.containsKey("begin")){
				String signedElements = SIGNED.getString("begin");
				signedElements += signature.equalsIgnoreCase("HeaderBody") ?
						SIGNED.getString("signed_parts_header") + SIGNED.getString("signed_parts_body") :
							(signature.equalsIgnoreCase("Header") ? SIGNED.getString("signed_parts_header") :
								(signature.equalsIgnoreCase("Body") ? SIGNED.getString("signed_parts_body") : "")); 
				signedElements += SIGNED.getString("end");
				return signedElements;
			} else if (SIGNED.containsKey("element_begin")){
				String encryptedElements = SIGNED.getString("element_begin");
				if (SIGNED.containsKey("signed_elements"))
					encryptedElements += SIGNED.getString("signed_elements");
				encryptedElements += SIGNED.getString("element_end");
				return encryptedElements;
			}
		}
		return "";
	}

	/**
	 * Gets a binding element depending on the given parameter. The hierarchy if
	 * all parameters are true is symmetric, asymmetric and then transport
	 * binding. Only one binding is returned according to the WS-SecurityPolicy
	 * standard of OASIS.
	 * 
	 * @param symmetric
	 * @param asymmetric
	 * @param transport
	 * @param algorithmSuite
	 * @return
	 */
	public static String getBINDING(boolean asymmetric_symmetric,
			boolean transport, String algorithmSuite) {
		return asymmetric_symmetric ? getASYMETRIC_SYMMETRICBINDING(algorithmSuite)
				: (transport ? getTRANSPORTBINDING(algorithmSuite) : "");
	}

	/**
	 * Gets the asymmetric_symmetric binding template as a string.
	 * @param messageIntegrityInstance
	 * @return
	 */
	public static String getASYMETRIC_SYMMETRICBINDING(String messageIntegrityInstance) {
		final ResourceBundle BINDING = ResourceBundle
		.getBundle(CONFIG.getString("asymmetric_symmetric_binding"));
		String bindingToken = BINDING.getString("begin");
		if (!messageIntegrityInstance.equals("") && BINDING.containsKey("algorithm_suite")){
			Object[] messageArguments = { messageIntegrityInstance };
			MessageFormat formatter = new MessageFormat("");
			formatter.applyPattern(BINDING.getString("algorithm_suite"));
			bindingToken +=  formatter.format(messageArguments);
		}
		if (BINDING.containsKey("layout"))
			bindingToken += BINDING.getString("layout");
		bindingToken += BINDING.getString("end");
		return bindingToken;
	}

	
	/**
	 * Gets the transport binding template as a string.
	 * 
	 * @param messageIntegrityInstance
	 * @return
	 */
	public static String getTRANSPORTBINDING(String messageIntegrityInstance) {
		final ResourceBundle TRANSPORT = ResourceBundle
		.getBundle(CONFIG.getString("transport_binding"));
		String transportToken = TRANSPORT.getString("transport_begin");
		if (!messageIntegrityInstance.equals("") && TRANSPORT.containsKey("algorithm_suite")){
			Object[] messageArguments = { messageIntegrityInstance };
			MessageFormat formatter = new MessageFormat("");
			formatter.applyPattern(TRANSPORT.getString("algorithm_suite"));
			transportToken +=  formatter.format(messageArguments);
		}
		if (TRANSPORT.containsKey("layout"))
			transportToken += TRANSPORT.getString("layout");
		transportToken += TRANSPORT.getString("transport_end");
		return transportToken;
	}

	/**
	 * Gets the policy ending.
	 * 
	 * @return
	 */
	public static String getPOLICYEND() {
		final ResourceBundle POL = ResourceBundle
		.getBundle(CONFIG.getString("policy_begin_end"));
		return POL.getString("policy_end");
	}

	
	private static int checkAuthenticationRegistrationAttributes(
			String[] kindsOfRegistration, String[] kindsOfAuthentication) {
		if ((kindsOfAuthentication == null || kindsOfAuthentication.length == 0)
				&& (kindsOfRegistration == null || kindsOfRegistration.length == 0))
			return 1;
		else if (kindsOfAuthentication.length > 0
				&& kindsOfRegistration.length == 0)
			return 2;
		else if (kindsOfAuthentication.length == 0
				&& kindsOfRegistration.length > 0)
			return 3;
		else if (kindsOfAuthentication.length > 0
				&& kindsOfRegistration.length > 0)
			return 4;
		return 0;
	}
}
