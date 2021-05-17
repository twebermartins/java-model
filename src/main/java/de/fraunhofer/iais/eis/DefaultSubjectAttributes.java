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
* "Subject Attributes"
* "A set of data elements that further classifies a specific subject."@en 
*/

public class DefaultSubjectAttributes implements SubjectAttributes {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has subject attribute"
	* "A data element that further classifies a specific subject. "@en
	* "Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced within the \'selectableSubjectAttributes\' attribute of \'AccessControl\'."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
	protected List<DataElement> subjectAttributes;


	// no manual construction
	protected DefaultSubjectAttributes() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.subjectAttributes});
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
			DefaultSubjectAttributes other = (DefaultSubjectAttributes) obj;
			return Objects.equals(this.subjectAttributes, other.subjectAttributes);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultSubjectAttributes other = new DefaultSubjectAttributes();
		other.subjectAttributes = (List<DataElement>) Util.clone(this.subjectAttributes);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
	final public List<DataElement> getSubjectAttributes() {
		return subjectAttributes;
	}
	
	final public void setSubjectAttributes (List<DataElement> subjectAttributes) {
		this.subjectAttributes = subjectAttributes;
	}
}
