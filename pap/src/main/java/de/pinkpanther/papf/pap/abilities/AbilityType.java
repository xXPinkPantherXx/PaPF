package de.pinkpanther.papf.pap.abilities;

import javax.annotation.Nonnull;

/**
 * An interface used to mark ability type enums.
 */
public interface AbilityType {

    /**
     * Returns the name of the ability type.
     *
     * @return Not null.
     */
    @Nonnull String getName();
}