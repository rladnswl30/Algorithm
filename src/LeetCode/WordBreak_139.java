package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak_139 {
    private static Map<String, Boolean> tmp = new HashMap<>();

    public static void main(String[] args) {
                System.out.println(wordBreak("leetcode", List.of("leet", "code")));
        //        System.out.println(wordBreak("applepenapple", List.of("apple", "pen")));
        //        System.out.println(wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
        //        System.out.println(wordBreak("a", List.of("a")));
//                System.out.println(wordBreak("cars", List.of("car", "ca", "rs")));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        if (tmp.containsKey(s) && tmp.get(s) == false) {
            return false;
        }

        for (String w : wordDict) {
            if (s.indexOf(w) == 0 && wordBreak(s.substring(w.length()), wordDict)) {
                return true;
            }
        }

        tmp.put(s, false);

        return false;
    }
}
