package t;

/**
 * https://leetcode.com/problems/jewels-and-stones
 */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        var counts = new int[100];
        for (var cur : stones.toCharArray()) {
            counts[cur - 'A']++;
        }
        var res = 0;
        for (var cur : jewels.toCharArray()) {
            res += counts[cur - 'A'];
        }
        return res;
    }
}
