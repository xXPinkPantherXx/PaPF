package de.pinkpanther.papf.generic.user.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.backend.PAPFDAO;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserDAO extends PAPFDAO<UserEntity> {

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

    @Nonnull
    @Override
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

    @Nonnull
    @Override
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
     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity Not null.
     * @return Maybe null.
     */
    @Nonnull
    @Override
    public <S extends UserEntity> S save(@Nonnull final S entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        entityManager.persist(entity);
        return entity;
    }
}
