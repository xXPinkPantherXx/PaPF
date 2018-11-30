package de.pinkpanther.papf.main.overview.backend;

import de.pinkpanther.papf.generic.backend.PAPFDAO;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Optional;

/**
 * The {@link PAPFDAO} for the overview.
 */
public class OverviewDAO extends PAPFDAO {
    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Nonnull
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public List findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public Object getOne(Object o) {
        return null;
    }

    @Override
    public Object saveAndFlush(Object o) {
        return null;
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
}
