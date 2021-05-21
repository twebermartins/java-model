package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "identifier key value pair" "An IdentifierKeyValuePair describes a generic identifier as
 * key-value pair."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends ModelClass, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Key of the identifier."@en
     * 
     * @return Returns the List of Strings for the property keys. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    public List<String> getKeys();

    /**
     * "The value of the identifier with the corresponding key."@en
     * 
     * @return Returns the List of Strings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    public List<String> getValues();

}
