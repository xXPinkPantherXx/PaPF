package de.pinkpanther.papf.main.config;

import com.google.common.base.Preconditions;
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

    /**
     * Method to execute on the startup of the application.
     * Initializes the root context.
     *
     * @param container Not null.
     */
    @Override
    public void onStartup(@Nonnull final ServletContext container) {
        Preconditions.checkNotNull(container, "container should not be null!");

        final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(PAPFConfig.class);

        container.addListener(new ContextLoaderListener(rootContext));

        final ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

//    @Bean
//    public DataSource dataSource() {
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        EmbeddedDatabase db = builder
//                .setType(EmbeddedDatabaseType.HSQL)
////                .addScript("db/sql/create-db.sql")
////                .addScript("db/sql/insert-data.sql")
//                .build();
//        return db;
//    }
}
