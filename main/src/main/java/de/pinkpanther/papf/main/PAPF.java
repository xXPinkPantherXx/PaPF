package de.pinkpanther.papf.main;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.Nonnull;

/**
 * The main-class of Pen and Paper Friend.
 */
@SpringBootApplication
public class PAPF extends SpringBootServletInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(PAPF.class);

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

        return builder.sources(PAPF.class);
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
