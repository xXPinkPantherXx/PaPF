package de.pinkpanther.papf.pap.dsa.characters.backend;

import de.pinkpanther.papf.pap.characters.backend.CharacterEntity;

import javax.annotation.Nonnull;

/**
 * The {@link CharacterEntity} for the DSA module.
 */
public class DSACharacterEntity extends CharacterEntity {

    private static final long serialVersionUID = -4028166193690338930L;

    private String bla;

    /**
     * The Constructor.
     *
     * @param name Not null.
     */
    public DSACharacterEntity(@Nonnull String name, @Nonnull String bla) {
        super(name);
        this.bla = bla;
    }

    public String getBla() {
        return bla;
    }
}
