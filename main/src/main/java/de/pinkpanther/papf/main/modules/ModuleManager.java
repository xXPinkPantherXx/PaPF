package de.pinkpanther.papf.main.modules;

import de.pinkpanther.papf.generic.PAPFModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.util.List;

@Component
public class ModuleManager {

    @Nonnull
    private final List<PAPFModule> modules;

    @Autowired
    public ModuleManager(@Nonnull final List<PAPFModule> modules) {
        this.modules = modules;
    }
}
