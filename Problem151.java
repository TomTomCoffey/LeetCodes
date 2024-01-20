public class Problem151 {
    public String reverseWords(String s) {

        String[] helper = s.split(" ");
        String ans = "";

        for (int i = helper.length - 1; i >= 0; i--) {
            if (!helper[i].isEmpty()) {
                ans += helper[i];
                ans += " ";
            }
        }
        return ans.trim();

    }
}
