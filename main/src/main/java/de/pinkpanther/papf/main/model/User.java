package de.pinkpanther.papf.main.model;

import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import java.io.Serializable;

/**
 * The model for a User of the Application.
 */
@SuppressWarnings("unused")
public class User implements Serializable {

    private static final long serialVersionUID = 1341777822890090228L;

    /**
     * The name of the User.
     */
    @Nonnull
    private String name;

    /**
     * The email of the User.
     */
    @Nonnull
    private String email;

    /**
     * The address of the User.
     */
    @Nonnull
    private String address;

    /**
     * The minimal constructor.
     *
     * @param name Not null.
     * @param email Not null.
     * @param address Not null.
     */
    public User(@Nonnull final String name, @Nonnull final String email, @Nonnull final String address) {
        Preconditions.checkNotNull(name, "name should not be null!");
        Preconditions.checkNotNull(email, "email should not be null!");
        Preconditions.checkNotNull(address, "address should not be null!");

        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * Returns the name of the User.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the User.
     *
     * @param name Not null.
     */
    public void setName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the email of the User.
     *
     * @return Not null.
     */
    @Nonnull
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the User.
     *
     * @param email Not null.
     */
    public void setEmail(@Nonnull final String email) {
        Preconditions.checkNotNull(email, "email should not be null!");

        this.email = email;
    }

    /**
     * Returns the address of the User.
     *
     * @return Not null.
     */
    @Nonnull
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the User.
     *
     * @param address Not null.
     */
    public void setAddress(@Nonnull final String address) {
        Preconditions.checkNotNull(address, "address should not be null!");

        this.address = address;
    }

    @Nonnull
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}