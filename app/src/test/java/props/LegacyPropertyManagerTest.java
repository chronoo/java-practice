package props;


import org.junit.jupiter.api.Test;
import props.manager.LegacyPropertyManager;
import props.props.ProjectProps;

class LegacyPropertyManagerTest {
    @Test
    void test1() {
        new LegacyPropertyManager().readProperty(ProjectProps.FIRST);
    }
}