package homework;

import homework.PathSumII.TreeNode;
import org.junit.jupiter.api.Test;

class PathSumIITest {
    @Test
    void test1() {
        System.out.println(
                new PathSumII().pathSum(new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11,
                                        new TreeNode(7),
                                        new TreeNode(2)),
                                null
                        ),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4,
                                        new TreeNode(5),
                                        new TreeNode(1)))
                ), 22)
        );
    }

    @Test
    void test2() {
        System.out.println(
                new PathSumII().pathSum(
                        new TreeNode(1,
                                new TreeNode(2),
                                null),
                        1
                )
        );
    }
}