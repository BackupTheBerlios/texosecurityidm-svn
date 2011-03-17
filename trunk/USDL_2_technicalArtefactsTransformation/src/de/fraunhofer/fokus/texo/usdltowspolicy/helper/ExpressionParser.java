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
package de.fraunhofer.fokus.texo.usdltowspolicy.helper;

/**
 * A expression parser to transform the following operators "==", "<", ">", ">=", "<="
 * into the xacml specific text operators.
 * 
 * @see http://www.oasis-open.org/committees/xacml/ConformanceTests/ConformanceTests.html
 */
public class ExpressionParser {

	private String attribute;

	private String value;

	private String operator;

	private String[] OPERATORS = new String[] { "==", "<", ">", ">=", "<=" };

	public ExpressionParser(String expression) {
		for (String o : OPERATORS)
			if (expression.contains(o)) {
				attribute = expression.split(o)[0];
				value = expression.split(o)[1];
				operator = o;
			}
			operator = transformOperator();
			
		
	}

	public String getAttribute() {
		return attribute;
	}

	public String getValue() {
		return value;
	}

	public String getOperator() {
		return operator;
	}


	private String transformOperator() {
		try {
		Integer.parseInt(value.replace(" ", ""));
		} catch (NumberFormatException e){
			return "string-equal";
		}
		if (operator.equals("<"))
			return "integer-less-than";
		else if (operator.equals("<="))
			return "integer-less-than-or-equal";
		else if (operator.equals("=="))
			return "integer-equal";
		else if (operator.equals(">="))
			return "integer-greater-than-or-equal";
		else if (operator.equals(">"))
			return "integer-greater-than";
		return "";
	}

}
