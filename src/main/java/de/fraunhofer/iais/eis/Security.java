package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Security" "Container for security relevant information of the AAS."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSecurity.class)
})
public interface Security extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Access control policy points of the AAS."@en
     * 
     * @return Returns the List of AccessControlPolicyPointss for the property
     *         accessControlPolicyPoints. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
    public List<AccessControlPolicyPoints> getAccessControlPolicyPoints();

    /**
     * "Access control policy points of the AAS."@en
     * 
     * @param accessControlPolicyPoints desired value for the property accessControlPolicyPoints. More
     *        information under https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
     */
    public void setAccessControlPolicyPoints(List<AccessControlPolicyPoints> accessControlPolicyPoints);

    /**
     * "Certificates of the AAS."@en
     * 
     * @return Returns the List of Certificates for the property certificates. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Security/certificate
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
    public List<Certificate> getCertificates();

    /**
     * "Certificates of the AAS."@en
     * 
     * @param certificates desired value for the property certificates. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Security/certificate
     */
    public void setCertificates(List<Certificate> certificates);

    /**
     * "Certificate extensions as required by the AAS."@en
     * 
     * @return Returns the List of References for the property requiredCertificateExtensions. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
    public List<Reference> getRequiredCertificateExtensions();

    /**
     * "Certificate extensions as required by the AAS."@en
     * 
     * @param requiredCertificateExtensions desired value for the property
     *        requiredCertificateExtensions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
     */
    public void setRequiredCertificateExtensions(List<Reference> requiredCertificateExtensions);

}
