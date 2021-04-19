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
* "Identifier"
* "Used to uniquely identify an entity by using an identifier."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Identifier")
public class DefaultIdentifier implements Serializable, Identifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Identifier", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Used to uniquely identify an entity by using an identifier.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has idType"
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifier/idType", "idType"})
	protected IdentifierType idType;


	/**
	* "has identification"
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifier/identifier", "identifier"})
	protected List<TypedLiteral> identifier;


	// no manual construction
	protected DefaultIdentifier() {
		id = VocabUtil.getInstance().createRandomUrl("identifier");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	/**
	* This function returns a hash code value for the Identifier for the benefit of e.g. hash tables.
	* @return a hash code value for the Identifier
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.identifier, this.idType});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Identifier is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultIdentifier other = (DefaultIdentifier) obj;
			return super.equals(other) && Objects.equals(this.identifier, other.identifier) && Objects.equals(this.idType, other.idType);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	* @return Returns the List of TypedLiteral for the property identifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
	final public List<TypedLiteral> getIdentifier() {
		return identifier;
	}

	
	/**
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	* @param identifier desired value for the property identifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
	*/
	final public void setIdentifier (List<TypedLiteral> identifier) {
		this.identifier = identifier;
	}

	/**
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	* @return Returns the IdentifierType for the property idType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
	final public IdentifierType getIdType() {
		return idType;
	}

	
	/**
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	* @param idType desired value for the property idType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
	*/
	final public void setIdType (IdentifierType idType) {
		this.idType = idType;
	}
}
