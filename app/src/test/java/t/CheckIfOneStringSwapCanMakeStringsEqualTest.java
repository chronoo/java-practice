package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfOneStringSwapCanMakeStringsEqualTest {
    CheckIfOneStringSwapCanMakeStringsEqual obj = new CheckIfOneStringSwapCanMakeStringsEqual();

    @Test
    void test1() {
        assertThat(obj.areAlmostEqual("bank", "kanb")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.areAlmostEqual("attack", "defend")).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.areAlmostEqual("kelb", "kelb")).isTrue();
    }
}