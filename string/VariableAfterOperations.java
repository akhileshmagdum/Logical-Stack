package string;

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
public class VariableAfterOperations {

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("++")) {
                x++;
            } else if (operations[i].contains("--")) {
                x--;
            }
        }
        return x;
    }
}
