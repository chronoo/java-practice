package homework;

public class RomanToIntegerUp {
    public int romanToInt(String s) {
        int sum = 0, currentDigit;
        for (int i = s.length() - 1; i >= 0; i--) {
            currentDigit = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            sum += 4 * currentDigit < sum ? -currentDigit : currentDigit;
        }
        return sum;
    }
}
