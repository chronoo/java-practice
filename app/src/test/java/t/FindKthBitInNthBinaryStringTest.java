package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindKthBitInNthBinaryStringTest {
    @Test
    void test1() {
        assertThat(new FindKthBitInNthBinaryString().findKthBit(3,1)).isEqualTo('0');
    }
    @Test
    void test2() {
        assertThat(new FindKthBitInNthBinaryString().findKthBit(4,11)).isEqualTo('1');
    }
}