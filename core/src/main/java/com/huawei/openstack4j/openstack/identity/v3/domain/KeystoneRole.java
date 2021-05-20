/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.identity.v3.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.identity.v3.Role;
import com.huawei.openstack4j.model.identity.v3.builder.RoleBuilder;
import com.huawei.openstack4j.openstack.common.ListResult;

import com.google.common.base.MoreObjects;

/**
 * v3 role implementation
 */
@JsonRootName("role")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeystoneRole implements Role {

    private static final long serialVersionUID = 1L;
    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty("domain_id")
    private String domainId;
    private Map<String, String> links;
    @JsonProperty("display_name")
    private String displayName;
    private String type;
    private String catalog;
    private String flag;
    private String description;
    private Map<String, Object> policy;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("description_cn")
    private String descriptionCn;
    @JsonProperty("updated_time")
    private String updatedTime;



    @Override
    public RoleBuilder toBuilder() {
        return new RoleConcreteBuilder(this);
    }

    public static RoleBuilder builder() {
        return new RoleConcreteBuilder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDomainId() {
        return domainId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getLinks() {
        return links;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDisplayName() {
        return displayName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCatalog() {
        return catalog;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFlag() {
        return flag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescriptionCn() {
        return descriptionCn;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Object> getPolicy() {
        return policy;
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("name", name)
                .add("domain_id", domainId)
                .add("links", links)
                .add("displayName", displayName)
                .add("type", type)
                .add("catalog", catalog)
                .add("flag", flag)
                .add("description", description)
                .add("descriptionCn", descriptionCn)
                .add("updatedTime", updatedTime)
                .add("createdTime", createdTime)
                .add("policy", policy)
                .toString();
    }

    public static class RoleConcreteBuilder implements RoleBuilder {

        private KeystoneRole model;

        RoleConcreteBuilder() {
            this(new KeystoneRole());
        }

        RoleConcreteBuilder(KeystoneRole model) {
            this.model = model;
        }

        @Override
        public Role build() {
            return model;
        }

        @Override
        public RoleBuilder from(Role in) {
            model = (KeystoneRole) in;
            return this;
        }

        @Override
        public RoleBuilder id(String id) {
            model.id = id;
            return this;
        }

        @Override
        public RoleBuilder name(String name) {
            model.name = name;
            return this;
        }

        @Override
        public RoleBuilder domainId(String domainId) {
            model.domainId = domainId;
            return this;
        }

        @Override
        public RoleBuilder links(Map<String, String> links) {
            model.links = links;
            return this;
        }

        @Override
        public RoleBuilder displayName(String displayName) {
            model.displayName = displayName;
            return this;
        }

        @Override
        public RoleBuilder type(String type) {
            model.type = type;
            return this;
        }

        @Override
        public RoleBuilder catalog(String catalog) {
            model.catalog = catalog;
            return this;
        }

        @Override
        public RoleBuilder flag(String flag) {
            model.flag = flag;
            return this;
        }

        @Override
        public RoleBuilder description(String description) {
            model.description = description;
            return this;
        }

        @Override
        public RoleBuilder updatedTime(String updatedTime) {
            model.updatedTime = updatedTime;
            return this;
        }

        @Override
        public RoleBuilder createdTime(String createdTime) {
            model.createdTime = createdTime;
            return this;
        }

        @Override
        public RoleBuilder descriptionCn(String descriptionCn) {
            model.descriptionCn = descriptionCn;
            return this;
        }

        @Override
        public RoleBuilder policy(Map<String, Object> policy) {
            model.policy = policy;
            return this;
        }

    }

    public static class Roles extends ListResult<KeystoneRole> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("roles")
        protected List<KeystoneRole> list;

        @Override
        public List<KeystoneRole> value() {
            return list;
        }

    }

}
