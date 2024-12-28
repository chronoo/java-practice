package t;

import func.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountCompleteTreeNodesTest {
    CountCompleteTreeNodes obj = new CountCompleteTreeNodes();

    @Test
    void test1() {
        assertThat(obj.countNodes(
            new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null))
        )).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.countNodes(
            new TreeNode()
        )).isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(obj.countNodes(
            new TreeNode(1)
        )).isEqualTo(1);
    }
}