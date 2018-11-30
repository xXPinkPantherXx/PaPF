package de.pinkpanther.papf.dsa.abilities.frontend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.frontend.AbilityDisplay;

import javax.annotation.Nonnull;

/**
 * The {@link AbilityDisplay} for the DSA module.
 */
public class DSAAbilityDisplay extends AbilityDisplay {

    /**
     * The name of this ability display.
     */
    @Nonnull
    private final String name;

    /**
     * The constructor.
     *
     * @param name Not null.
     */
    public DSAAbilityDisplay(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the name of this ability display.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
