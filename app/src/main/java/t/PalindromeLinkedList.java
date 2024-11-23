package t;

import func.ListNode;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        var sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
