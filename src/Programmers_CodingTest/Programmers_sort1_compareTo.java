package Programmers_CodingTest;

import java.util.Arrays;

/**
 * @author woonji.kim
 */
public class Programmers_sort1_compareTo {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {6, 10, 2}));
	}

	public static String solution(int[] numbers) {
		String answer = "";

		String[] numArr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			numArr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(numArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if (numArr[0] == "0") {
			return "0";
		}

		for (int i = 0; i < numArr.length; i++) {
			answer += numArr[i];
		}
		return answer;
	}
}
