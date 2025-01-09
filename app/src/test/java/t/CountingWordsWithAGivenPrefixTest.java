package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountingWordsWithAGivenPrefixTest {
    CountingWordsWithAGivenPrefix obj = new CountingWordsWithAGivenPrefix();

    @Test
    void test1() {
        assertThat(obj.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at"))
            .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.prefixCount(new String[]{"leetcode","win","loops","success"}, "code"))
            .isEqualTo(0);
    }
}