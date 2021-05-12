package Testdome;

import java.util.HashMap;
import java.util.Map;

/**
 * @author woonji.kim
 */
public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < list.length; i++) {
			int cmp = sum - list[i];
			if (result.get(cmp) != null) {
				return new int[]{i, result.get(cmp)};
			}
			result.put(list[i], i);
		}

		return null;
	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
		if(indices != null) {
			System.out.println(indices[0] + " " + indices[1]);
		}
	}
}