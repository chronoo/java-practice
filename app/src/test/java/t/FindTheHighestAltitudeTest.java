package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheHighestAltitudeTest {
    FindTheHighestAltitude obj = new FindTheHighestAltitude();

    @Test
    void test1() {
        assertThat(obj.largestAltitude(new int[]{
                -5, 1, 5, 0, -7
        })).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.largestAltitude(new int[]{
                -4, -3, -2, -1, 4, 3, 2
        })).isEqualTo(0);
    }
}