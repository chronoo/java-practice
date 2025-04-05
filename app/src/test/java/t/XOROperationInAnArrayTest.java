package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class XOROperationInAnArrayTest {
    XOROperationInAnArray obj = new XOROperationInAnArray();

    @Test
    void test1() {
        assertThat(obj.xorOperation(5, 0)).isEqualTo(8);
    }

    @Test
    void test2() {
        assertThat(obj.xorOperation(4, 3)).isEqualTo(8);
    }
}