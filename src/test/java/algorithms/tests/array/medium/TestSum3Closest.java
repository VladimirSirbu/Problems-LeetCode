package algorithms.tests.array.medium;

import array.medium.Sum3Closest;
import org.junit.Assert;
import org.junit.Test;

public class TestSum3Closest {

    private Sum3Closest closest = new Sum3Closest();

    @Test
    public void testThreeSumClosest() {
        Assert.assertEquals(2, closest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assert.assertEquals(2, closest.threeSumClosest(new int[]{1, 1, 1, 0}, -100));
        Assert.assertEquals(82, closest.threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82));
    }
}
