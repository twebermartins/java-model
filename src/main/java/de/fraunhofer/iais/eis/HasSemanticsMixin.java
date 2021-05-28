package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("HasSemantics")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Submodel.class),
    @JsonSubTypes.Type(value = IdentifierKeyValuePair.class),
    @JsonSubTypes.Type(value = View.class),
    @JsonSubTypes.Type(value = SubmodelElement.class),
    @JsonSubTypes.Type(value = Qualifier.class),
    @JsonSubTypes.Type(value = Extension.class)
})
public interface HasSemanticsMixin {

}
