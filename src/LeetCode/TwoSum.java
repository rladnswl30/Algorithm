package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author woonji.kim
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] result = twoSum(new int[]{2,7,11,15}, 9);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[]{map.get(nums[i]), i};
			}
			map.put(target - nums[i], i);
		}
		return new int[]{};
	}
}
