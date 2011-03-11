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

import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.edit.provider.FeatureMapEntryWrapperItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;

/**
 * The EcoreResourceHelper supports the provisioning of ecore elements
 * within a xml tree.
 * 
 */
public class EcoreResourceHelper {

	private ReflectiveItemProvider reflProvider;

	public EcoreResourceHelper(ReflectiveItemProvider reflProvider) {
		this.reflProvider = reflProvider;
	}

	/**
	 * Returns true if an array of elements contain a particular object
	 * holding the given name.
	 * 
	 * @param elementsArray
	 * @param eobjectName
	 * @param found
	 * @return
	 */
	public boolean hasEObject(Object[] elementsArray, EReference eobjectName,
			boolean found) {
		Object it = null;
		for (int i = 0; i < elementsArray.length && !found; i++) {
			if (elementsArray[i] instanceof String) {
				;
			} else {
				EStructuralFeature its = ((Entry) ((FeatureMapEntryWrapperItemProvider) elementsArray[i])
						.getValue()).getEStructuralFeature();
				String name = ExtendedMetaData.INSTANCE.getName(its);
				if (name.equalsIgnoreCase(ExtendedMetaData.INSTANCE
						.getName(eobjectName)))
					found = true;
				it = ((Entry) ((FeatureMapEntryWrapperItemProvider) elementsArray[i])
						.getValue()).getValue();
				if (it instanceof String) {
					;
				} else {
					if (reflProvider.hasChildren(it) && !found) {
						found = hasEObject(getElements(it), eobjectName, found);

					}
				}
			}
		}
		return found;
	}

	public Object[] getElements(Object oinstance) {
		@SuppressWarnings("unchecked")
		Collection<Object> elements = (Collection<Object>) reflProvider
				.getElements(oinstance);
		return elements.toArray();
	}
}
