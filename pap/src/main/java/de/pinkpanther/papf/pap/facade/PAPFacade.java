package de.pinkpanther.papf.pap.facade;

import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.pap.backend.PAPEntity;
import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;

/**
 * The abstract base class of all pen and paper facades.
 */
public abstract class PAPFacade<E extends PAPEntity, FO extends PAPFacadeObject, D extends PAPDisplayObject>
        extends PAPFFacade<E, FO, D> {

}
