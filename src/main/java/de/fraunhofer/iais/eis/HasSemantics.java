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
* "Has Semantics"
* "Element that can have a semantic definition. Identifier of the semantic definition of the element. It is called semantic id of the element. The semantic id may either reference an external global id or it may reference a referable model element of kind=Type that defines the semantics of the element."@en
* "In many cases the idShort is identical to the English short name within the semantic definition as referenced vi aits semantic id."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = Submodel.class),
	@KnownSubtypes.Type(value = IdentifierKeyValuePair.class),
	@KnownSubtypes.Type(value = View.class),
	@KnownSubtypes.Type(value = SubmodelElement.class),
	@KnownSubtypes.Type(value = Qualifier.class),
	@KnownSubtypes.Type(value = Extension.class)
})
public interface HasSemantics extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the Reference for the property semanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	public Reference getSemanticId();

}
