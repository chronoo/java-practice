package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BulbSwitcherTest {
    private final BulbSwitcher obj = new BulbSwitcher();

    @Test
    void test1() {
        assertThat(obj.bulbSwitch(3))
            .isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.bulbSwitch(0))
            .isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(obj.bulbSwitch(1))
            .isEqualTo(1);
    }
    @Test
    void test4() {
        assertThat(obj.bulbSwitch(15))
            .isEqualTo(3);
    }
    @Test
    void test5() {
        assertThat(obj.bulbSwitch(9))
            .isEqualTo(3);
    }
}