package Programmers_CodingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author woonji.kim
 */
public class Programmers_hash1_participant {
	public static void main(String[] args) {
		String[] participant = new String[]{"leo", "kiki", "eden"};
		String[] completion = new String[]{"eden", "kiki"};

		String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};

		String[] participant3 = new String[]{"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = new String[]{"stanko", "ana", "mislav"};


//		System.out.println(solution(participant, completion));
		System.out.println(solution2(participant, completion));
//		System.out.println(solution(participant2, completion2));
		System.out.println(solution2(participant2, completion2));
//		System.out.println(solution(participant3, completion3));
		System.out.println(solution2(participant3, completion3));
	}

	public static String solution(String[] participant, String[] completion) {
		Map<String, Integer> result = new HashMap<>();

		for (String pOne : participant) {
			result.put(pOne, result.getOrDefault(pOne, 0) + 1);
		}

		for (String cOne : completion) {
			result.put(cOne, result.getOrDefault(cOne, 0) - 1);
		}

		for (String key : result.keySet()) {
			if (result.get(key) != 0) {
				return key;
			}
		}
		return "";
	}

	public static String solution2(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		for (i = 0; i < completion.length; i++) {
			if (participant[i].equals(completion[i]) == false) {
				return participant[i];
			}
		}
		return participant[i];
	}
}
