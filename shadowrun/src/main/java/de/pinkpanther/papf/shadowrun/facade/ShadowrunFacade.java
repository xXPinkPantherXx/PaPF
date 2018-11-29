package de.pinkpanther.papf.shadowrun.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.shadowrun.backend.ShadowrunEntity;
import de.pinkpanther.papf.shadowrun.frontend.ShadowrunDisplay;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAPFacade} for the shadowrun module.
 */
@Component
public class ShadowrunFacade extends PAPFacade<ShadowrunEntity, ShadowrunFacadeObject, ShadowrunDisplay> {

    /**
     * Converts a {@link ShadowrunEntity} into a {@link ShadowrunDisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected ShadowrunDisplay convertEntityToDisplay(@Nonnull final ShadowrunEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new ShadowrunDisplay();
    }
}
