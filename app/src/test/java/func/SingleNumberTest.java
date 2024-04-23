package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SingleNumberTest {
    SingleNumber obj = new SingleNumber();

    @Test
    void test1() {
        assertThat(obj.singleNumber(new int[]{2,2,1})).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.singleNumber(new int[]{4,1,2,1,2})).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(obj.singleNumber(new int[]{1})).isEqualTo(1);
    }
}
