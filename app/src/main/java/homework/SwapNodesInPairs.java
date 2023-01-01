package homework;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        if (head == null) return null;
        ListNode result = head.next;
        if (result == null) return head;
        ListNode prev = null;
        while (first != null) {
            ListNode second = first.next;
            if (second != null) {
                if (prev==null) {
                    prev = first;
                } else {
                    prev.next = second;
                    prev = first;
                }
                first.next = second.next;
                second.next = first;
                first = second.next.next;
            } else {
                break;
            }
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode ofNumbers(int... values) {
            ListNode head = new ListNode();
            head.val = values[0];
            var currentHead = head;
            for (int i = 1; i < values.length; i++) {
                int value = values[i];
                currentHead.next = new ListNode(value);
                currentHead = currentHead.next;
            }
            return head;
        }

        @Override
        public String toString() {
            return val + (next == null ? "" : next.toString());
        }
    }
}
