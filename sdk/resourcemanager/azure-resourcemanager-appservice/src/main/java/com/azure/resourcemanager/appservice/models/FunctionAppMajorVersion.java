// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Function App stack major version. */
@Immutable
public final class FunctionAppMajorVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FunctionAppMajorVersion.class);

    /*
     * Function App stack major version (display only).
     */
    @JsonProperty(value = "displayText", access = JsonProperty.Access.WRITE_ONLY)
    private String displayText;

    /*
     * Function App stack major version name.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Minor versions associated with the major version.
     */
    @JsonProperty(value = "minorVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<FunctionAppMinorVersion> minorVersions;

    /**
     * Get the displayText property: Function App stack major version (display only).
     *
     * @return the displayText value.
     */
    public String displayText() {
        return this.displayText;
    }

    /**
     * Get the value property: Function App stack major version name.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the minorVersions property: Minor versions associated with the major version.
     *
     * @return the minorVersions value.
     */
    public List<FunctionAppMinorVersion> minorVersions() {
        return this.minorVersions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (minorVersions() != null) {
            minorVersions().forEach(e -> e.validate());
        }
    }
}