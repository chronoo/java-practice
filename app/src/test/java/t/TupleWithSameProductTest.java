package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TupleWithSameProductTest {
    TupleWithSameProduct obj = new TupleWithSameProduct();

    @Test
    void test1() {
        assertThat(obj.tupleSameProduct(new int[]{2, 3, 4, 6})).isEqualTo(8);
    }

    @Test
    void test2() {
        assertThat(obj.tupleSameProduct(new int[]{1, 2, 4, 5, 10})).isEqualTo(16);
    }
}