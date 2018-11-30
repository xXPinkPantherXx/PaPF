package de.pinkpanther.papf.pap.dsa.abilities;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.ApplicationHelper;
import de.pinkpanther.papf.pap.abilities.AbilityType;

import javax.annotation.Nonnull;

/**
 * The DSA ability types.
 */
public enum DSAAbilityType implements AbilityType {
    /**
     * Magic ability type.
     */
    MAGIC("papf.dsa.abilityType.magic"),

    /**
     * Physical  ability type.
     */
    PHSYSICAL("papf.dsa.abilityType.physical")
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
    DSAAbilityType(@Nonnull final String nameMessageKey) {
        Preconditions.checkNotNull(nameMessageKey, "nameMessageKey should not be null!");

        this.name = ApplicationHelper.getMessage(nameMessageKey);
    }

    /**
     * Returns the name of this {@link DSAAbilityType}.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
