package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class DataSpecificationBuilder {

    private Map<String, Object> map;

    public DataSpecificationBuilder() {
        this.map = new HashMap<>();
    }

    public DataSpecificationBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for dataSpecificationContents
     * 
     * @param dataSpecificationContents desired value to be set
     * @return Builder object with new value for dataSpecificationContents
     */
    public DataSpecificationBuilder dataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.map.put("dataSpecificationContents", dataSpecificationContents);
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
    final public DataSpecification build() throws ConstraintViolationException {
        DefaultDataSpecification defaultDataSpecification = Util.fillInstanceFromMap(new DefaultDataSpecification(), this.map);
        return defaultDataSpecification;
    }
}
