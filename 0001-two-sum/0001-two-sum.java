class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                int sum =nums[i]+nums[j];
                if(sum == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}