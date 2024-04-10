package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();

    @Test
    void test1() {
        assertThat(obj.maxDepth(new TreeNode(
            3, new TreeNode(9), new TreeNode(
            20, new TreeNode(7), new TreeNode(15)
        )
        ))).isEqualTo(3);
    }
}
