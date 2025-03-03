package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PartitionArrayAccordingToGivenPivotTest {
    PartitionArrayAccordingToGivenPivot obj = new PartitionArrayAccordingToGivenPivot();

    @Test
    void test1() {
        assertThat(obj.pivotArray(new int[]{
                9, 12, 5, 10, 14, 3, 10
        }, 10)).isEqualTo(new int[]{
                9, 5, 3, 10, 10, 12, 14
        });
    }

    @Test
    void test2() {
        assertThat(obj.pivotArray(new int[]{
                -3,4,3,2
        }, 2)).isEqualTo(new int[]{
                -3,2,4,3
        });
    }
}