package algorithms.tests.string;

import org.junit.Test;
import string.LongestCommonPrefix;
import static org.junit.Assert.assertEquals;

public class TestLongestCommonPrefix {

    LongestCommonPrefix commonPrefix = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() {
        assertEquals("fl", commonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", commonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("a", commonPrefix.longestCommonPrefix(new String[]{"a"}));
        assertEquals("flower", commonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
        assertEquals("a", commonPrefix.longestCommonPrefix(new String[]{"ab","a"}));
    }

    @Test
    public void testLongestCommonPrefix1() {
        assertEquals("fl", commonPrefix.longestCommonPrefix1(new String[]{"flower","flow","flight"}));
        assertEquals("", commonPrefix.longestCommonPrefix1(new String[]{"dog","racecar","car"}));
        assertEquals("a", commonPrefix.longestCommonPrefix1(new String[]{"a"}));
        assertEquals("flower", commonPrefix.longestCommonPrefix1(new String[]{"flower","flower","flower","flower"}));
        assertEquals("a", commonPrefix.longestCommonPrefix1(new String[]{"ab","a"}));
        assertEquals("", commonPrefix.longestCommonPrefix1(new String[]{"flower","flower","flower","biflower"}));
    }


}
