package Programmers_CodingTest;

import java.util.Stack;

/**
 * Programmers :: 탐욕법 :: 큰 수 만들기
 * @author woonji.kim
 */
public class Programmers_greedy {
	public static void main(String[] args) {
		System.out.println(solution("1924", 2));
		System.out.println(solution("4177252841", 4));
	}

	public static String solution(String number, int k) {
		char[] result = new char[number.length() - k];
		Stack<Character> stack = new Stack<>();

		int idx = k;
		for (int i = 0; i < number.length(); i++) {
			char cmp = number.charAt(i);
			// cmp보다 작으면 pop
			while (stack.isEmpty() == false && cmp > stack.peek() && idx > 0) {
				stack.pop();
				idx--;
			}
			// cmp보다 크면 push
			stack.push(cmp);
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = stack.get(i);
		}
		return new String(result);
	}
}
