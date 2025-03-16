package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountOfSubstringsContainingEveryVowelAndKConsonantsIITest {
    CountOfSubstringsContainingEveryVowelAndKConsonantsII obj = new CountOfSubstringsContainingEveryVowelAndKConsonantsII();

    @Test
    void test1() {
        assertThat(obj.countOfSubstrings("aeioqq", 1)).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.countOfSubstrings("aeiou", 0)).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.countOfSubstrings("ieaouqqieaouqq", 1)).isEqualTo(3);
    }
}