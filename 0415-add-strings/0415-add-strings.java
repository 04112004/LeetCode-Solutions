class Solution {
    public String addStrings(String num1, String num2) {
        int a = num1.length()-1;
        int b = num2.length()-1;
        int carry =0;
        StringBuilder res = new StringBuilder();
        while(a>=0 || b>=0 || carry!=0){
            int sum = carry;
            if(a>=0){
                sum += num1.charAt(a) - '0';
                a--;
            }
            if(b>=0){
                sum += num2.charAt(b) - '0';
                b--;
            }
            res.append(sum%10);
            carry = sum/10;
        }
        return res.reverse().toString();
    }
}