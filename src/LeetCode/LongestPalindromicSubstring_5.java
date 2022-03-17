package LeetCode;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
//        System.out.println(longestPalindrome("babad"));
//        System.out.println(longestPalindrome("cbbd"));
//        System.out.println(longestPalindrome("a"));
//        System.out.println(longestPalindrome("ac"));
//        System.out.println(longestPalindrome("aaaaa"));
//        System.out.println(longestPalindrome("cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj"));
    }

    public static String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            String tmp = "";

            if (s.substring(i).length() < max) {
                break;
            }

            for (int j = s.length() - 1; j > i; j--) {
                String a = s.substring(i, j + 1);

                char[] chars = a.toCharArray();
                if (chars[0] != chars[a.length() - 1]) {
                    continue;
                }

                if (a.length() < max) {
                    break;
                }

                StringBuilder sb = new StringBuilder(a);
                String b = sb.reverse().toString();
                if (a.equals(b)) {
                    tmp = a;
                    break;
                }
            }
            if (tmp.length() > max) {
                res = tmp;
                max = tmp.length();
            }
        }

        if (res.isEmpty()) {
            return s.substring(0, 1);
        }

        return res;
    }
}
