package LeetCodes;

public class Problem8 {

    public int myAtoi(String s) {

        s = s.trim();
        boolean neg = false;
        int num = 0;
        char c;

        if (s.length() == 0)
            return 0;

        try {
            return Integer.parseInt(s);
        } catch (Exception e) {

        }

        //// detect the signs
        if (s.charAt(0) == '-') {
            neg = !neg;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {

            s = s.substring(1);
        }

        ////////
        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);

            if (!Character.isDigit(c))
                break;

            int digit = Character.getNumericValue(c);
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = (num * 10 + digit);
        }

        return neg ? -num : num;

    }

}
