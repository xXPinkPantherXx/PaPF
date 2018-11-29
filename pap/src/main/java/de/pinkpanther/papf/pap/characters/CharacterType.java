package de.pinkpanther.papf.pap.characters;

import javax.annotation.Nonnull;

/**
 * An interface used to mark character type enums.
 */
public interface CharacterType {

    /**
     * Returns the name of the character type.
     *
     * @return The character types name.
     */
    @Nonnull String getName();
}
