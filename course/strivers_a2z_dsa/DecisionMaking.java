package course.strivers_a2z_dsa;

/**
 * https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0
 */
public class DecisionMaking {

    public static void main(String[] args) {
        System.out.println(compareNM(4, 6));
    }

    static String compareNM(int n, int m) {
        String result = "";
        if (n == m) {
            result = "equal";
        } else if (n > m) {
            result = "greater";
        } else {
            result = "lesser";
        }
        return result;
    }
}
