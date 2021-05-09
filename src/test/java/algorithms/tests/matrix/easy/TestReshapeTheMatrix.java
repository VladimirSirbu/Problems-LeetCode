package algorithms.tests.matrix.easy;

import matrix.easy.ReshapeTheMatrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestReshapeTheMatrix {

    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    public void testMatrixReshape_FirstAproach() {
        int[][] expectedMatrix = {{1, 2, 3, 4}};
        int[][] originalMatrix = {{1, 2}, {3, 4}};
        Assert.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(reshapeTheMatrix.matrixReshape(originalMatrix, 1, 4)));
    }

    @Test
    public void testMatrixReshape_SecondAproach() {
        int[][] expectedMatrix = {{1, 2, 3, 4}};
        int[][] originalMatrix = {{1, 2}, {3, 4}};
        Assert.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(reshapeTheMatrix.matrixReshape1(originalMatrix, 1, 4)));
    }

    @Test
    public void testMatrixReshape1_FirstAproach() {
        int[][] originalMatrix = {{1, 2, 3, 4}};
        int[][] expectedMatrix = {{1, 2}, {3, 4}};
        Assert.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(reshapeTheMatrix.matrixReshape(originalMatrix, 2, 2)));
    }

    @Test
    public void testMatrixReshape2_SecondAproach() {
        int[][] originalMatrix = {{1, 2, 3, 4}};
        int[][] expectedMatrix = {{1, 2}, {3, 4}};
        Assert.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(reshapeTheMatrix.matrixReshape1(originalMatrix, 2, 2)));
    }


}
