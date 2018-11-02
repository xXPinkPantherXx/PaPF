package de.pinkpanther.papf.shadowrun.characters.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.characters.facade.CharacterFacade;
import de.pinkpanther.papf.shadowrun.characters.backend.ShadowrunCharacterEntity;
import de.pinkpanther.papf.shadowrun.characters.backend.ShadowrunCharacterService;
import de.pinkpanther.papf.shadowrun.characters.frontend.ShadowrunCharacterDisplay;
import de.pinkpanther.papf.shadowrun.characters.frontend.ShadowrunCharacterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

/**
 * The {@link CharacterFacade} for the shadowrun module.
 */
@Service
public class ShadowrunCharacterFacade extends CharacterFacade<ShadowrunCharacterEntity, ShadowrunCharacter, ShadowrunCharacterDisplay> {

    /**
     * The {@link de.pinkpanther.papf.pap.characters.backend.CharacterService} for the shadowrun module.
     */
    @Nonnull
    private final ShadowrunCharacterService shadowrunService;

    /**
     * The {@link de.pinkpanther.papf.pap.characters.frontend.CharacterView} for the shadowrun module.
     */
    @Nonnull
    private final ShadowrunCharacterView shadowrunCharacterView;

    /**
     * Autowired constructor.
     *
     * @param shadowrunService Not null.
     * @param shadowrunCharacterView Not null.
     */
    @Autowired
    public ShadowrunCharacterFacade(@Nonnull final ShadowrunCharacterService shadowrunService,
                                    @Nonnull final ShadowrunCharacterView shadowrunCharacterView) {
        Preconditions.checkNotNull(shadowrunService, "shadowrunService should not be null!");
        Preconditions.checkNotNull(shadowrunCharacterView, "shadowrunCharacterView should not be null!");

        this.shadowrunService = shadowrunService;
        this.shadowrunCharacterView = shadowrunCharacterView;
    }

    /**
     * Converts a {@link ShadowrunCharacterEntity} into a {@link ShadowrunCharacterDisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    @Override
    protected ShadowrunCharacterDisplay convertEntityToDisplay(@Nonnull final ShadowrunCharacterEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new ShadowrunCharacterDisplay(entity.getName());
    }
}
