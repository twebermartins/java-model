package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Submodel Element Collection"
* "A submodel element collection is a set or list of submodel elements."@en
* "Constraint AASd-059: If the semanticId of a SubmodelElementCollection references a ConceptDescription then the category of the ConceptDescription shall be COLLECTION or ENTITY."@en
* "Constraint AASd-092: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a ConceptDescription then the ConceptDescription/category shall be ENTITY."@en
* "Constraint AASd-093: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection extends SubmodelElement {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	/**
	* This function returns a hash code value for the SubmodelElementCollection for the benefit of e.g. hash tables.
	* @return a hash code value for the SubmodelElementCollection
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this SubmodelElementCollection is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	* @return Returns the boolean for the property allowDuplicates.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	public boolean getAllowDuplicates();

	/**
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	* @return Returns the boolean for the property ordered.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	public boolean getOrdered();

	/**
	* "Submodel element contained in the collection."@en
	* @return Returns the List of SubmodelElement for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	public List<SubmodelElement> getValue();

}
