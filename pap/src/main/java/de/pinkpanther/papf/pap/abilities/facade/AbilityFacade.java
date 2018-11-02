package de.pinkpanther.papf.pap.abilities.facade;

import de.pinkpanther.papf.pap.abilities.backend.AbilityEntity;
import de.pinkpanther.papf.pap.abilities.frontend.AbilityDisplay;
import de.pinkpanther.papf.pap.facade.PAPFacade;

/**
 * The abstract base class of all ability facades.
 */
public abstract class AbilityFacade<E extends AbilityEntity, FO extends Ability, D extends AbilityDisplay>
        extends PAPFacade<E, FO, D> {

}
