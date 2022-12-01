package homework;

public class Force {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (!(i == 5 || j == 4 || k == 8))
                        continue;

                    if (i == 5 || j == 3 || k == 0)
                        continue;

                    if (!((i == 1 && j == 5 && k != 7) ||
                            (i == 1 && j != 5 && k == 7) ||
                            (i != 1 && j == 5 && k == 7)))
                        continue;

                    System.out.println(i +","+j+","+k);
                }
            }
        }
    }
}
