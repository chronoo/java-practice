package props.manager;

import props.Props;
import props.annotation.ConfigServiceProperty;

public class ConfigServicePropertyManager implements PropertyManager<ConfigServiceProperty> {
    @Override
    public <T extends Enum<?> & Props> void readProperty(T property) {
        ConfigServiceProperty propertyAnnotation = getInfo(property);
        System.out.println(propertyAnnotation.key() + ":" + propertyAnnotation.service());
    }

    @Override
    public <T extends Enum<?> & Props> void updateProperty(T property, Object value) {
        ConfigServiceProperty propertyAnnotation = getInfo(property);
        System.out.println("make " + propertyAnnotation.key() + " is " + value);
    }

    @Override
    public Class<ConfigServiceProperty> getPropertyClass() {
        return ConfigServiceProperty.class;
    }
}
