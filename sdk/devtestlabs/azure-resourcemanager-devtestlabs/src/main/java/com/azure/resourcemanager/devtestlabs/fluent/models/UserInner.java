// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.UserIdentity;
import com.azure.resourcemanager.devtestlabs.models.UserSecretStore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Profile of a lab user. */
@JsonFlatten
@Fluent
public class UserInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserInner.class);

    /*
     * The identity of the user.
     */
    @JsonProperty(value = "properties.identity")
    private UserIdentity identity;

    /*
     * The secret store of the user.
     */
    @JsonProperty(value = "properties.secretStore")
    private UserSecretStore secretStore;

    /*
     * The creation date of the user profile.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the identity property: The identity of the user.
     *
     * @return the identity value.
     */
    public UserIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the user.
     *
     * @param identity the identity value to set.
     * @return the UserInner object itself.
     */
    public UserInner withIdentity(UserIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the secretStore property: The secret store of the user.
     *
     * @return the secretStore value.
     */
    public UserSecretStore secretStore() {
        return this.secretStore;
    }

    /**
     * Set the secretStore property: The secret store of the user.
     *
     * @param secretStore the secretStore value to set.
     * @return the UserInner object itself.
     */
    public UserInner withSecretStore(UserSecretStore secretStore) {
        this.secretStore = secretStore;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the user profile.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /** {@inheritDoc} */
    @Override
    public UserInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (secretStore() != null) {
            secretStore().validate();
        }
    }
}