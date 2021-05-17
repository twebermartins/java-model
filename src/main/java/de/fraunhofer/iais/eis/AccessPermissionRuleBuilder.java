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

public class AccessPermissionRuleBuilder {

	private Map<String, Object> map;

	public AccessPermissionRuleBuilder() {
		this.map = new HashMap<>();
	}

	public AccessPermissionRuleBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for permissionsPerObjects
	* @param permissionsPerObjects desired value to be set
	* @return Builder object with new value for permissionsPerObjects
	*/
	public AccessPermissionRuleBuilder permissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects) {
		this.map.put("permissionsPerObjects", permissionsPerObjects);
		return this;
	}


	/**
	* This function allows setting a value for targetSubjectAttributes
	* @param targetSubjectAttributes desired value to be set
	* @return Builder object with new value for targetSubjectAttributes
	*/
	public AccessPermissionRuleBuilder targetSubjectAttributes(SubjectAttributes targetSubjectAttributes) {
		this.map.put("targetSubjectAttributes", targetSubjectAttributes);
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	public AccessPermissionRuleBuilder referableCategory(String referableCategory) {
		this.map.put("referableCategory", referableCategory);
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	public AccessPermissionRuleBuilder description(TypedLiteral description) {
		this.map.put("description", description);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public AccessPermissionRuleBuilder displayName(TypedLiteral displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public AccessPermissionRuleBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public AccessPermissionRuleBuilder qualifiers(List<Constraint> qualifiers) {
		this.map.put("qualifiers", qualifiers);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public AccessPermissionRule build() throws ConstraintViolationException {
		DefaultAccessPermissionRule defaultAccessPermissionRule = Util.fillInstanceFromMap(new DefaultAccessPermissionRule(), this.map);
		return defaultAccessPermissionRule;
	}
}
