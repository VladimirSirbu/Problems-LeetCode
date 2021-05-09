package algorithms.tests.array.easy;

import array.easy.TheKWeakestRowsInAMatrix;
import org.junit.Assert;
import org.junit.Test;

public class TestTheKWeakestRowsInAMatrix {

    TheKWeakestRowsInAMatrix weakest = new TheKWeakestRowsInAMatrix();

    @Test
    public void testKWeakestRows() {

        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;

        Assert.assertArrayEquals(new int[]{2, 0, 3}, weakest.kWeakestRows1(matrix, 3));
        Assert.assertArrayEquals(new int[]{2, 0, 3}, weakest.kWeakestRows(matrix, 3));
        Assert.assertArrayEquals(new int[]{2, 0, 3, 1}, weakest.kWeakestRows(matrix, 4));
    }
}
