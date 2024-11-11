package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HappyNumberTest {
    HappyNumber obj = new HappyNumber();

    @Test
    void test1() {
        assertThat(obj.isHappy(19)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isHappy(2)).isFalse();
    }
}