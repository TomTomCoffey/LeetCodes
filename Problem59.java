public class Problem59 {

    public int[][] generateMatrix(int n) {

        if (n == 1) {
            int[][] g = new int[n][n];
            g[0][0] = 1;
            return g;
        }

        int[][] ans = new int[n][n];

        int target = n * n;
        int start = 1;
        int i = 0;
        int j = 0;

        while (start < target + 1) {

            while (j < ans[0].length) {

                if (ans[i][j] > 0)
                    break;

                ans[i][j] = start;
                j++;
                start++;

            }
            j--;
            i++;
            while (i < ans.length) {

                if (ans[i][j] > 0)
                    break;

                else {
                    ans[i][j] = start;
                    i++;
                    start++;
                }
            }
            i--;
            j--;
            while (j >= 0) {
                if (ans[i][j] > 0)
                    break;

                else {
                    ans[i][j] = start;
                    j--;
                    start++;
                }

            }
            j++;
            i--;
            while (i < ans.length) {

                if (ans[i][j] > 0)
                    break;

                else {
                    ans[i][j] = start;
                    start++;
                    i--;
                }
            }
            i++;
            j++;

        }

        return ans;

    }

}
