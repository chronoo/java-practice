package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfEmployeesWhoMetTheTargetTest {
    NumberOfEmployeesWhoMetTheTarget obj = new NumberOfEmployeesWhoMetTheTarget();

    @Test
    void test1() {
        assertThat(obj.numberOfEmployeesWhoMetTarget(new int[]{
            0, 1, 2, 3, 4
        }, 2)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.numberOfEmployeesWhoMetTarget(new int[]{
            5, 1, 4, 2, 2
        }, 6)).isEqualTo(0);
    }
}