package algorithms.tests.array.easy;

import array.easy.SquaresOfASortedArray;
import org.junit.Assert;
import org.junit.Test;

public class TestSquaresOfASortedArray {

    private SquaresOfASortedArray squares = new SquaresOfASortedArray();

    @Test
    public void testSortedSquares() {
        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121},
                squares.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
        Assert.assertArrayEquals(new int[]{1, 4, 16, 25, 144},
                squares.sortedSquares(new int[]{-5, -2, -1, 4, 12}));
    }
}
