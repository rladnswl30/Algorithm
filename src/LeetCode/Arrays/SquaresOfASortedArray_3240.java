/*
 *
 *  SquaresOfASortedArray_3240.java 2021. 05. 08
 *
 *  Copyright 2021 WorksMobile Corp. All rights Reserved.
 *  WorksMobile PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package LeetCode.Arrays;

import java.util.Arrays;

/**
 * Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * @author woonji.kim
 */
public class SquaresOfASortedArray_3240 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-4, -1, 0, 3, 10})));
	}

	private static int[] sortedSquares(int[] nums) {
		int length = nums.length;
		int[] res = new int[length];
		for (int i = 0; i < length; i++) {
			res[i] = nums[i] * nums[i];
		}

		Arrays.sort(res);

		return res;
	}
}
