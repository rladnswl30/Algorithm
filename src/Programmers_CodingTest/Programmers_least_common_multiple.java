package Programmers_CodingTest;

/**
 * Programmers :: N개의 최소 공배수
 * @author woonji.kim
 */
public class Programmers_least_common_multiple {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 6, 8, 14}));
		System.out.println(solution(new int[] {1, 2, 3}));
	}

	public static int solution(int[] arr) {
		int cmp = arr[0];
		// arr.length까지 순차적으로 최소공배수 구하기
		for (int i = 0; i < arr.length; i++) {
			cmp = lcm(cmp, arr[i]);
		}
		return cmp;
	}

	// 최대공약수
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	// 최소공배수
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
