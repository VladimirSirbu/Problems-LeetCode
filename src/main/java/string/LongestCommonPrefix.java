package string;

public class LongestCommonPrefix {
    // Aproach 1 (own)
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String newLongestCommonPrefix;
        String longestCommonPrefix = "";
        int index = 1;

        while (index <= strs[0].length()) {

            newLongestCommonPrefix = strs[0].substring(0, index);

            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(newLongestCommonPrefix))
                    return longestCommonPrefix;
            }
            longestCommonPrefix = newLongestCommonPrefix;
            index++;
        }

        return longestCommonPrefix;
    }

    // Aproach 2
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    
}
