package de.pinkpanther.papf.pap.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFEntity;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.DynamicUpdate;

import javax.annotation.Nonnull;
import javax.persistence.*;

/**
 * The {@link PAPFEntity} for paps.
 */
@Entity
@DynamicUpdate
@Table(name = "PAP", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "NAME")
})
public class PAPEntity extends PAPFEntity {
    private static final long serialVersionUID = 283256326842132723L;


    /**
     * The id of the pap.
     */
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    @Check(constraints = "ID > 0")
    private long id;

    /**
     * The name of the pap.
     */
    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    /**
     * Constructor to make hibernate happy.
     */
    public PAPEntity(){}

    /**
     * The minimal constructor.
     *
     * @param name    Not null.
     */
    public PAPEntity(@Nonnull final String name){
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
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
}
