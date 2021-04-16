// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Policies. */
public interface Policies {
    /**
     * List policies in a given policy set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Policy> list(String resourceGroupName, String labName, String policySetName);

    /**
     * List policies in a given policy set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Policy> list(
        String resourceGroupName,
        String labName,
        String policySetName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    Policy get(String resourceGroupName, String labName, String policySetName, String name);

    /**
     * Get policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    Response<Policy> getWithResponse(
        String resourceGroupName, String labName, String policySetName, String name, String expand, Context context);

    /**
     * Delete policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String policySetName, String name);

    /**
     * Delete policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String labName, String policySetName, String name, Context context);

    /**
     * Get policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    Policy getById(String id);

    /**
     * Get policy.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    Response<Policy> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Policy resource.
     *
     * @param name resource name.
     * @return the first stage of the new Policy definition.
     */
    Policy.DefinitionStages.Blank define(String name);
}