package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Submodel Element" "A submodel element is an element suitable for the description and
 * differentiation of assets."@en "The concept of type and instance applies to submodel elements.
 * Properties are special submodel elements. The property types are defined in dictionaries (like
 * the IEC Common Data Dictionary or eCl@ss), they do not have a value. The property type
 * (kind=Type) is also called data element type in some standards. The property instances
 * (kind=Instance) typically have a value. A property instance is also called property-value pair in
 * certain standards."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElement.class),
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = SubmodelElementCollection.class)
})
public interface SubmodelElement extends ModelClass {

    // standard methods

}
