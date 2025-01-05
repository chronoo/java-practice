package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RansomNoteTest {
    RansomNote obj = new RansomNote();

    @Test
    void test1() {
        assertThat(obj.canConstruct("a", "b")).isEqualTo(false);
    }

    @Test
    void test2() {
        assertThat(obj.canConstruct("aa", "ab")).isEqualTo(false);
    }

    @Test
    void test3() {
        assertThat(obj.canConstruct("aa", "aab")).isEqualTo(true);
    }
}