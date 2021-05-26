package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Referable" "An element that is referable by its idShort. This id is not globally unique. This id
 * is unique within the name space of the element."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AccessPermissionRule.class),
    @KnownSubtypes.Type(value = Identifiable.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Referable extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints."@en
     * 
     * @return Returns the String for the property category. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Referable/category
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    public String getCategory();

    /**
     * "The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints."@en
     * 
     * @param category desired value for the property category. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Referable/category
     */
    public void setCategory(String category);

    /**
     * "Description or comments on the element. The description can be provided in several
     * languages."@en
     * 
     * @return Returns the List of LangStrings for the property descriptions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Referable/description
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    public List<LangString> getDescriptions();

    /**
     * "Description or comments on the element. The description can be provided in several
     * languages."@en
     * 
     * @param descriptions desired value for the property descriptions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Referable/description
     */
    public void setDescriptions(List<LangString> descriptions);

    /**
     * "Display name. Can be provided in several languages."@en
     * 
     * @return Returns the List of LangStrings for the property displayNames. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    public List<LangString> getDisplayNames();

    /**
     * "Display name. Can be provided in several languages."@en
     * 
     * @param displayNames desired value for the property displayNames. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     */
    public void setDisplayNames(List<LangString> displayNames);

    /**
     * "Identifying string of the element within its name space."@en "Constraint AASd-002: idShort shall
     * only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e.
     * [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched case-insensitive."@en
     * "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its
     * namespace."@en "Note: In case the element is a property and the property has a semantic
     * definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
     * "Note: In case of an identifiable element idShort is optional but recommended to be defined. It
     * can be used for unique reference in its name space and thus allows better usability and a more
     * performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
     * 
     * @return Returns the String for the property idShort. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    public String getIdShort();

    /**
     * "Identifying string of the element within its name space."@en "Constraint AASd-002: idShort shall
     * only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e.
     * [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched case-insensitive."@en
     * "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its
     * namespace."@en "Note: In case the element is a property and the property has a semantic
     * definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
     * "Note: In case of an identifiable element idShort is optional but recommended to be defined. It
     * can be used for unique reference in its name space and thus allows better usability and a more
     * performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
     * 
     * @param idShort desired value for the property idShort. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     */
    public void setIdShort(String idShort);

}
