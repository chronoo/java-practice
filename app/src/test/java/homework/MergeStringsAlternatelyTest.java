package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately obj = new MergeStringsAlternately();

    @Test
    void test1() {
        assertThat(obj.mergeAlternately("abc", "pqr"))
            .isEqualTo("apbqcr");
    }

    @Test
    void test2() {
        assertThat(obj.mergeAlternately("ab", "pqrs"))
            .isEqualTo("apbqrs");
    }

    @Test
    void test3() {
        assertThat(obj.mergeAlternately("abcd", "pq"))
            .isEqualTo("apbqcd");
    }
}