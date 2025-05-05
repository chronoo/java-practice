package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ToLowerCaseTest {
    ToLowerCase obj = new ToLowerCase();

    @Test
    void test1() {
        assertThat(obj.toLowerCase("Hello")).isEqualTo("hello");
    }

    @Test
    void test2() {
        assertThat(obj.toLowerCase("here")).isEqualTo("here");
    }

    @Test
    void test3() {
        assertThat(obj.toLowerCase("LOVELY")).isEqualTo("lovely");
    }
}