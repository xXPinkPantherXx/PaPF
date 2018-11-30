package de.pinkpanther.papf.main.facade;

import de.pinkpanther.papf.generic.user.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class DashboardFacade {

    @Nonnull
    private final UserFacade userFacade;

    @Autowired
    public DashboardFacade(@Nonnull final UserFacade userFacade) {
        this.userFacade = userFacade;
    }
}
