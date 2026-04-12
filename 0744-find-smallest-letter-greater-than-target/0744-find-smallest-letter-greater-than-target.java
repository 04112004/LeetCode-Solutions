class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        while(left<=right){
            int m = left + (right-left)/2;
            if(letters[m]<=target){
                left=m+1;
            }
            else
            {
                right=m-1;
            }
        }
        return letters[left % letters.length];
    }
}