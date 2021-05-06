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

public class RangeBuilder {

	private DefaultRange defaultRange;

	public RangeBuilder() {
		defaultRange = new DefaultRange();
	}

	public RangeBuilder(URI id) {
		this();
		defaultRange.id = id;
	}

	/**
	* This function allows setting a value for maxs
	* @param maxs desired value to be set
	* @return Builder object with new value for maxs
	*/
	final public RangeBuilder maxs(List<TypedLiteral> maxs) {
		this.defaultRange.maxs = maxs;
		return this;
	}


	/**
	* This function allows setting a value for mins
	* @param mins desired value to be set
	* @return Builder object with new value for mins
	*/
	final public RangeBuilder mins(List<TypedLiteral> mins) {
		this.defaultRange.mins = mins;
		return this;
	}




	/**
	* This function allows setting a value for referableCategories
	* @param referableCategories desired value to be set
	* @return Builder object with new value for referableCategories
	*/
	final public RangeBuilder referableCategories(List<String> referableCategories) {
		this.defaultRange.referableCategories = referableCategories;
		return this;
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	final public RangeBuilder descriptions(List<TypedLiteral> descriptions) {
		this.defaultRange.descriptions = descriptions;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public RangeBuilder displayName(TypedLiteral displayName) {
		this.defaultRange.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public RangeBuilder idShort(String idShort) {
		this.defaultRange.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public RangeBuilder parent(URI parent) {
		this.defaultRange.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	final public RangeBuilder qualifiers(List<Constraint> qualifiers) {
		this.defaultRange.qualifiers = qualifiers;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public RangeBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultRange.dataSpecifications = dataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public RangeBuilder kind(ModelingKind kind) {
		this.defaultRange.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public RangeBuilder semanticId(Reference semanticId) {
		this.defaultRange.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Range build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultRange);
		return defaultRange;
	}
}
