package func;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        if (root.left != null && root.right != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        if (root.left != null) {
            return maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            return maxDepth(root.right) + 1;
        }
        return depth + 1;
    }
}
