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
package org.xmlsoap.schemas.ws._2004._09.wspolicy.presentation;

public class TextAlternative {

	private String text;
	private int alternative;
	
	public TextAlternative(String text, int alternative){
		this.text = text;
		this.alternative = alternative;
	}

	protected String getText() {
		return text;
	}

	protected void setText(String text) {
		this.text = text;
	}

	protected int getAlternative() {
		return alternative;
	}

	protected void setAlternative(int alternative) {
		this.alternative = alternative;
	}
	
	
}
