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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "Referable Elements"
* "Enumeration of all referable elements within an asset administration shell. Contains IdentifiableElements"@en 
*/
public enum ReferableElements {

	/** 
	* "Asset"
	*/
	ASSET,

	/** 
	* "Asset Administration Shell"
	*/
	ASSET_ADMINISTRATION_SHELL,

	/** 
	* "Concept Description"
	*/
	CONCEPT_DESCRIPTION,

	/** 
	* "Submodel"
	*/
	SUBMODEL,

	/** 
	* "Access Permission Rule"
	*/
	ACCESS_PERMISSION_RULE,

	/** 
	* "Annotated relationship element"
	*/
	ANNOTATED_RELATIONSHIP_ELEMENT,

	/** 
	* "Basic Event"
	*/
	BASIC_EVENT,

	/** 
	* "Blob"
	*/
	BLOB,

	/** 
	* "Capability"
	*/
	CAPABILITY,

	/** 
	* "Concept Dictionary"
	*/
	CONCEPT_DICTIONARY,

	/** 
	* "Data Element"
	* "Data Element is abstract, i.e. if a key uses \'DataElement\' the reference may be a Property, a File etc."@en
	*/
	DATA_ELEMENT,

	/** 
	* "Entity"
	*/
	ENTITY,

	/** 
	* "Event"
	* "Event is abstract"@en
	*/
	EVENT,

	/** 
	* "Multi-language Property"
	* "Property with a value that can be provided in multiple languages."@en
	*/
	MULTI_LANGUAGE_PROPERTY,

	/** 
	* "Operation"
	*/
	OPERATION,

	/** 
	* "Property"
	*/
	PROPERTY,

	/** 
	* "Range"
	*/
	RANGE,

	/** 
	* "Reference Element"
	*/
	REFERENCE_ELEMENT,

	/** 
	* "Relationship Element"
	*/
	RELATIONSHIPT_ELEMENT,

	/** 
	* "Submodel Element"
	* "Submodel Element is abstract, i.e. if a key uses \'SubmodelElement\' the reference may be a Property, a SubmodelElementCollection, an Operation etc."@en
	*/
	SUBMODEL_ELEMENT,

	/** 
	* "Submodel Element Collection"
	* "Collection of Submodel Elements"@en
	*/
	SUBMODEL_ELEMENT_COLLECTION,

	/** 
	* "View"
	*/
	VIEW;


}
