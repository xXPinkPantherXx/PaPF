package de.pinkpanther.papf.pap.facade;

import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.pap.backend.PAPEntity;
import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;

public abstract class PAPFacade<E extends PAPEntity, F extends PAPFacadeObject, D extends PAPDisplayObject> extends PAPFFacade<E, F, D> {

}
