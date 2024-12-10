package t;

import func.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        var res = new ArrayList<String>();
        addPaths(root, res, "");
        return res;
    }

    private void addPaths(TreeNode root, ArrayList<String> res, String current) {
        if (root.left != null) {
            addPaths(root.left, res, current + root.val +"->");
        }
        if (root.right != null) {
            addPaths(root.right, res, current + root.val +"->");
        }
        if (root.left == null && root.right == null) {
            res.add(current + root.val);
        }
    }
}
