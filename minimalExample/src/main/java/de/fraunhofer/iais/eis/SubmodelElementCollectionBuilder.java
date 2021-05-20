package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class SubmodelElementCollectionBuilder {

    private Map<String, Object> map;

    public SubmodelElementCollectionBuilder() {
        this.map = new HashMap<>();
    }

    public SubmodelElementCollectionBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for allowDuplicates
     * 
     * @param allowDuplicates desired value to be set
     * @return Builder object with new value for allowDuplicates
     */
    public SubmodelElementCollectionBuilder allowDuplicates(List<Boolean> allowDuplicates) {
        this.map.put("allowDuplicates", allowDuplicates);
        return this;
    }

    /**
     * This function allows setting a value for ordereds
     * 
     * @param ordereds desired value to be set
     * @return Builder object with new value for ordereds
     */
    public SubmodelElementCollectionBuilder ordereds(List<Boolean> ordereds) {
        this.map.put("ordereds", ordereds);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public SubmodelElementCollectionBuilder values(List<SubmodelElement> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public SubmodelElementCollection build() throws ConstraintViolationException {
        DefaultSubmodelElementCollection defaultSubmodelElementCollection =
            Util.fillInstanceFromMap(new DefaultSubmodelElementCollection(), this.map);
        return defaultSubmodelElementCollection;
    }
}
