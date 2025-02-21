package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/implement-stack-using-queues
 */
public class ImplementStackUsingQueues {
    public static class MyStack {
        private final List<Integer> stack = new ArrayList<>();

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            return stack.removeLast();
        }

        public int top() {
            return stack.getLast();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
