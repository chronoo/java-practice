import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        var result = new ArrayList<Integer>();
        for (var i = 0; i < height.length - 1; i++) if (height[i] > threshold) result.add(i + 1);
        return result;
    }
}
