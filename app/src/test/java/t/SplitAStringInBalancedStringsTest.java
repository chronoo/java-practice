package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SplitAStringInBalancedStringsTest {
    SplitAStringInBalancedStrings obj = new SplitAStringInBalancedStrings();

    @Test
    void test1() {
        assertThat(obj.balancedStringSplit("RLRRLLRLRL")).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.balancedStringSplit("RLRRRLLRLL")).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.balancedStringSplit("LLLLRRRR")).isEqualTo(1);
    }
}