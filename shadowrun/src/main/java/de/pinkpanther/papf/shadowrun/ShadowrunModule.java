package de.pinkpanther.papf.shadowrun;

import com.google.common.collect.Lists;
import de.pinkpanther.papf.pap.PAPModule;
import de.pinkpanther.papf.shadowrun.abilities.facade.ShadowrunAbilityFacade;
import de.pinkpanther.papf.shadowrun.backend.ShadowrunEntity;
import de.pinkpanther.papf.shadowrun.backend.ShadowrunService;
import de.pinkpanther.papf.shadowrun.facade.Shadowrun;
import de.pinkpanther.papf.shadowrun.facade.ShadowrunFacade;
import de.pinkpanther.papf.shadowrun.frontend.ShadowrunDisplay;
import de.pinkpanther.papf.shadowrun.frontend.ShadowrunPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class ShadowrunModule
        extends PAPModule<ShadowrunEntity, ShadowrunService, ShadowrunDisplay, ShadowrunPresenter, Shadowrun, ShadowrunFacade> {

    @Nonnull
    private ShadowrunAbilityFacade abilityFacade;

    @Autowired
    public ShadowrunModule(@Nonnull final ShadowrunAbilityFacade abilityFacade) {
        super(Lists.newArrayList(abilityFacade));

        this.abilityFacade = abilityFacade;
    }
}
