package array.medium;

import java.util.Arrays;

public class Sum3Closest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int difference = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int pointerX = i + 1;
            int pointerY = nums.length - 1;

            while (pointerX < pointerY) {
                int sum = nums[i] + nums[pointerX] + nums[pointerY];

                if (sum == target) // if difference between 'sum' and 'target' is 0 -> sum == target;
                    return sum;

                if (Math.abs(target - sum) < Math.abs(difference))
                    difference = target - sum;

                if (sum < target)
                    pointerX++;
                else
                    pointerY--;
            }
        }
        return target - difference;
    }
}
