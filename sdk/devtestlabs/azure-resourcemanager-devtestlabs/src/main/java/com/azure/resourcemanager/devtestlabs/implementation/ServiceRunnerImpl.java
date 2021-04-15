// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceRunnerInner;
import com.azure.resourcemanager.devtestlabs.models.IdentityProperties;
import com.azure.resourcemanager.devtestlabs.models.ServiceRunner;
import java.util.Collections;
import java.util.Map;

public final class ServiceRunnerImpl implements ServiceRunner, ServiceRunner.Definition, ServiceRunner.Update {
    private ServiceRunnerInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public IdentityProperties identity() {
        return this.innerModel().identity();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServiceRunnerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    public ServiceRunnerImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public ServiceRunner create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServiceRunner create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    ServiceRunnerImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new ServiceRunnerInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ServiceRunnerImpl update() {
        return this;
    }

    public ServiceRunner apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServiceRunner apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .createOrUpdateWithResponse(resourceGroupName, labName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    ServiceRunnerImpl(
        ServiceRunnerInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "servicerunners");
    }

    public ServiceRunner refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .getWithResponse(resourceGroupName, labName, name, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceRunner refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceRunners()
                .getWithResponse(resourceGroupName, labName, name, context)
                .getValue();
        return this;
    }

    public ServiceRunnerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceRunnerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceRunnerImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ServiceRunnerImpl withIdentity(IdentityProperties identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }
}