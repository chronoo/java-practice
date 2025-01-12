package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NimGameTest {
    NimGame obj = new NimGame();

    @Test
    void test1() {
        assertThat(obj.canWinNim(4)).isFalse();
    }

    @Test
    void test2() {
        assertThat(obj.canWinNim(1)).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.canWinNim(1)).isTrue();
    }
}