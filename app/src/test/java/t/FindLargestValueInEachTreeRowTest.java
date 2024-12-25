package t;

import func.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindLargestValueInEachTreeRowTest {
    FindLargestValueInEachTreeRow obj = new FindLargestValueInEachTreeRow();

    @Test
    void test1() {
        assertThat(obj.largestValues(
            new TreeNode(1,
                new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, new TreeNode(9), null))
        )).isEqualTo(List.of(1, 3, 9));
    }

    @Test
    void test2() {
        assertThat(obj.largestValues(
            new TreeNode(1, new TreeNode(2), new TreeNode(3))
        )).isEqualTo(List.of(1, 3));
    }
}