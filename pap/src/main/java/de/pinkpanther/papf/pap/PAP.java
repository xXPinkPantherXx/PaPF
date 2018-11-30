package de.pinkpanther.papf.pap;

import javax.annotation.Nonnull;

/**
 * The abstract base class of all paps in this application.
 * (If you need some kind of additional initialization just override {@link PAP#initialize()}).
 */
public abstract class PAP {

    private boolean active = true;

    /**
     * The constructor.
     */
    protected PAP() {
        initialize();
    }

    public void initialize(){}

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    @Nonnull
    public abstract String getName();
}
