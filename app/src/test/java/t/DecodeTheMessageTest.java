package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DecodeTheMessageTest {
    DecodeTheMessage obj = new DecodeTheMessage();

    @Test
    void test1() {
        assertThat(obj.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"))
            .isEqualTo("this is a secret");
    }

    @Test
    void test2() {
        assertThat(obj.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"))
            .isEqualTo("the five boxing wizards jump quickly");
    }
}