package Programmers_CodingTest;

/**
 * Programmers :: 124 나라의 숫자
 * @author woonji.kim
 */
public class Programmers_decimal {
	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

	public static String solution(int n) {
		String answer = "";

		while (n > 0) {
			if (n % 3 == 0) {
				answer = '4' + answer;
				n = n / 3 - 1;
			} else if (n % 3 == 1) {
				answer = '1' + answer;
				n = (int)Math.floor((double)n / 3);
			} else if (n % 3 == 2) {
				answer = '2' + answer;
				n = (int)Math.floor((double)n / 3);
			}
		}

		return answer;
	}
}
