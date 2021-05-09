package algorithms.tests.array.medium;

import array.medium.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

public class TestContainerWithMostWater {

    ContainerWithMostWater container = new ContainerWithMostWater();

    @Test
    public void testMaxArea() {
        Assert.assertEquals(1, container.maxArea(new int[]{1, 1}));
        Assert.assertEquals(49, container.maxArea(new int[]{1 , 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(16, container.maxArea(new int[]{4, 3, 2, 1, 4}));
        Assert.assertEquals(2, container.maxArea(new int[]{1, 2, 1}));

    }
}
