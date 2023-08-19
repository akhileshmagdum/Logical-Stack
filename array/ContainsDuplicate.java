package array;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 5, 0, 6}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setInt = new HashSet<>();
        for (int element : nums) {
            setInt.add(element);
        }
        return nums.length != setInt.size();
    }
}
