package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber_17 {
    private static final Map<Character, Object> MAP = Map.of(
        '2', List.of("a", "b", "c"),
        '3', List.of("d", "e", "f"),
        '4', List.of("g", "h", "i"),
        '5', List.of("j", "k", "l"),
        '6', List.of("m", "n", "o"),
        '7', List.of("p", "q", "r", "s"),
        '8', List.of("t", "u", "v"),
        '9', List.of("w", "x", "y", "z")
    );

    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
        System.out.println("result : " + letterCombinations("234"));
    }

    private static List<String> letterCombinations(String digits) {
        char[] digitArr = digits.toCharArray();

        if (digitArr.length == 0) {
            return List.of();
        }
        if (digitArr.length == 1) {
            return (List)MAP.get(digitArr[0]);
        }

        List<String> res = (List)MAP.get(digitArr[0]);
        for (int i = 1; i < digitArr.length; i++) {
            List<String> a = res;
            List<String> b = (List)MAP.get(digitArr[i]);
            List<String> tmp = new ArrayList<>();

            for (String j : a) {
                for (String k : b) {
                    tmp.add(j + k);
                    System.out.println(tmp);
                }
            }
            res = tmp;
        }

        return res;
    }
}
