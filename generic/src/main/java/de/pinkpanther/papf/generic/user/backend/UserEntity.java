package de.pinkpanther.papf.generic.user.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFEntity;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.DynamicUpdate;

import javax.annotation.Nonnull;
import javax.persistence.*;

/**
 * The {@link PAPFEntity} for the user entity.
 */
@Entity
@DynamicUpdate
@Table(name = "USER", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "EMAIL")
})
public class UserEntity extends PAPFEntity<UserEntity> {
    private static final long serialVersionUID = 8477830552845508012L;
    /**
     * The id of the {@link PAPFEntity}.
     */
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    @Check(constraints = "ID > 0")
    private long id;

    /**
     * The name of the user entity.
     */
    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    /**
     * The email of the user entity.
     */
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    public UserEntity() {}

    /**
     * Copy constructor.
     *
     * @param userEntity Not null.
     */
    public UserEntity(@Nonnull final UserEntity userEntity) {
        Preconditions.checkNotNull(userEntity, "userEntity should not be null!");

        this.id = userEntity.id;
        this.name = userEntity.name;
        this.email = userEntity.email;
    }

    /**
     * The minimal constructor.
     *
     * @param name    Not null.
     * @param email   Not null.
     */
    public UserEntity(@Nonnull final String name, @Nonnull final String email) {
        Preconditions.checkNotNull(name, "name should not be null!");
        Preconditions.checkNotNull(email, "email should not be null!");

        this.name = name;
        this.email = email;
    }

    /**
     * The full constructor.
     *
     * @param id      Must be a value > 0.
     * @param name    Not null.
     * @param email   Not null.
     */
    public UserEntity(final long id, @Nonnull final String name, @Nonnull final String email) {
        Preconditions.checkArgument(id > 0, "id should not be <= 0!");
        Preconditions.checkNotNull(name, "name should not be null!");
        Preconditions.checkNotNull(email, "email should not be null!");

        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Returns the id of the user entity.
     *
     * @return A value > 0.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id of the user entity.
     *
     * @param id A value > 0.
     */
    public void setId(final long id) {
        Preconditions.checkArgument(id > 0, "id should not be <= 0!");

        this.id = id;
    }

    /**
     * Returns the name of the user entity.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user entity.
     *
     * @param name Not null.
     */
    public void setName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }

    /**
     * Returns the email of the user entity.
     *
     * @return Not null.
     */
    @Nonnull
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user entity.
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
        return "User {" +
                "name='" + name + "'" +
                ", email='" + email + "'" +
                '}';
    }
}