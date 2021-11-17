/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.DataSpecificationContent
 * 
 * DataSpecificationContent contains the additional attributes to be added to the element instance
 * that references the data specification template and meta information about the template itself.
 */

@IRI("aas:DataSpecificationContent")
public class DefaultDataSpecificationContent implements DataSpecificationContent {

    public DefaultDataSpecificationContent() {}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecificationContent bean.
     */
    public static class Builder extends DataSpecificationContentBuilder<DefaultDataSpecificationContent, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationContent newBuildingInstance() {
            return new DefaultDataSpecificationContent();
        }
    }
}
