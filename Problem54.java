import java.util.ArrayList;
import java.util.List;

public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (ans.size() < (matrix.length * matrix[0].length)) {

            while (j < matrix[0].length) {

                if (matrix[i][j] == 101) {
                    break;
                } else {
                    ans.add(matrix[i][j]);
                    matrix[i][j] = 101;
                    j++;

                }
            }
            j--;
            i++;

            while (i < matrix.length) {
                if (matrix[i][j] == 101) {
                    break;
                } else {
                    ans.add(matrix[i][j]);
                    matrix[i][j] = 101;
                    i++;

                }

            }
            i--;
            j--;

            while (j >= 0) {
                if (matrix[i][j] == 101) {
                    break;
                } else {
                    ans.add(matrix[i][j]);
                    matrix[i][j] = 101;
                    j--;
                }
            }
            j++;
            i--;
            while (i >= 0) {
                if (matrix[i][j] == 101) {
                    break;
                } else {
                    ans.add(matrix[i][j]);
                    matrix[i][j] = 101;
                    i--;
                }
            }
            i++;
            j++;

        }

        return ans;

    }

}
