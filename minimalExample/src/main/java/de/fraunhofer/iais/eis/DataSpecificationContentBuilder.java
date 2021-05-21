package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class DataSpecificationContentBuilder {

    private Map<String, Object> map;

    public DataSpecificationContentBuilder() {
        this.map = new HashMap<>();
    }

    public DataSpecificationContentBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public DataSpecificationContent build() throws ConstraintViolationException {
        DefaultDataSpecificationContent defaultDataSpecificationContent =
            Util.fillInstanceFromMap(new DefaultDataSpecificationContent(), this.map);
        return defaultDataSpecificationContent;
    }
}
