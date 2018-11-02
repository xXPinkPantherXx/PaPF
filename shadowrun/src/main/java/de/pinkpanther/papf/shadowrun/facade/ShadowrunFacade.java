package de.pinkpanther.papf.shadowrun.facade;

import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.shadowrun.backend.ShadowrunEntity;
import de.pinkpanther.papf.shadowrun.frontend.ShadowrunDisplay;
import org.springframework.stereotype.Component;

@Component
public class ShadowrunFacade extends PAPFacade<ShadowrunEntity, Shadowrun, ShadowrunDisplay> {
}
