package arrays.class_problems;

import java.util.Arrays;

/**
 * Week 4 - S4 - Practice Problem L1: Two Sum
 *
 * Brute force: check every pair (i, j) with nested loops. Time O(n^2), space O(1).
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];   // not expected: the problem guarantees exactly one pair
    }

    public static void main(String[] args) {
        int[][] inputs = {{2, 7, 11, 15}, {3, 2, 4}};
        int[] targets = {9, 6};
        for (int t = 0; t < inputs.length; t++) {
            int[] nums = inputs[t];
            int[] result = twoSum(nums, targets[t]);
            System.out.println("nums = " + Arrays.toString(nums) + ", target = " + targets[t] + " -> "
                    + Arrays.toString(result) + " (nums[" + result[0] + "] + nums[" + result[1] + "] = "
                    + nums[result[0]] + " + " + nums[result[1]] + " = " + targets[t] + ")");
        }
    }
}
