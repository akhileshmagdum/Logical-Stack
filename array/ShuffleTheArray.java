package array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {

    public static void main(String[] args) {
        System.out.println(Arrays
                .toString(
                        shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)
                ));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            answer[i] = nums[i / 2];
            answer[i + 1] = nums[nums.length - n];
            n = n - 1;
        }
        return answer;
    }
}
