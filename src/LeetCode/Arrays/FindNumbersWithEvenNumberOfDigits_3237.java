package LeetCode.Arrays;

/**
 * Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * @author woonji.kim
 */
public class FindNumbersWithEvenNumberOfDigits_3237 {
	public static void main(String[] args) {
//		System.out.println(findNumbers(new int[] {12, 345, 2, 6, 7896}));
		System.out.println(findNumbers(new int[] {555, 901, 482, 1771}));
	}

	private static int findNumbers(int[] nums) {
		int cnt = 0;

		for (int num : nums) {
			int res = (int)Math.log10(num) + 1;
			if (res % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
