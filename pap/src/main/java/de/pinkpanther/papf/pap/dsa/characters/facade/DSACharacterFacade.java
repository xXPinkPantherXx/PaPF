package de.pinkpanther.papf.pap.dsa.characters.facade;

import com.google.common.base.Preconditions;
import de.pinkpanther.papf.pap.characters.facade.CharacterFacade;
import de.pinkpanther.papf.pap.dsa.characters.backend.DSACharacterEntity;
import de.pinkpanther.papf.pap.dsa.characters.backend.DSACharacterService;
import de.pinkpanther.papf.pap.dsa.characters.frontend.DSACharacterDisplay;
import de.pinkpanther.papf.pap.dsa.characters.frontend.DSACharacterView;

import javax.annotation.Nonnull;

/**
 * The {@link CharacterFacade} for the DSA module.
 */
public class DSACharacterFacade
//        extends CharacterFacade<DSACharacterEntity, DSACharacter, DSACharacterDisplay>
{

    /**
     * The {@link de.pinkpanther.papf.pap.characters.backend.CharacterService} for the DSA module.
     */
    @Nonnull
    private final DSACharacterService DSAService;

    /**
     * The {@link de.pinkpanther.papf.pap.characters.frontend.CharacterView} for the DSA module.
     */
    @Nonnull
    private final DSACharacterView DSACharacterView;

    /**
     * Autowired constructor.
     *
     * @param DSAService Not null.
     * @param DSACharacterView Not null.
     */
    public DSACharacterFacade(@Nonnull final DSACharacterService DSAService,
                                    @Nonnull final DSACharacterView DSACharacterView) {
        Preconditions.checkNotNull(DSAService, "DSAService should not be null!");
        Preconditions.checkNotNull(DSACharacterView, "DSACharacterView should not be null!");

        this.DSAService = DSAService;
        this.DSACharacterView = DSACharacterView;
    }

    /**
     * Converts a {@link DSACharacterEntity} into a {@link DSACharacterDisplay}.
     *
     * @param entity Not null.
     * @return Not null.
     */
    @Nonnull
    protected DSACharacterDisplay convertEntityToDisplay(@Nonnull final DSACharacterEntity entity) {
        Preconditions.checkNotNull(entity, "entity should not be null!");

        return new DSACharacterDisplay(entity.getName());
    }
}
