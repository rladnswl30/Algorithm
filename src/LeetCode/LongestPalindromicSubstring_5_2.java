package LeetCode;

public class LongestPalindromicSubstring_5_2 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        //        System.out.println(longestPalindrome("cbbd"));
        //        System.out.println(longestPalindrome("a"));
        //        System.out.println(longestPalindrome("ac"));
        //        System.out.println(longestPalindrome("aaaaa"));
                System.out.println(longestPalindrome("cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {

            // i, i
            String tmp = search(s, i, i);
            if (tmp.length() > res.length()) {
                res = tmp;
            }

            // i, i+1
            tmp = search(s, i, i + 1);
            if (tmp.length() > res.length()) {
                res = tmp;
            }
        }
        return res;
    }

    public static String search(String s, int start, int end) {
        while (start >= 0 && end <= s.length() - 1) {
            if (s.charAt(start) != s.charAt(end)) {
                break;
            }
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}
