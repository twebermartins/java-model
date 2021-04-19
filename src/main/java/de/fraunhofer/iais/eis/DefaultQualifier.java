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
* "Qualifier"
* "A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element."@en
* "Constraint AASd-063: The semanticId of a Qualifier shall only reference a ConceptDescription with the category QUALIFIER."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Qualifier")
public class DefaultQualifier implements Serializable, Qualifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Qualifier", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "semanticId"})
	protected Reference semanticId;


	/**
	* "has qualifier type"
	* "The qualifier type describes the type of the qualifier that is applied to the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/type", "type"})
	protected String type;


	/**
	* "The qualifier value is the value of the qualifier."@en
	* "Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en
	* "Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/value", "value"})
	protected TypedLiteral value;


	/**
	* "Reference to the global unqiue id of a coded value."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId", "valueId"})
	protected Reference valueId;


	// no manual construction
	protected DefaultQualifier() {
		id = VocabUtil.getInstance().createRandomUrl("qualifier");
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
	* This function returns a hash code value for the Qualifier for the benefit of e.g. hash tables.
	* @return a hash code value for the Qualifier
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.type, this.value, this.valueId});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Qualifier is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultQualifier other = (DefaultQualifier) obj;
			return super.equals(other) && Objects.equals(this.type, other.type) && Objects.equals(this.value, other.value) && Objects.equals(this.valueId, other.valueId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "The qualifier type describes the type of the qualifier that is applied to the element."@en
	* @return Returns the String for the property type.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	final public String getType() {
		return type;
	}

	
	/**
	* "The qualifier type describes the type of the qualifier that is applied to the element."@en
	* @param type desired value for the property type.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
	*/
	final public void setType (String type) {
		this.type = type;
	}

	/**
	* "The qualifier value is the value of the qualifier."@en
	* "Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en
	* "Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	* @return Returns the TypedLiteral for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	final public TypedLiteral getValue() {
		return value;
	}

	
	/**
	* "The qualifier value is the value of the qualifier."@en
	* "Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en
	* "Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	* @param value desired value for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
	*/
	final public void setValue (TypedLiteral value) {
		this.value = value;
	}

	/**
	* "Reference to the global unqiue id of a coded value."@en
	* @return Returns the Reference for the property valueId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	final public Reference getValueId() {
		return valueId;
	}

	
	/**
	* "Reference to the global unqiue id of a coded value."@en
	* @param valueId desired value for the property valueId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
	*/
	final public void setValueId (Reference valueId) {
		this.valueId = valueId;
	}


	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the Reference for the property semanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}

	
	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @param semanticId desired value for the property semanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
