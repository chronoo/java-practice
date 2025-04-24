package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ShuffleStringTest {
    ShuffleString obj = new ShuffleString();

    @Test
    void test1() {
        assertThat(obj.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}))
            .isEqualTo("leetcode");
    }

    @Test
    void test2() {
        assertThat(obj.restoreString("abc", new int[]{0, 1, 2}))
            .isEqualTo("abc");
    }
}