package de.pinkpanther.papf.generic.user.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * The {@link PAPFService} for the user.
 */
@Service
public class UserService extends PAPFService<UserEntity> {

    @Nonnull
    private final UserDAO userDAO;

    @Autowired
    public UserService(@Nonnull final UserDAO userDAO) {
        Preconditions.checkNotNull(userDAO, "userDAO should not be null!");

        this.userDAO = userDAO;
    }

    @Override
    public String toString() {
        return "ServiceName: UserService";
    }

    public List<UserEntity> getAllUserEntities() {
        return userDAO.findUsers();
    }
}
