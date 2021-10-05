package algorithms.tests.string.medium;

import org.junit.Assert;
import org.junit.Test;
import string.medium.RemoveAllOccurrencesOfASubstring;

public class RemoveAllOccurrencesOfASubstringTest {

    private RemoveAllOccurrencesOfASubstring remove = new RemoveAllOccurrencesOfASubstring();

    @Test
    public void testRemoveOccurrences() {
        Assert.assertEquals("dab", remove.removeOccurrences("daabcbaabcbc", "abc"));
        Assert.assertEquals("ab", remove.removeOccurrences("axxxxyyyyb", "xy"));
        Assert.assertEquals("", remove.removeOccurrences("ababcc", "abc"));
        Assert.assertEquals("ba", remove.removeOccurrences("aabababa", "aba"));
    }
}
