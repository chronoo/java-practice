package func;

import io.vavr.collection.List;
import io.vavr.collection.Queue;

public class SameClass {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 6);

        System.out.println(list.filter(x -> x % 2 == 0));

        System.out.println(list.drop(2));

        System.out.println(list.dropRight(2));

        System.out.println(list.take(2));

        System.out.println(list.takeRight(2));

        System.out.println(list.head() + ":" + list.tail());

        System.out.println(list.isSingleValued());

        System.out.println(list.take(1).single());

        System.out.println(list.distinct());

        System.out.println(
            list.intersperse(100500)
                .reduce((x, y) -> x + y)
        );

        System.out.println(list.pop());

        System.out.println(list.peek());

        System.out.println(list.push(10));

        System.out.println(list.pop2Option());

        Queue<Integer> queue = Queue.of(1, 2, 3, 4);

        System.out.println(queue.enqueue(5, 6, 7));

        System.out.println(queue.dequeue());

        System.out.println(queue.combinations());

    }
}
