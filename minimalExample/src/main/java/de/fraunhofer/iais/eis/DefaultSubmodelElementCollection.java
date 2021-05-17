package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
* "Submodel Element Collection"
* "A submodel element collection is a set or list of submodel elements."@en
* "Constraint AASd-059: If the semanticId of a SubmodelElementCollection references a ConceptDescription then the category of the ConceptDescription shall be COLLECTION or ENTITY."@en
* "Constraint AASd-092: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a ConceptDescription then the ConceptDescription/category shall be ENTITY."@en
* "Constraint AASd-093: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION."@en 
*/

public class DefaultSubmodelElementCollection implements SubmodelElementCollection {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "allow duplicates"
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	protected List<Boolean> allowDuplicates;


	/**
	* "ordered"
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	protected List<Boolean> ordereds;


	/**
	* "has value"
	* "Submodel element contained in the collection."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	protected List<SubmodelElement> values;


	// no manual construction
	protected DefaultSubmodelElementCollection() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.allowDuplicates,
			this.ordereds,
			this.values});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSubmodelElementCollection other = (DefaultSubmodelElementCollection) obj;
			return Objects.equals(this.allowDuplicates, other.allowDuplicates) &&
				Objects.equals(this.ordereds, other.ordereds) &&
				Objects.equals(this.values, other.values);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultSubmodelElementCollection other = new DefaultSubmodelElementCollection();
		other.allowDuplicates = (List<Boolean>) Util.clone(this.allowDuplicates);
		other.ordereds = (List<Boolean>) Util.clone(this.ordereds);
		other.values = (List<SubmodelElement>) Util.clone(this.values);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	final public List<Boolean> getAllowDuplicates() {
		return allowDuplicates;
	}
	
	final public void setAllowDuplicates (List<Boolean> allowDuplicates) {
		this.allowDuplicates = allowDuplicates;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	final public List<Boolean> getOrdereds() {
		return ordereds;
	}
	
	final public void setOrdereds (List<Boolean> ordereds) {
		this.ordereds = ordereds;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	final public List<SubmodelElement> getValues() {
		return values;
	}
	
	final public void setValues (List<SubmodelElement> values) {
		this.values = values;
	}

}
