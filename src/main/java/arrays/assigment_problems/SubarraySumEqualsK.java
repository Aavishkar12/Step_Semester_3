package arrays.assigment_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Week 4 - S4 - Assignment Problem A4: Subarray Sum Equals K
 *
 * sum(i+1..j) = prefix[j] - prefix[i], so at each position count how many earlier prefix
 * sums equal (currentSum - k). The map starts with {0: 1} for the empty prefix.
 * Time O(n), space O(n).
 *
 * Why not a sliding window? With negative numbers, growing the window can make the sum
 * smaller, so there is no rule for when to move the left edge.
 */
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for (int num : nums) {
            currentSum += num;
            count += prefixCount.getOrDefault(currentSum - k, 0);
            prefixCount.put(currentSum, prefixCount.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0));
    }
}
