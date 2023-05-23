package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestNiceSubstringTest {

    private final LongestNiceSubstring obj = new LongestNiceSubstring();

    @Test
    void test1() {
        assertThat(obj.longestNiceSubstring("YazaAay"))
            .isEqualTo("aAa");
    }

    @Test
    void test2() {
        assertThat(obj.longestNiceSubstring("Bb"))
            .isEqualTo("Bb");
    }

    @Test
    void test3() {
        assertThat(obj.longestNiceSubstring("c"))
            .isEqualTo("");
    }
}