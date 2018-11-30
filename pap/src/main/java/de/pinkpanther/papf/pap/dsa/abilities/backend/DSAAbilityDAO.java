package de.pinkpanther.papf.pap.dsa.abilities.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.backend.AbilityDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

/**
 * The {@link AbilityDAO} for the DSA module.
 */
@Repository
public class DSAAbilityDAO extends AbilityDAO
{

    /**
     * Returns a {@link DSAAbilityEntity} with the given name.
     *
     * @param name Not null.
     * @return May be null.
     */
    @Nullable
    public DSAAbilityEntity getDSAAbilityByName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        return new DSAAbilityEntity(name);
    }

    /**
     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity must not be {@literal null}.
     * @return the saved entity will never be {@literal null}.
     */
    public Object save(Object entity) {
        return null;
    }

    /**
     * Retrieves an entity by its id.
     *
     * @param o must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    public Optional findById(Object o) {
        return Optional.empty();
    }

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param o must not be {@literal null}.
     * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    public boolean existsById(Object o) {
        return false;
    }

    @Nonnull
    public List findAll() {
        return null;
    }

    public List findAllById(Iterable iterable) {
        return null;
    }

    /**
     * Deletes the entity with the given id.
     *
     * @param o must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    public void deleteById(Object o) {

    }

    /**
     * Deletes a given entity.
     *
     * @param entity
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    public void delete(Object entity) {

    }

    /**
     * Returns a reference to the entity with the given identifier.
     *
     * @param o must not be {@literal null}.
     * @return a reference to the entity with the given identifier.
     * @throws EntityNotFoundException if no entity exists for given {@code id}.
     * @see EntityManager#getReference(Class, Object)
     */
    public Object getOne(Object o) {
        return null;
    }

    /**
     * Saves an entity and flushes changes instantly.
     *
     * @param entity
     * @return the saved entity
     */
    public Object saveAndFlush(Object entity) {
        return null;
    }

    /**
     * Deletes the entity with the given id.
     *
     * @param aLong must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    public void deleteById(@Nonnull Long aLong) {

    }
}