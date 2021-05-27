package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Operation Variable" "An operation variable is a submodel element that is used as input or output
 * variable of an operation."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationVariable.class)
})
public interface OperationVariable extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Describes the needed argument for an operation via a submodel element of kind=Template."@en "The
     * submodel element value of an operation variable shall be of kind=Template."@en
     * 
     * @return Returns the List of SubmodelElements for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    public List<SubmodelElement> getValues();

    /**
     * "Describes the needed argument for an operation via a submodel element of kind=Template."@en "The
     * submodel element value of an operation variable shall be of kind=Template."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     */
    public void setValues(List<SubmodelElement> values);

}
