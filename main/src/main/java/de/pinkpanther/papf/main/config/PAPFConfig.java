package de.pinkpanther.papf.main.config;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Nonnull;

/**
 * {@link WebMvcConfigurer} for PaPF.
 */
@Configuration
public class PAPFConfig implements WebMvcConfigurer {
    @Nonnull
    private static final Logger LOG = LoggerFactory.getLogger(PAPFConfig.class);

    /**
     * This method adds resource handlers for js and css.
     *
     * @param registry Not null.
     */
    @Override
    public void addResourceHandlers(@Nonnull final ResourceHandlerRegistry registry) {
        Preconditions.checkNotNull(registry, "registry should not be null!");

        LOG.debug("WebConfig");
        registry.addResourceHandler("/*.js/**").addResourceLocations("/styles/");
        registry.addResourceHandler("/*.css/**").addResourceLocations("/styles/");
    }
}