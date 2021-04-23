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
* "Policy Information Points"
* "Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyInformationPoints")
public class DefaultPolicyInformationPoints implements Serializable, PolicyInformationPoints {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Policy Information Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has external information point"
	* "If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints", "policyInformationPointsExternalInformationPoints"})
	protected boolean policyInformationPointsExternalInformationPoints;


	/**
	* "has internal information point"
	* "References to submodels defining information used by security access permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint", "policyInformationPointsInternalInformationPoint"})
	protected List<Submodel> policyInformationPointsInternalInformationPoints;


	// no manual construction
	protected DefaultPolicyInformationPoints() {
		id = VocabUtil.getInstance().createRandomUrl("policyInformationPoints");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.policyInformationPointsExternalInformationPoints,
			this.policyInformationPointsInternalInformationPoints});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
			return Objects.equals(this.policyInformationPointsExternalInformationPoints, other.policyInformationPointsExternalInformationPoints) &&
				Objects.equals(this.policyInformationPointsInternalInformationPoints, other.policyInformationPointsInternalInformationPoints);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
	final public boolean getPolicyInformationPointsExternalInformationPoints() {
		return policyInformationPointsExternalInformationPoints;
	}
	
	final public void setPolicyInformationPointsExternalInformationPoints (boolean policyInformationPointsExternalInformationPoints) {
		this.policyInformationPointsExternalInformationPoints = policyInformationPointsExternalInformationPoints;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
	final public List<Submodel> getPolicyInformationPointsInternalInformationPoints() {
		return policyInformationPointsInternalInformationPoints;
	}
	
	final public void setPolicyInformationPointsInternalInformationPoints (List<Submodel> policyInformationPointsInternalInformationPoints) {
		this.policyInformationPointsInternalInformationPoints = policyInformationPointsInternalInformationPoints;
	}
}
