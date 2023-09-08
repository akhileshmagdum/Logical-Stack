package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sort-the-people/
 */
public class SortThePeople {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(sortPeople(
                        new String[]{"Alice", "Bob", "Bob"},
                        new int[]{155, 185, 150})));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }
}
