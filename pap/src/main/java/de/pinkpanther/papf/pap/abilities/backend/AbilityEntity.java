package de.pinkpanther.papf.pap.abilities.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.backend.PAPEntity;
import org.hibernate.annotations.DynamicUpdate;

import javax.annotation.Nonnull;
import javax.persistence.*;

/**
 * The abstract base class of all ability entities.
 */
@Entity
@DynamicUpdate
@Table(name = "ABILITY", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = {"NAME", "PAP"})
})
public abstract class AbilityEntity extends PAPEntity {

    /**
     * The id of the ability.
     */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private long id;

    /**
     * The name of the ability.
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PAP", nullable = false)
    private long pap;

    /**
     * The constructor for JPA.
     */
    public AbilityEntity() {
    }

    /**
     * Constructor with default id (= -1).
     *
     * @param name The name of the Ability.
     * @param pap  The pap the ability is used in.
     */
    public AbilityEntity(@Nonnull final String name, final long pap) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.id = -1;
        this.name = name;
        this.pap = pap;
    }

    /**
     * Full constructor.
     *
     * @param id   The id of the Ability. (-1 is an unsaved newly crated ability)
     * @param name The name of the Ability.
     */
    public AbilityEntity(final int id, @Nonnull final String name, final long pap) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.id = id;
        this.name = name;
    }

    /**
     * Sets the id of this ability.
     *
     * @param id -1 is an unsaved newly crated ability.
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * Returns the id of the ability.
     *
     * @return -1 is an unsaved newly crated ability.
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the name of the ability.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        this.name = name;
    }
}
