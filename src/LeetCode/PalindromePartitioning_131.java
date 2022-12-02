package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {
    public static void main(String[] args) {
        //        System.out.println(partition("aab"));
        System.out.println(partition("우영우"));
    }

    private static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtracking(s, 0, res, new ArrayList<>());
        return res;
    }

    private static void backtracking(String s, int idx, List<List<String>> res, List<String> tmp) {
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s.substring(idx, i + 1))) {
                tmp.add(s.substring(idx, i + 1));
                backtracking(s, i + 1, res, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }

        if (idx == s.length()) {
            res.add(new ArrayList<>(tmp));
            return;
        }
    }

    private static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
