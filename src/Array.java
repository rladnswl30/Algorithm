import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author woonji.kim
 */
public class Array {
	public static void main(String[] args) {
//		System.out.println(findMaxConsecutiveOnes(new int[]{1}));
//		System.out.println(findMaxConsecutiveOnesSolution(new int[]{1,1,0,1,1,1}));
		System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		if (nums.length == 1 && nums[0] == 1) {
			return 1;
		}

		int cnt = 1;
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				return result;
			}

			if (nums[i] == nums[i + 1]) {
				cnt++;
			} else {
				cnt = 1;
			}

			if (cnt > result) {
				result = cnt;
			}
		}

		return result;
	}

	public static int findMaxConsecutiveOnesSolution(int[] nums) {
		int sum = 0;
		int num = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				num = 0;
			} else if (++num > sum) {
				sum = num;
			}
		}
		return sum;
	}

	public static int findNumbers(int[] nums) {
		List<Integer> lengList = new ArrayList<>();
		int count = 0;

		for (int num : nums) {
			String strNum = Integer.toString(num);
			lengList.add(strNum.length());
		}

		for (int length : lengList) {
			if (length % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}