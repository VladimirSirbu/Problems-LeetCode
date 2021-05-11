package algorithms.tests.string.easy;

import org.junit.Assert;
import org.junit.Test;
import string.easy.ReverseVowelsOfAString;

public class TestReverseVowelsOfAString {

    ReverseVowelsOfAString reverse = new ReverseVowelsOfAString();

    @Test
    public void TestReverseVowels() {
        Assert.assertEquals("holle", reverse.reverseVowels("hello"));
        Assert.assertEquals("leotcede", reverse.reverseVowels("leetcode"));
        Assert.assertEquals("aA", reverse.reverseVowels("Aa"));
        Assert.assertEquals("race a car", reverse.reverseVowels("raca e car"));
    }

    @Test
    public void TestReverseVowels1() {
        Assert.assertEquals("holle", reverse.reverseVowels1("hello"));
        Assert.assertEquals("leotcede", reverse.reverseVowels1("leetcode"));
        Assert.assertEquals("aA", reverse.reverseVowels1("Aa"));
        Assert.assertEquals("race a car", reverse.reverseVowels1("raca e car"));
    }
}
