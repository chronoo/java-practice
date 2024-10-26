package t;

import func.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode first, TreeNode  second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        if (first.val != second.val) return false;
        return isEqual(first.left, second.right) && isEqual(first.right, second.left);
    }
}
