package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfArrayIsSortedAndRotatedTest {
    CheckIfArrayIsSortedAndRotated obj = new CheckIfArrayIsSortedAndRotated();

    @Test
    void test1() {
        assertThat(obj.check(new int[] {3,4,5,1,2})).isEqualTo(true);
    }

    @Test
    void test2() {
        assertThat(obj.check(new int[] {2,1,3,4})).isEqualTo(false);
    }

    @Test
    void test3() {
        assertThat(obj.check(new int[] {1,2,3})).isEqualTo(true);
    }
}