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

package net.texo.USDLSecurityEditor;

import net.texo.USDLSecurityEditor.exceptions.OntologyNotLoadedException;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class OWLOntology {

	protected OntModel model = null;
	
	public OWLOntology(String url) {
		
		try {
			model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			model.read(url);
		} catch(Exception E) {
			E.printStackTrace();
			return;
		}
	}

	
	public String getNS() {
		if (model == null) return null;
		
		return model.getNsPrefixMap().get("");
	}
	
	
	/**
	 * Test ontology.
	 *
	 * @throws OntologyNotLoadedException the ontology not loaded exception
	 */
	public void testOntology() throws OntologyNotLoadedException {
		
		if (model == null) throw new OntologyNotLoadedException();
		
		System.out.println(model.toString());
		System.out.println();
		for (StmtIterator it = model.listStatements(); it.hasNext(); ) {
			System.out.println(it.next().toString());
		}
	}

}
