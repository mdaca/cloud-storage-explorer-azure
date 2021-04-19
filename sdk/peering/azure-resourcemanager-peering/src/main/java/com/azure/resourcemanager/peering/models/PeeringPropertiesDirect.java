// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that define a direct peering. */
@Fluent
public final class PeeringPropertiesDirect {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringPropertiesDirect.class);

    /*
     * The set of connections that constitute a direct peering.
     */
    @JsonProperty(value = "connections")
    private List<DirectConnection> connections;

    /*
     * The flag that indicates whether or not the peering is used for peering
     * service.
     */
    @JsonProperty(value = "useForPeeringService", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean useForPeeringService;

    /*
     * The reference of the peer ASN.
     */
    @JsonProperty(value = "peerAsn")
    private SubResource peerAsn;

    /*
     * The type of direct peering.
     */
    @JsonProperty(value = "directPeeringType")
    private DirectPeeringType directPeeringType;

    /**
     * Get the connections property: The set of connections that constitute a direct peering.
     *
     * @return the connections value.
     */
    public List<DirectConnection> connections() {
        return this.connections;
    }

    /**
     * Set the connections property: The set of connections that constitute a direct peering.
     *
     * @param connections the connections value to set.
     * @return the PeeringPropertiesDirect object itself.
     */
    public PeeringPropertiesDirect withConnections(List<DirectConnection> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the useForPeeringService property: The flag that indicates whether or not the peering is used for peering
     * service.
     *
     * @return the useForPeeringService value.
     */
    public Boolean useForPeeringService() {
        return this.useForPeeringService;
    }

    /**
     * Get the peerAsn property: The reference of the peer ASN.
     *
     * @return the peerAsn value.
     */
    public SubResource peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: The reference of the peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the PeeringPropertiesDirect object itself.
     */
    public PeeringPropertiesDirect withPeerAsn(SubResource peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the directPeeringType property: The type of direct peering.
     *
     * @return the directPeeringType value.
     */
    public DirectPeeringType directPeeringType() {
        return this.directPeeringType;
    }

    /**
     * Set the directPeeringType property: The type of direct peering.
     *
     * @param directPeeringType the directPeeringType value to set.
     * @return the PeeringPropertiesDirect object itself.
     */
    public PeeringPropertiesDirect withDirectPeeringType(DirectPeeringType directPeeringType) {
        this.directPeeringType = directPeeringType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connections() != null) {
            connections().forEach(e -> e.validate());
        }
    }
}