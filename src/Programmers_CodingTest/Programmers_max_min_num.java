package Programmers_CodingTest;

import java.util.Arrays;

/**
 * Programmers :: 최대값과 최소값
 * @author woonji.kim
 */
public class Programmers_max_min_num {
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
		System.out.println(solution("0 12 13 9 1"));
	}

	public static String solution(String s) {
		String[] sArr = s.split(" ");
		int[] iArr = Arrays.asList(sArr).stream().mapToInt(Integer::parseInt).toArray();

		int max = iArr[0];
		int min = iArr[0];
		int cmp = iArr[0];
		for (int i = 0; i < iArr.length; i++) {
			if (cmp < iArr[i]) {
				max = iArr[i];
				cmp = iArr[i];
			}
		}


		int cmp2 = iArr[0];
		for (int i = 0; i < iArr.length; i++) {
			if (cmp2 > iArr[i]) {
				min = iArr[i];
				cmp2 = iArr[i];
			}
		}

		return min + " " + max;
	}
}
