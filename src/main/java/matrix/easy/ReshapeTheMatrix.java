package matrix.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {


    // Aproach 1
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c)
            return nums;

        Queue<Integer> queue = new LinkedList<>();
        int[][] reshapedMatrix = new int[r][c];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                queue.add(nums[i][j]);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedMatrix[i][j] = queue.remove();
            }
        }

        return reshapedMatrix;
    }

    // Aproach 2
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c)
            return nums;

        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                reshapedMatrix[row][col++] = nums[i][j];
                if (col == c){
                    col = 0;
                    row++;
                }
            }
        }

        return reshapedMatrix;
    }

    private void printMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
