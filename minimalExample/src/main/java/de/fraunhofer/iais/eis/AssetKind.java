package de.fraunhofer.iais.eis;

/**
 * Enumeration for denoting whether an element is a type or an instance.
 */
public enum AssetKind {

    /**
     * Concrete, clearly identifiable component of a certain type.
     */
    INSTANCE,
    /**
     * hardware or software element which specifies the common attributes shared
     * by all instances of the type.
     */
    TYPE;

}
