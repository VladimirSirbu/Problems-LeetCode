package algorithms.tests.string.medium;

import org.junit.Assert;
import org.junit.Test;
import string.medium.LongestSubstringWithoutRepeatingCharacters;

public class TestLongestSubstringWithoutRepeatingCharacters {

    private LongestSubstringWithoutRepeatingCharacters longestSubstring = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testLengthOfLongestSubstring () {
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(0, longestSubstring.lengthOfLongestSubstring(""));
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring(" "));
    }
}
