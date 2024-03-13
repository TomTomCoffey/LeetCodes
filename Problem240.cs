public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.Length; i++){
            if(matrix[i][0] > target) break;
         
           if(matrix[i][0] <= target && matrix[i][matrix[0].Length-1] >= target){
                if(searchWorks(i, matrix, target)){
                    return true;
                }
           }
        }
      return false;
    }
    public bool searchWorks(int i, int[][] matrix, int target){

        int left = 0;
        int right = matrix[i].Length-1;
        int mid;

        while(left <= right){
            mid = (right+left)/2 ;

            if(matrix[i][mid] == target){
                return true;
            }
            else if(matrix[i][mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}


   