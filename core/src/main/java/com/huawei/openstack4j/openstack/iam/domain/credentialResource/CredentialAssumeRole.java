/*******************************************************************************
 * 	Copyright 2020 Huawei Technologies Co.,Ltd.
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
package com.huawei.openstack4j.openstack.iam.domain.credentialResource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("assume_role")
public class CredentialAssumeRole implements ModelEntity {
    private static final long serialVersionUID = 1L;

    /**
     * the agency name of assumeRole
     */
    @JsonProperty("agency_name")
    private String agencyName;

    /**
     * the domain id of assumeRole
     */
    @JsonProperty("domain_id")
    private String domainId;

    /**
     * the domain name of assumeRole
     */
    @JsonProperty("domain_name")
    private String domainName;

    /**
     * the duration of assumeRole
     */
    @JsonProperty("duration-seconds")
    private Integer durationSeconds;

    /**
     * the sessioin user of assumeRole
     */
    @JsonProperty("sessioin_user")
    private CredentialSessionUser sessionUser;
}
