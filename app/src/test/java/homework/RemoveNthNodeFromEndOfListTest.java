package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();

    @Test
    void test1() {
        assertThat(obj.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1,
                        new RemoveNthNodeFromEndOfList.ListNode(2,
                                new RemoveNthNodeFromEndOfList.ListNode(3,
                                        new RemoveNthNodeFromEndOfList.ListNode(4,
                                                new RemoveNthNodeFromEndOfList.ListNode(5)
                                        )
                                )
                        )
                ), 2)
        ).isEqualTo(new RemoveNthNodeFromEndOfList.ListNode(1,
                        new RemoveNthNodeFromEndOfList.ListNode(2,
                                new RemoveNthNodeFromEndOfList.ListNode(3,
                                        new RemoveNthNodeFromEndOfList.ListNode(5)
                                )
                        )
                )
        );
    }

    @Test
    void test2() {
        assertThat(obj.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1), 1))
                .isEqualTo(new RemoveNthNodeFromEndOfList.ListNode());
    }

    @Test
    void test3() {
        assertThat(obj.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1,
                        new RemoveNthNodeFromEndOfList.ListNode(2)
                ), 1)
        ).isEqualTo(new RemoveNthNodeFromEndOfList.ListNode(1));
    }

    @Test
    void test4() {
        assertThat(obj.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1,
                        new RemoveNthNodeFromEndOfList.ListNode(2)
                ), 2)
        ).isEqualTo(new RemoveNthNodeFromEndOfList.ListNode(2));
    }

    @Test
    void test5() {
        assertThat(obj.removeNthFromEnd(new RemoveNthNodeFromEndOfList.ListNode(1,
                        new RemoveNthNodeFromEndOfList.ListNode(2,
                                new RemoveNthNodeFromEndOfList.ListNode(3))
                ), 2)
        ).isEqualTo(new RemoveNthNodeFromEndOfList.ListNode(2,
                new RemoveNthNodeFromEndOfList.ListNode(3)));
    }
}