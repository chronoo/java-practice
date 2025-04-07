package t;

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        var res = new ArrayList<Integer>();
        for (var i = 0; i < index.length; i++) res.add(index[i], nums[i]);
        return res.stream().mapToInt(x -> x).toArray();
    }
}
