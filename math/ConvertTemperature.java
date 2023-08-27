package math;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/convert-the-temperature/
 */
public class ConvertTemperature {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(2.3456)));
    }

    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
