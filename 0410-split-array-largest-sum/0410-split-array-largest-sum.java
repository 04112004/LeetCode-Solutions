class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int num:nums){
            l=Math.max(l,num);
            r +=num;
        }
        int res = r;
        while(l<=r){
            int m = l+(r-l)/2;
            if(canSplit(nums,k,m)){
                res =m;
                r= m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return res;
    }
    private boolean canSplit(int[] nums, int k, int maxSum){
        int parts = 1;
        int currSum=0;
        for(int num:nums){
            if(currSum+num > maxSum){
                parts++;
                currSum = num; 
            }
            else
            {
                currSum += num;
            }
        }
        return parts<=k;
    }
}