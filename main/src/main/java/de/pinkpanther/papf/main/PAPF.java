package de.pinkpanther.papf.main;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.generic.user.UserModule;
import de.pinkpanther.papf.main.config.ApplicationInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Nonnull;

/**
 * The main-class of Pen and Paper Friend.
 */
@SpringBootApplication
@ComponentScan({"de.pinkpanther.papf"})
@EntityScan(basePackages = {"de.pinkpanther.papf.**.backend"})
public class PAPF extends SpringBootServletInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(PAPF.class);

    @Nonnull
    private final UserModule userModule;

    @Autowired
    public PAPF(@Nonnull final UserModule userModule) {
        Preconditions.checkNotNull(userModule, "userModule should not be null!");

        this.userModule = userModule;
    }

    /**
     * Spring-Configuration Method for this project.
     *
     * @param builder Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected SpringApplicationBuilder configure(@Nonnull final SpringApplicationBuilder builder) {
        Preconditions.checkNotNull(builder, "builder should not be null!");

        return builder.sources(PAPF.class, ApplicationInitializer.class);
    }

    /**
     * The main method of PaPF.
     *
     * @param args Not null.
     */
    public static void main(@Nonnull final String[] args) {
        Preconditions.checkNotNull(args, "args should not be null!");

        LOG.debug("Starting application!");
        SpringApplication.run(PAPF.class, args);
        LOG.debug("Ending application!");
    }
}

