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

import java.util.Iterator;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import net.texo.USDLSecurityEditor.SecurityEditor;
import net.texo.USDLSecurityEditor.SecurityOntology;
import servicelevelmodule.SecurityAspect;
import servicelevelmodule.SecurityMechanism;
import servicelevelmodule.SecurityRequirementLevel;

public class SecurityMechanismProxy extends SecurityActionProxy {

	private ComboViewer cvReqLevel;
	private Label marker;
	private List lMechanisms;

	
	/**
	 * Instantiates a new security mechanism proxy.
	 *
	 * @param editor the editor
	 * @param aspect the aspect
	 * @param action the action
	 * @param cAction the c action
	 * @param cvReqLevel the cv req level
	 * @param marker the marker
	 * @param lMechanisms the l mechanisms
	 */
	public SecurityMechanismProxy(
			SecurityEditor editor,
			SecurityAspect aspect,
			SecurityMechanism action,
			Composite cAction,
			ComboViewer cvReqLevel,
			Label marker,
			List lMechanisms) {
		
		super(editor, aspect, action, cAction);
		this.cvReqLevel = cvReqLevel;
		this.marker = marker;
		this.lMechanisms = lMechanisms;
		
		update();
	}

	
	public void setLevel(String levelName) {
		
		if (cvReqLevel == null) return;
		if (aspect == null) return;
		
       	SecurityRequirementLevel level = SecurityOntology.getSecReqLvlByString(levelName);
       	((SecurityMechanism)action).setLevel(level);
       	
       	update();
	}
	
	
	public void setVisible(boolean state) {
		cAction.setVisible(state);
	}
	
	
	public void updateMechanisms() {
		
		java.util.List<String> instances;
		instances = editor.profile.getInstancesOfSecurityAction(action.getType(), ((SecurityMechanism)action).getLevel(), true);

		lMechanisms.removeAll();
		for (Iterator<String> i = instances.iterator(); i.hasNext();) lMechanisms.add(i.next());
	}


	public void notifyLevel(String levelName) {

		IStructuredSelection selection = new StructuredSelection(levelName);
		cvReqLevel.setSelection(selection);
	}


	@Override
	public void update() {
		
		if (((SecurityMechanism)action).getLevel().getValue() < aspect.getLevel().getValue()) {
   			marker.setVisible(true);
   			marker.setToolTipText(action.getType().getLiteral() + " requirement level is below " + aspect.getType().getLiteral() + " requirement level.");
    	} else {
   			marker.setVisible(false);
    	}
		
		updateMechanisms();
	}
}
