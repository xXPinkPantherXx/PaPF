package de.pinkpanther.papf.shadowrun;

import de.pinkpanther.papf.pap.PAPModule;
import de.pinkpanther.papf.shadowrun.backend.ShadowrunService;
import de.pinkpanther.papf.shadowrun.facade.ShadowrunFacade;
import de.pinkpanther.papf.shadowrun.frontend.ShadowrunPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAPModule}-class for shadowrun.
 */
@Component
public class Shadowrun
        extends PAPModule<ShadowrunService, ShadowrunPresenter, ShadowrunFacade> {

    /**
     * Autowired constructor.
     *
     * @param shadowrunService Not null.
     * @param shadowrunPresenter Not null.
     * @param shadowrunFacade Not null.
     */
    @Autowired
    public Shadowrun(@Nonnull final ShadowrunService shadowrunService, @Nonnull final ShadowrunPresenter shadowrunPresenter, @Nonnull final ShadowrunFacade shadowrunFacade) {
        super(shadowrunService, shadowrunPresenter, shadowrunFacade);
    }
}
