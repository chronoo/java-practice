package homework;

import java.util.Map;

import static java.util.Map.entry;

public class RomanToInteger {
    private static final Map<String, String> REPLACES = Map.of(
        "IV", "IIII",
        "IX", "VIIII",
        "XL", "XXXX",
        "XC", "LXXXX",
        "CD", "CCCC",
        "CM", "DCCCC"
    );

    private static final Map<Character, Integer> DIGITS = Map.ofEntries(
        entry('I', 1),
        entry('V', 5),
        entry('X', 10),
        entry('L', 50),
        entry('C', 100),
        entry('D', 500),
        entry('M', 1000)
    );

    public int romanToInt(String s) {
        String temp = s;
        for (Map.Entry<String, String> replace : REPLACES.entrySet()) {
            temp = temp.replace(replace.getKey(), replace.getValue());
        }
        return temp.chars()
            .mapToObj(x -> (char) x)
            .mapToInt(DIGITS::get)
            .sum();
    }
}
