package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PermutationDifferenceBetweenTwoStringsTest {
    PermutationDifferenceBetweenTwoStrings obj = new PermutationDifferenceBetweenTwoStrings();

    @Test
    void test1() {
        assertThat(obj.findPermutationDifference("abc", "bac")).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.findPermutationDifference("abcde", "edbac")).isEqualTo(12);
    }
}