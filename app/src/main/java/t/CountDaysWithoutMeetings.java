package t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/count-days-without-meetings
 */
public class CountDaysWithoutMeetings {
    public int countDays(int days, int[][] meetings) {
        var meets = new LinkedList<int[]>();
        Arrays.sort(meetings, Comparator.comparing(x -> ((int[]) x)[0]).thenComparing(x -> ((int[]) x)[1]));
        for (var meeting : meetings) {
            var head = meets.pollLast();
            if (head == null) {
                meets.add(meeting);
            } else if (head[1] < meeting[0]) {
                meets.add(head);
                meets.add(meeting);
            } else {
                meets.add(new int[]{head[0], Math.max(head[1], meeting[1])});
            }
        }
        var count = 0;
        for (var meet : meets) {
            count += meet[1] - meet[0] + 1;
        }
        return days - count;
    }
}
