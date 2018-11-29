package de.pinkpanther.papf.pap;

import de.pinkpanther.papf.generic.PAPFModule;
import de.pinkpanther.papf.pap.backend.PAPEntity;
import de.pinkpanther.papf.pap.backend.PAPService;
import de.pinkpanther.papf.pap.facade.PAPFacade;
import de.pinkpanther.papf.pap.facade.PAPFacadeObject;
import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;
import de.pinkpanther.papf.pap.frontend.PAPPresenter;

import javax.annotation.Nonnull;
import java.util.List;

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
     * @param moduleService   Not null.
     * @param modulePresenter Not null.
     * @param moduleFacade    Not null.
     */
    protected PAPModule(@Nonnull S moduleService, @Nonnull P modulePresenter, @Nonnull F moduleFacade) {
        super(moduleService, modulePresenter, moduleFacade);
    }
}
