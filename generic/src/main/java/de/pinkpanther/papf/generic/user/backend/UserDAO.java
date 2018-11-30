package de.pinkpanther.papf.generic.user.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nonnull;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The {@link PAPFDAO} for the user.
 */
@Repository
@Transactional
public class UserDAO implements PAPFDAO<UserEntity> {

    @Nonnull
    @PersistenceContext
    private final EntityManager entityManager;

    @Autowired
    public UserDAO(@Nonnull final EntityManager entityManager) {
        Preconditions.checkNotNull(entityManager, "entityManager should not be null!");

        this.entityManager = entityManager;
    }

    public void initializeUsers() {
        final UserEntity user1 = new UserEntity("PinkPanther", "pinkpanther@email.de");
        final UserEntity user2 = new UserEntity("PinkPanther2", "pinkpanther2@email.de");
        save(user1);
        save(user2);
    }

    public List<UserEntity> findUsers() {
        final String queryStatement = "select u from UserEntity u";
        TypedQuery<UserEntity> query = entityManager.createQuery(queryStatement, UserEntity.class);
        final List<UserEntity> userEntities =  query.getResultList();
        if(userEntities == null || userEntities.isEmpty()) {
            initializeUsers();
            query = entityManager.createQuery(queryStatement, UserEntity.class);
        }
        return query.getResultList();

    }
    @Override
    @Nonnull
    public List<UserEntity> findAll() {
        final String queryStatement = "select u from UserEntity u";
        TypedQuery<UserEntity> query = entityManager.createQuery(queryStatement, UserEntity.class);
        final List<UserEntity> userEntities =  query.getResultList();
        if(userEntities == null || userEntities.isEmpty()) {
            initializeUsers();
            query = entityManager.createQuery(queryStatement, UserEntity.class);
        }
        return query.getResultList();
    }

    @Override
    @Nonnull
    public List<UserEntity> findAll(@Nonnull Sort sort) {
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
    public Page<UserEntity> findAll(@Nonnull Pageable pageable) {
        return null;
    }

    @Override
    @Nonnull
    public List<UserEntity> findAllById(@Nonnull final Iterable<Long> iterable) {
        final List<UserEntity> userEntities = new ArrayList<>();
        for(final Long id : iterable) {
            final Optional<UserEntity> userEntity = findById(id);
            if (userEntity.isPresent()) {
                userEntities.add(userEntity.get());
            }
        }

        return userEntities;
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
     * @param id must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    @Override
    public void deleteById(@Nonnull final Long id) {
        Preconditions.checkNotNull(id, "id should not be null!");

        entityManager.createQuery("delete from UserEntity where UserEntity.id = " + id, UserEntity.class);
    }

    /**
     * Deletes a given entity.
     *
     * @param entity Not null.
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    @Override
    public void delete(@Nonnull UserEntity entity) {

    }

    /**
     * Deletes the given entities.
     *
     * @param entities Not null.
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    @Override
    public void deleteAll(@Nonnull Iterable<? extends UserEntity> entities) {

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
     * @return Maybe null.
     */
    @Override
    @Nonnull
    public <S extends UserEntity> S save(@Nonnull final S entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        entityManager.persist(entity);
        return entity;
    }

    @Override
    @Nonnull
    public <S extends UserEntity> List<S> saveAll(@Nonnull Iterable<S> iterable) {
        return null;
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
    public Optional<UserEntity> findById(@Nonnull Long aLong) {
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
    @Nonnull
    public <S extends UserEntity> S saveAndFlush(@Nonnull S s) {
        return null;
    }

    @Override
    public void deleteInBatch(@Nonnull Iterable<UserEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    @Nonnull
    public UserEntity getOne(@Nonnull Long aLong) {
        return null;
    }

    /**
     * Returns a single entity matching the given {@link Example} or {@literal null} if none was found.
     *
     * @param example must not be {@literal null}.
     * @return a single entity matching the given {@link Example} or {@link Optional#empty()} if none was found.
     * @throws IncorrectResultSizeDataAccessException if the Example yields more than one result.
     */
    @Override
    @Nonnull
    public <S extends UserEntity> Optional<S> findOne(@Nonnull Example<S> example) {
        return Optional.empty();
    }

    @Override
    @Nonnull
    public <S extends UserEntity> List<S> findAll(@Nonnull Example<S> example) {
        return null;
    }

    @Override
    @Nonnull
    public <S extends UserEntity> List<S> findAll(@Nonnull Example<S> example, @Nonnull Sort sort) {
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
    @Override
    @Nonnull
    public <S extends UserEntity> Page<S> findAll(@Nonnull Example<S> example, @Nonnull Pageable pageable) {
        return null;
    }

    /**
     * Returns the number of instances matching the given {@link Example}.
     *
     * @param example the {@link Example} to count instances for. Must not be {@literal null}.
     * @return the number of instances matching the {@link Example}.
     */
    @Override
    public <S extends UserEntity> long count(@Nonnull Example<S> example) {
        return 0;
    }

    /**
     * Checks whether the data store contains elements that match the given {@link Example}.
     *
     * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
     * @return {@literal true} if the data store contains elements that match the given {@link Example}.
     */
    @Override
    public <S extends UserEntity> boolean exists(@Nonnull Example<S> example) {
        return false;
    }
}
