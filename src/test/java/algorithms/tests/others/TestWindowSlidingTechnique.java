package algorithms.tests.others;

import org.junit.Assert;
import org.junit.Test;
import others.WindowSlidingTechnique;

public class TestWindowSlidingTechnique {

    private WindowSlidingTechnique windowSliding = new WindowSlidingTechnique();

    @Test
    public void testMaxSum() {
        Assert.assertEquals(700, windowSliding.maxSum(new int[]{100, 200, 300, 400}, 2));
        Assert.assertEquals(39, windowSliding.maxSum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
        Assert.assertEquals(-1, windowSliding.maxSum(new int[]{2, 3}, 3));
    }

    @Test
    public void testMaxSum1() {
        Assert.assertEquals(700, windowSliding.maxSum1(new int[]{100, 200, 300, 400}, 2));
        Assert.assertEquals(39, windowSliding.maxSum1(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
        Assert.assertEquals(-1, windowSliding.maxSum1(new int[]{2, 3}, 3));
    }
}
