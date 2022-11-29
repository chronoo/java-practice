package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    public void test1() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(
                "807",
                addTwoNumbers.toString(addTwoNumbers.addTwoNumbers(
                                new ListNode(
                                        2,
                                        new ListNode(
                                                4,
                                                new ListNode(3)
                                        )
                                ),
                                new ListNode(
                                        5,
                                        new ListNode(
                                                6,
                                                new ListNode(4)
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test2() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(
                "10009998",
                addTwoNumbers.toString(addTwoNumbers.addTwoNumbers(
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))),
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9))))
                        )
                )
        );
    }

    @Test
    public void test3() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(
                "0",
                addTwoNumbers.toString(addTwoNumbers.addTwoNumbers(
                                new ListNode(0),
                                new ListNode(0)
                        )
                )
        );
    }

    @Test
    public void test() {
        assertEquals("342", new AddTwoNumbers().toString(
                        new ListNode(
                                2,
                                new ListNode(
                                        4,
                                        new ListNode(3)
                                )
                        )
                )
        );
    }
}