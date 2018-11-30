package de.pinkpanther.papf.dsa.characters.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.characters.backend.CharacterEntity;

import javax.annotation.Nonnull;

/**
 * The {@link CharacterEntity} for the DSA module.
 */
public class DSACharacterEntity extends CharacterEntity {

    /**
     * The name of this character entity.
     */
    @Nonnull
    private final String name;

    /**
     * The Constructor.
     *
     * @param name Not null.
     */
    public DSACharacterEntity(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the name of this character entity.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
