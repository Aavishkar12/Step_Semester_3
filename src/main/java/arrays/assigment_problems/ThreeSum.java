package arrays.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Week 4 - S4 - Assignment Problem A3: 3Sum
 *
 * Sort, then for each index i use two pointers (left, right) on the rest of the array.
 * Duplicates are skipped for i, left and right so each triplet is reported once.
 * Time O(n^2), space O(1) apart from the output.
 */
public class ThreeSum {

    public static int[][] threeSum(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        List<int[]> triplets = new ArrayList<>();

        for (int i = 0; i < sorted.length - 2; i++) {
            if (i > 0 && sorted[i] == sorted[i - 1]) continue;       // skip duplicate first values
            if (sorted[i] > 0) break;                                // nothing positive can sum to 0

            int left = i + 1, right = sorted.length - 1;
            while (left < right) {
                int sum = sorted[i] + sorted[left] + sorted[right];
                if (sum == 0) {
                    triplets.add(new int[]{sorted[i], sorted[left], sorted[right]});
                    while (left < right && sorted[left] == sorted[left + 1]) left++;
                    while (left < right && sorted[right] == sorted[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
        System.out.println(Arrays.deepToString(threeSum(new int[]{0, 0, 0})));
        System.out.println(Arrays.deepToString(threeSum(new int[]{-2, 0, 0, 2, 2, -2, 0})));
    }
}
