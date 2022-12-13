package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {
    private final NumberOfStudentsDoingHomeworkAtAGivenTime obj = new NumberOfStudentsDoingHomeworkAtAGivenTime();

    @Test
    void test1() {
        assertThat(obj.busyStudent(
                new int[]{1, 2, 3},
                new int[]{3, 2, 7}, 4)
        ).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.busyStudent(
                new int[]{4},
                new int[]{4}, 4)
        ).isEqualTo(1);
    }
}