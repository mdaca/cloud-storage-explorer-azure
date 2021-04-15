// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Costs. */
public interface Costs {
    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost.
     */
    LabCost get(String resourceGroupName, String labName, String name);

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost.
     */
    Response<LabCost> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context);

    /**
     * Get cost.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost.
     */
    LabCost getById(String id);

    /**
     * Get cost.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($expand=labCostDetails)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cost.
     */
    Response<LabCost> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Begins definition for a new LabCost resource.
     *
     * @param name resource name.
     * @return the first stage of the new LabCost definition.
     */
    LabCost.DefinitionStages.Blank define(String name);
}