package de.pinkpanther.papf.pap.rules.facade;

import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.pap.rules.backend.RulebookEntity;
import de.pinkpanther.papf.pap.rules.frontend.RulebookDisplay;

/**
 * The abstract base class of all rulebook facades.
 */
public abstract class RulebookFacade<E extends RulebookEntity, FO extends Rulebook, D extends RulebookDisplay>
        extends PAPFacade<E, FO, D> {
}
