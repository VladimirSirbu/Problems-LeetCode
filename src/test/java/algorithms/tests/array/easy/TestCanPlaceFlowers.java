package algorithms.tests.array.easy;

import array.easy.CanPlaceFlowers;
import org.junit.Assert;
import org.junit.Test;

public class TestCanPlaceFlowers {

    private CanPlaceFlowers flowers = new CanPlaceFlowers();

    @Test
    public void testCanPlaceFlowers() {
        Assert.assertTrue(flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        Assert.assertFalse(flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        Assert.assertFalse(flowers.canPlaceFlowers(new int[]{1, 1, 0, 0, 1}, 1));
        Assert.assertTrue(flowers.canPlaceFlowers(new int[]{0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 3}, 1));
    }
}
