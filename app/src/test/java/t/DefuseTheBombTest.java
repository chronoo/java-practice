package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DefuseTheBombTest {
    DefuseTheBomb obj = new DefuseTheBomb();

    @Test
    void test1() {
        assertThat(obj.decrypt(new int[]{5, 7, 1, 4}, 3))
            .isEqualTo(new int[]{12, 10, 16, 13});
    }

    @Test
    void test2() {
        assertThat(obj.decrypt(new int[]{1, 2, 3, 4}, 0))
            .isEqualTo(new int[]{0, 0, 0, 0});
    }

    @Test
    void test3() {
        assertThat(obj.decrypt(new int[]{2, 4, 9, 3}, -2))
            .isEqualTo(new int[]{12, 5, 6, 13});
    }
}