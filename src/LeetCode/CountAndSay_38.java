package LeetCode;

public class CountAndSay_38 {
    public static void main(String[] args) {
//        System.out.println(countAndSay(1));
//        System.out.println(countAndSay(2));
//        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String res = "1";

        for (int i = 1; i < n; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {

                int count = 1;
                // 중복되는 숫자만큼 카운트 증가
                while (j + 1 < res.length() && res.charAt(j) == res.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(res.charAt(j));
            }
            res = sb.toString();
        }

        return res;
    }
}
