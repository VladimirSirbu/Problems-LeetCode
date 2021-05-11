package string.medium;

import java.util.HashMap;
import java.util.Map;


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
}
