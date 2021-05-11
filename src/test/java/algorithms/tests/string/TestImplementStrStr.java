package algorithms.tests.string;

import org.junit.Assert;
import org.junit.Test;
import string.ImplementStrStr;

public class TestImplementStrStr {

    private ImplementStrStr strStrRef = new ImplementStrStr();

    /** haystack and needle consist of only lower-case English characters. **/
    @Test
    public void testStrStr() {
        Assert.assertEquals(2, strStrRef.strStr("hello", "ll"));
        Assert.assertEquals(-1, strStrRef.strStr("aaaaa", "bba"));
        Assert.assertEquals(0, strStrRef.strStr("", ""));
        Assert.assertEquals(0, strStrRef.strStr("hello", ""));
        Assert.assertEquals(-1, strStrRef.strStr("", "hy"));
        Assert.assertEquals(4, strStrRef.strStr("mississippi", "issip"));
    }
}
