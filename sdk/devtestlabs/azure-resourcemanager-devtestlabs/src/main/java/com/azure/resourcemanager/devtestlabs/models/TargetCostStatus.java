// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TargetCostStatus. */
public final class TargetCostStatus extends ExpandableStringEnum<TargetCostStatus> {
    /** Static value Enabled for TargetCostStatus. */
    public static final TargetCostStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for TargetCostStatus. */
    public static final TargetCostStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a TargetCostStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TargetCostStatus.
     */
    @JsonCreator
    public static TargetCostStatus fromString(String name) {
        return fromString(name, TargetCostStatus.class);
    }

    /** @return known TargetCostStatus values. */
    public static Collection<TargetCostStatus> values() {
        return values(TargetCostStatus.class);
    }
}