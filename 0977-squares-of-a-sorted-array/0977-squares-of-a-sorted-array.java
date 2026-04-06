class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            int leftsq = nums[i] * nums[i];
            int rightsq = nums[j] * nums[j];
            if(leftsq>rightsq){
                ans[k] = leftsq;
                i++;
            }
            else{
                ans[k] = rightsq;
                j--;
            }
            k--;
        }
        return ans;
    }
}