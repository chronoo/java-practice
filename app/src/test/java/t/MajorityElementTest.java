package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MajorityElementTest {
    MajorityElement obj = new MajorityElement();

    @Test
    void test1() {
        assertThat(obj.majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }
}