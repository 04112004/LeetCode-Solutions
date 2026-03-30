class Solution {
    public int diagonalSum(int[][] mat) {
        int matL = mat.length;
        int matB = mat[0].length;
        int sum=0;
        int ans=0;
        int i=0,j=matB-1;
        for(i=0;i<matL;i++){
            for(j=0;j<matB;j++){
                
                if(i==j||i+j==matL-1){
                        sum+=mat[i][j];
                        ans=sum;
                }
            }
        }
        return ans;
    }
}