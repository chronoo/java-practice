package func;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();

    @Test
    void test1() {
        assertThat(obj.inorderTraversal(new TreeNode(
            1, null, new TreeNode(
            2, new TreeNode(3), null
        )
        ))).isEqualTo(List.of(1, 3, 2));
    }
    @Test
    void test2() {
        assertThat(obj.inorderTraversal(null)).isEqualTo(List.of());
    }
    @Test
    void test3() {
        assertThat(obj.inorderTraversal(new TreeNode(1))).isEqualTo(List.of(1));
    }
}
