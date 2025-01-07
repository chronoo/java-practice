package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringMatchingInAnArrayTest {
    StringMatchingInAnArray obj = new StringMatchingInAnArray();

    @Test
    void test1() {
        assertThat(obj.stringMatching(new String[]{"mass", "as", "hero", "superhero"}))
            .isEqualTo(List.of("as", "hero"));
    }

    @Test
    void test2() {
        assertThat(obj.stringMatching(new String[]{"leetcode","et","code"}))
            .isEqualTo(List.of("et","code"));
    }

    @Test
    void test3() {
        assertThat(obj.stringMatching(new String[]{"blue","green","bu"}))
            .isEqualTo(List.of());
    }
}