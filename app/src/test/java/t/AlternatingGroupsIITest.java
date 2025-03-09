package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AlternatingGroupsIITest {
    AlternatingGroupsII obj = new AlternatingGroupsII();

    @Test
    void test1() {
        assertThat(obj.numberOfAlternatingGroups(new int[]{
            0, 1, 0, 1, 0
        }, 3)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.numberOfAlternatingGroups(new int[]{
            0, 1, 0, 0, 1, 0, 1
        }, 6)).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.numberOfAlternatingGroups(new int[]{
            1, 1, 0, 1
        }, 4)).isEqualTo(0);
    }
}