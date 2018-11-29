package de.pinkpanther.papf.shadowrun.characters.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.characters.backend.CharacterEntity;

import javax.annotation.Nonnull;

/**
 * The {@link CharacterEntity} for the shadowrun module.
 */
public class ShadowrunCharacterEntity extends CharacterEntity {

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
    public ShadowrunCharacterEntity(@Nonnull final String name) {
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
