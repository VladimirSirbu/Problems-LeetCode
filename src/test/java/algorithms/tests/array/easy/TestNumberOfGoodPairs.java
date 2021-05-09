package algorithms.tests.array.easy;

import array.easy.NumberOfGoodPairs;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfGoodPairs {

    NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();

    @Test
    public void testNumIdenticalPairs1() {
        Assert.assertEquals(4, goodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assert.assertEquals(6, goodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        Assert.assertEquals(0, goodPairs.numIdenticalPairs(new int[]{1, 2, 3}));
    }

    @Test
    public void testNumIdenticalPairs2() {
        Assert.assertEquals(4, goodPairs.numIdenticalPairs1(new int[]{1, 2, 3, 1, 1, 3}));
        Assert.assertEquals(6, goodPairs.numIdenticalPairs1(new int[]{1, 1, 1, 1}));
        Assert.assertEquals(0, goodPairs.numIdenticalPairs1(new int[]{1, 2, 3}));
    }
}
