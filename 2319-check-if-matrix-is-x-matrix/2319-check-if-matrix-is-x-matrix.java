class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int gridL = grid.length;
        int gridB = grid[0].length;
        int i=0;
        int j=gridB-1;
        for(i=0;i<gridL;i++){
            for(j=0;j<gridB;j++){
                if(i==j ||i+j==gridL-1){
                    if(grid[i][j]==0){
                        return false;
                    }
                
                }
                else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}