package de.pinkpanther.papf.dsa.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.dsa.backend.DSAEntity;
import de.pinkpanther.papf.dsa.frontend.DSADisplay;
import de.pinkpanther.papf.pap.facade.PAPFacade;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAPFacade} for the DSA module.
 */
@Component
public class DSAFacade extends PAPFacade<DSAEntity, DSAFacadeObject, DSADisplay>
{

    /**
     * Converts a {@link de.pinkpanther.papf.dsa.backend.DSAEntity} into a {@link DSADisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected DSADisplay convertEntityToDisplay(@Nonnull final DSAEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new DSADisplay();
    }

    @Nonnull
    @Override
    protected DSAFacadeObject convertEntityToFacadeObject(@Nonnull DSAEntity entity) {
        return null;
    }
}
