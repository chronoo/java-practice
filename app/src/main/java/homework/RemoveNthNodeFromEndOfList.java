package homework;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode prev = head;
        int x = -n;
        while (current.next != null) {
            if (x >= 0) {
                prev = prev.next;
            }
            current = current.next;
            x++;
        }
        if (prev.next == null) return null;
        if (x <= 0) {
            head.val = head.next.val;
            head.next = head.next.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
