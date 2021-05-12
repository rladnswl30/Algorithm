package Programmers_CodingTest;

/**
 * @author woonji.kim
 */
public class Programmers_search2_carpet {
	public static void main(String[] args) {
		solution(10, 2);
		solution(18, 6);
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int sum = brown + yellow;

		for (int i = sum / 2; i > 0; i--) {
			if (sum % i != 0) {
				continue;
			}
			int a = i;
			int b = sum / i;

			if ((a - 2) * (b - 2) == yellow) {
				return new int[] {a, b};
			}
		}
		return answer;
	}
}
