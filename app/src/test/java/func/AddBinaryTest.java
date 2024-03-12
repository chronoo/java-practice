package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    private AddBinary obj = new AddBinary();

    @Test
    void test1() {
        assertThat(obj.addBinary("11", "1")).isEqualTo("100");
    }

    @Test
    void test2() {
        assertThat(obj.addBinary("1010", "1011")).isEqualTo("10101");
    }

    @Test
    void test3() {
        assertThat(obj.addBinary("1", "111")).isEqualTo("1000");
    }
}
