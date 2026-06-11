class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqs = new int[26];
        if(s.length() != t.length()) {
            return false;
        }
        for(char ch : s.toCharArray()) {
            freqs[ch - 'a']++;
        }
        for(char ch : t.toCharArray()) {
            freqs[ch - 'a']--;
            if(freqs[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
