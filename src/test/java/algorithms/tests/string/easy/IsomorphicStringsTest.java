package algorithms.tests.string.easy;

import org.junit.Assert;
import org.junit.Test;
import string.easy.IsomorphicStrings;

public class IsomorphicStringsTest {

    private IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @Test
    public void testIsomorphicStrings() {
        Assert.assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
        Assert.assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
        Assert.assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
        Assert.assertFalse(isomorphicStrings.isIsomorphic("badc", "baba"));
    }
}
