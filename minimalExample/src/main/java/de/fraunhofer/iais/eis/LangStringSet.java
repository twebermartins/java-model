package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Lang String Set" "A set of strings, each annotated by the language of the string. The meaning of
 * the string in each language shall be the same."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLangStringSet.class)
})
public interface LangStringSet extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A string in a specified language."@en
     * 
     * @return Returns the List of LangStrings for the property langStrings. More information under
     *         https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    public List<LangString> getLangStrings();

    /**
     * "A string in a specified language."@en
     * 
     * @param langStrings desired value for the property langStrings. More information under
     *        https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     */
    public void setLangStrings(List<LangString> langStrings);

}
