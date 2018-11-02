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
 * @param <E> extends {@link PAPEntity}
 * @param <S> extends {@link PAPService}
 * @param <D> extends {@link PAPDisplayObject}
 * @param <P> extends {@link PAPPresenter}
 * @param <FO> extends {@link PAPFacadeObject}
 * @param <F> extends {@link PAPFacade}
 */
public abstract class PAPModule<E extends PAPEntity,
                                S extends PAPService<E>,
                                D extends PAPDisplayObject,
                                P extends PAPPresenter<D>,
                                FO extends PAPFacadeObject,
                                F extends PAPFacade<E, FO, D>> extends PAPFModule<E, S, D, P, FO, F> {


    /**
     * The constructor.
     *
     * @param facades Not null.
     */
    public PAPModule(@Nonnull List<F> facades) {
        super(facades);
    }
}
