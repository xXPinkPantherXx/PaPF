package de.pinkpanther.papf.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.annotation.Nonnull;

/**
 * Class for all basic {@link Bean} configurations.
 */
@Configuration
public class ViewResolverConfig {

    /**
     * Method to setup the {@link InternalResourceViewResolver}.
     *
     * @return Not null.
     */
    @Nonnull
    @Bean
    public InternalResourceViewResolver setupViewResolver()  {
        final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix ("/WEB-INF/view/");
        resolver.setSuffix (".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}