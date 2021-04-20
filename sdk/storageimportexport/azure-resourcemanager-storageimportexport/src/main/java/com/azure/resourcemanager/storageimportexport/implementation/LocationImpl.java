// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.implementation;

import com.azure.resourcemanager.storageimportexport.fluent.models.LocationInner;
import com.azure.resourcemanager.storageimportexport.models.Location;
import java.util.Collections;
import java.util.List;

public final class LocationImpl implements Location {
    private LocationInner innerObject;

    private final com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager;

    LocationImpl(
        LocationInner innerObject,
        com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String recipientName() {
        return this.innerModel().recipientName();
    }

    public String streetAddress1() {
        return this.innerModel().streetAddress1();
    }

    public String streetAddress2() {
        return this.innerModel().streetAddress2();
    }

    public String city() {
        return this.innerModel().city();
    }

    public String stateOrProvince() {
        return this.innerModel().stateOrProvince();
    }

    public String postalCode() {
        return this.innerModel().postalCode();
    }

    public String countryOrRegion() {
        return this.innerModel().countryOrRegion();
    }

    public String phone() {
        return this.innerModel().phone();
    }

    public String additionalShippingInformation() {
        return this.innerModel().additionalShippingInformation();
    }

    public List<String> supportedCarriers() {
        List<String> inner = this.innerModel().supportedCarriers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> alternateLocations() {
        List<String> inner = this.innerModel().alternateLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager() {
        return this.serviceManager;
    }
}