package de.pinkpanther.papf.shadowrun.abilities;

import de.pinkpanther.papf.pap.abilities.AbilityType;

import javax.annotation.Nonnull;

public enum ShadowrunAbilityType implements AbilityType {
    /**
     * Type for magic abilities.
     */
    MAGIC("Magic")
    ;

    /**
     * The name of the ability type.
     */
    private final String name;

    /**
     * The constructor.
     *
     * @param name Not null.
     */
    ShadowrunAbilityType(@Nonnull final String name){
        this.name = name;
    }

    @Nonnull
    @Override
    public String getName() {
        return name;
    }
}
