package algorithms.tests.string;

import org.junit.Assert;
import org.junit.Test;
import string.LengthOfLastWord;

public class TestLengthOfLastWord {

    private LengthOfLastWord lastWord = new LengthOfLastWord();

    @Test
    public void testLengthOfLastWord() {
        Assert.assertEquals(5, lastWord.lengthOfLastWord1("Hello World"));
        Assert.assertEquals(0, lastWord.lengthOfLastWord1(" "));
        Assert.assertEquals(3, lastWord.lengthOfLastWord1("Day"));
        Assert.assertEquals(4, lastWord.lengthOfLastWord1("Hello my name is Mark"));
    }

    @Test
    public void testLengthOfLastWord1() {
        Assert.assertEquals(5, lastWord.lengthOfLastWord2("Hello World"));
        Assert.assertEquals(0, lastWord.lengthOfLastWord2(" "));
        Assert.assertEquals(3, lastWord.lengthOfLastWord2("Day"));
        Assert.assertEquals(4, lastWord.lengthOfLastWord2("Hello my name is Mark"));
    }

}
