package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultConceptDescriptionBuilder extends AbstractBuilder<DefaultConceptDescription> {

    public DefaultConceptDescriptionBuilder() {
        super();
    }

    public DefaultConceptDescriptionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for isCaseOfs
     * 
     * @param isCaseOfs desired value to be set
     * @return Builder object with new value for isCaseOfs
     */
    public DefaultConceptDescriptionBuilder isCaseOfs(List<Reference> isCaseOfs) {
        this.map.put("isCaseOfs", isCaseOfs);
        return this;
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public DefaultConceptDescriptionBuilder embeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.map.put("embeddedDataSpecifications", embeddedDataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultConceptDescriptionBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for administrations
     * 
     * @param administrations desired value to be set
     * @return Builder object with new value for administrations
     */
    public DefaultConceptDescriptionBuilder administrations(List<AdministrativeInformation> administrations) {
        this.map.put("administrations", administrations);
        return this;
    }

    /**
     * This function allows setting a value for identifications
     * 
     * @param identifications desired value to be set
     * @return Builder object with new value for identifications
     */
    public DefaultConceptDescriptionBuilder identifications(List<Identifier> identifications) {
        this.map.put("identifications", identifications);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultConceptDescriptionBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultConceptDescriptionBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultConceptDescriptionBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultConceptDescriptionBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultConceptDescription build() {
        DefaultConceptDescription defaultConceptDescription = Util.fillInstanceFromMap(new DefaultConceptDescription(), this.map);
        return defaultConceptDescription;
    }
}
