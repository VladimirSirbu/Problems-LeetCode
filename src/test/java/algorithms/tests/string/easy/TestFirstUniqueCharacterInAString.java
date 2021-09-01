package algorithms.tests.string.easy;

import org.junit.Assert;
import org.junit.Test;
import string.easy.FirstUniqueCharacterInAString;

public class TestFirstUniqueCharacterInAString {

    private FirstUniqueCharacterInAString firstUniq
            = new FirstUniqueCharacterInAString();

    @Test
    public void firstUniqCharTest() {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        Assert.assertEquals(0, firstUniq.firstUniqChar(s1));
        Assert.assertEquals(2, firstUniq.firstUniqChar(s2));
        Assert.assertEquals(-1, firstUniq.firstUniqChar(s3));
    }
}
