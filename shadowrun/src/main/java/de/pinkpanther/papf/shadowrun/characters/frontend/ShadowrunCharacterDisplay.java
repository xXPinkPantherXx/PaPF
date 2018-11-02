package de.pinkpanther.papf.shadowrun.characters.frontend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.characters.frontend.CharacterDisplay;

import javax.annotation.Nonnull;

public class ShadowrunCharacterDisplay extends CharacterDisplay {

    /**
     * The name of the character.
     */
    @Nonnull
    private final String name;

    public ShadowrunCharacterDisplay(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the name of the character.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
