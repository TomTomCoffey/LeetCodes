package LeetCodes;

import java.util.HashSet;

public class Problem3 {

    public int lengthOfLongestSubstring(String s) {

        return helper(s, 0, new HashSet<>());

    }

    public int helper(String s, int count, HashSet<Character> set) {
        if (count >= s.length())
            return count;
        int tempcount = 0;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (!set.contains(c)) {

                set.add(c);
                tempcount++;

            } else {
                if (tempcount > count)
                    return helper(s.substring(s.indexOf(c)), tempcount, new HashSet<>());
                else {
                    return helper(s.substring(1), count, new HashSet<>());
                }

            }

        }

        return tempcount > count ? tempcount : count;
    }

}
