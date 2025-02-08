package t;

import org.junit.jupiter.api.Test;
import t.DesignANumberContainerSystem.NumberContainers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DesignANumberContainerSystemTest {
    NumberContainers obj = new NumberContainers();

    @Test
    void test1() {
        obj.change(1, 4);
        obj.change(1,3);
        System.out.println(obj);
    }
}