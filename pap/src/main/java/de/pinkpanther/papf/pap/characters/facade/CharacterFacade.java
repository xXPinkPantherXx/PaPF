package de.pinkpanther.papf.pap.characters.facade;

import de.pinkpanther.papf.pap.characters.backend.CharacterEntity;
import de.pinkpanther.papf.pap.characters.frontend.CharacterDisplay;
import de.pinkpanther.papf.pap.facade.PAPFacade;

/**
 * The abstract base class of all character facades.
 */
public abstract class CharacterFacade<E extends CharacterEntity, FO extends Character, D extends CharacterDisplay>
        extends PAPFacade<E, FO, D> {
}
