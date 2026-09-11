package arrays.class_problems;

import java.util.Arrays;

/**
 * Week 4 - S4 - Practice Problem L3: Contains Duplicate
 *
 * Pairwise comparison with nested loops and early exit. Time O(n^2), space O(1).
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] inputs = {{1, 2, 3, 1}, {1, 2, 3, 4}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + containsDuplicate(nums));
        }
    }
}
