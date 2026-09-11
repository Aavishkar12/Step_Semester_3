package arrays.assigment_problems;

/**
 * Week 4 - S4 - Assignment Problem A5: Find Minimum in Rotated Sorted Array
 *
 * Modified binary search: if nums[mid] > nums[right], the minimum is to the right of mid;
 * otherwise it is at mid or to its left. Also handles the no-rotation case.
 * Time O(log n), space O(1).
 */
public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
    }
}
