package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindThePivotIntegerTest {
    FindThePivotInteger obj = new FindThePivotInteger();

    @Test
    void test1() {
        assertThat(obj.pivotInteger(8))
                .isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.pivotInteger(1))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.pivotInteger(4))
                .isEqualTo(-1);
    }
}
