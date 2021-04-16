// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The B2B partner content. */
@Fluent
public final class B2BPartnerContent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(B2BPartnerContent.class);

    /*
     * The list of partner business identities.
     */
    @JsonProperty(value = "businessIdentities")
    private List<BusinessIdentity> businessIdentities;

    /**
     * Get the businessIdentities property: The list of partner business identities.
     *
     * @return the businessIdentities value.
     */
    public List<BusinessIdentity> businessIdentities() {
        return this.businessIdentities;
    }

    /**
     * Set the businessIdentities property: The list of partner business identities.
     *
     * @param businessIdentities the businessIdentities value to set.
     * @return the B2BPartnerContent object itself.
     */
    public B2BPartnerContent withBusinessIdentities(List<BusinessIdentity> businessIdentities) {
        this.businessIdentities = businessIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (businessIdentities() != null) {
            businessIdentities().forEach(e -> e.validate());
        }
    }
}