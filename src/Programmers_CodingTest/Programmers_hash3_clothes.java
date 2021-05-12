package Programmers_CodingTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author woonji.kim
 */
public class Programmers_hash3_clothes {
	public static void main(String[] args) {
		System.out.println(solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
		System.out.println(solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
		System.out.println(solution(new String[][]{{"a", "headgear"}, {"a", "eyewear"}, {"b", "headgear"}, {"b", "eyewear"}, {"a", "face"}}));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> result = new HashMap<>();
		for (String[] one : clothes) {
			result.put(one[1], result.getOrDefault(one[1], 0) + 1);
		}
//		System.out.println(result);
//		System.out.println(result.values());

		for (Integer one : result.values()) {
			answer *= (one + 1);
		}
		return answer - 1;
	}
}
