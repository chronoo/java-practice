package t;

import func.ListNode;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {
    RemoveLinkedListElements obj = new RemoveLinkedListElements();

    @Test
    void test1() {
        var aa = obj.removeElements(
            new ListNode(1,
                new ListNode(2,
                    new ListNode(3,
                        new ListNode(4,
                            new ListNode(5,
                                new ListNode(6)
                            )
                        )
                    )
                )
            ), 6
        );
        System.out.println(aa);
    }

    @Test
    void test2() {
        var aa = obj.removeElements(
            new ListNode(7,
                new ListNode(7,
                    new ListNode(7,
                        new ListNode(7)
                    )
                )
            ), 7
        );
        System.out.println(aa);
    }
}