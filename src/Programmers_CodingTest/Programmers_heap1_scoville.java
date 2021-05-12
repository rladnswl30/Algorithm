package Programmers_CodingTest;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author woonji.kim
 */
public class Programmers_heap1_scoville {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{2}, 1));
		System.out.println(solution(new int[]{1, 7}, 7));
		System.out.println(solution(new int[]{7, 1}, 7));
		System.out.println(solution(new int[]{8, 10, 11}, 7));
		System.out.println(solution(new int[]{100, 1, 10}, 7));
		System.out.println(solution(new int[]{1, 1, 100}, 7));
		System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> foods = new PriorityQueue<>();

		Arrays.stream(scoville).forEach(foods::add);

		while (foods.size() > 1) {
			if (foods.peek() >= K) {
				return answer;
			}

			int sum = foods.poll() + (foods.poll() * 2);

			foods.add(sum);
			answer++;
		}

		if (foods.peek() < K) {
			return -1;
		}
		return answer;
	}
}
