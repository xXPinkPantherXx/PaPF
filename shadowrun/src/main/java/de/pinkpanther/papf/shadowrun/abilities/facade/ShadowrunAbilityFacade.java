package de.pinkpanther.papf.shadowrun.abilities.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.facade.AbilityFacade;
import de.pinkpanther.papf.shadowrun.abilities.backend.ShadowrunAbilityEntity;
import de.pinkpanther.papf.shadowrun.abilities.frontend.ShadowrunAbilityDisplay;

import javax.annotation.Nonnull;

/**
 * The {@link AbilityFacade} for the shadowrun module.
 */
public class ShadowrunAbilityFacade extends AbilityFacade<ShadowrunAbilityEntity, ShadowrunAbility, ShadowrunAbilityDisplay> {

    /**
     * Converts a {@link ShadowrunAbilityEntity} into a {@link ShadowrunAbilityDisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected ShadowrunAbilityDisplay convertEntityToDisplay(@Nonnull final ShadowrunAbilityEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new ShadowrunAbilityDisplay(entity.getName());
    }
}
