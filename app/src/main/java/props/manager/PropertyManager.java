package props.manager;

import lombok.SneakyThrows;
import props.props.ProjectProps;
import props.Props;

import java.lang.annotation.Annotation;

public interface PropertyManager<A extends Annotation> {
    <T extends Enum<?> & Props> void readProperty(T property);

    <T extends Enum<?> & Props> void updateProperty(T property, Object value);

    Class<A> getPropertyClass();

    @SneakyThrows
    default <T extends Enum<?> & Props> A getInfo(T property) {
        String propertyName = property.name();
        return ProjectProps.class.getField(propertyName)
                .getAnnotation(getPropertyClass());
    }
}
