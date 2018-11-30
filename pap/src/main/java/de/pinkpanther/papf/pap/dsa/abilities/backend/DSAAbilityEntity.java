package de.pinkpanther.papf.pap.dsa.abilities.backend;


import de.pinkpanther.papf.pap.abilities.backend.AbilityEntity;

import javax.annotation.Nonnull;

/**
 * The {@link AbilityEntity} for the DSA module.
 */
public class DSAAbilityEntity extends AbilityEntity {

    private static final long serialVersionUID = 1550896167331932857L;

    /**
     * The constructor for JPA.
     */
    public DSAAbilityEntity() {
    }

    /**
     * Constructor with default id (= -1).
     *
     * @param name The name of the Ability.
     */
    public DSAAbilityEntity(@Nonnull String name) {
        super(name, 1);
    }

    /**
     * Full constructor.
     *
     * @param id   The id of the Ability. (-1 is an unsaved newly crated ability)
     * @param name The name of the Ability.
     */
    public DSAAbilityEntity(int id, @Nonnull String name) {
        super(id, name, 2);
    }
}
