package homework;

import java.util.*;

public class IntegerToRoman {
    public String intToRoman(int num) {
        LinkedHashMap<Integer, String> pairs = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        pairs.put(1000, "M");
        pairs.put(900, "CM");
        pairs.put(500, "D");
        pairs.put(400, "CD");
        pairs.put(100, "C");
        pairs.put(90, "XC");
        pairs.put(50, "L");
        pairs.put(40, "XL");
        pairs.put(10, "X");
        pairs.put(9, "IX");
        pairs.put(5, "V");
        pairs.put(4, "IV");
        pairs.put(1, "I");

        int cur = num;

        do {
            for(var a : pairs.entrySet()) {
                if (cur >= a.getKey()) {
                    result.append(a.getValue());
                    cur -= a.getKey();
                    break;
                }
            }
        } while (cur > 0);

        return result.toString();
    }
}
