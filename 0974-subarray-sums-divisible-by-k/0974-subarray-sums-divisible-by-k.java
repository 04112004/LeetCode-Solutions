class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        h1.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int num:nums){
            prefixSum += num;
            int rem = prefixSum%k;

            if(rem<0){
                rem += k;
            }
            count += h1.getOrDefault(rem,0);
            h1.put(rem, h1.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}