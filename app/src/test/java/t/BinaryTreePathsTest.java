package t;

import func.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BinaryTreePathsTest {
    BinaryTreePaths obj = new BinaryTreePaths();

    @Test
    void test1() {
        assertThat(obj.binaryTreePaths(
            new TreeNode(
                1,
                new TreeNode(
                    2,
                    new TreeNode(5),
                    null
                ),
                new TreeNode(3)
            )
        )).isEqualTo(List.of(
            "1->2->5", "1->3"
        ));
    }
}