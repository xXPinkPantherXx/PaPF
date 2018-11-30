package de.pinkpanther.papf.generic.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The  for the user.
 */
@Component
public class UserModule
//        extends PAPFModule
{
    @Nonnull
    private final static Logger LOG = LoggerFactory.getLogger(UserModule.class);

    /**
     * The constructor.
     */
    protected UserModule() {
        super();
    }

    @Nonnull
    public String getName() {
        return "UserModule";
    }
}