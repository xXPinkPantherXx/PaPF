package de.pinkpanther.papf.pap.dsa;

import de.pinkpanther.papf.pap.PAP;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * The {@link PAP}-class for DSA.
 */
@Component
public class DSA extends PAP {

    public DSA() {
        super();
        setActive(false);
    }

    @Nonnull
    public String getName() {
        return "DSA";
    }

}