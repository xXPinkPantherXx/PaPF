package de.pinkpanther.papf.pap;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PAPManager {

    @Nonnull
    private final static Logger LOG = LoggerFactory.getLogger(PAPManager.class);

//    @Nonnull
//    private final PAPService papService;

    @Nonnull
    private final List<PAP> paps;

    @Nonnull
    private final Map<String, PAP> papByName = new HashMap<>();

    @Nonnull
    private final List<PAP> activePAPS = new ArrayList<>();

    @Nonnull
    private final List<PAP> inactivePAPS = new ArrayList<>();

    @Autowired
    public PAPManager(@Nonnull final List<PAP> paps){
        Preconditions.checkNotNull(paps, "paps should not be null!");
        Preconditions.checkArgument(!paps.isEmpty(), "paps should not be empty!");

        this.paps = paps;
        initialize();

//        displayModules();
    }

    private void initialize() {
        for (final PAP pap : paps) {
//            papByName.put(pap.getName(), pap);
            LOG.error(pap.getName());
        }
//
//        List<ModuleEntity> entities = papService.getAll();
//        for (ModuleEntity moduleEntity : entities) {
//            final PAPFModule module = papByName.get(moduleEntity.getName());
//            module.setActive(moduleEntity.isActive());
//            if (module.isActive()) {
//                activePAPS.add(module);
//            } else {
//                inactivePAPS.add(module);
//            }
//        }
    }

    /**
     * With this method you can get a module by its name.
     *
     * @param papName Not null.
     * @return Not null.
     * @throws IllegalArgumentException If there is no module with the given name.
     */
    @Nonnull
    public PAP getPAPByName(@Nonnull final String papName) throws IllegalArgumentException {
        Preconditions.checkNotNull(papName, "papName should not be null!");

        final PAP module = papByName.get(papName);
        if(module == null) {
            throw new IllegalArgumentException("No module with the name '" + papName + "' exists!");
        }

        return module;
    }

    @Nonnull
    public List<PAP> getActivePAPS() {
        return activePAPS;
    }

    @Nonnull
    public List<PAP> getInactivePAPS() {
        return inactivePAPS;
    }

    public void displayModules() {
        LOG.error("PAPS BY NAME:");
        for (final Map.Entry papEntry : papByName.entrySet()) {
            LOG.error(papEntry.getKey() + "   " + papEntry.getValue());
        }
        LOG.error("ACTIVE PAPS:");
        for (final PAP pap : activePAPS) {
            LOG.error(pap.getName());
        }
        LOG.error("INACTIVE PAPS:");
        for (final PAP pap : inactivePAPS) {
            LOG.error(pap.getName());
        }
    }
}
