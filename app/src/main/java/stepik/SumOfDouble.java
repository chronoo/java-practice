package stepik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        while (scanner.hasNext()) {
            try {
                sum += scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
        System.out.println(String.format("%.6f",  sum));
    }
}
