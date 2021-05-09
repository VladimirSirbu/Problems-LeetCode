package array.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateZeros {
    public static void main(String[] args) {
        int array[] = {1, 0, 2, 3, 0, 4, 5, 0};
        int array1[] = {1, 0, 2, 0, 3};
        duplicateZeros1(array);
        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> map = new TreeMap<>();
    }

    public static int[] duplicateZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        int[] newArr = new int[arr.length + count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newArr[j++] = 0;
                newArr[j++] = 0;
            } else {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void duplicateZeros1(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                if (i + 2 < arr.length) {
                    System.arraycopy(arr, i + 1, arr, i + 2, arr.length - i - 2);
                    arr[i + 1] = 0;
                    i = i + 2;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

}
