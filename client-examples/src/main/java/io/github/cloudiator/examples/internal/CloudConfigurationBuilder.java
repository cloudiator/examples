/*
 * Copyright (c) 2014-2016 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.github.cloudiator.examples.internal;

import java.util.Map;
import java.util.Set;

class CloudConfigurationBuilder {
    private String name;
    private String endpoint;
    private String credentialUsername;
    private String credentialPassword;
    private String apiName;
    private String apiInternalProvider;
    private String hardwareId;
    private Set<String> locationId;
    private String imageId;
    private String imageLoginName;
    private String operatingSystemVendor;
    private Map<String, String> properties;

    public CloudConfigurationBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CloudConfigurationBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public CloudConfigurationBuilder credentialUsername(String credentialUsername) {
        this.credentialUsername = credentialUsername;
        return this;
    }

    public CloudConfigurationBuilder credentialPassword(String credentialPassword) {
        this.credentialPassword = credentialPassword;
        return this;
    }

    public CloudConfigurationBuilder apiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    public CloudConfigurationBuilder apiInternalProvider(String apiInternalProvider) {
        this.apiInternalProvider = apiInternalProvider;
        return this;
    }

    public CloudConfigurationBuilder hardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }

    public CloudConfigurationBuilder locationId(Set<String> locationId) {
        this.locationId = locationId;
        return this;
    }

    public CloudConfigurationBuilder imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public CloudConfigurationBuilder imageLoginName(String imageLoginName) {
        this.imageLoginName = imageLoginName;
        return this;
    }

    public CloudConfigurationBuilder imageOperatingSystemVendor(String imageOperatingSystem) {
        this.operatingSystemVendor = imageOperatingSystem;
        return this;
    }

    public CloudConfigurationBuilder properties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public ConfigurationLoader.CloudConfiguration createCloudConfiguration() {
        return new ConfigurationLoader.CloudConfiguration(name, endpoint, credentialUsername,
                credentialPassword, apiName, apiInternalProvider, hardwareId, locationId, imageId,
                imageLoginName, operatingSystemVendor, properties);
    }
}
