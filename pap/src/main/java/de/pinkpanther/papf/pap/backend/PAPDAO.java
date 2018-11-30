package de.pinkpanther.papf.pap.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

/**
 * The abstract base class of all pen and paper DAOs.
 */
@Repository
public class PAPDAO implements PAPFDAO<PAPEntity> {

    @Nonnull
    @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public PAPDAO(@Nonnull final EntityManager entityManager) {
        Preconditions.checkNotNull(entityManager, "entityManager should not be null!");

        this.entityManager = entityManager;
    }

    public void initializePAPS() {
        final PAPEntity dsa = new PAPEntity("DSA");
        save(dsa);
    }

    @Override
    public List<PAPEntity> findAll() {
        final String queryStatement = "select p from PAPEntity p";
        TypedQuery<PAPEntity> query = entityManager.createQuery(queryStatement, PAPEntity.class);
        final List<PAPEntity> papEntities =  query.getResultList();
        if(papEntities == null || papEntities.isEmpty()) {
            initializePAPS();
            query = entityManager.createQuery(queryStatement, PAPEntity.class);
        }
        return query.getResultList();
    }

    @Nonnull
    @Override
    public List<PAPEntity> findAll(@Nonnull Sort sort) {
        return null;
    }

    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    public Page<PAPEntity> findAll(@Nonnull Pageable pageable) {
        return null;
    }

    @Nonnull
    @Override
    public List<PAPEntity> findAllById(@Nonnull Iterable<Long> iterable) {
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
    public void delete(@Nonnull PAPEntity entity) {

    }

    /**
     * Deletes the given entities.
     *
     * @param entities Not null.
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    @Override
    public void deleteAll(@Nonnull Iterable<? extends PAPEntity> entities) {

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
    public <S extends PAPEntity> S save(@Nonnull S entity) {
        return null;
    }

    @Nonnull
    @Override
    public <S extends PAPEntity> List<S> saveAll(@Nonnull Iterable<S> iterable) {
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
    public Optional<PAPEntity> findById(@Nonnull Long aLong) {
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

    @Nonnull
    @Override
    public <S extends PAPEntity> S saveAndFlush(@Nonnull S s) {
        return null;
    }

    @Override
    public void deleteInBatch(@Nonnull Iterable<PAPEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Nonnull
    @Override
    public PAPEntity getOne(@Nonnull Long aLong) {
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
    public <S extends PAPEntity> Optional<S> findOne(@Nonnull Example<S> example) {
        return Optional.empty();
    }

    @Nonnull
    @Override
    public <S extends PAPEntity> List<S> findAll(@Nonnull Example<S> example) {
        return null;
    }

    @Nonnull
    @Override
    public <S extends PAPEntity> List<S> findAll(@Nonnull Example<S> example, @Nonnull Sort sort) {
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
    public <S extends PAPEntity> Page<S> findAll(@Nonnull Example<S> example, @Nonnull Pageable pageable) {
        return null;
    }

    /**
     * Returns the number of instances matching the given {@link Example}.
     *
     * @param example the {@link Example} to count instances for. Must not be {@literal null}.
     * @return the number of instances matching the {@link Example}.
     */
    @Override
    public <S extends PAPEntity> long count(@Nonnull Example<S> example) {
        return 0;
    }

    /**
     * Checks whether the data store contains elements that match the given {@link Example}.
     *
     * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
     * @return {@literal true} if the data store contains elements that match the given {@link Example}.
     */
    @Override
    public <S extends PAPEntity> boolean exists(@Nonnull Example<S> example) {
        return false;
    }
}
