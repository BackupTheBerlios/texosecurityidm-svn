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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.texo.USDLSecurityEditor.SecurityEditor;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import servicelevelmodule.SecurityAction;
import servicelevelmodule.SecurityAspect;
import servicelevelmodule.SecurityRequirementLevel;

import net.texo.USDLSecurityEditor.SecurityOntology;

public class SecurityAspectProxy {

	public SecurityEditor editor;
	
	private ComboViewer cvReqLevel;
	private SecurityAspect aspect;
	private List<SecurityActionProxy> actions;

	
	/**
	 * Instantiates a new security aspect proxy.
	 *
	 * @param editor the editor
	 * @param aspect the aspect
	 * @param cvReqLevel the cv req level
	 */
	public SecurityAspectProxy(
			SecurityEditor editor,
			SecurityAspect aspect,
			ComboViewer cvReqLevel) {
		
		this.editor = editor;
		this.aspect = aspect;
		this.cvReqLevel = cvReqLevel;
		actions = new ArrayList<SecurityActionProxy>();
	}
	
	
	public void addAction(SecurityAction action) {
		actions.add(editor.ActionProxies.get(action));
	}
	
	
	public void setLevel(String levelName) {

		if (editor == null) return;
		if (cvReqLevel == null) return;
		if (aspect == null) return;
		
       	SecurityRequirementLevel level = SecurityOntology.getSecReqLvlByString(levelName);
       	aspect.setLevel(level);
       	
		for (Iterator<SecurityActionProxy> i = actions.iterator(); i.hasNext();) {
			SecurityActionProxy action = i.next();
			if (level == SecurityRequirementLevel.UNDEFINED) {
				action.setVisible(false);
			} else {
				action.setVisible(true);
			}
			if (action instanceof SecurityMechanismProxy) {
				((SecurityMechanismProxy)action).notifyLevel(levelName);
			}
		}
	}
	
	
	public void notifyLevel(String levelName) {

		IStructuredSelection selection = new StructuredSelection(levelName);
		cvReqLevel.setSelection(selection);
	}
}
