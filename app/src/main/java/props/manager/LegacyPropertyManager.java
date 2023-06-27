package props.manager;

import props.Props;
import props.annotation.LegacyProperty;

public class LegacyPropertyManager implements PropertyManager<LegacyProperty> {
    @Override
    public <T extends Enum<?> & Props> void readProperty(T property) {
        LegacyProperty propertyAnnotation = getInfo(property);
        System.out.println(propertyAnnotation.key() + ":" + propertyAnnotation.category());
    }

    @Override
    public <T extends Enum<?> & Props> void updateProperty(T property, Object value) {
        LegacyProperty propertyAnnotation = getInfo(property);
        System.out.println("make " + propertyAnnotation.key() + " is " + value);
    }

    @Override
    public Class<LegacyProperty> getPropertyClass() {
        return LegacyProperty.class;
    }
}

