package de.pinkpanther.papf.pap.dsa.abilities.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.facade.AbilityFacade;
import de.pinkpanther.papf.pap.dsa.abilities.backend.DSAAbilityEntity;
import de.pinkpanther.papf.pap.dsa.abilities.frontend.DSAAbilityDisplay;

import javax.annotation.Nonnull;

/**
 * The {@link AbilityFacade} for the DSA module.
 */
public class DSAAbilityFacade
        //extends AbilityFacade<DSAAbilityEntity, DSAAbility, DSAAbilityDisplay
{

    /**
     * Converts a {@link DSAAbilityEntity} into a {@link DSAAbilityDisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    protected DSAAbilityDisplay convertEntityToDisplay(@Nonnull final DSAAbilityEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new DSAAbilityDisplay(entity.getName());
    }
}