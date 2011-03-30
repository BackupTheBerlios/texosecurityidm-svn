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

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import net.texo.USDLSecurityEditor.SecurityEditor;
import net.texo.USDLSecurityEditor.SecurityOntology;
import servicelevelmodule.AuthorizationMechanism;
import servicelevelmodule.AuthorizationMechanismType;
import servicelevelmodule.SecurityAspect;

public class AuthZMechanismProxy extends SecurityActionProxy {

	private ComboViewer cvAuthZMethod;
	private Text tExpression;
	private ComboViewer cvExprLang;

	/**
	 * Instantiates a new auth z mechanism proxy.
	 *
	 * @param editor the editor
	 * @param aspect the aspect
	 * @param action the action
	 * @param cAction the c action
	 * @param cvAuthZMethod the cv auth z method
	 * @param tExpression the t expression
	 * @param cvExprLang the cv expr lang
	 */
	public AuthZMechanismProxy(
			SecurityEditor editor,
			SecurityAspect aspect,
			AuthorizationMechanism action,
			Composite cAction,
			ComboViewer cvAuthZMethod,
			Text tExpression,
			ComboViewer cvExprLang) {
		
		super(editor, aspect, action, cAction);
		
		this.cvAuthZMethod = cvAuthZMethod;
		this.tExpression = tExpression;
		this.cvExprLang = cvExprLang;
	}

	
	public void setAuthZMethod(String methodName) {

		if (editor == null) return;
		if (editor.model == null) return;
		
    	((AuthorizationMechanism)action).setAuthorizationType(SecurityOntology.getAuthZMechTypeByString(methodName));
    	
    	if (methodName.equals(AuthorizationMechanismType.NONE.getLiteral())) {
    		tExpression.setEnabled(false);
    		cvExprLang.getCombo().setEnabled(false);
    	} else {
    		/** TODO **/
    		tExpression.setEnabled(true);
//    		cvExprLang.getCombo().setEnabled(true);
    	}
    	
    	if (methodName.equals(AuthorizationMechanismType.ROLE_BASED.getLiteral())) {
    		/** TODO **/
    		notifyExprLang("AccessControlExpressionLanguage#RBAC");
    	} else if (methodName.equals(AuthorizationMechanismType.ATTRIBUTE_BASED.getLiteral())) {
    		/** TODO **/
    		notifyExprLang("AccessControlExpressionLanguage#ABAC");
    	} else {
    		/** TODO **/
    		notifyExprLang("");
    	}
	}
	
	
	public void notifyAuthZMethod(String methodName) {
		IStructuredSelection selection = new StructuredSelection(methodName);
		cvAuthZMethod.setSelection(selection);
	}

	
	public String getAuthZType() {
		return ((AuthorizationMechanism)action).getAuthorizationType().getName();
	}
	

	public void setExpressionElement() {

		if (editor == null) return;
		if (editor.model == null) return;

		editor.model.setSecurityExpression(
				aspect.getType(),
				action.getType(),
				tExpression.getText(),
				(String)((IStructuredSelection)cvExprLang.getSelection()).getFirstElement());
	}

	
	public void notifyExprLang(String lang) {
		IStructuredSelection selection = new StructuredSelection(lang);
		cvExprLang.setSelection(selection);
	}

	
	public String getExpression() {
		try {
			return action.getSecurityExpression().getExpression();
		} catch (Exception e) {
			return "";
		}
	}

	
	public String getExprLang() {
		try {
			return action.getSecurityExpression().getLanguage();
		} catch (Exception e) {
			return "";
		}
	}

	
	@Override
	public void update() {
	}
	
	
	public void setVisible(boolean state) {
		cAction.setVisible(state);
	}
}
