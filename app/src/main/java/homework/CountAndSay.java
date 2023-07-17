package homework;

public class CountAndSay {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            res = say(res);
        }
        return res;
    }

    private String say(String res) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < res.length(); i++) {
            if (i < res.length() - 1 && res.charAt(i) == res.charAt(i + 1)) {
                count++;
            } else {
                result.append(count).append(res.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }
}
