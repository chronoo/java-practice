package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseBitsTest {
    ReverseBits obj = new ReverseBits();

    @Test
    void test1() {
        assertThat(obj.reverseBits(Integer.parseInt("00000010100101000001111010011100", 2))).isEqualTo(964176192);
    }

    @Test
    void test2() {
        assertThat(obj.reverseBits(-3)).isEqualTo(-1073741825);
    }
}