package func;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> has = new HashSet<>();
        while (head != null) {
            if (has.contains(head)) return true;
            has.add(head);
            head = head.next;
        }
        return false;
    }
}

