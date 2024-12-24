package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AlternatingGroupsITest {
    AlternatingGroupsI obj = new AlternatingGroupsI();

    @Test
    void test1() {
        assertThat(obj.numberOfAlternatingGroups(new int[]{1, 1, 1})).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.numberOfAlternatingGroups(new int[]{0,1,0,0,1})).isEqualTo(3);
    }
}