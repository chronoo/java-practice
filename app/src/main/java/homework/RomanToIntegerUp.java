package homework;

public class RomanToIntegerUp {
    public int romanToInt(String s) {
        int a = 0, n = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> n = 1;
                case 'V' -> n = 5;
                case 'X' -> n = 10;
                case 'L' -> n = 50;
                case 'C' -> n = 100;
                case 'D' -> n = 500;
                case 'M' -> n = 1000;
            }
            if (4 * n < a) a -= n;
            else a += n;
        }
        return a;
    }
}
