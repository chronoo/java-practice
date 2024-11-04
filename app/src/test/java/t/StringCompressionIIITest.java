package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringCompressionIIITest {
    StringCompressionIII obj = new StringCompressionIII();

    @Test
    void test1() {
        assertThat(obj.compressedString("abcde")).isEqualTo("1a1b1c1d1e");
    }

    @Test
    void test2() {
        assertThat(obj.compressedString("aaaaaaaaaaaaaabb")).isEqualTo("9a5a2b");
    }
}