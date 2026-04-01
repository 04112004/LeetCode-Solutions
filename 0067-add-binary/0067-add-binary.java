class Solution {
    public String addBinary(String a, String b) {
        int l = a.length()-1;
        int r = b.length()-1;
        int carry =0;
        
        StringBuilder res = new StringBuilder();
        while(l>=0||r>=0||carry!=0){
            int sum=carry;
            if(l>=0){
                sum+=a.charAt(l)-'0';
                l--;
            }
            if(r>=0){
                sum+=b.charAt(r) -'0';
                r--;
            }
            res.append(sum%2);
            carry=sum/2;
        }
        return res.reverse().toString();

    }
}