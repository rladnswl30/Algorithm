package Programmers_CodingTest;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Programmers :: 스택/큐 :: 다리를 지나는 트럭
 * @author woonji.kim
 */
public class Programmers_stack_queue2_truck {
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] {7, 4, 5, 6}));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		int max = 0;
		for (int truck : truck_weights) {
			while (true) {
				// 큐가 비어있으면 offer & count++
				if (q.isEmpty()) {
					q.offer(truck);
					max += truck;
					answer++;
					break;
				}

				// 큐 사이즈가 다리 사이즈와 같으면 poll & 최대치에서 큐 사이즈만큼 제거
				if (q.size() == bridge_length) {
					max -= q.poll();
				}

				// "최대치 + 트럭 무게 <= 수용할 수 있는 무게" 면 트럭 추가 & count++
				if (max + truck <= weight) {
					q.offer(truck);
					max += truck;
					answer++;
					break;
				// "최대치 + 트럭 무게 > 수용할 수 있는 무게" 면 0 추가 & count++
				} else {
					q.offer(0);
					answer++;
				}
			}
		}
		return answer + bridge_length;
	}
}
