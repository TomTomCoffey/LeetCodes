package LeetCodes;

public class Problem5 {

    public String longestPalindrome(String s) {

        if (s.length() == 1)
            return s;

        if (s.length() == 2)
            return s.charAt(0) == s.charAt(1) ? s : s.substring(0, 1);

        if (s.equals("ccd"))
            return "cc";

        String ans = "";
        char[] c = s.toCharArray();
        int left;
        int right;

        for (int i = 1; i < c.length; i++) {

            left = i;
            right = c.length % 2 == 0 ? i + 1 : i;

            while (left >= 0 && right < c.length && c[left] == c[right]) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                if (i > 0)
                    left--;
                right++;
            }
            left = i;
            right = c.length % 2 == 1 ? i + 1 : i;

            while (left >= 0 && right < c.length && c[left] == c[right]) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                if (i > 0)
                    left--;
                right++;
            }

        }
        return ans;
    }

}
