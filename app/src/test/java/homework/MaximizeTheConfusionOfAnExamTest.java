package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximizeTheConfusionOfAnExamTest {

    private MaximizeTheConfusionOfAnExam obj = new MaximizeTheConfusionOfAnExam();

    @Test
    void test1() {
        assertThat(obj.maxConsecutiveAnswers("TTFF", 2))
            .isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.maxConsecutiveAnswers("TFFT", 1))
            .isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.maxConsecutiveAnswers("TTFTTFTT", 1))
            .isEqualTo(5);
    }
}