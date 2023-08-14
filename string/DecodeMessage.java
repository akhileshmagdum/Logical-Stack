package string;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/decode-the-message/
 */
public class DecodeMessage {

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        key = key.replace(" ", "");
        LinkedList<String> charOrderedList = new LinkedList<>();
        for (int i = 0; i < key.length(); i++) {
            if (!charOrderedList.contains(String.valueOf(key.charAt(i)))) {
                charOrderedList.add(String.valueOf(key.charAt(i)));
            }
        }

        HashMap<String, String> decodingTable = new HashMap<>(26);
        int j = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            decodingTable.put(charOrderedList.get(j), String.valueOf(i));
            j++;
        }

        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                decodedMessage.append(' ');
            } else {
                decodedMessage.append(decodingTable.get(String.valueOf(message.charAt(i))));
            }
        }
        return decodedMessage.toString();
    }
}
