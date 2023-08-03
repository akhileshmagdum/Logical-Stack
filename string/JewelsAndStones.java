package string;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int totalJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                totalJewels++;
            }
        }
        return totalJewels;
    }
}
