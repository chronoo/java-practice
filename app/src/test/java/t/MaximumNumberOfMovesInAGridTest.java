package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfMovesInAGridTest {
    MaximumNumberOfMovesInAGrid obj = new MaximumNumberOfMovesInAGrid();

    @Test
    void test1() {
        assertThat(obj.maxMoves(new int[][]{
                {2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}
        })).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.maxMoves(new int[][]{
                {3,2,4},{2,1,9},{1,1,7}
        })).isEqualTo(0);
    }
}