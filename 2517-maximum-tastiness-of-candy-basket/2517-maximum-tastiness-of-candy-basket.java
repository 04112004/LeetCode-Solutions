class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        
        int l=0;
        int h=price[price.length-1]-price[0];
        int ans=0;
        while(l<=h){
            int m = l+(h-l)/2;
            if(canChoose(price,k,m)){
                ans=m;
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
    private boolean canChoose(int[] price, int k, int diff){
        int count=1;
        int last = price[0];
        for(int i=1;i<price.length;i++){
            if(price[i] - last >= diff){
                count++;
                last = price[i];
            }
            if(count >= k) return true;
        }
        return false;

    }
   
}