package t;

import func.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest {
    MinimumNumberOfChangesToMakeBinaryStringBeautiful obj = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();

    @Test
    void test1() {
        ListNode a = new ListNode(4);
        a.next = new ListNode(1);
        a.next.next = new ListNode(8);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);

        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(1);
        b.next.next.next = new ListNode(8);
        b.next.next.next.next = new ListNode(4);
        b.next.next.next.next.next = new ListNode(5);

        obj.getIntersectionNode(a, b);
    }
}