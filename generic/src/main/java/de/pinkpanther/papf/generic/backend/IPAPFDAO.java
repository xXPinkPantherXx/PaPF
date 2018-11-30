package de.pinkpanther.papf.generic.backend;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Optional;

public interface IPAPFDAO<T extends PAPFEntity> extends JpaRepository<T, Long> {

    @Nonnull
    @Override
    List<T> findAll();

    @Nonnull
    @Override
    List<T> findAll(@Nonnull final Sort sort);

    @Nonnull
    @Override
    Page<T> findAll(@Nonnull final Pageable pageable);

    @Nonnull
    @Override
    List<T> findAllById(@Nonnull final Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(@Nonnull final Long aLong);

    @Override
    void delete(@Nonnull final T entity);

    @Override
    void deleteAll(@Nonnull final Iterable<? extends T> entities);

    @Override
    void deleteAll();

    @Nonnull
    @Override
    <S extends T> S save(@Nonnull final S entity);

    @Nonnull
    @Override
    <S extends T> List<S> saveAll(@Nonnull final Iterable<S> iterable);

    @Nonnull
    @Override
    Optional<T> findById(@Nonnull final Long aLong);

    @Override
    boolean existsById(@Nonnull final Long aLong);

    @Override
    void flush();

    @Nonnull
    @Override
    <S extends T> S saveAndFlush(@Nonnull final S s);

    @Override
    void deleteInBatch(@Nonnull final Iterable<T> iterable);

    @Override
    void deleteAllInBatch();

    @Nonnull
    @Override
    T getOne(@Nonnull final Long aLong);

    @Nonnull
    @Override
    <S extends T> Optional<S> findOne(@Nonnull final Example<S> example);

    @Nonnull
    @Override
    <S extends T> List<S> findAll(@Nonnull final Example<S> example);

    @Nonnull
    @Override
    <S extends T> List<S> findAll(@Nonnull final Example<S> example, @Nonnull final Sort sort);

    @Nonnull
    @Override
    <S extends T> Page<S> findAll(@Nonnull final Example<S> example, @Nonnull final Pageable pageable);

    @Override
    <S extends T> long count(@Nonnull final Example<S> example);

    @Override
    <S extends T> boolean exists(@Nonnull Example<S> example);
}
