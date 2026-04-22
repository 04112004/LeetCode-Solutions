class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer, Integer> h1 = new  HashMap<>();
        for(int i=0; i<n; i++){
            int comp = target - nums[i];
            if(h1.containsKey(comp)){
                return new int[]{h1.get(comp),i};
                
            }
            h1.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}