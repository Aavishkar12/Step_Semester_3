package arrays.assigment_problems;

import java.util.Arrays;

/**
 * Week 4 - S4 - Assignment Problem A1: Product of Array Except Self
 *
 * No division. Forward pass stores the product of everything to the LEFT of i in answer[i];
 * backward pass multiplies in a running product of everything to the RIGHT.
 * Time O(n), extra space O(1) beyond the output array.
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
