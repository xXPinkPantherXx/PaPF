package de.pinkpanther.papf.main.controller;

import de.pinkpanther.papf.main.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;

/**
 * The controller for the dashboard.
 */
@RestController
public class DashboardController {
    @Nonnull
    private static final Logger LOG = LoggerFactory.getLogger(DashboardController.class);

    /**
     * Returns the welcome-{@link ModelAndView}
     *
     * @return Not null.
     */
    @Nonnull
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        LOG.debug("DashboardController#welcome");
        final ModelAndView model = new ModelAndView();
        model.setViewName("welcome");
        return model;
    }

    /**
     * Returns data for the user list.
     *
     * @return Not null.
     */
    @Nonnull
    @RequestMapping(value = "/userlist", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody List<User> getUsers() {
        LOG.debug("DashboardController#getUsers");
        final User user = new User("John Doe", "johndoe123@gmail.com" , "Bangalore, Karnataka");
        final User user1 = new User("Amit Singh", "amitsingh@yahoo.com", "Chennai, Tamilnadu");
        final User user2 = new User("Bipul Kumar", "bipulkumar@gmail.com", "Bangalore, Karnataka");
        final User user3 = new User("Prakash Ranjan", "prakashranjan@gmail.com", "Chennai, Tamilnadu");
        return Arrays.asList(user, user1, user2, user3);
    }
}