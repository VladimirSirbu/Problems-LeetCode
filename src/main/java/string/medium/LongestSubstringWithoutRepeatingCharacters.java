package string.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {

    // Aproach 1
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;

        int maxLenSubStr = 0; // maximum length of a substring
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length()) {
                if (map.containsKey(s.charAt(j)))
                    break;
                map.put(s.charAt(j++), 1);
            }
            maxLenSubStr = Math.max(maxLenSubStr, s.substring(i, j).length());
            map.clear();
        }
        return maxLenSubStr;
    }

    // Aproach 2 (using Window Sliding Technique)
    public int lengthOfLongestSubstring1(String s) {
        if (s.isEmpty() || s == null)
            return 0;

        int maxLenSubStr = 0; /* keep track of the maximum length substring that we come across that has no repeating characters */
        int windowLength, j = 0, i = 0; // actual window length
        Set<Character> set = new HashSet<>(); // keep track of the UNIQUE characters that we see in our window

        while (i < s.length()) {
            if (set.add(s.charAt(i))) {
                windowLength = set.size();
                maxLenSubStr = Math.max(windowLength,maxLenSubStr);
                i++;
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return maxLenSubStr;
    }
}
