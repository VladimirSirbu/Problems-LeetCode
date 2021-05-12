package others;

public class WindowSlidingTechnique {
    /** find max sum of k-th elemets from given array **/
    // Aproach 1
    public int maxSum (int arr[], int k) {
        if (k > arr.length)
            return -1;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum = currentSum + arr[i + j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Aproach 2
    public int maxSum1 (int arr[], int k) {
        if (k > arr.length)
            return -1;

        int maxSum = 0;
        for (int i = 0; i < k; i++)
            maxSum += arr[i];

        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
