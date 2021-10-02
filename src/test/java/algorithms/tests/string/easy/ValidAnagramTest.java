package algorithms.tests.string.easy;

import org.junit.Assert;
import org.junit.Test;
import string.easy.ValidAnagram;

public class ValidAnagramTest {

    private final ValidAnagram anagram = new ValidAnagram();

    @Test
    public void testIsAnagram() {
        Assert.assertTrue(anagram.isAnagram("anagram", "nagaram"));
        Assert.assertFalse(anagram.isAnagram("rat","car"));
        Assert.assertFalse(anagram.isAnagram("aacc","ccac"));
    }

    @Test
    public void testIsAnagram1() {
        Assert.assertTrue(anagram.isAnagram1("anagram", "nagaram"));
        Assert.assertFalse(anagram.isAnagram1("rat","car"));
        Assert.assertFalse(anagram.isAnagram1("aacc","ccac"));
    }

    @Test
    public void testIsAnagram2() {
        Assert.assertTrue(anagram.isAnagram2("anagram", "nagaram"));
        Assert.assertFalse(anagram.isAnagram2("rat","car"));
        Assert.assertFalse(anagram.isAnagram2("aacc","ccac"));
    }
}
