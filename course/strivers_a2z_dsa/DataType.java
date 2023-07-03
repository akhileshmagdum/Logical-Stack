package course.strivers_a2z_dsa;

/**
 * https://practice.geeksforgeeks.org/problems/data-type-1666706751/1
 */
public class DataType {

    public static void main(String[] args) {
        System.out.println(dataTypeSize("Integer"));
    }

    static int dataTypeSize(String str) {
        int result;
        if (str.equals("Character")) {
            result = 1;
        } else if (str.equals("Integer") || str.equals("Float")) {
            result = 4;
        } else {
            result = 8;
        }
        return result;
    }
}
