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

package net.texo.USDLSecurityEditor.listener;

import net.texo.USDLSecurityEditor.SecurityEditor;
import net.texo.USDLSecurityEditor.proxies.AuthZMechanismProxy;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;


// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving authZExpression events.
 * The class that is interested in processing a authZExpression
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addAuthZExpressionListener<code> method. When
 * the authZExpression event occurs, that object's appropriate
 * method is invoked.
 *
 * @see AuthZExpressionEvent
 */
public class AuthZExpressionListener implements
		ModifyListener {

	/** The editor. */
	private SecurityEditor editor;
	
	/** The action. */
	private SecurityAction action;
	
	/**
	 * Instantiates a new auth z expression listener.
	 *
	 * @param editor the editor
	 * @param aspect the aspect
	 * @param action the action
	 */
	public AuthZExpressionListener(SecurityEditor editor, SecurityAspect aspect, SecurityAction action) {
	    this.editor = editor;
		this.action = action;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
	 */
	@Override
	public void modifyText(ModifyEvent event) {

        ((AuthZMechanismProxy)editor.ActionProxies.get(action)).setExpressionElement();
    	editor.setDirty(true);
	}
}
