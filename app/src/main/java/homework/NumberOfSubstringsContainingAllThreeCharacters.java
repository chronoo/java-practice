package homework;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int count = 0;
        if (getStatistics(s, 0).getMin() == -1) {
            return 0;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            var stat = getStatistics(s, i);
            if (stat.getMin() > -1)
                count += s.length() - stat.getMax();
        }
        return count;
    }

    private IntSummaryStatistics getStatistics(String s, int start) {
        int firstA = s.indexOf('a', start);
        int firstB = s.indexOf('b', start);
        int firstC = s.indexOf('c', start);
        return IntStream.of(firstA, firstB, firstC)
            .summaryStatistics();
    }
}
