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
}
