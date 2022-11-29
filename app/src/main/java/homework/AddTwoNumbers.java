package homework;

class ListNode {
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
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var result = new ListNode();
        var curRes = result;
        var needPlus = false;

        while (true) {
            curRes.val = l1.val + l2.val;
            needPlus = curRes.val > 9;
            curRes.val %= 10;
            if (l1.next == null && l2.next == null && !needPlus) {
                break;
            }

            l1 = l1.next == null ? new ListNode(0) : l1.next;
            l2 = l2.next == null ? new ListNode(0) : l2.next;

            if (needPlus) l1.val++;

            curRes.next = new ListNode();
            curRes = curRes.next;
        }

        return result;
    }

    public String toString(ListNode node) {
        String result = String.valueOf(node.val);
        if (node.next == null) {
            return result;
        }
        return toString(node.next) + result;
    }
}