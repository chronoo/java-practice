package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ScoreOfAStringTest {
    ScoreOfAString obj = new ScoreOfAString();

    @Test
    void test1() {
        assertThat(obj.scoreOfString("hello")).isEqualTo(13);
    }

    @Test
    void test2() {
        assertThat(obj.scoreOfString("zaz")).isEqualTo(50);
    }
}