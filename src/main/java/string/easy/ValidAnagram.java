package string.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // (own approach - 1)
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

    // (own approach - 2)
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> mapS = new HashMap<>();
        // fill mapS with letters from 's'
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0) + 1);
        }

        Map<Character, Integer> mapT = new HashMap<>();
        // fill mapT with letters from 't'
        for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }

        return mapS.equals(mapT);
    }

    // approach 3 (from leetcode)
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] v = new int[26];

        for (int i = 0; i < s.length(); i++) {
            v[s.charAt(i) - 'a']++;
            v[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < s.length(); i++) {
            if (v[s.charAt(i) - 'a'] != 0)
                return false;
        }
        return true;
    }
}
