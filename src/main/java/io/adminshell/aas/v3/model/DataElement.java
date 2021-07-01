package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A data element is a submodel element that is not further composed out of other submodel elements.
 * A data element is a submodel element that has a value. The type of value differs for different
 * subtypes of data elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = Blob.class),
    @KnownSubtypes.Type(value = MultiLanguageProperty.class),
    @KnownSubtypes.Type(value = Property.class),
    @KnownSubtypes.Type(value = Range.class),
    @KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement extends SubmodelElement {

}