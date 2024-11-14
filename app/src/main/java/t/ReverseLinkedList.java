package t;

import func.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
            var head2 = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return head2;
        } else {
            return head;
        }
    }
}
