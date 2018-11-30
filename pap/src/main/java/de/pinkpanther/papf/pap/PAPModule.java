package de.pinkpanther.papf.pap;

import de.pinkpanther.papf.generic.PAPFModule;
import de.pinkpanther.papf.pap.backend.PAPService;
import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.pap.frontend.PAPPresenter;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all pap modules.
 *
 * @param <S> extends {@link PAPService}
 * @param <P> extends {@link PAPPresenter}
 * @param <F> extends {@link PAPFacade}
 */
public abstract class PAPModule<S extends PAPService<?>,
                                P extends PAPPresenter<?>,
                                F extends PAPFacade<?, ?, ?>>
        extends PAPFModule<S, P, F> {

    /**
     * The constructor.
     *
     * @param papService   Not null.
     * @param papPresenter Not null.
     * @param papFacade    Not null.
     */
    protected PAPModule(@Nonnull S papService, @Nonnull P papPresenter, @Nonnull F papFacade) {
        super(papService, papPresenter, papFacade);
    }
}
