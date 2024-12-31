package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ArrangingCoinsTest {
    ArrangingCoins obj = new ArrangingCoins();

    @Test
    void test1() {
        assertThat(obj.arrangeCoins(5)).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.arrangeCoins(8)).isEqualTo(3);
    }
}