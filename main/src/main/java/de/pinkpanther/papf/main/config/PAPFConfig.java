package de.pinkpanther.papf.main.config;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Nonnull;

/**
 * {@link WebMvcConfigurer} for PaPF.
 */
@Configuration
public class PAPFConfig extends WebMvcAutoConfiguration.EnableWebMvcConfiguration {

    public PAPFConfig(final ObjectProvider<WebMvcProperties> mvcPropertiesProvider,
                      final ObjectProvider<WebMvcRegistrations> mvcRegistrationsProvider, ListableBeanFactory beanFactory) {
        super(mvcPropertiesProvider, mvcRegistrationsProvider, beanFactory);
    }

    /**
     * This method adds resource handlers for js and css.
     *
     * @param registry Not null.
     */
    @Override
    public void addResourceHandlers(@Nonnull final ResourceHandlerRegistry registry) {
        Preconditions.checkNotNull(registry, "registry should not be null!");

        registry.addResourceHandler("/*.js/**").addResourceLocations("/styles/");
        registry.addResourceHandler("/*.css/**").addResourceLocations("/styles/");
    }

    @Override
    public void configurePathMatch(@Nonnull final PathMatchConfigurer configurer) {
        Preconditions.checkNotNull(configurer, "configurer should not be null!");

        super.configurePathMatch(configurer);
        configurer.setUseRegisteredSuffixPatternMatch(false);
        configurer.setUseSuffixPatternMatch(false);
    }
}