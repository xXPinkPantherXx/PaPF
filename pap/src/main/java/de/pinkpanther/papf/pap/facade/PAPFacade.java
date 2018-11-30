package de.pinkpanther.papf.pap.facade;

import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.pap.backend.PAPEntity;
import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all pen and paper facades.
 */
public /*abstract*/ class PAPFacade<E extends PAPEntity, FO extends PAPFacadeObject, D extends PAPDisplayObject>
        extends PAPFFacade<E, FO, D> {

    /**
     * Converts an {@link E} to a {@link D}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected D convertEntityToDisplay(@Nonnull E entity) {
        return null;
    }

    @Nonnull
    @Override
    protected FO convertEntityToFacadeObject(@Nonnull E entity) {
        return null;
    }
}
