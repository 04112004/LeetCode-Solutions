class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int rd=0,i;
        for(i=0;i<n;i++){
            if(nums[rd] !=  nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
}