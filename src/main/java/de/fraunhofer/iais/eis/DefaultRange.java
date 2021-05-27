package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Range" "An element that is referable by its idShort. This id is not globally unique. This id is
 * unique within the name space of the element."@en "Constraint AASd-053: The semanticId of a Range
 * submodel element shall only reference a ConceptDescription with the category PROPERTY."@en
 * "Constraint AASd-068: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or RATIONAL_*."@en
 * "Constraint AASd-069: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/levelType shall be identical to the set {Min,Max}."@en
 */

public class DefaultRange implements Range {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Data Specification" "Global reference to the data specification template used by the
     * element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications;

    /**
     * "has kind" "ModelingKind of the element: either type or instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected List<ModelingKind> kinds;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds;

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers;

    /**
     * "has maximum value" "The maximum value of the range."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    protected List<String> maxs;

    /**
     * "has minimum value" "The minimum value of the range."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    protected List<String> mins;

    /**
     * "has value type of range" "Data type of the min and max."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    protected List<String> valueTypes;

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected List<String> categories;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions;

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames;

    /**
     * "has short id" "Identifying string of the element within its name space."@en "Constraint
     * AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small
     * letter. I.e. [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched
     * case-insensitive."@en "Constraint AASd-022: idShort of non-identifiable referables shall be
     * unqiue in its namespace."@en "Note: In case the element is a property and the property has a
     * semantic definition (HasSemantics) the idShort is typically identical to the short name in
     * English. "@en "Note: In case of an identifiable element idShort is optional but recommended to be
     * defined. It can be used for unique reference in its name space and thus allows better usability
     * and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC
     * UA."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected List<String> idShorts;

    // no manual construction
    protected DefaultRange() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.valueTypes,
            this.maxs,
            this.mins,
            this.categories,
            this.descriptions,
            this.displayNames,
            this.idShorts,
            this.qualifiers,
            this.dataSpecifications,
            this.kinds,
            this.semanticIds});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultRange other = (DefaultRange) obj;
            return Objects.equals(this.valueTypes, other.valueTypes) &&
                Objects.equals(this.maxs, other.maxs) &&
                Objects.equals(this.mins, other.mins) &&
                Objects.equals(this.categories, other.categories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShorts, other.idShorts) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kinds, other.kinds) &&
                Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultRange other = new DefaultRange();
        other.valueTypes = (List<String>) Util.clone(this.valueTypes);
        other.maxs = (List<String>) Util.clone(this.maxs);
        other.mins = (List<String>) Util.clone(this.mins);
        other.categories = (List<String>) Util.clone(this.categories);
        other.descriptions = (List<LangString>) Util.clone(this.descriptions);
        other.displayNames = (List<LangString>) Util.clone(this.displayNames);
        other.idShorts = (List<String>) Util.clone(this.idShorts);
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
        other.kinds = (List<ModelingKind>) Util.clone(this.kinds);
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    final public List<String> getValueTypes() {
        return valueTypes;
    }

    final public void setValueTypes(List<String> valueTypes) {
        this.valueTypes = valueTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    final public List<String> getMaxs() {
        return maxs;
    }

    final public void setMaxs(List<String> maxs) {
        this.maxs = maxs;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    final public List<String> getMins() {
        return mins;
    }

    final public void setMins(List<String> mins) {
        this.mins = mins;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public List<String> getCategories() {
        return categories;
    }

    final public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public List<String> getIdShorts() {
        return idShorts;
    }

    final public void setIdShorts(List<String> idShorts) {
        this.idShorts = idShorts;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    final public List<ModelingKind> getKinds() {
        return kinds;
    }

    final public void setKinds(List<ModelingKind> kinds) {
        this.kinds = kinds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
