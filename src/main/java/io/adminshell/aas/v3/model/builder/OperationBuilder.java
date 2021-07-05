

package io.adminshell.aas.v3.model.builder;

import java.util.List;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class OperationBuilder<T extends Operation, B extends OperationBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for inputVariables
     * 
     * @param inputVariables desired value to be set
     * @return Builder object with new value for inputVariables
     */
    public B inputVariables(List<OperationVariable> inputVariables) {
        getBuildingInstance().setInputVariables(inputVariables);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List inputVariables
     * 
     * @param inputVariable desired value to be added
     * @return Builder object with new value for inputVariables
     */
    public B inputVariable(OperationVariable inputVariable) {
        getBuildingInstance().getInputVariables().add(inputVariable);
        return getSelf();
    }

    /**
     * This function allows setting a value for inoutputVariables
     * 
     * @param inoutputVariables desired value to be set
     * @return Builder object with new value for inoutputVariables
     */
    public B inoutputVariables(List<OperationVariable> inoutputVariables) {
        getBuildingInstance().setInoutputVariables(inoutputVariables);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List inoutputVariables
     * 
     * @param inoutputVariable desired value to be added
     * @return Builder object with new value for inoutputVariables
     */
    public B inoutputVariable(OperationVariable inoutputVariable) {
        getBuildingInstance().getInoutputVariables().add(inoutputVariable);
        return getSelf();
    }

    /**
     * This function allows setting a value for outputVariables
     * 
     * @param outputVariables desired value to be set
     * @return Builder object with new value for outputVariables
     */
    public B outputVariables(List<OperationVariable> outputVariables) {
        getBuildingInstance().setOutputVariables(outputVariables);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List outputVariables
     * 
     * @param outputVariable desired value to be added
     * @return Builder object with new value for outputVariables
     */
    public B outputVariable(OperationVariable outputVariable) {
        getBuildingInstance().getOutputVariables().add(outputVariable);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangString description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangString> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangString displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(List<Constraint> qualifiers) {
        getBuildingInstance().setQualifiers(qualifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List qualifiers
     * 
     * @param qualifier desired value to be added
     * @return Builder object with new value for qualifiers
     */
    public B qualifier(Constraint qualifier) {
        getBuildingInstance().getQualifiers().add(qualifier);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(EmbeddedDataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public B kind(ModelingKind kind) {
        getBuildingInstance().setKind(kind);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }
}
