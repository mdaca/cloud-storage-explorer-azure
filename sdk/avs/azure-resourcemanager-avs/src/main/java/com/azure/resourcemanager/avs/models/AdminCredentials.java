// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.resourcemanager.avs.fluent.models.AdminCredentialsInner;

/** An immutable client-side representation of AdminCredentials. */
public interface AdminCredentials {
    /**
     * Gets the nsxtUsername property: NSX-T Manager username.
     *
     * @return the nsxtUsername value.
     */
    String nsxtUsername();

    /**
     * Gets the nsxtPassword property: NSX-T Manager password.
     *
     * @return the nsxtPassword value.
     */
    String nsxtPassword();

    /**
     * Gets the vcenterUsername property: vCenter admin username.
     *
     * @return the vcenterUsername value.
     */
    String vcenterUsername();

    /**
     * Gets the vcenterPassword property: vCenter admin password.
     *
     * @return the vcenterPassword value.
     */
    String vcenterPassword();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.AdminCredentialsInner object.
     *
     * @return the inner object.
     */
    AdminCredentialsInner innerModel();
}