package leetCodeQV2;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    /**
     * You are given two strings s and t.
     *
     * String t is generated by random shuffling string s and then add one more letter at a random position.
     *
     * Return the letter that was added to t.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "abcd", t = "abcde"
     * Output: "e"
     * Explanation: 'e' is the letter that was added.
     * Example 2:
     *
     * Input: s = "", t = "y"
     * Output: "y"
     */

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> mapOfS =  new HashMap<>();
        Map<Character, Integer> mapOfT =  new HashMap<>();

        char [] charArrayT  = t.toCharArray();
        char [] charArrayS  = s.toCharArray();

        for (char element : charArrayT) {
            if (mapOfT.containsKey(element)) {
                int count = mapOfT.get(element) + 1;
                mapOfT.put(element, count);
            } else {
                mapOfT.put(element, 1);
            }
        }

        for (char element : charArrayS) {
            if (mapOfS.containsKey(element)) {
                int count = mapOfS.get(element) + 1;
                mapOfS.put(element, count);
            } else {
                mapOfS.put(element, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapOfT.entrySet()) {
            if (mapOfS.containsKey(entry.getKey())) {
                int valueOfEntry = entry.getValue();
                int valueOfEntryInS = mapOfS.get(entry.getKey());

                if (valueOfEntry != valueOfEntryInS) {
                    return entry.getKey();
                }
            } else {
                return entry.getKey();
            }
        }

        char defaultValue = '-';
        return defaultValue;
    }

    public static char findTheDifferenceII(String s, String t) {
        int sumT = 0;
        int sumS = 0;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            sumT =sumT +c;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sumS =sumS +c;
        }

        return (char) (sumT - sumS);
    }

    public static void main (String [] args) {
        System.out.println(findTheDifferenceII("","a"));
    }
}
