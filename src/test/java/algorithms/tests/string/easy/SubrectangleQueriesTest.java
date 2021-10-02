package algorithms.tests.string.easy;

import matrix.medium.SubrectangleQueries;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SubrectangleQueriesTest {

    private int[][] matrix;

    @Test
    public void test1() {
        matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        SubrectangleQueries subrectangleQueries =
                new SubrectangleQueries(matrix);
        // 1
        Assert.assertEquals(6, subrectangleQueries.getValue(1, 2));

        // 2
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        Assert.assertTrue(Arrays.deepEquals(
                subrectangleQueries.getMatrix(),
                new int[][] {
                        {5,5,5},
                        {5,5,5},
                        {5,5,5},
                        {5,5,5},
                }
                ));
    }
}
