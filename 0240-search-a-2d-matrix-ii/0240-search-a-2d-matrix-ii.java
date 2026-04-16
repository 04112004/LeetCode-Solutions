class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int matL = matrix.length;
        int matB = matrix[0].length;
        int i=0, j=matB-1;
        while(i<matL && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}