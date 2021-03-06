package de.pinkpanther.papf.pap.items.facade;

import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.pap.items.backend.ItemEntity;
import de.pinkpanther.papf.pap.items.frontend.ItemDisplay;
import de.pinkpanther.papf.generic.facade.PAPFFacade;

/**
 * The abstract base class of all item facades.
 */
public abstract class ItemFacade<E extends ItemEntity, FO extends Item, D extends ItemDisplay>
        extends PAPFacade<E, FO, D> {
}
