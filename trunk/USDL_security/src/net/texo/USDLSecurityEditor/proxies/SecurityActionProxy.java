/**
* This file is part of net.texo.idm.USDLSecurityEditor.
* Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
* Authors: rda
* 
 * net.texo.idm.USDLSecurityEditor is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.

* net.texo.idm.USDLSecurityEditor is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* 
 * You should have received a copy of the GNU Affero General Public License
* along with net.texo.idm.USDLSecurityEditor.  If not, see <http://www.gnu.org/licenses/>.
* 
 * For more information, please contact Fraunhofer FOKUS at this
* address: elankontakt [at] fokus [dot] fraunhofer [dot] de
* http://www.fokus.fraunhofer.de
*/

package net.texo.USDLSecurityEditor.proxies;

import org.eclipse.swt.widgets.Composite;

import net.texo.USDLSecurityEditor.SecurityEditor;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;


public abstract class SecurityActionProxy {
	
	protected SecurityEditor editor;
	protected SecurityAspect aspect;
	protected SecurityAction action;
	protected Composite cAction;
	
	/**
	 * Instantiates a new security action proxy.
	 *
	 * @param editor the editor
	 * @param aspect the aspect
	 * @param action the action
	 * @param cAction the c action
	 */
	public SecurityActionProxy(
			SecurityEditor editor,
			SecurityAspect aspect,
			SecurityAction action,
			Composite cAction) {
		
		this.editor = editor;
		this.aspect = aspect;
		this.action = action;
		this.cAction = cAction;
	}
	
	
	public abstract void update();
	public abstract void setVisible(boolean state);
}
