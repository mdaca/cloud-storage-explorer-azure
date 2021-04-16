// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The integration service environment properties. */
@Fluent
public final class IntegrationServiceEnvironmentProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationServiceEnvironmentProperties.class);

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private WorkflowProvisioningState provisioningState;

    /*
     * The integration service environment state.
     */
    @JsonProperty(value = "state")
    private WorkflowState state;

    /*
     * Gets the tracking id.
     */
    @JsonProperty(value = "integrationServiceEnvironmentId")
    private String integrationServiceEnvironmentId;

    /*
     * The endpoints configuration.
     */
    @JsonProperty(value = "endpointsConfiguration")
    private FlowEndpointsConfiguration endpointsConfiguration;

    /*
     * The network configuration.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /*
     * The encryption configuration.
     */
    @JsonProperty(value = "encryptionConfiguration")
    private IntegrationServiceEnvironmenEncryptionConfiguration encryptionConfiguration;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkflowProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withProvisioningState(WorkflowProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the state property: The integration service environment state.
     *
     * @return the state value.
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Set the state property: The integration service environment state.
     *
     * @param state the state value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withState(WorkflowState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the integrationServiceEnvironmentId property: Gets the tracking id.
     *
     * @return the integrationServiceEnvironmentId value.
     */
    public String integrationServiceEnvironmentId() {
        return this.integrationServiceEnvironmentId;
    }

    /**
     * Set the integrationServiceEnvironmentId property: Gets the tracking id.
     *
     * @param integrationServiceEnvironmentId the integrationServiceEnvironmentId value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withIntegrationServiceEnvironmentId(
        String integrationServiceEnvironmentId) {
        this.integrationServiceEnvironmentId = integrationServiceEnvironmentId;
        return this;
    }

    /**
     * Get the endpointsConfiguration property: The endpoints configuration.
     *
     * @return the endpointsConfiguration value.
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.endpointsConfiguration;
    }

    /**
     * Set the endpointsConfiguration property: The endpoints configuration.
     *
     * @param endpointsConfiguration the endpointsConfiguration value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withEndpointsConfiguration(
        FlowEndpointsConfiguration endpointsConfiguration) {
        this.endpointsConfiguration = endpointsConfiguration;
        return this;
    }

    /**
     * Get the networkConfiguration property: The network configuration.
     *
     * @return the networkConfiguration value.
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: The network configuration.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the encryptionConfiguration property: The encryption configuration.
     *
     * @return the encryptionConfiguration value.
     */
    public IntegrationServiceEnvironmenEncryptionConfiguration encryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * Set the encryptionConfiguration property: The encryption configuration.
     *
     * @param encryptionConfiguration the encryptionConfiguration value to set.
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withEncryptionConfiguration(
        IntegrationServiceEnvironmenEncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointsConfiguration() != null) {
            endpointsConfiguration().validate();
        }
        if (networkConfiguration() != null) {
            networkConfiguration().validate();
        }
        if (encryptionConfiguration() != null) {
            encryptionConfiguration().validate();
        }
    }
}