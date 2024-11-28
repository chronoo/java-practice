package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FirstBadVersionTest {
    @Test
    void test1() {
        assertThat(new FirstBadVersion(4).firstBadVersion(5)).isEqualTo(4);
    }
    @Test
    void test2() {
        assertThat(new FirstBadVersion(1).firstBadVersion(1)).isEqualTo(1);
    }
    @Test
    void test3() {
        assertThat(new FirstBadVersion(1).firstBadVersion(2)).isEqualTo(1);
    }
}