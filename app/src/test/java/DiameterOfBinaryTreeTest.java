import func.DiameterOfBinaryTree;
import func.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree obj = new DiameterOfBinaryTree();

    @Test
    void test1() {
        assertThat(obj.diameterOfBinaryTree(
                new TreeNode(
                        1, new TreeNode(2), null
                ))
        )
                .isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.diameterOfBinaryTree(
                new TreeNode(
                        1, new TreeNode(2, new TreeNode(3), null), null
                ))
        )
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.diameterOfBinaryTree(
                new TreeNode(
                        1, new TreeNode(2,
                        new TreeNode(4), new TreeNode(5)), new TreeNode(3)
                ))
        )
                .isEqualTo(3);
    }
}
