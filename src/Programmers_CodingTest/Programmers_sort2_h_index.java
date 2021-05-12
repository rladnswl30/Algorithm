package Programmers_CodingTest;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author woonji.kim
 */
public class Programmers_sort2_h_index {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
		System.out.println(solution(new int[]{1, 1, 2, 6, 8}));
		System.out.println(solution(new int[]{0, 1, 2, 3, 6}));
	}

	public static int solution(int[] citations) {
		Integer[] cits = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		Arrays.sort(cits, Collections.reverseOrder());

		for (int i = 0; i < cits.length; i++) {
			if (i >= cits[i]) {
				return i;
			}
		}

		return cits.length;
	}
}
