package props.config;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PropertyManagerConfig {
    private boolean legacyMode = false;

    public boolean isLegacyMode() {
        return legacyMode;
    }

    public void setLegacyMode(boolean isLegacyMode) {
        legacyMode = isLegacyMode;
    }
}
