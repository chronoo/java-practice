package t;

import homework.PathSumII.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class KthLargestSumInABinaryTreeTest {
    KthLargestSumInABinaryTree obj = new KthLargestSumInABinaryTree();

    @Test
    void test1() {
        assertThat(
            obj.kthLargestLevelSum(
                new TreeNode(5,
                    new TreeNode(
                        8,
                        new TreeNode(2, new TreeNode(4), new TreeNode(6)),
                        new TreeNode(1)),
                    new TreeNode(
                        9,
                        new TreeNode(3),
                        new TreeNode(7)
                    )
                ), 2
            )
        ).isEqualTo(13);
    }

    @Test
    void test2() {
        assertThat(
            obj.kthLargestLevelSum(
                new TreeNode(1,
                    new TreeNode(
                        2,
                        new TreeNode(3),
                        null),
                    null
                ), 1
            )
        ).isEqualTo(3);
    }
}