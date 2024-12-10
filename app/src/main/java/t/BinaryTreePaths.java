package t;

import func.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths
 */
public class BinaryTreePaths {
    private final List<String> res = new ArrayList<>();
    private final StringBuilder sb = new StringBuilder();

    public List<String> binaryTreePaths(TreeNode root) {
        addPaths(root);
        return res;
    }

    private void addPaths(TreeNode root) {
        if (root == null) return;
        var length = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            addPaths(root.left);
            addPaths(root.right);
        }
        sb.setLength(length);
    }
}
