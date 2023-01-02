package stepik;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class NumbersPrinter {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        boolean yea = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (yea)
                    numbers.add(scanner.nextInt());
                else
                    scanner.next();
                yea = !yea;
            }
        }
        Iterator<Integer> iterator = numbers.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
