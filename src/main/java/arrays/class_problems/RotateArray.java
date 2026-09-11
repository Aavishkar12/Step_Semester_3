package arrays.class_problems;

import java.util.Arrays;

/**
 * Week 4 - S4 - Practice Problem L5: Rotate Array (right by k)
 *
 * Reduce k with k % n, then place every element at (i + k) % n in a new array.
 * Time O(n), space O(n).
 */
public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {    // copy back so the caller's array is rotated too
            nums[i] = rotated[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2}, 3)));
    }
}
