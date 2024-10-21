package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SplitAStringIntoTheMaxNumberOfUniqueSubstringsTest {
    SplitAStringIntoTheMaxNumberOfUniqueSubstrings obj = new SplitAStringIntoTheMaxNumberOfUniqueSubstrings();

    @Test
    void test1() {
        assertThat(obj.maxUniqueSplit("ababccc")).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.maxUniqueSplit("aba")).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.maxUniqueSplit("aa")).isEqualTo(1);
    }

    @Test
    void test4() {
        assertThat(obj.maxUniqueSplit("wwwzfvedwfvhsww")).isEqualTo(11);
    }
}