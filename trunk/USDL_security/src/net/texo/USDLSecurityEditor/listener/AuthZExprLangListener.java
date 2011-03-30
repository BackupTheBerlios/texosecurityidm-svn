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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;


public class AuthZExprLangListener implements
		ISelectionChangedListener {

	private SecurityEditor editor;
	private SecurityAction action;
	
	public AuthZExprLangListener(SecurityEditor editor, SecurityAspect aspect, SecurityAction action) {
	    this.editor = editor;
		this.action = action;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	@Override
    public void selectionChanged(SelectionChangedEvent event) {

        if (editor.ActionProxies.get(action) != null) {
        	((AuthZMechanismProxy)editor.ActionProxies.get(action)).setExpressionElement();
        }
    	editor.setDirty(true);
    }
}
