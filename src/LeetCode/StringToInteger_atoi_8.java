package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class StringToInteger_atoi_8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("   42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("+42"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("    +0 123"));
    }

    public static int myAtoi(String s) {
        String a = s.trim();
        char[] charArray = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        boolean minus = false;
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                if (charArray[i] == '-') {
                    minus = true;
                    continue;
                } else if (charArray[i] == '+') {
                    continue;
                }
            }

            if (charArray[i] > 0) {
                if (String.valueOf(charArray[i]).matches("[0-9]+")) {
                    sb.append(charArray[i]);
                } else {
                    break;
                }
            }
        }

        if (sb.length() == 0) {
            return 0;
        }

        try {
            int res = Integer.parseInt(sb.toString());
            return minus ? res * -1 : res;
        } catch (NumberFormatException e) {
            return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
