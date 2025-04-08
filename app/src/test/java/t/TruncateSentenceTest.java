package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TruncateSentenceTest {
    TruncateSentence obj = new TruncateSentence();

    @Test
    void test1() {
        assertThat(obj.truncateSentence("Hello how are you Contestant", 4)).isEqualTo("Hello how are you");
    }

    @Test
    void test2() {
        assertThat(obj.truncateSentence("What is the solution to this problem", 4)).isEqualTo("What is the solution");
    }

    @Test
    void test3() {
        assertThat(obj.truncateSentence("chopper is not a tanuki", 5)).isEqualTo("chopper is not a tanuki");
    }
}