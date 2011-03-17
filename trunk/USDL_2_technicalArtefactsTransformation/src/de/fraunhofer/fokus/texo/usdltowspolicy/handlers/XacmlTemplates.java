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

import de.fraunhofer.fokus.texo.usdltowspolicy.helper.ExpressionParser;


/**
 * @see http://www.oasis-open.org/committees/tc_home.php?wg_abbrev=xacml
 */
public class XacmlTemplates {

	/**
	 * Gets a xacml policy depending on a language profile.
	 * Possible parameters for the language profile are role based access control (rbac)
	 * and attribute based access control (abac).
	 * @param policyID
	 * @param authorizationText
	 * @param containsOR
	 * @param roles
	 * @param language
	 * @return
	 */
	public static String GETXACML(String profile_url, String policyID, String authorizationText,
			boolean containsOR, String[] roles, String language) {
		final ResourceBundle XACML = ResourceBundle
		.getBundle("templates/xacml/xacmlbegin_end_template");
		Object[] messageArguments = { policyID };
		MessageFormat formatter = new MessageFormat("");
		formatter.applyPattern(XACML.getString("xacml_begin"));
		String s = formatter.format(messageArguments);

		s += language.equals("RBAC") ? GETRBAC(profile_url, policyID, authorizationText,
				roles, containsOR) : (language.equals("ABAC") ? GETABAC(profile_url,
				policyID, authorizationText, roles, containsOR) : XACML.getString("xacml_end"));

		s += XACML.getString("xacml_end");
		return s;
	}

	private static String GETRBAC(String profile_url, String policyID, String authorizationText,
			String[] roles, boolean containsOR) {
		final ResourceBundle XACML = ResourceBundle
		.getBundle("templates/xacml/xacml_template");
		MessageFormat formatter = new MessageFormat("");
		String s = "";
		int i = 1;
		if (containsOR) {
			for (String role : roles) {
				Object[] messageArguments = { new Integer(i), role.replace(" ", "") };
				formatter.applyPattern(XACML.getString("xacml_rule_begin"));
				s += formatter.format(messageArguments); 
				s += XACML.getString("xacml_target_begin");
				i++;
				messageArguments = new Object[]{ role.replace(" ", "") };
				formatter.applyPattern(XACML.getString("xacml_subject"));
				s += formatter.format(messageArguments); 
				messageArguments = new Object[]{ policyID };
				formatter.applyPattern(XACML.getString("xacml_resource"));
				s += formatter.format(messageArguments);
				s += XACML.getString("xacml_action");
				s += XACML.getString("xacml_target_end");
				s += XACML.getString("xacml_condition_begin_normal");
				messageArguments = new Object[]{ profile_url, role.replace(" ", "") };
				formatter.applyPattern(XACML.getString("xacml_condition_rule"));
				s += formatter.format(messageArguments);
				s += XACML.getString("xacml_condition_end");
				s += XACML.getString("xacml_rule_end");
			}
		} else {
			Object[] messageArguments = { new Integer(i), authorizationText };
			formatter.applyPattern(XACML.getString("xacml_rule_begin"));
			s += formatter.format(messageArguments); 
			s += XACML.getString("xacml_target_begin");
			for (String role : roles) {
				messageArguments = new Object[]{ role.replace(" ", "") };
				formatter.applyPattern(XACML.getString("xacml_subject"));
				s += formatter.format(messageArguments);
			}
			messageArguments = new Object[]{ policyID };
			formatter.applyPattern(XACML.getString("xacml_resource"));
			s += formatter.format(messageArguments);
			s += XACML.getString("xacml_action");
			s += XACML.getString("xacml_target_end");
			s += XACML.getString("xacml_condition_begin_andfunction");
			for (String role : roles) {
				messageArguments = new Object[]{ profile_url, role.replace(" ", "") };
				formatter.applyPattern(XACML.getString("xacml_condition_rule"));
				s += formatter.format(messageArguments);
			}
			s += XACML.getString("xacml_condition_end");
			s += XACML.getString("xacml_rule_end");
		}
		return s;
	}

	private static String GETABAC(String profile_url, String policyID, String authorizationText,
			String[] attributes, boolean containsOR) {
		final ResourceBundle XACML = ResourceBundle
		.getBundle("templates/xacml/xacml_template");
		MessageFormat formatter = new MessageFormat("");
		String s = "";
		int i =1;
		if (containsOR) {
			for (String attribute : attributes) {
				ExpressionParser ep = new ExpressionParser(attribute);
				Object[] messageArguments = { new Integer(i), attribute.replace("<", "&lt;")};
				formatter.applyPattern(XACML.getString("xacml_rule_begin"));
				s += formatter.format(messageArguments); 
				s += XACML.getString("xacml_target_begin");
				i++;
				messageArguments = new Object[]{new String("ServiceConsumer") };
				formatter.applyPattern(XACML.getString("xacml_subject"));
				s += formatter.format(messageArguments);
				messageArguments = new Object[]{ policyID };
				formatter.applyPattern(XACML.getString("xacml_resource"));
				s += formatter.format(messageArguments);
				s += XACML.getString("xacml_action");
				s += XACML.getString("xacml_target_end");
				messageArguments = new Object[]{ ep.getOperator() };
				formatter.applyPattern(XACML.getString("xacml_condition_begin_function"));
				s += formatter.format(messageArguments);
				messageArguments = new Object[]{ profile_url, ep.getAttribute().replace(" ", ""), ep.getValue() };
				formatter.applyPattern(XACML.getString("xacml_condition_attribute"));
				s += formatter.format(messageArguments);
				s += XACML.getString("xacml_condition_end");
				s += XACML.getString("xacml_rule_end");
			}
		} else {
			Object[] messageArguments = { new Integer(i), authorizationText.replace("<", "&lt;")};
			formatter.applyPattern(XACML.getString("xacml_rule_begin"));
			s += formatter.format(messageArguments); 
			s += XACML.getString("xacml_target_begin");
			messageArguments = new Object[]{new String("ServiceConsumer") };
			formatter.applyPattern(XACML.getString("xacml_subject"));
			s += formatter.format(messageArguments);
			messageArguments = new Object[]{ policyID };
			formatter.applyPattern(XACML.getString("xacml_resource"));
			s += formatter.format(messageArguments);
			s += XACML.getString("xacml_action");
			s += XACML.getString("xacml_target_end");
			for (String attribute : attributes) {
				ExpressionParser ep = new ExpressionParser(attribute);
				messageArguments = new Object[]{ ep.getOperator() };
				formatter.applyPattern(XACML.getString("xacml_condition_begin_function"));
				s += formatter.format(messageArguments);
				messageArguments = new Object[]{ profile_url, ep.getAttribute().replace(" ", ""), ep.getValue() };
				formatter.applyPattern(XACML.getString("xacml_condition_attribute"));
				s += formatter.format(messageArguments);
				s += XACML.getString("xacml_condition_end");
			}
			s += XACML.getString("xacml_rule_end");
		}
		return s;
	}
}
