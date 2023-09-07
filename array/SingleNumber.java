package array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            /*
            .add() method returns true
            if the element that we are adding does not exist in the set
            */
            if (!numbers.add(i)) {
                numbers.remove(i);
            }
        }
        return numbers.stream().findFirst().get();
    }
}
