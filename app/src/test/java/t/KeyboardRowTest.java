package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class KeyboardRowTest {
    KeyboardRow obj = new KeyboardRow();

    @Test
    void test1() {
        assertThat(obj.findWords(new String[]{
            "Hello", "Alaska", "Dad", "Peace"
        })).isEqualTo(new String[]{
            "Alaska", "Dad"
        });
    }

    @Test
    void test2() {
        assertThat(obj.findWords(new String[]{
            "omk"
        })).isEqualTo(new String[]{});
    }

    @Test
    void test3() {
        assertThat(obj.findWords(new String[]{
            "adsdf", "sfd"
        })).isEqualTo(new String[]{
            "adsdf", "sfd"
        });
    }
}