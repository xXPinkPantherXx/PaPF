package de.pinkpanther.papf.main.config;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.Nonnull;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * The {@link WebApplicationInitializer} for PaPF.
 */
@Configuration
public class ApplicationInitializer implements WebApplicationInitializer {
    @Nonnull
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationInitializer.class);

    /**
     * Method to execute on the startup of the application.
     * Initializes the root context.
     *
     * @param container Not null.
     */
    @Override
    public void onStartup(@Nonnull final ServletContext container) {
        Preconditions.checkNotNull(container, "container should not be null!");

        LOG.debug("ApplicationInitializer#onStartup(ServletContext)");
        final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(PAPFConfig.class);

        container.addListener(new ContextLoaderListener(rootContext));

        final ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
