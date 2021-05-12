package Programmers_CodingTest;

/**
 * Programmers :: 다음 큰 숫자
 * @author woonji.kim
 */
public class Programmers_next_big_num {
	public static void main(String[] args) {
		System.out.println(solution(78));
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int origin = n;
		while(true) {
			int x = ++n;

			// 한개씩 늘려가며 origin과 비교
			if (getNum(origin) == getNum(x)) {
				return x;
			}
		}
	}

	// 1의 개수 비트 계산 반환
	public static int getNum(int n) {
		return Integer.bitCount(n);
	}
}
