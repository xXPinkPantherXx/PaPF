package de.pinkpanther.papf.pap.dsa.frontend;

import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;

import javax.annotation.Nonnull;

/**
 * The {@link PAPDisplayObject} for the DSA module.
 */
public class DSADisplay implements PAPDisplayObject {

    /**
     * Returns the name of the DSA module.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return "DSA";
    }
}
