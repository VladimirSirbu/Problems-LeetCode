package string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /** Approach 1 */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i)))
                map.put(s.charAt(i), t.charAt(i));
            newStr.append(map.get(s.charAt(i)));
        }

        return t.equals(newStr.toString());
    }
}
