package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
