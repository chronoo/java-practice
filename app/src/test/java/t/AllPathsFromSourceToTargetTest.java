package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AllPathsFromSourceToTargetTest {
    AllPathsFromSourceToTarget obj = new AllPathsFromSourceToTarget();

    @Test
    void test1() {
        assertThat(obj.allPathsSourceTarget(
            new int[][]{{1, 2}, {3}, {3}, {}}
        )).isEqualTo(List.of(
            List.of(0, 1, 3),
            List.of(0, 2, 3)
        ));
    }

    @Test
    void test2() {
        assertThat(obj.allPathsSourceTarget(
            new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}
        )).isEqualTo(List.of(
            List.of(0, 4),
            List.of(0, 3, 4),
            List.of(0, 1, 3, 4),
            List.of(0, 1, 2, 3, 4),
            List.of(0, 1, 4)
        ));
    }
}