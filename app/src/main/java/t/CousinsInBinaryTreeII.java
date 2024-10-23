package t;

import func.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/cousins-in-binary-tree-ii
 */
public class CousinsInBinaryTreeII {
    public TreeNode replaceValueInTree(TreeNode root) {
        var levelSum = new ArrayList<Integer>();
        countSums(root, 0, levelSum);
        updateTree(root, 0, levelSum);
        return root;
    }

    private void updateTree(TreeNode root, int level, List<Integer> levelSum) {
        if (level == 0) root.val = 0;
        if (root.left != null || root.right != null) {
            var nextLevelSum = levelSum.get(level + 1);
            var oldLeft = 0;
            if (root.left != null) {
                oldLeft = root.left.val;
                root.left.val = nextLevelSum - root.left.val - (root.right == null ? 0 : root.right.val);
            }
            if (root.right != null) {
                root.right.val = nextLevelSum - root.right.val - oldLeft;
            }
        }
        if (root.left != null) {
            updateTree(root.left, level + 1, levelSum);
        }
        if (root.right != null) {
            updateTree(root.right, level + 1, levelSum);
        }
    }

    private void countSums(TreeNode root, int level, List<Integer> levelSum) {
        if (level >= levelSum.size()) levelSum.add(0);
        levelSum.set(level, levelSum.get(level) + root.val);
        if (root.left == null && root.right == null) return;
        if (root.left != null) {
            countSums(root.left, level + 1, levelSum);
        }
        if (root.right != null) {
            countSums(root.right, level + 1, levelSum);
        }
    }
}
