package t;

import func.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PalindromeLinkedListTest {
    PalindromeLinkedList obj = new PalindromeLinkedList();

    @Test
    void test1() {
        assertThat(obj.isPalindrome(
            new ListNode(1,
                new ListNode(2,
                    new ListNode(2,
                        new ListNode(1))))
        )).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isPalindrome(
            new ListNode(1,
                new ListNode(2)))).isFalse();
    }
}