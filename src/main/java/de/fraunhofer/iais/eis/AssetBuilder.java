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

public class AssetBuilder {

	private DefaultAsset defaultAsset;

	public AssetBuilder() {
		defaultAsset = new DefaultAsset();
	}

	public AssetBuilder(URI id) {
		this();
		defaultAsset.id = id;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public AssetBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultAsset.dataSpecifications = dataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	final public AssetBuilder administration(AdministrativeInformation administration) {
		this.defaultAsset.administration = administration;
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	final public AssetBuilder identification(Identifier identification) {
		this.defaultAsset.identification = identification;
		return this;
	}


	/**
	* This function allows setting a value for referableCategories
	* @param referableCategories desired value to be set
	* @return Builder object with new value for referableCategories
	*/
	final public AssetBuilder referableCategories(List<String> referableCategories) {
		this.defaultAsset.referableCategories = referableCategories;
		return this;
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	final public AssetBuilder descriptions(List<TypedLiteral> descriptions) {
		this.defaultAsset.descriptions = descriptions;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public AssetBuilder displayName(TypedLiteral displayName) {
		this.defaultAsset.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public AssetBuilder idShort(String idShort) {
		this.defaultAsset.idShort = idShort;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Asset build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAsset);
		return defaultAsset;
	}
}
