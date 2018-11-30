package de.pinkpanther.papf.pap.shadowrun;

import de.pinkpanther.papf.pap.PAP;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component
public class Shadowrun extends PAP {
    @Nonnull
    @Override
    public String getName() {
        return "Shadowrun";
    }
}
