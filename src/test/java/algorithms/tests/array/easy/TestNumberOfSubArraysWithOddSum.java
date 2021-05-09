package algorithms.tests.array.easy;

import array.easy.NumberOfSubArraysWithOddSum;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfSubArraysWithOddSum {

    NumberOfSubArraysWithOddSum oddSum = new NumberOfSubArraysWithOddSum();

    @Test
    public void testNumOfSubarrays() {
        Assert.assertEquals(4, oddSum.numOfSubarrays(new int[]{1, 3, 5}));
        Assert.assertEquals(0, oddSum.numOfSubarrays(new int[]{2, 4, 6}));
        Assert.assertEquals(16, oddSum.numOfSubarrays(new int[]{1, 2, 3, 4, 5, 6, 7}));
        Assert.assertEquals(4, oddSum.numOfSubarrays(new int[]{100, 100, 99, 99}));
        Assert.assertEquals(1, oddSum.numOfSubarrays(new int[]{7}));
    }

    @Test
    public void testNumOfSubarrays1() {
        Assert.assertEquals(4, oddSum.numOfSubarrays1(new int[]{1, 3, 5}));
        Assert.assertEquals(0, oddSum.numOfSubarrays1(new int[]{2, 4, 6}));
        Assert.assertEquals(16, oddSum.numOfSubarrays1(new int[]{1, 2, 3, 4, 5, 6, 7}));
        Assert.assertEquals(4, oddSum.numOfSubarrays1(new int[]{100, 100, 99, 99}));
        Assert.assertEquals(1, oddSum.numOfSubarrays1(new int[]{7}));
    }
}
