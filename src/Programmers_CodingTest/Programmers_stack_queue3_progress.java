package Programmers_CodingTest;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Programmers :: 스택/큐 :: 기능 개발
 * @author woonji.kim
 */
public class Programmers_stack_queue3_progress {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
		System.out.println(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		// 남은 퍼센티지
		Queue<Integer> re = new LinkedList<>();
		// 스피드
		Queue<Integer> sp = new LinkedList<>();
		// 총 일을 하는데 걸리는 일 수
		Queue<Integer> to = new LinkedList<>();
		// 답
		Queue<Integer> ans = new LinkedList<>();

		for (int i = 0; i < progresses.length; i++) {
			re.offer(100 - progresses[i]);
			sp.offer(speeds[i]);
		}

		while (re.isEmpty() == false) {
			double div = (double)re.poll() / sp.poll();
			// 걸리는 일 수 => 올림하여 queue에 추가
			to.add((int)Math.ceil(div));
		}

		int cmp = to.poll();
		int cnt = 1;
		while (to.isEmpty() == false) {
			int num = to.poll();
			if (cmp >= num) {
				cnt++;
			} else {
				ans.offer(cnt);
				cnt = 1;
				cmp = num;
			}
		}
		ans.offer(cnt);
		System.out.println(ans);
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
}
