package de.pinkpanther.papf.main.frontend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Nonnull;

/**
 * The controller for the dashboard.
 */
@RestController
public class DashboardPresenter {
    @Nonnull
    private static final Logger LOG = LoggerFactory.getLogger(DashboardPresenter.class);

    /**
     * Returns the welcome-{@link ModelAndView}
     *
     * @return Not null.
     */
    @Nonnull
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        LOG.debug("DashboardController#welcome");
        return new ModelAndView("dashboard");
    }
}