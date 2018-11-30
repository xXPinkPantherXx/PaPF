package de.pinkpanther.papf.dsa;

import de.pinkpanther.papf.dsa.backend.DSAService;
import de.pinkpanther.papf.dsa.facade.DSAFacade;
import de.pinkpanther.papf.dsa.frontend.DSAPresenter;
import de.pinkpanther.papf.pap.PAPModule;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAPModule}-class for DSA.
 */
@Component
public class DSA extends PAPModule<DSAService, DSAPresenter, DSAFacade> {


    /**
     * Autowired constructor.
     *
     * @param DSAService Not null.
     * @param DSAPresenter Not null.
     * @param DSAFacade Not null.
     */
    public DSA(@Nonnull final de.pinkpanther.papf.dsa.backend.DSAService DSAService, @Nonnull final de.pinkpanther.papf.dsa.frontend.DSAPresenter DSAPresenter, @Nonnull final DSAFacade DSAFacade) {
        super(DSAService, DSAPresenter, DSAFacade);
    }

    protected void initialize() {

    }
}
