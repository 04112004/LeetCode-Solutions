class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, maxLen =0;
        HashSet<Character> h1=new HashSet<>();
        for(int right=0; right<s.length();right++){
            while(h1.contains(s.charAt(right))){
                h1.remove(s.charAt(left));
                left++;
            }
            h1.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
        
    }
}