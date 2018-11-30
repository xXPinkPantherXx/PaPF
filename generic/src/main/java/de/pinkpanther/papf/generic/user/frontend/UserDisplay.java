package de.pinkpanther.papf.generic.user.frontend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.frontend.PAPFDisplayObject;

import javax.annotation.Nonnull;
import java.io.Serializable;

/**
 * The {@link PAPFDisplayObject} for the user.
 */
public class UserDisplay extends PAPFDisplayObject implements Serializable {
    private static final long serialVersionUID = 7600803961972923275L;

    /**
     * The name of the user display.
     */
    @Nonnull
    private String name;

    /**
     * The email of the user display.
     */
    @Nonnull
    private String email;

    /**
     * The minimal constructor.
     *
     * @param name Not null.
     * @param email Not null.
     */
    public UserDisplay(@Nonnull final String name, @Nonnull final String email) {
        Preconditions.checkNotNull(name, "name should not be null!");
        Preconditions.checkNotNull(email, "email should not be null!");

        this.name = name;
        this.email = email;
    }

    /**
     * Returns the name of the user display.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user display.
     *
     * @param name Not null.
     */
    public void setName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the email of the user display.
     *
     * @return Not null.
     */
    @Nonnull
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user display.
     *
     * @param email Not null.
     */
    public void setEmail(@Nonnull final String email) {
        Preconditions.checkNotNull(email, "email should not be null!");

        this.email = email;
    }

    @Nonnull
    @Override
    public String toString() {
        return "UserDisplay{" +
                "name='" + name + "'" +
                ", email='" + email + "'" +
                '}';
    }
}