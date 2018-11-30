package de.pinkpanther.papf.generic.user.frontend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.frontend.PAPFView;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link PAPFView} for the user.
 */
@Component
class UserView extends PAPFView<UserDisplay> {

    @Nonnull
    private List<UserDisplay> userDisplays = new ArrayList<>();

    public void setUsers(@Nonnull final List<UserDisplay> userDisplays) {
        Preconditions.checkNotNull(userDisplays, "userDisplays should not be null!");

        this.userDisplays = userDisplays;
    }
}