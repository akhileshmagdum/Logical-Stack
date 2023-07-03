package pattern;

/**
 * GFG Star (asterisk) Pattern related problem
 */
public class PrintPattern {

    public static void main(String[] args) {
        printSquare(5);
        printRightTriangle(5);
    }

    /**
     * https://practice.geeksforgeeks.org/problems/square-pattern/1
     */
    static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * https://practice.geeksforgeeks.org/problems/right-triangle/1
     */
    static void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
