package de.pinkpanther.papf.shadowrun.frontend;

import de.pinkpanther.papf.pap.frontend.PAPDisplayObject;

import javax.annotation.Nonnull;

/**
 * The {@link PAPDisplayObject} for the shadowrun module.
 */
public class ShadowrunDisplay extends PAPDisplayObject {

    /**
     * Returns the name of the Shadowrun module.
     *
     * @return Not null.
     */
    @Nonnull
    public String getName() {
        return "Shadowrun";
    }
}
