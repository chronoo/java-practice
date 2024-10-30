package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseStringTest {
    ReverseString obj = new ReverseString();

    @Test
    void test1() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(word);
        assertThat(word).isEqualTo(new char[]{
                'o', 'l', 'l', 'e', 'h'
        });
    }
}