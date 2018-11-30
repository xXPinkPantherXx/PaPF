package de.pinkpanther.papf.main.overview.backend;

import de.pinkpanther.papf.generic.backend.PAPFDAO;
import de.pinkpanther.papf.generic.backend.PAPFEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Optional;

/**
 * The {@link PAPFDAO} for the overview.
 */
public class OverviewDAO implements PAPFDAO {
    @Override
    @Nonnull
    public Object save(@Nonnull final Object o) {
        return null;
    }

    @Override
    @Nonnull
    public Optional findById(@Nonnull final Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(@Nonnull final Object o) {
        return false;
    }

    @Override
    @Nonnull
    public List findAll() {
        return null;
    }

    @Override
    @Nonnull
    public List findAllById(@Nonnull final Iterable iterable) {
        return null;
    }

    @Override
    public void deleteById(@Nonnull final Object o) {

    }

    @Override
    public void delete(@Nonnull final Object o) {

    }

    @Override
    @Nonnull
    public Object getOne(@Nonnull final Object o) {
        return null;
    }

    @Override
    @Nonnull
    public Object saveAndFlush(@Nonnull final Object o) {
        return null;
    }

    @Override
    @Nonnull
    public List findAll(@Nonnull Sort sort) {
        return null;
    }

    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable Not null.
     * @return Not null.
     */
    @Override
    @Nonnull
    public Page findAll(@Nonnull Pageable pageable) {
        return null;
    }

    /**
     * Returns the number of entities available.
     *
     * @return the number of entities
     */
    @Override
    public long count() {
        return 0;
    }

    /**
     * Deletes the entity with the given id.
     *
     * @param aLong must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    @Override
    public void deleteById(@Nonnull Long aLong) {

    }

    /**
     * Deletes a given entity.
     *
     * @param entity Not null.
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    @Override
    public void delete(@Nonnull PAPFEntity entity) {

    }

    /**
     * Deletes the given entities.
     *
     * @param entities Not null.
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    @Override
    public void deleteAll(@Nonnull Iterable entities) {

    }

    /**
     * Deletes all entities managed by the repository.
     */
    @Override
    public void deleteAll() {

    }

    /**
     * Retrieves an entity by its id.
     *
     * @param aLong must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    @Override
    @Nonnull
    public Optional findById(@Nonnull Long aLong) {
        return Optional.empty();
    }

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param aLong must not be {@literal null}.
     * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    @Override
    public boolean existsById(@Nonnull Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteInBatch(@Nonnull Iterable iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    @Nonnull
    public PAPFEntity getOne(@Nonnull Long aLong) {
        return null;
    }

    /**
     * Checks whether the data store contains elements that match the given {@link Example}.
     *
     * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
     * @return {@literal true} if the data store contains elements that match the given {@link Example}.
     */
    @Override
    public boolean exists(@Nonnull Example example) {
        return false;
    }

    /**
     * Returns the number of instances matching the given {@link Example}.
     *
     * @param example the {@link Example} to count instances for. Must not be {@literal null}.
     * @return the number of instances matching the {@link Example}.
     */
    @Override
    public long count(@Nonnull Example example) {
        return 0;
    }

    /**
     * Returns a {@link Page} of entities matching the given {@link Example}. In case no match could be found, an empty
     * {@link Page} is returned.
     *
     * @param example  must not be {@literal null}.
     * @param pageable can be {@literal null}.
     * @return a {@link Page} of entities matching the given {@link Example}.
     */
    @Override
    @Nonnull
    public Page findAll(@Nonnull Example example, @Nonnull Pageable pageable) {
        return null;
    }

    @Override
    @Nonnull
    public List findAll(@Nonnull Example example, @Nonnull Sort sort) {
        return null;
    }

    @Override
    @Nonnull
    public List findAll(@Nonnull Example example) {
        return null;
    }

    /**
     * Returns a single entity matching the given {@link Example} or {@literal null} if none was found.
     *
     * @param example must not be {@literal null}.
     * @return a single entity matching the given {@link Example} or {@link Optional#empty()} if none was found.
     */
    @Override
    @Nonnull
    public Optional findOne(@Nonnull Example example) {
        return Optional.empty();
    }

    @Override
    @Nonnull
    public PAPFEntity saveAndFlush(@Nonnull PAPFEntity entity) {
        return null;
    }

    @Override
    @Nonnull
    public List saveAll(@Nonnull Iterable iterable) {
        return null;
    }

    /**
     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity Not null.
     * @return the saved entity will never be {@literal null}.
     */
    @Override
    @Nonnull
    public PAPFEntity save(@Nonnull PAPFEntity entity) {
        return null;
    }
}
