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

import java.util.LinkedList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;

/**
 * 
 *
 */
public class StyledTextCustomizer {

	private StyledText st;
	private boolean[] elementsFound;
	
	public StyledTextCustomizer(StyledText st){
		this.st = st;
		
	}
	
	/**
	 * Customizes a text within a style text element.
	 * The given keywords must be at least two (start and end).
	 * @param keywords
	 */
	public void customizeText(final String keywords[]){	
		elementsFound = new boolean[keywords.length];
		for (boolean b: elementsFound)
			b = false;
		st.addLineStyleListener(new LineStyleListener() {
		      @SuppressWarnings("unchecked")
			public void lineGetStyle(LineStyleEvent event) {		        
		    	  @SuppressWarnings("rawtypes")
		    	  LinkedList list = null;
		    	 
		    	 String line = event.lineText;
		        int cursor = -1;
		        
		        
				list = new LinkedList();
		       
				for (int i = 0; i < keywords.length; i++){
		        	
		        if( ((keywords.length >1 && i % 2 == 0) && getElementFound(i) == true && getElementFound(i+1) == false) || ((cursor = line.indexOf(keywords[i], cursor+1)) >= 0)) {
		        	setElementFound(i);
		        	if (keywords.length >1 && i % 2 == 0){
		        		if (getElementFound(i) == true && getElementFound(i+1) == false){
		        			list.add(getHighlightStyle(0, line.indexOf(">")));
		        		} else if (getElementFound(i) == true && getElementFound(i+1) == true)
		        			list.add(getHighlightStyle(event.lineOffset+cursor, line.indexOf(">")));
		        	}
		        	list.add(getHighlightStyle(event.lineOffset+cursor, line.indexOf(">")));
		        }
		        }
				
		        event.styles = (StyleRange[]) list.toArray(new StyleRange[list.size()]);
		      }
		    });
	}
	
	private StyleRange getHighlightStyle(int startOffset, int length) {
	    StyleRange styleRange = new StyleRange();
	    styleRange.start = startOffset;
	    styleRange.length = length;
	    styleRange.fontStyle = SWT.BOLD;
	    return styleRange;
	  }

	private boolean getElementFound(int number){
		return elementsFound[number];
	}
	
	private void setElementFound(int number){
		elementsFound[number] = true;
	}
	
	
}
