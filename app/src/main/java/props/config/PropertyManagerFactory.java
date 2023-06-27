package props.config;

import lombok.experimental.UtilityClass;
import props.manager.ConfigServicePropertyManager;
import props.manager.LegacyPropertyManager;
import props.manager.PropertyManager;

@UtilityClass
public class PropertyManagerFactory {
    private final LegacyPropertyManager legacyPropertyManager = new LegacyPropertyManager();
    private final ConfigServicePropertyManager configServicePropertyManager = new ConfigServicePropertyManager();

    public PropertyManager<?> getCurrent() {
        if (PropertyManagerConfig.isLegacyMode()) {
            return legacyPropertyManager;
        } else {
            return configServicePropertyManager;
        }
    }
}

