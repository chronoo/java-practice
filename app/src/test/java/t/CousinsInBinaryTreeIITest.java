package t;

import func.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CousinsInBinaryTreeIITest {
        CousinsInBinaryTreeII obj = new CousinsInBinaryTreeII();
    @Test
    void test1() {
        obj.replaceValueInTree(
            new TreeNode(
                5,
                new TreeNode(
                    4,
                    new TreeNode(1),
                    new TreeNode(10)
                ),
                new TreeNode(
                    9,
                    new TreeNode(7),
                    null
                )
            )
        );
    }
}