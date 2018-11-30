package de.pinkpanther.papf.generic.user.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.facade.PAPFFacade;
import de.pinkpanther.papf.generic.user.backend.UserEntity;
import de.pinkpanther.papf.generic.user.backend.UserService;
import de.pinkpanther.papf.generic.user.frontend.UserDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link PAPFFacade} for the user.
 */
@Component
public class UserFacade extends PAPFFacade<UserEntity, User, UserDisplay> {

    @Nonnull
    private final UserService userService;

    @Autowired
    public UserFacade(@Nonnull UserService userService) {
        this.userService = userService;
    }


    @Nonnull
    @Override
    protected UserDisplay convertEntityToDisplay(@Nonnull final UserEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new UserDisplay(entity.getName(), entity.getEmail());
    }

    /**
     * Converts an {@link UserEntity} to a {@link User}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    protected User convertEntityToFacadeObject(@Nonnull final UserEntity entity) {
        return new User(entity.getName(), entity.getEmail());
    }

    @Nonnull
    public List<UserDisplay> getAllUsersDisplays() {
        final List<UserEntity> userEntities = userService.getAllUserEntities();
        final List<UserDisplay> userDisplays = new ArrayList<>();
        for (final UserEntity userEntity : userEntities) {
            userDisplays.add(convertEntityToDisplay(userEntity));
        }
        return userDisplays;
    }
}
