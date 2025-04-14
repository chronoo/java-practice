package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountGoodTripletsTest {
    CountGoodTriplets obj = new CountGoodTriplets();

    @Test
    void test1() {
        assertThat(obj.countGoodTriplets(new int[]{
            3, 0, 1, 1, 9, 7
        }, 7, 2, 3)).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.countGoodTriplets(new int[]{
            1, 1, 2, 2, 3
        }, 0, 0, 1)).isEqualTo(0);
    }
}