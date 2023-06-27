package props;

import org.junit.jupiter.api.Test;
import props.manager.ConfigServicePropertyManager;
import props.props.ProjectProps;

class ConfigServicePropertyManagerTest {
    @Test
    void test1() {
        new ConfigServicePropertyManager().readProperty(ProjectProps.SECOND);
    }
}