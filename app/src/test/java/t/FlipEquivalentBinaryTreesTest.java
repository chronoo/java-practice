package t;

import func.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FlipEquivalentBinaryTreesTest {
    FlipEquivalentBinaryTrees obj = new FlipEquivalentBinaryTrees();

    @Test
    void test1() {
        assertThat(obj.flipEquiv(
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5,
                        new TreeNode(7),
                        new TreeNode(8)
                    )
                ),
                new TreeNode(3,
                    new TreeNode(6),
                    null)
            ),
            new TreeNode(1,
                new TreeNode(3,
                    null,
                    new TreeNode(6)
                ),
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5,
                        new TreeNode(8),
                        new TreeNode(7))))
        )).isTrue();
    }
}