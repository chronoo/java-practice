package func;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    SameTree obj = new SameTree();

    @Test
    void test1() {
        assertThat(obj.toList(new TreeNode(1,
            new TreeNode(2), new TreeNode(3)))
        ).isEqualTo(List.of(1, 2, 3));
    }
}
