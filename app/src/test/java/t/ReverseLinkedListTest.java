package t;

import func.ListNode;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
    ReverseLinkedList obj = new ReverseLinkedList();

    @Test
    void test1() {
        var a = obj.reverseList(
            new ListNode(1,
                new ListNode(2,
                    new ListNode(3,
                        new ListNode(4,
                            new ListNode(5)))))
        );
        System.out.println(a);
    }

    @Test
    void test2() {
        var a = obj.reverseList(
            new ListNode(1,
                new ListNode(2))
        );
        System.out.println(a);
    }
}