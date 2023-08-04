package string;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
public class MaxWordsInSentence {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = Integer.MIN_VALUE;

        for (int i = 0; i < sentences.length; i++) {
            int words = sentences[i].split(" ").length;
            if (maxWords < words) {
                maxWords = words;
            }
        }
        return maxWords;
    }
}
