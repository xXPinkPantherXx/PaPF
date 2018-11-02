package de.pinkpanther.papf.generic;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFEntity;
import de.pinkpanther.papf.generic.backend.PAPFService;
import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.generic.facade.PAPFFacadeObject;
import de.pinkpanther.papf.generic.frontend.PAPFDisplayObject;
import de.pinkpanther.papf.generic.frontend.PAPFPresenter;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * The abstract base class of all modules in this program.
 *
 * @param <E> extends {@link PAPFEntity}
 * @param <S> extends {@link PAPFService}
 * @param <D> extends {@link PAPFDisplayObject}
 * @param <P> extends {@link PAPFPresenter}
 * @param <FO> extends {@link PAPFFacadeObject}
 * @param <F> extends {@link PAPFFacade}
 */
public abstract class PAPFModule<E extends PAPFEntity,
                    S extends PAPFService<E>,
                    D extends PAPFDisplayObject,
                    P extends PAPFPresenter<D>,
                    FO extends PAPFFacadeObject,
                    F extends PAPFFacade<E, FO, D>> {

    /**
     * The minimum count of facades that need to be registered.
     */
    private final int MIN_FACADE_COUNT = 5;

    /**
     * The facades registered to this module.
     *
     * @see PAPFFacade
     */
    private final List<F> facadeRegistry = new ArrayList<>(MIN_FACADE_COUNT);

    /**
     * The constructor.
     *
     * @param facades Not null.
     */
    protected PAPFModule(@Nonnull final List<F> facades) {
        Preconditions.checkNotNull(facades, "'facade' should not be null!");
        Preconditions.checkArgument(facades.size() >= MIN_FACADE_COUNT,
                                  "The minimum of facades to register ist " + MIN_FACADE_COUNT + "!" );

        registerFacades(facades);
    }

    /**
     * Method to register multiple new {@link PAPFFacade facades}.
     *
     * @param facades Not null.
     */
    protected final void registerFacades(@Nonnull final List<F> facades) {
        Preconditions.checkNotNull(facades, "'facades' should not be null!");

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
        Preconditions.checkNotNull(facade, "'facade' should not be null!");

        if(facadeRegistry.contains(facade)) {
            throw new RuntimeException("Facade already registered: " + facade.toString());
        }
        facadeRegistry.add(facade);
    }
}
