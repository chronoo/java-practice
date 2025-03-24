package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountDaysWithoutMeetingsTest {
    CountDaysWithoutMeetings obj = new CountDaysWithoutMeetings();

    @Test
    void test1() {
        assertThat(obj.countDays(
            10, new int[][]{{5, 7}, {1, 3}, {9, 10}}
        )).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.countDays(
            5, new int[][]{{2, 4}, {1, 3}}
        )).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.countDays(
            6, new int[][]{{1, 6}}
        )).isEqualTo(0);
    }
}