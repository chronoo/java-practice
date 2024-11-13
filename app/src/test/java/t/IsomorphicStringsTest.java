package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IsomorphicStringsTest {
    IsomorphicStrings obj = new IsomorphicStrings();

    @Test
    void test1() {
        assertThat(obj.isIsomorphic("egg", "add")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isIsomorphic("foo", "bar")).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.isIsomorphic("paper", "title")).isTrue();
    }

    @Test
    void test4() {
        assertThat(obj.isIsomorphic("badc", "baba")).isFalse();
    }
}