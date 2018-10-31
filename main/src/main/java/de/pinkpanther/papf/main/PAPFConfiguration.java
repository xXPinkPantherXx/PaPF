package de.pinkpanther.papf.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PAPFConfiguration implements WebMvcConfigurer {
    private static final Logger LOG = LoggerFactory.getLogger(PAPFConfiguration.class);

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        LOG.debug("WebConfig");
//        registry.addResourceHandler("/*.js/**").addResourceLocations("/styles/");
//        registry.addResourceHandler("/*.css/**").addResourceLocations("/styles/");
    }
}
