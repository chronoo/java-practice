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
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 0;
        while(right < res.length()){
            while(right<res.length() && res.charAt(left) == res.charAt(right)){
                right++;
            }
            sb.append(right - left);
            sb.append(res.charAt(left));
            left = right;
        }
        return sb.toString();
    }
}
