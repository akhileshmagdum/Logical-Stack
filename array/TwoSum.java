package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reminder = target - nums[i];
            if (sumsMap.containsKey(reminder)) {
                return new int[]{i, sumsMap.get(reminder)};
            } else {
                sumsMap.put(nums[i], i);
            }
        }
        return null;
    }
}
