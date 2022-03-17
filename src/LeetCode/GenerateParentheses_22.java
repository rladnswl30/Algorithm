package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, 0, 0, "", res);
        return res;
    }

    public static void dfs(int n, int open, int close, String s, List<String> res) {
//        System.out.println(s);

        // open == close == n
        if (s.length() == n * 2 && open == close) {
            res.add(s);
            return;
        }

        // open can added lower than n
        if (open < n) {
            dfs(n, open + 1, close, s + "(", res);
        }

        // close can added lower than open
        if (close < open) {
            dfs(n, open, close + 1, s + ")", res);
        }
    }
}
