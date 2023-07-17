package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    private final CountAndSay obj = new CountAndSay();

    @Test
    void test1() {
        assertThat(obj.countAndSay(1)).isEqualTo("1");
    }

    @Test
    void test2() {
        assertThat(obj.countAndSay(2)).isEqualTo("11");
    }

    @Test
    void test3() {
        assertThat(obj.countAndSay(3)).isEqualTo("21");
    }

    @Test
    void test4() {
        assertThat(obj.countAndSay(4)).isEqualTo("1211");
    }
}