package de.pinkpanther.papf.generic.backend;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * A util class used for hibernate.
 */
public class HibernateUtil {

    /**
     * Logger for this class.
     */
    @Nonnull
    private final static Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);

    /**
     * Factory for all database sessions.
     */
    @Nonnull
    private static SessionFactory sessionFactory = buildSessionFactory();

    /**
     * Factory for all database sessions.
     */
    @Nonnull
    @PersistenceContext
    private static EntityManager entityManager = buildEntityManager();

    /**
     * Builds the session factory for the database.
     *
     * @return Not null.
     */
    @Nonnull
    private static SessionFactory buildSessionFactory() {
        LOG.error("building session factory!");
        try {
            if (sessionFactory == null) {
                final Configuration configuration = new Configuration();
//                final URL configurationURL = HibernateUtil.class.getResource("/src/hibernate.cfg.xml");
                configuration.configure();
                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
                serviceRegistryBuilder.applySettings(configuration.getProperties());
                ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
                Class jdbcDiverObject = Class.forName("org.hsqldb.jdbcDriver");
                LOG.warn(jdbcDiverObject.getCanonicalName());
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            }
            LOG.debug("SessionFactory created.");
            return sessionFactory;
        } catch (final Throwable ex) {
            LOG.error("Initial SessionFactory creation failed.", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    @Nonnull
    private static EntityManager buildEntityManager() {
        if (entityManager == null) {
            entityManager = sessionFactory.createEntityManager();
        }

        return entityManager;
    }

    /**
     * Returns the session factory for the database.
     *
     * @return Not null.
     */
    @Nonnull
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Shutdown the session factory for the database.
     */
    public static void shutdown() {
        getSessionFactory().close();
    }
}