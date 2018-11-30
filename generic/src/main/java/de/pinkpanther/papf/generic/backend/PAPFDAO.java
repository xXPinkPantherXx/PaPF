package de.pinkpanther.papf.generic.backend;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.data.domain.*;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The abstract base class of all DAOs.
 */
public abstract class PAPFDAO<T extends PAPFEntity> implements IPAPFDAO<T> {

    @Nonnull
    @Override
    public List<T> findAll(@Nonnull final Sort sort) {
        return new ArrayList<>();
    }

    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    @Nonnull
    @Override
    public Page<T> findAll(@Nonnull final Pageable pageable) {
        return new PageImpl<>(new ArrayList<>());
    }

    @Nonnull
    @Override
    public abstract List<T> findAllById(@Nonnull final Iterable<Long> iterable);

    /**
     * Returns the number of entities available.
     *
     * @return the number of entities
     */
    @Override
    public long count() {
        return findAll().size();
    }

    /**
     * Deletes the entity with the given id.
     *
     * @param aLong must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    @Override
    public abstract void deleteById(@Nonnull final Long aLong);

    /**
     * Deletes a given entity.
     *
     * @param entity Not null.
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    @Override
    public void delete(@Nonnull final T entity) {

    }

    /**
     * Deletes the given entities.
     *
     * @param entities Not null.
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    @Override
    public void deleteAll(@Nonnull final Iterable<? extends T> entities) {

    }

    /**
     * Deletes all entities managed by the repository.
     */
    @Override
    public void deleteAll() {

    }

    /**
     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity Not null.
     * @return the saved entity will never be {@literal null}.
     */
    @Nonnull
    @Override
    public <S extends T> S save(@Nonnull final S entity) {
        return entity;
    }

    @Nonnull
    @Override
    public <S extends T> List<S> saveAll(@Nonnull final Iterable<S> iterable) {
        return null;
    }

    /**
     * Retrieves an entity by its id.
     *
     * @param aLong must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    @Nonnull
    @Override
    public Optional<T> findById(@Nonnull final Long aLong) {
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
    public boolean existsById(@Nonnull final Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Nonnull
    @Override
    public <S extends T> S saveAndFlush(@Nonnull final S s) {
        return null;
    }

    @Override
    public void deleteInBatch(@Nonnull final Iterable<T> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Nonnull
    @Override
    public T getOne(@Nonnull final Long aLong) {
        return null;
    }

    /**
     * Returns a single entity matching the given {@link Example} or {@literal null} if none was found.
     *
     * @param example must not be {@literal null}.
     * @return a single entity matching the given {@link Example} or {@link Optional#empty()} if none was found.
     * @throws IncorrectResultSizeDataAccessException if the Example yields more than one result.
     */
    @Nonnull
    @Override
    public <S extends T> Optional<S> findOne(@Nonnull final Example<S> example) {
        return Optional.empty();
    }

    @Nonnull
    @Override
    public <S extends T> List<S> findAll(@Nonnull final Example<S> example) {
        return null;
    }

    @Override
    public <S extends T> List<S> findAll(@Nonnull final Example<S> example, @Nonnull Sort sort) {
        return null;
    }

    /**
     * Returns a {@link Page} of entities matching the given {@link Example}. In case no match could be found, an empty
     * {@link Page} is returned.
     *
     * @param example  must not be {@literal null}.
     * @param pageable can be {@literal null}.
     * @return a {@link Page} of entities matching the given {@link Example}.
     */
    @Nonnull
    @Override
    public <S extends T> Page<S> findAll(@Nonnull final Example<S> example, @Nonnull final Pageable pageable) {
        return null;
    }

    /**
     * Returns the number of instances matching the given {@link Example}.
     *
     * @param example the {@link Example} to count instances for. Must not be {@literal null}.
     * @return the number of instances matching the {@link Example}.
     */
    @Override
    public <S extends T> long count(@Nonnull final Example<S> example) {
        return 0;
    }

    /**
     * Checks whether the data store contains elements that match the given {@link Example}.
     *
     * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
     * @return {@literal true} if the data store contains elements that match the given {@link Example}.
     */
    @Override
    public <S extends T> boolean exists(@Nonnull final Example<S> example) {
        return false;
    }


}
