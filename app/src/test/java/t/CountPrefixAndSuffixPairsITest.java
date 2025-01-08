package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountPrefixAndSuffixPairsITest {
    CountPrefixAndSuffixPairsI obj = new CountPrefixAndSuffixPairsI();

    @Test
    void test1() {
        assertThat(obj.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}))
            .isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"}))
            .isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.countPrefixSuffixPairs(new String[]{"abab","ab"}))
            .isEqualTo(0);
    }
}