package de.pinkpanther.papf.pap.characters.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.backend.PAPEntity;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all character entities.
 */
public abstract class CharacterEntity extends PAPEntity {

    private static final long serialVersionUID = -1377918079158134945L;

    /**
     * The name of this character entity.
     */
    private String name;

    /**
     * An empty constructor to make hibernate happy.
     */
    public CharacterEntity () {

    }

    /**
     * The Constructor.
     *
     * @param name Not null.
     */
    public CharacterEntity(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the name of the character entity.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }
}
