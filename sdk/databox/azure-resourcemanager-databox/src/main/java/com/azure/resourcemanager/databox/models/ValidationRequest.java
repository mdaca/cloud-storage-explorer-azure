// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Minimum request requirement of any validation category. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "validationCategory",
    defaultImpl = ValidationRequest.class)
@JsonTypeName("ValidationRequest")
@JsonSubTypes({@JsonSubTypes.Type(name = "JobCreationValidation", value = CreateJobValidations.class)})
@Fluent
public class ValidationRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationRequest.class);

    /*
     * List of request details contain validationType and its request as key
     * and value respectively.
     */
    @JsonProperty(value = "individualRequestDetails", required = true)
    private List<ValidationInputRequest> individualRequestDetails;

    /**
     * Get the individualRequestDetails property: List of request details contain validationType and its request as key
     * and value respectively.
     *
     * @return the individualRequestDetails value.
     */
    public List<ValidationInputRequest> individualRequestDetails() {
        return this.individualRequestDetails;
    }

    /**
     * Set the individualRequestDetails property: List of request details contain validationType and its request as key
     * and value respectively.
     *
     * @param individualRequestDetails the individualRequestDetails value to set.
     * @return the ValidationRequest object itself.
     */
    public ValidationRequest withIndividualRequestDetails(List<ValidationInputRequest> individualRequestDetails) {
        this.individualRequestDetails = individualRequestDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (individualRequestDetails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property individualRequestDetails in model ValidationRequest"));
        } else {
            individualRequestDetails().forEach(e -> e.validate());
        }
    }
}