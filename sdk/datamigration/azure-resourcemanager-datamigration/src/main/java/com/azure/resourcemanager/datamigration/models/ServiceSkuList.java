// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.models.AvailableServiceSkuInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** OData page of available SKUs. */
@Fluent
public final class ServiceSkuList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceSkuList.class);

    /*
     * List of service SKUs
     */
    @JsonProperty(value = "value")
    private List<AvailableServiceSkuInner> value;

    /*
     * URL to load the next page of service SKUs
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of service SKUs.
     *
     * @return the value value.
     */
    public List<AvailableServiceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of service SKUs.
     *
     * @param value the value value to set.
     * @return the ServiceSkuList object itself.
     */
    public ServiceSkuList withValue(List<AvailableServiceSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to load the next page of service SKUs.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to load the next page of service SKUs.
     *
     * @param nextLink the nextLink value to set.
     * @return the ServiceSkuList object itself.
     */
    public ServiceSkuList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}