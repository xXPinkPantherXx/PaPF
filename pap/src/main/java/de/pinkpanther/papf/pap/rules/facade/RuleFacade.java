package de.pinkpanther.papf.pap.rules.facade;

import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.pap.rules.backend.RuleEntity;
import de.pinkpanther.papf.pap.rules.frontend.RuleDisplay;

/**
 * The abstract base class of all rule facades.
 */
public abstract class RuleFacade<E extends RuleEntity, FO extends Rule, D extends RuleDisplay>
        extends PAPFacade<E, FO, D> {
}
