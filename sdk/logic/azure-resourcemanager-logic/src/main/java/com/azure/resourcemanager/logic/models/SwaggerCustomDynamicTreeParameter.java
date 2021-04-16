// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The swagger custom dynamic tree parameter. */
@Fluent
public final class SwaggerCustomDynamicTreeParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwaggerCustomDynamicTreeParameter.class);

    /*
     * Gets or sets a path to a property in the currently selected item to pass
     * as a value to a parameter for the given operation.
     */
    @JsonProperty(value = "selectedItemValuePath")
    private String selectedItemValuePath;

    /*
     * The parameter value.
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * The parameter reference.
     */
    @JsonProperty(value = "parameterReference")
    private String parameterReference;

    /*
     * Indicates whether the parameter is required.
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /**
     * Get the selectedItemValuePath property: Gets or sets a path to a property in the currently selected item to pass
     * as a value to a parameter for the given operation.
     *
     * @return the selectedItemValuePath value.
     */
    public String selectedItemValuePath() {
        return this.selectedItemValuePath;
    }

    /**
     * Set the selectedItemValuePath property: Gets or sets a path to a property in the currently selected item to pass
     * as a value to a parameter for the given operation.
     *
     * @param selectedItemValuePath the selectedItemValuePath value to set.
     * @return the SwaggerCustomDynamicTreeParameter object itself.
     */
    public SwaggerCustomDynamicTreeParameter withSelectedItemValuePath(String selectedItemValuePath) {
        this.selectedItemValuePath = selectedItemValuePath;
        return this;
    }

    /**
     * Get the value property: The parameter value.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: The parameter value.
     *
     * @param value the value value to set.
     * @return the SwaggerCustomDynamicTreeParameter object itself.
     */
    public SwaggerCustomDynamicTreeParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the parameterReference property: The parameter reference.
     *
     * @return the parameterReference value.
     */
    public String parameterReference() {
        return this.parameterReference;
    }

    /**
     * Set the parameterReference property: The parameter reference.
     *
     * @param parameterReference the parameterReference value to set.
     * @return the SwaggerCustomDynamicTreeParameter object itself.
     */
    public SwaggerCustomDynamicTreeParameter withParameterReference(String parameterReference) {
        this.parameterReference = parameterReference;
        return this;
    }

    /**
     * Get the required property: Indicates whether the parameter is required.
     *
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: Indicates whether the parameter is required.
     *
     * @param required the required value to set.
     * @return the SwaggerCustomDynamicTreeParameter object itself.
     */
    public SwaggerCustomDynamicTreeParameter withRequired(Boolean required) {
        this.required = required;
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