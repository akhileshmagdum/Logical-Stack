package string;

/**
 * https://leetcode.com/problems/truncate-sentence/
 */
public class TruncateSentence {

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] stringArr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            stringBuilder.append(stringArr[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
