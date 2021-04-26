// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The structure of the property that a time series id can have. An environment can have multiple such properties. */
@Fluent
public final class TimeSeriesIdProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimeSeriesIdProperty.class);

    /*
     * The name of the property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the property.
     */
    @JsonProperty(value = "type")
    private PropertyType type;

    /**
     * Get the name property: The name of the property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the property.
     *
     * @param name the name value to set.
     * @return the TimeSeriesIdProperty object itself.
     */
    public TimeSeriesIdProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the property.
     *
     * @return the type value.
     */
    public PropertyType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the property.
     *
     * @param type the type value to set.
     * @return the TimeSeriesIdProperty object itself.
     */
    public TimeSeriesIdProperty withType(PropertyType type) {
        this.type = type;
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