package homework;

public class MaximizeTheConfusionOfAnExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max = 0;
        int trues = 0;
        int falses = 0;
        int left = 0;
        for (int right = 0; right < answerKey.length(); right++) {
            if (answerKey.charAt(right) == 'T') trues++;
            else falses++;
            while (trues > k && falses > k) {
                if (answerKey.charAt(left) == 'T') trues--;
                else falses--;
                left++;
            }
            int currentMax = right - left + 1;
            if (currentMax > max) max = currentMax;
        }
        return max;
    }
}
