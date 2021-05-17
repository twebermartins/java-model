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
* "Asset Kind"
* "Enumeration for denoting whether an element is a type or an instance."@en 
*/
public enum AssetKind {

	/** 
	* "Asset Instance"
	* "Concrete, clearly identifiable component of a certain type."@en
	*/
	INSTANCE("https://admin-shell.io/aas/3/0/RC01/AssetKind/INSTANCE", Arrays.asList(new TypedLiteral("Asset Instance", "")), Arrays.asList(new TypedLiteral("Concrete, clearly identifiable component of a certain type.", "en"))),

	/** 
	* "Asset Type"
	* "hardware or software element which specifies the common attributes shared by all instances of the type."@en
	*/
	TYPE("https://admin-shell.io/aas/3/0/RC01/AssetKind/TYPE", Arrays.asList(new TypedLiteral("Asset Type", "")), Arrays.asList(new TypedLiteral("hardware or software element which specifies the common attributes shared by all instances of the type.", "en")));

	AssetKind(String id, List<TypedLiteral> labels, List<TypedLiteral> comments) {
	}

}
