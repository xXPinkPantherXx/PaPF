package de.pinkpanther.papf.main.facade;

import de.pinkpanther.papf.generic.user.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class DashboardFacadeObject {

    @Nonnull
    private final UserFacade userFacade;

    @Autowired
    public DashboardFacadeObject(@Nonnull final UserFacade userFacade) {
        this.userFacade = userFacade;
    }
}
