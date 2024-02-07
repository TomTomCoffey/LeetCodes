public class Problem200 {
    public int numIslands(char[][] grid) {

        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    sinkThem(grid, i, j);
                }
            }
        }
        return ans;
    }

    public void sinkThem(char[][] grid, int i, int j) {

        if (i < 0 || i > grid.length - 1)
            return;
        if (j < 0 || j > grid[0].length - 1)
            return;
        if (grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        sinkThem(grid, i, j + 1);
        sinkThem(grid, i, j - 1);
        sinkThem(grid, i + 1, j);
        sinkThem(grid, i - 1, j);

    }
}
