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

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

public class ColorSelector_new {

	public static final int EDGE = 0;
	public static final int FILL = 1;
	public static final int FONT_NORMAL = 2;
	public static final int FONT_HOVER = 3;
	private static final int RED = 0;
	private static final int GREEN = 1;
	private static final int BLUE = 2;
	private static final int DEFAULT = 3;
	
	public static final int colors[][][] = new int[][][] {
		{/* technical colors: */{ 0, 25, 51 }, { 130, 151, 182 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* operational colors: */{ 120, 80, 0 }, { 250, 220, 130 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* business colors: */{ 60, 0, 0 }, { 220, 160, 160 },
				{ 60, 60, 60 }, { 0, 0, 0 } },
		{/* default colors: */{ 181, 189, 210 }, { 233, 236, 242 },
				{ 31, 62, 94 }, { 120, 139, 158 } },
		{/* marked colors: */{ 80, 130, 80 }, { 150, 200, 140 },
				{ 60, 60, 60 }, { 0, 0, 0 } } };
	
	public static Color getColor(String key, Device device, int colorType) {
		int elementType = 3;
		if (key.equalsIgnoreCase("Identifiability"))
			elementType=0;
		else if (key.equalsIgnoreCase("TransportSecurity"))
			elementType=2;
		else if (key.equalsIgnoreCase("MessageSecurity"))
			elementType=4;
		else
			return new Color(device, colors[DEFAULT][colorType][RED],
					colors[DEFAULT][colorType][GREEN],
					colors[DEFAULT][colorType][BLUE]);

		return new Color(device, colors[elementType][colorType][RED],
				colors[elementType][colorType][GREEN],
				colors[elementType][colorType][BLUE]);
	}
}
