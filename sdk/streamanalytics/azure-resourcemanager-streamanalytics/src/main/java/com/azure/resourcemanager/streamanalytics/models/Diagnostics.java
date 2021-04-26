// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention. */
@Immutable
public final class Diagnostics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Diagnostics.class);

    /*
     * A collection of zero or more conditions applicable to the resource, or
     * to the job overall, that warrant customer attention.
     */
    @JsonProperty(value = "conditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<DiagnosticCondition> conditions;

    /**
     * Get the conditions property: A collection of zero or more conditions applicable to the resource, or to the job
     * overall, that warrant customer attention.
     *
     * @return the conditions value.
     */
    public List<DiagnosticCondition> conditions() {
        return this.conditions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (conditions() != null) {
            conditions().forEach(e -> e.validate());
        }
    }
}