package array.easy;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] arr) {
        if (arr.length == 0)
            return arr;
        int[] newArr = new int[arr.length];
        int low = 0, high = arr.length - 1, i = arr.length - 1;
        while (low <= high) {
            if (Math.abs(arr[low]) > Math.abs(arr[high])){
                newArr[i--] = (int)Math.pow(arr[low], 2);
                low++;
            } else {
                newArr[i--] = (int)Math.pow(arr[high], 2);
                high--;
            }
        }
        return newArr;
    }
}


