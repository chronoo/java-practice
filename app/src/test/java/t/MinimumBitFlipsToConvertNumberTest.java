package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumBitFlipsToConvertNumberTest {
    MinimumBitFlipsToConvertNumber obj = new MinimumBitFlipsToConvertNumber();

    @Test
    void test1() {
        assertThat(obj.minBitFlips(10, 7)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.minBitFlips(3, 4)).isEqualTo(3);
    }
}