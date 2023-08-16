package string;

/**
 * https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
 */
public class RemoveTrailingZeros {

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("5123100"));
    }

    public static String removeTrailingZeros(String num) {
        char[] numArr = num.toCharArray();
        int zeroCount = 0;
        for (int i = numArr.length - 1; i > 0; i--) {
            if (numArr[i] == '0') {
                zeroCount++;
            } else {
                break;
            }
        }
        StringBuilder answer = new StringBuilder(num);
        return answer.replace(num.length() - zeroCount, num.length() + 1, "").toString();
    }
}
