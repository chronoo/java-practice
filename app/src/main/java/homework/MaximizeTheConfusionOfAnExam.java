package homework;

public class MaximizeTheConfusionOfAnExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int trues=0;
        int falses=0;
        int max=0;
        for(int right=0; right<answerKey.length(); right++) {
            char chR = answerKey.charAt(right);
            if(chR == 'T') trues++;
            else falses++;
            while(Math.min(trues, falses) > k) {
                char chL = answerKey.charAt(left);
                if(chL == 'T') trues--;
                else falses--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
