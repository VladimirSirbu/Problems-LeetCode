package string.easy;

public class ImplementStrStr {
    /**
     * Go through the string until match first letter from 'needle'.
     * If exist a substring from that index equals to 'needle' string then return i.
     * If not exist a substring then continue to search another match of first letter of 'needle',
     * until we get to the index(inclusive) = haystack.length - needle.length =>,
     * (because is doesn't make any sense to through the whole string_.
     **/
    // own aproach
    public int strStr(String haystack, String needle) {

        if ((haystack.length() == 0 && needle.length() == 0) || (haystack.length() != 0 && needle.length() == 0))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String substr = haystack.substring(i, needle.length() + i);
                if (substr.equals(needle))
                    return i;
            }
        }

        return -1;
    }
}
