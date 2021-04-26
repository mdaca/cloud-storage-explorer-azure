// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private container registry. */
@Fluent
public final class ContainerRegistry {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerRegistry.class);

    /*
     * If omitted, the default is "docker.io".
     */
    @JsonProperty(value = "registryServer")
    private String registryServer;

    /*
     * The user name to log into the registry server.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The password to log into the registry server.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the registryServer property: If omitted, the default is "docker.io".
     *
     * @return the registryServer value.
     */
    public String registryServer() {
        return this.registryServer;
    }

    /**
     * Set the registryServer property: If omitted, the default is "docker.io".
     *
     * @param registryServer the registryServer value to set.
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withRegistryServer(String registryServer) {
        this.registryServer = registryServer;
        return this;
    }

    /**
     * Get the username property: The user name to log into the registry server.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The user name to log into the registry server.
     *
     * @param username the username value to set.
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password to log into the registry server.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password to log into the registry server.
     *
     * @param password the password value to set.
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property username in model ContainerRegistry"));
        }
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property password in model ContainerRegistry"));
        }
    }
}