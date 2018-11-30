package de.pinkpanther.papf.generic.user.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.facade.PAPFFacadeObject;

import javax.annotation.Nonnull;

/**
 * The {@link PAPFFacadeObject} for the user.
 */
public class User extends PAPFFacadeObject {

    private static final long serialVersionUID = 1341777822890090228L;

    /**
     * The name of the user.
     */
    @Nonnull
    private String name;

    /**
     * The email of the user.
     */
    @Nonnull
    private String email;

    /**
     * The minimal constructor.
     *
     * @param name Not null.
     * @param email Not null.
     */
    public User(@Nonnull final String name, @Nonnull final String email) {
        Preconditions.checkNotNull(name, "name should not be null!");
        Preconditions.checkNotNull(email, "email should not be null!");

        this.name = name;
        this.email = email;
    }

    /**
     * Returns the name of the user.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name Not null.
     */
    public void setName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the email of the user.
     *
     * @return Not null.
     */
    @Nonnull
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user.
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
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}