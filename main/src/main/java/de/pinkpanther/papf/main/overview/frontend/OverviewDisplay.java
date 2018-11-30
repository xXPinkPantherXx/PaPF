package de.pinkpanther.papf.main.overview.frontend;

import de.pinkpanther.papf.generic.frontend.PAPFDisplayObject;

import javax.annotation.Nonnull;

/**
 * The {@link PAPFDisplayObject} for the overview.
 */
public class OverviewDisplay implements PAPFDisplayObject {

    /**
     * Returns the name of this overview display.
     *
     * @return Not null.
     */
    @Override
    @Nonnull
    public String getName() {
        return "Overview";
    }
}
