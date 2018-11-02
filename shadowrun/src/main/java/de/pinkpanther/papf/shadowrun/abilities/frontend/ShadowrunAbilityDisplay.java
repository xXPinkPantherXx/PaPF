package de.pinkpanther.papf.shadowrun.abilities.frontend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.frontend.AbilityDisplay;

import javax.annotation.Nonnull;

/**
 * The {@link AbilityDisplay} for the shadowrun module.
 */
public class ShadowrunAbilityDisplay extends AbilityDisplay {

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
    public ShadowrunAbilityDisplay(@Nonnull final String name) {
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
