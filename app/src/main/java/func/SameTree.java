package func;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return toList(p).equals(toList(q));
    }

    public List<Integer> toList(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            list.add(null);
        } else {
            list.add(node.val);
            list.addAll(toList(node.left));
            list.addAll(toList(node.right));
        }
        return list;
    }
}
