package de.pinkpanther.papf.pap.characters.backend;

import de.pinkpanther.papf.pap.backend.PAPEntity;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all character entities.
 */
public abstract class CharacterEntity extends PAPEntity {

    /**
     * Returns the name of the character entity.
     *
     * @return Not null.
     */
    @Nonnull
    public abstract String getName();
}
