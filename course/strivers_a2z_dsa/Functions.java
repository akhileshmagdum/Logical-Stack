package course.strivers_a2z_dsa;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/pass-by-reference-and-value/1
 */
public class Functions {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(passedBy(2, 4)));
    }

    static int[] passedBy(int a, int b) {
        return new int[]{a + 1, b + 2};
    }
}
