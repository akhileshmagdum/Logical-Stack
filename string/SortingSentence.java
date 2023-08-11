package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class SortingSentence {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        List<String> stringList = new ArrayList<>(Arrays.asList(s.split(" ")));
        String[] answerArray = new String[stringList.size()];
        for (String sentence : stringList) {
            answerArray[Integer.parseInt(String.valueOf(sentence.charAt(sentence.length() - 1))) - 1] = sentence.substring(0, sentence.length() - 1);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < answerArray.length; i++) {
            answer.append(answerArray[i]).append(" ");
        }
        return answer.toString().trim();
    }
}
