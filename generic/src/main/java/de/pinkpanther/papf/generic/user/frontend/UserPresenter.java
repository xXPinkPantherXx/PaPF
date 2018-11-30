package de.pinkpanther.papf.generic.user.frontend;

import de.pinkpanther.papf.generic.frontend.PAPFPresenter;
import de.pinkpanther.papf.generic.user.facade.UserFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * The {@link PAPFPresenter} for the user.
 */
@RestController
public class UserPresenter extends PAPFPresenter<UserDisplay> {

    private final static Logger LOG = LoggerFactory.getLogger(UserPresenter.class);

    @Nonnull
    private final UserFacade userFacade;

    @Nonnull
    private final UserView userView;

    @Autowired
    public UserPresenter(@Nonnull final UserFacade userFacade, @Nonnull final UserView userView) {
        this.userFacade = userFacade;
        this.userView = userView;
    }

    /**
     * Returns data for the user list.
     *
     * @return Not null.
     */
    @Nonnull
    @RequestMapping(value = "/userlist", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody List<UserDisplay> getUsers() {
        final List<UserDisplay> userDisplays = userFacade.getAllUsersDisplays();
        userView.setUsers(userDisplays);
        return userDisplays;
    }
}