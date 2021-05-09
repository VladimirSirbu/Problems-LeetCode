package array.easy;


public class NumberOfSubArraysWithOddSum {

    // my aproach
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                sum += arr[j];
                if (sum % 2 == 1)
                    count++;
            }
            sum = 0;
        }
        return count;
    }

    // the most inteligent aproach
    public int numOfSubarrays1(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for(int i = 0; i< n; i++) {
            prefix[i + 1] = prefix[i]  + arr[i];
        }
        long odd = 0;
        for (int i = 0; i <= n; i++) {
            odd += prefix[i] % 2;
        }
        return (int)(odd * (n + 1 - odd) % 1000000007);
    }
}
