// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Bound. */
public final class Bound extends ExpandableStringEnum<Bound> {
    /** Static value Upper for Bound. */
    public static final Bound UPPER = fromString("Upper");

    /** Static value Lower for Bound. */
    public static final Bound LOWER = fromString("Lower");

    /**
     * Creates or finds a Bound from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Bound.
     */
    @JsonCreator
    public static Bound fromString(String name) {
        return fromString(name, Bound.class);
    }

    /** @return known Bound values. */
    public static Collection<Bound> values() {
        return values(Bound.class);
    }
}