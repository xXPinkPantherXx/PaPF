package de.pinkpanther.papf.shadowrun.abilities.backend;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.abilities.backend.AbilityDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * The {@link AbilityDAO} for the shadowrun module.
 */
@Repository
public class ShadowrunAbilityDAO extends AbilityDAO {

    /**
     * Returns a {@link ShadowrunAbilityEntity} with the given name.
     *
     * @param name Not null.
     * @return May be null.
     */
    @Nullable
    public ShadowrunAbilityEntity getShadowrunAbilityByName(@Nonnull final String name) {
        Preconditions.checkNotNull(name, "name should not be null!");

        return new ShadowrunAbilityEntity(name);
    }
}