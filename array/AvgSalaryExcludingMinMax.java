package array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class AvgSalaryExcludingMinMax {

    public static void main(String[] args) {
        System.out.println(average(new int[]{2000, 3000, 1000}));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double totalSal = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            totalSal += salary[i];
        }
        double totalNum = salary.length - 2;
        return totalSal / totalNum;
    }
}
