package Programmers_CodingTest;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Programmers :: 스택/큐 :: 프린터
 * @author woonji.kim
 */
public class Programmers_stack_queue3_printer {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,1,3,2}, 2));
		System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 1;

		Queue<Item> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			Item item;
			if (i == location) {
				item = new Item(priorities[i], 1);
			} else {
				item = new Item(priorities[i], 0);
			}
			queue.add(item);
		}

		int cnt = 0;
		while (queue.isEmpty() == false) {
			boolean flag = false;
			int cmp = queue.peek().num;
			for (Item i : queue) {
				if (i.num > cmp) {
					flag = true;
				}
			}

			if (flag) {
				queue.offer(queue.poll());
			} else {
				cnt++;
				if (queue.poll().loc == 1) {
					return cnt;
				}
			}


		}

		return answer;
	}
}


class Item {
	int num;
	int loc;

	public Item(int num, int loc) {
		this.num = num;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Item{" +
			"num=" + num +
			", loc=" + loc +
			'}';
	}
}

