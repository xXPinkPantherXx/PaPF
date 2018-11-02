package de.pinkpanther.papf.shadowrun.abilities;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.ApplicationHelper;
import de.pinkpanther.papf.pap.abilities.AbilityType;

import javax.annotation.Nonnull;

/**
 * The shadowrun ability types.
 */
public enum ShadowrunAbilityType implements AbilityType {
    /**
     * Magic ability type.
     */
    MAGIC("papf.shadowrun.abilityType.magic"),
    PHSYSICAL("papf.shadowrun.abilityType.physical")
    ;

    /**
     * The name of the ability type.
     */
    @Nonnull
    private final String name;

    /**
     * The constructor.
     *
     * @param nameMessageKey Not null.
     */
    ShadowrunAbilityType(@Nonnull final String nameMessageKey) {
        Preconditions.checkNotNull(nameMessageKey, "name should not be null!");

        this.name = ApplicationHelper.getMessage(nameMessageKey);
    }

    /**
     * Returns the name of this {@link ShadowrunAbilityType}.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
