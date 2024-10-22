package homework;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        int sum = root.val;
        List<Integer> currentPath = List.of(root.val);
        generate(sum, currentPath, targetSum, root, res);
        return res;
    }

    private void generate(int sum, List<Integer> currentPath, int targetSum, TreeNode node, List<List<Integer>> res) {
        if (sum == targetSum && node.left == null && node.right == null)
            res.add(currentPath);
        if (node.left != null) {
            List<Integer> newPath = addToPath(currentPath, node.left);
            generate(node.left.val + sum, newPath, targetSum, node.left, res);
        }
        if (node.right != null) {
            List<Integer> newPath = addToPath(currentPath, node.right);
            generate(node.right.val + sum, newPath, targetSum, node.right, res);
        }
    }

    private static List<Integer> addToPath(List<Integer> currentPath, TreeNode node) {
        List<Integer> newPath = new ArrayList<>(currentPath);
        newPath.add(node.val);
        return newPath;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


