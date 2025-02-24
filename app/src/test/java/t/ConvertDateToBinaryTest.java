package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConvertDateToBinaryTest {
    ConvertDateToBinary obj = new ConvertDateToBinary();

    @Test
    void test1() {
        assertThat(obj.convertDateToBinary("2080-02-29")).isEqualTo("100000100000-10-11101");
    }

    @Test
    void test2() {
        assertThat(obj.convertDateToBinary("1900-01-01")).isEqualTo("11101101100-1-1");
    }
}