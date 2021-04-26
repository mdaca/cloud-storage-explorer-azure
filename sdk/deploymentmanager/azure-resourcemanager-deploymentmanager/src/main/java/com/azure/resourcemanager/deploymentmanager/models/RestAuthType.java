// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RestAuthType. */
public enum RestAuthType {
    /** Enum value ApiKey. */
    API_KEY("ApiKey"),

    /** Enum value RolloutIdentity. */
    ROLLOUT_IDENTITY("RolloutIdentity");

    /** The actual serialized value for a RestAuthType instance. */
    private final String value;

    RestAuthType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestAuthType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RestAuthType object, or null if unable to parse.
     */
    @JsonCreator
    public static RestAuthType fromString(String value) {
        RestAuthType[] items = RestAuthType.values();
        for (RestAuthType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}