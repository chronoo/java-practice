package func;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left != null && root.right != null) {
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
        if (root.left != null) {
            return hasPathSum(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            return hasPathSum(root.right, targetSum - root.val);
        }
        return targetSum == root.val;
    }
}
