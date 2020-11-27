/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joram Barrez
 */
public class PlanItemDefinition extends CaseElement implements HasLifecycleListeners {
    
    protected String planItemRef;
    protected PlanItemControl defaultControl;
    protected List<FlowableListener> lifecycleListeners = new ArrayList<>();
    protected List<VariableAggregationDefinition> variableAggregationDefinitions;

    public String getPlanItemRef() {
        return planItemRef;
    }

    public void setPlanItemRef(String planItemRef) {
        this.planItemRef = planItemRef;
    }
    
    public PlanItemControl getDefaultControl() {
        return defaultControl;
    }

    public void setDefaultControl(PlanItemControl defaultControl) {
        this.defaultControl = defaultControl;
    }

    @Override
    public List<FlowableListener> getLifecycleListeners() {
        return lifecycleListeners;
    }

    @Override
    public void setLifecycleListeners(List<FlowableListener> lifecycleListeners) {
        this.lifecycleListeners = lifecycleListeners;
    }

    public List<VariableAggregationDefinition> getVariableAggregationDefinitions() {
        return variableAggregationDefinitions;
    }

    public void setVariableAggregationDefinitions(List<VariableAggregationDefinition> variableAggregationDefinitions) {
        this.variableAggregationDefinitions = variableAggregationDefinitions;
    }

    public void setValues(PlanItemDefinition otherElement) {
        super.setValues(otherElement);
        setPlanItemRef(otherElement.getPlanItemRef());
        setDefaultControl(otherElement.getDefaultControl());
        setLifecycleListeners(otherElement.lifecycleListeners);
        setVariableAggregationDefinitions(otherElement.getVariableAggregationDefinitions());
    }
    
    @Override
    public String toString() {
        return "PlanItemDefinition " + id + (name != null ? " " + name : "");
    }
    
}
