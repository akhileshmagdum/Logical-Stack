package string;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class CheckIfStringArraysEquivalent {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Sb = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            word1Sb.append(word1[i]);
        }
        StringBuilder word2Sb = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            word2Sb.append(word2[i]);
        }
        return word1Sb.toString().equals(word2Sb.toString());
    }
}
