package t;

/**
 * https://leetcode.com/problems/decode-xored-array
 */
public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        var res = new int[encoded.length + 1];
        res[0] = first;
        for (var i = 0; i < encoded.length; i++) res[i + 1] = encoded[i] ^ res[i];
        return res;
    }
}
