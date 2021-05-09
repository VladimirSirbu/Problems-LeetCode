package algorithms.tests.array.medium;

import array.medium.RabbitsInForest;
import org.junit.Assert;
import org.junit.Test;

public class TestRabbitsForest {

    private RabbitsInForest rabbitsInForest = new RabbitsInForest();

    @Test
    public void testNumRabbits() {
        Assert.assertEquals(5, rabbitsInForest.numRabbits(new int[]{1, 1, 2}));
        Assert.assertEquals(7, rabbitsInForest.numRabbits(new int[]{1, 1, 2, 1}));
        Assert.assertEquals(11, rabbitsInForest.numRabbits(new int[]{10, 10, 10}));
        Assert.assertEquals(5, rabbitsInForest.numRabbits(new int[]{1, 0, 1, 0, 0}));
        Assert.assertEquals(6, rabbitsInForest.numRabbits(new int[]{0, 0, 1, 1, 1}));
        Assert.assertEquals(9, rabbitsInForest.numRabbits(new int[]{1, 1, 0, 2, 0, 1}));
    }
}
