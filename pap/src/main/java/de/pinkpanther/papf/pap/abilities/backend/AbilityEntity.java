package de.pinkpanther.papf.pap.abilities.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.backend.PAPEntity;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all ability entities.
 */
public abstract class AbilityEntity extends PAPEntity {

    /**
     * The name of the ability.
     */
    private final String name;

    /**
     * The constructor.
     *
     * @param name Not null.
     */
    public AbilityEntity(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the name of the ability.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
