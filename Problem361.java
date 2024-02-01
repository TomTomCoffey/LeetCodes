public class Problem361 {
    public int maxKilledEnemies(char[][] grid) {
        
        int max = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '0')
                max = Math.max(max, boom(i, j, grid));
            }
        }
        
        return max;
        
    }
    public int boom(int i, int j, char[][] grid){
        
        int kill = 0;
        int iLevel = i;
        int up = i; 
        int right = j;
        
        while(i >= 0){
            if(grid[i][j] == 'W'){
                break;
            }
            else if(grid[i][j] == 'E'){
                kill++;
            }
            i--;
        }
        while(up < grid.length){
            if(grid[up][j] =='W'){
                break;
            }
            else if(grid[up][j] == 'E'){
                kill++;
            }
            up++;
        }
        while(j >= 0){
            if(grid[iLevel][j] == 'W'){
                break;
            }
            else if(grid[iLevel][j] == 'E'){
                kill++;
            }
            j--;
        }
        while(right < grid[0].length){
            if(grid[iLevel][right] == 'W'){
                break;
            }
            else if(grid[iLevel][right] == 'E'){
                kill++;
            }
            right++;
        }
        return kill;
      
    }
}
