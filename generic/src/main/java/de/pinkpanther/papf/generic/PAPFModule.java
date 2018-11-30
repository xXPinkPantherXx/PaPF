package de.pinkpanther.papf.generic;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFService;
import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.generic.frontend.PAPFPresenter;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * The abstract base class of all modules in this application.
 *
 *  @param <S> extends {@link PAPFService}
 * @param <P> extends {@link PAPFPresenter}
 * @param <F> extends {@link PAPFFacade}
 */
public abstract class PAPFModule<S extends PAPFService<?>, P extends PAPFPresenter<?>, F extends PAPFFacade<?, ?, ?>> {

    /**
     * The facades registered to this module.
     *
     * @see PAPFFacade
     */
    @Nonnull
    private final List<F> facadeRegistry = new ArrayList<>();

    /**
     * The module service.
     */
    private final S moduleService;

    /**
     * The module presenter.
     */
    private final P modulePresenter;

    /**
     * The module facade.
     */
    private final F moduleFacade;

    /**
     * The constructor.
     *
     * @param moduleService Not null.
     * @param modulePresenter Not null.
     * @param moduleFacade Not null.
     */
    protected PAPFModule(@Nonnull final S moduleService, @Nonnull final P modulePresenter, @Nonnull final F moduleFacade) {
        Preconditions.checkNotNull(moduleService, "moduleService should not be null!");
        Preconditions.checkNotNull(modulePresenter, "modulePresenter should not be null!");
        Preconditions.checkNotNull(moduleFacade, "moduleFacade should not be null!");

        this.moduleService = moduleService;
        this.modulePresenter = modulePresenter;
        this.moduleFacade = moduleFacade;
        initialize();
    }

    protected abstract void initialize();

    /**
     * Method to register multiple new {@link PAPFFacade facades}.
     *
     * @param facades Not null.
     */
    protected final void registerFacades(@Nonnull final List<F> facades) {
        Preconditions.checkNotNull(facades, "facades should not be null!");

        for(final F facade : facades) {
            Preconditions.checkNotNull(facade, "facade should not be null!");

            registerFacade(facade);
        }
    }

    /**
     * Method to register a new {@link PAPFFacade facade}.
     *
     * @param facade Not null.
     */
    protected final void registerFacade(@Nonnull final F facade) {
        Preconditions.checkNotNull(facade, "facade should not be null!");

        if(!facadeRegistry.contains(facade)) {
            facadeRegistry.add(facade);
        }
    }
}
