package de.pinkpanther.papf.main;

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

@Configuration
public class ApplicationInitializer implements WebApplicationInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationInitializer.class);

    @Override
    public void onStartup(@Nonnull final ServletContext container) {
        Preconditions.checkNotNull(container, "'container' should not be null!");

        LOG.debug("onStartup!");
        final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(PAPFConfiguration.class);

        container.addListener(new ContextLoaderListener(rootContext));

        final ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
