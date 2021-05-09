package array.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int countGoodPairs = 0;

        for(int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        for(var entry : map.entrySet())
            if (entry.getValue() > 1)
                countGoodPairs = countGoodPairs + (entry.getValue() * (entry.getValue() - 1) / 2);

        return countGoodPairs;
    }

    public int numIdenticalPairs1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }
}
