// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.PolicyDetails;
import com.azure.resourcemanager.policyinsights.models.TrackedResourceModificationDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Policy tracked resource record. */
@Immutable
public final class PolicyTrackedResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyTrackedResourceInner.class);

    /*
     * The ID of the policy tracked resource.
     */
    @JsonProperty(value = "trackedResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackedResourceId;

    /*
     * The details of the policy that require the tracked resource.
     */
    @JsonProperty(value = "policyDetails", access = JsonProperty.Access.WRITE_ONLY)
    private PolicyDetails policyDetails;

    /*
     * The details of the policy triggered deployment that created the tracked
     * resource.
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private TrackedResourceModificationDetails createdBy;

    /*
     * The details of the policy triggered deployment that modified the tracked
     * resource.
     */
    @JsonProperty(value = "lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private TrackedResourceModificationDetails lastModifiedBy;

    /*
     * Timestamp of the last update to the tracked resource.
     */
    @JsonProperty(value = "lastUpdateUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdateUtc;

    /**
     * Get the trackedResourceId property: The ID of the policy tracked resource.
     *
     * @return the trackedResourceId value.
     */
    public String trackedResourceId() {
        return this.trackedResourceId;
    }

    /**
     * Get the policyDetails property: The details of the policy that require the tracked resource.
     *
     * @return the policyDetails value.
     */
    public PolicyDetails policyDetails() {
        return this.policyDetails;
    }

    /**
     * Get the createdBy property: The details of the policy triggered deployment that created the tracked resource.
     *
     * @return the createdBy value.
     */
    public TrackedResourceModificationDetails createdBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedBy property: The details of the policy triggered deployment that modified the tracked
     * resource.
     *
     * @return the lastModifiedBy value.
     */
    public TrackedResourceModificationDetails lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the lastUpdateUtc property: Timestamp of the last update to the tracked resource.
     *
     * @return the lastUpdateUtc value.
     */
    public OffsetDateTime lastUpdateUtc() {
        return this.lastUpdateUtc;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyDetails() != null) {
            policyDetails().validate();
        }
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
    }
}