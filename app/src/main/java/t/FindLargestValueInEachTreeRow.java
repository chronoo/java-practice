package t;

import func.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row
 */
public class FindLargestValueInEachTreeRow {
    ArrayList<Integer> max = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return List.of();
        proc(root, 0);
        return max;
    }

    private void proc(TreeNode node, int level) {
        if (level >= max.size()) {
            max.add(node.val);
        } else if (node.val > max.get(level)) {
            max.set(level, node.val);
        }
        if (node.left != null) proc(node.left, level + 1);
        if (node.right != null) proc(node.right, level + 1);
    }
}
