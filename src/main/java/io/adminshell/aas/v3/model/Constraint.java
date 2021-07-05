package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A constraint is used to further qualify an element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Formula.class),
    @KnownSubtypes.Type(value = Qualifier.class)
})
public interface Constraint {

}
