class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return palindrome(s , start+1 , end) || palindrome(s , start , end-1);
            }
            start++;
            end--;
        }
        return true;
    }
    private boolean palindrome(String s , int left , int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}