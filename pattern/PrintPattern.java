package pattern;

/**
 * GFG Star (asterisk) Pattern related problem
 */
public class PrintPattern {

    public static void main(String[] args) {
//        printSquare(5);
//        printRightTriangle(5);
//        printRightNumberTriangle(5);
//        printRightNumberSeriesTriangle(5);
//        printReverseRightTriangle(5);
//        printReverseRightNumberTriangle(5);
        printPyramid(5);
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

    /**
     * https://practice.geeksforgeeks.org/problems/triangle-number/1
     */
    static void printRightNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1
     */
    static void printRightNumberSeriesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /**
     * https://practice.geeksforgeeks.org/problems/triangle-pattern/1
     */
    static void printReverseRightTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1
     */
    static void printReverseRightNumberTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1
     */
    static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
