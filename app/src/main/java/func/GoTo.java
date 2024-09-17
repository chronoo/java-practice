package func;

public class GoTo {
    public static void main(String[] args) {
        Integer i = 0;
        start:
        {
            if (i < 10) {
                i = i + 1;
                System.out.println(i);
                break start;
            }
            else {
                System.out.println("finish");
            }
        }
    }
}
