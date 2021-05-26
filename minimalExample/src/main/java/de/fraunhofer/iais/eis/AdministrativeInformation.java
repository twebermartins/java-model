package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Administrative Information" "Every Identifiable may have administrative information.
 * Administrative information includes for example 1) Information about the version of the element
 * 2) Information about who created or who made the last change to the element 3) Information about
 * the languages available in case the element contains text, for translating purposed also
 * themmaster or default language may be definedIn the first version of the AAS metamodel only
 * version information as defined by IEC 61360 is defined. In later versions additional attributes
 * may be added."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Version of the element."@en
     * 
     * @return Returns the List of Strings for the property versions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    public List<String> getVersions();

    /**
     * "Version of the element."@en
     * 
     * @param versions desired value for the property versions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     */
    public void setVersions(List<String> versions);

    /**
     * "Revision of the element."@en "Constraint AASd-005: A revision requires a version. This means, if
     * there is no version there is no revision neither."@en
     * 
     * @return Returns the List of Strings for the property revisions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    public List<String> getRevisions();

    /**
     * "Revision of the element."@en "Constraint AASd-005: A revision requires a version. This means, if
     * there is no version there is no revision neither."@en
     * 
     * @param revisions desired value for the property revisions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     */
    public void setRevisions(List<String> revisions);

}
