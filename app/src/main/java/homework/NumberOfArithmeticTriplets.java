package homework;

public class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean findSecond = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (findSecond) break;
                if (nums[j] > nums[i] + diff) break;
                if (nums[j] == nums[i] + diff) {
                    findSecond = true;
                    for (int k = j+1; k < nums.length; k++) {
                        if (nums[k] == nums[j] + diff) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        return count;
    }
}
