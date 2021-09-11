package string.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /** Approach 1 (own) */
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

    /** Aproach 2 */
    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] dictionarStoT = new int[256];
        int[] dictionarTtoS = new int[256];
        Arrays.fill(dictionarStoT, -1);
        Arrays.fill(dictionarTtoS, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (dictionarStoT[ch1] == -1 && dictionarTtoS[ch2] == -1) {
                dictionarStoT[ch1] = ch2;
                dictionarTtoS[ch2] = ch1;
            }

            if (!(dictionarStoT[ch1] == ch2 && dictionarTtoS[ch2] == ch1))
                return false;

        }
        return true;
    }
}
