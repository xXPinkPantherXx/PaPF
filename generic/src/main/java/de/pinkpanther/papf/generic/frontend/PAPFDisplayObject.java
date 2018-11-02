package de.pinkpanther.papf.generic.frontend;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all display objects.
 */
public abstract class PAPFDisplayObject {

    /**
     * Returns the name of this display object.
     *
     * @return Not null.
     */
    @Nonnull
    public abstract String getName();
}
