package string.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // (own approach)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        // fill map with letters from 's'
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        // check if anagram
        try {
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                map.put(ch, map.get(ch) - 1); // here getting from map may cause NullPointerException
                if (map.get(ch) == -1)
                    return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
