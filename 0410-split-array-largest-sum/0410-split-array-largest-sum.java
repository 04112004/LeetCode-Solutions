class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for (int num : nums) {
            left = Math.max(left, num); 
            right += num;               
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                ans = mid;
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }

        return ans;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int parts = 1;
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > maxSum) {
                parts++;
                currSum = num;
            } else {
                currSum += num;
            }
        }

        return parts <= k;
    }
}