package props.manager;

import org.junit.jupiter.api.Test;
import props.props.AdminProps;
import props.props.ProjectProps;
import props.config.PropertyManagerConfig;
import props.config.PropertyManagerFactory;

class PropertyManagerFactoryTest {
    @Test
    void test1() {
        PropertyManagerFactory.getCurrent()
                .readProperty(AdminProps.FIRST);
    }

    @Test
    void test2() {
        PropertyManagerConfig.setLegacyMode(true);
        PropertyManagerFactory.getCurrent()
                .readProperty(ProjectProps.FIRST);
    }

    @Test
    void test3() {
        PropertyManagerFactory.getCurrent()
                .updateProperty(ProjectProps.FIRST, 42);
    }

    @Test
    void test4() {
        PropertyManagerConfig.setLegacyMode(true);
        PropertyManagerFactory.getCurrent()
                .updateProperty(ProjectProps.FIRST, 42);
    }
}