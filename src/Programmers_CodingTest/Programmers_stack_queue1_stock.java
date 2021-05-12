package Programmers_CodingTest;

import java.util.Arrays;

/**
 * @author woonji.kim
 */
public class Programmers_stack_queue1_stock {
	public static void main(String[] args) {
		// return 4, 3, 1, 1, 0
		System.out.println(solution(new int[]{1, 2, 3, 2, 3}));
	}

	public static int[] solution(int[] prices) {
		int[] ans = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {
				ans[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}

		System.out.println(Arrays.toString(ans));
		return ans;
	}
}
