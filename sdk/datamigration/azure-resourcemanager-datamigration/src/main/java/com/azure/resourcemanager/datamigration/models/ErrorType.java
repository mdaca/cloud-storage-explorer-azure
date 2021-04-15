// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ErrorType. */
public final class ErrorType extends ExpandableStringEnum<ErrorType> {
    /** Static value Default for ErrorType. */
    public static final ErrorType DEFAULT = fromString("Default");

    /** Static value Warning for ErrorType. */
    public static final ErrorType WARNING = fromString("Warning");

    /** Static value Error for ErrorType. */
    public static final ErrorType ERROR = fromString("Error");

    /**
     * Creates or finds a ErrorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ErrorType.
     */
    @JsonCreator
    public static ErrorType fromString(String name) {
        return fromString(name, ErrorType.class);
    }

    /** @return known ErrorType values. */
    public static Collection<ErrorType> values() {
        return values(ErrorType.class);
    }
}