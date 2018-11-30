package de.pinkpanther.papf.generic.user;

import de.pinkpanther.papf.generic.PAPFModule;
import de.pinkpanther.papf.generic.user.backend.UserService;
import de.pinkpanther.papf.generic.user.facade.UserFacade;
import de.pinkpanther.papf.generic.user.frontend.UserPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAPFModule} for the user.
 */
@Component
public class UserModule extends PAPFModule<UserService, UserPresenter, UserFacade> {

    /**
     * The constructor.
     *
     * @param userService Not null.
     */
    @Autowired
    protected UserModule(@Nonnull final UserService userService,
                         @Nonnull final UserFacade userFacade,
                         @Nonnull final UserPresenter userPresenter) {
        super(userService, userPresenter, userFacade);
    }

    @Override
    protected void initialize() {

    }
}