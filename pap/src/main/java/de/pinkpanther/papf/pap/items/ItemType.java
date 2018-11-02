package de.pinkpanther.papf.pap.items;

import javax.annotation.Nonnull;

/**
 * An interface used to mark item type enums.
 */
public interface ItemType {

    /**
     * Returns the name of the item type.
     *
     * @return Not null.
     */
    @Nonnull
    String getName();
}
