package LeetCode.Arrays;

/**
 * Max Consecutive Ones
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * @author woonji.kim
 */
public class MaxConsencutiveOnes_3238 {
	public static void main(String[] args) {
		//		System.out.println(findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));
		//		System.out.println(findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
		//		System.out.println(findMaxConsecutiveOnes(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		System.out.println(answer(new int[] {1, 1, 1, 0, 1, 1, 0, 1, 1}));
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int maxCnt = 0;
		int cnt = 0;

		for (int num : nums) {
			if (num == 1) {
				cnt++;
			} else {
				if (maxCnt < cnt) {
					maxCnt = cnt;
				}
				cnt = 0;
			}
		}

		if (maxCnt < cnt) {
			maxCnt = cnt;
		}

		return maxCnt;
	}

	private static int answer(int[] nums) {
		int maxCnt = 0;
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				cnt++;
			} else {
				maxCnt = Math.max(maxCnt, cnt);
				cnt = 0;
			}
		}

		return Math.max(maxCnt, cnt);
	}
}
