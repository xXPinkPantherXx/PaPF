package de.pinkpanther.papf.generic.facade;

import de.pinkpanther.papf.generic.backend.PAPFEntity;
import de.pinkpanther.papf.generic.frontend.PAPFDisplayObject;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all facades.
 */
public abstract class PAPFFacade<E extends PAPFEntity, F extends PAPFFacadeObject, D extends PAPFDisplayObject> {

    /**
     * Converts an {@link E} to a {@link D}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    protected abstract D convertEntityToDisplay(@Nonnull final E entity);
}
