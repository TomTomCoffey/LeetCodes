package LeetCodes;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        helper(list, "", n, n);
        return list;
    }

    public void helper(List<String> list, String str, int left, int right) {
        if (left == 0 && right == 0)
            list.add(str);

        if (left > 0)
            helper(list, str + "(", left - 1, right);

        if (right > left)
            helper(list, str + ")", left, right - 1);
    }

    public static void main(String[] args) {

        Problem22 p22 = new Problem22();

        List<String> list = p22.generateParenthesis(3);

        for (String str : list)
            System.out.println(str);

    }

}
