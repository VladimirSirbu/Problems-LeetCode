package algorithms.tests.string.easy;

import org.junit.Test;
import string.easy.RomanToInteger;
import static org.junit.Assert.assertEquals;

public class TestRomanToInteger {

    private RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void testRomanToInt() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
