// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a cluster that may be updated. */
@Fluent
public class ClusterUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterUpdateProperties.class);

    /*
     * The cluster size
     */
    @JsonProperty(value = "clusterSize")
    private Integer clusterSize;

    /**
     * Get the clusterSize property: The cluster size.
     *
     * @return the clusterSize value.
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the clusterSize property: The cluster size.
     *
     * @param clusterSize the clusterSize value to set.
     * @return the ClusterUpdateProperties object itself.
     */
    public ClusterUpdateProperties withClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}