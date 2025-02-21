package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ImplementStackUsingQueuesTest {
    ImplementStackUsingQueues.MyStack myStack  = new ImplementStackUsingQueues.MyStack();

    @Test
    void test1() {
        myStack.push(1);
        myStack.push(2);
        assertThat(myStack.top()).isEqualTo(2); // return 2
        assertThat(myStack.pop()).isEqualTo(2); // return 2
        assertThat(myStack.empty()).isFalse(); // return False
    }
}