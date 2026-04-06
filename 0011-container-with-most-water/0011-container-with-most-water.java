class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0,h=n-1;
        int res=0;
        while(l<h){
            int area = (h-l) * Math.min(height[l],height[h]);
            res = Math.max(res,area);
            if(height[l] < height[h]){
                l++;
            }
            else
            {
                h--;
            }
        }
        return res;
    }
}
