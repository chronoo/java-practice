package func;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> integers = inorderTraversal(root.left);
        result.addAll(integers);
        result.add(root.val);
        List<Integer> integers2 = inorderTraversal(root.right);
        result.addAll(integers2);
        return result;
    }
}
