package stepik;

import java.io.IOException;

public class ChangeLineBreaker {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        while (prev != -1) {
            int current = System.in.read();
            if (current != '\n' || prev != '\r') {
                System.out.write(prev);
            }
            prev = current;
        }
        System.out.flush();
    }
}
