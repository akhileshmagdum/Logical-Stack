package course.strivers_a2z_dsa;

import java.util.Arrays;
import java.util.List;

/**
 * https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1
 */
public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println(switchCase(2, Arrays.asList(6d, 2d)));
    }

    static double switchCase(int choice, List<Double> arr) {
        double result = switch (choice) {
            case 1 -> Math.PI * Math.pow(arr.get(0), 2);
            case 2 -> arr.get(0) * arr.get(1);
            default -> 0;
        };
        return result;
    }
}
