package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumMultiplesTest {
    SumMultiples obj = new SumMultiples();

    @Test
    void test1() {
        assertThat(obj.sumOfMultiples(7)).isEqualTo(21);
    }

    @Test
    void test2() {
        assertThat(obj.sumOfMultiples(10)).isEqualTo(40);
    }

    @Test
    void test3() {
        assertThat(obj.sumOfMultiples(9)).isEqualTo(30);
    }

    @Test
    void test4() {
        assertThat(obj.sumOfMultiples(15)).isEqualTo(81);
    }
}