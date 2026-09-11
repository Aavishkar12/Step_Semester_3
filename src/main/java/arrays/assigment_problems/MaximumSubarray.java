package arrays.assigment_problems;

/**
 * Week 4 - S4 - Assignment Problem A2: Maximum Subarray (Kadane's algorithm)
 *
 * At each element decide: extend the current run, or restart from this element -
 * whichever is larger. Time O(n), space O(1). Works for all-negative arrays too.
 *
 * Follow-up (divide and conquer, O(n log n)): split the array in half; the answer is the
 * best of the left half, the right half, or a subarray crossing the middle (best suffix of
 * the left + best prefix of the right).
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int bestSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);   // restart vs extend
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{-3, -1, -2}));
    }
}
