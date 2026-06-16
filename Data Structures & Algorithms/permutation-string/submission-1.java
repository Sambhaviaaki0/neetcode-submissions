class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count = new int[26];
        int[] windowcount = new int[26];
        if(s1.length() > s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++) {
            s1count[s1.charAt(i) - 'a']++;
            windowcount[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1count , windowcount)) {
            return true;
        }
        for(int i=s1.length();i<s2.length();i++) {
            windowcount[s2.charAt(i) - 'a']++;
            windowcount[s2.charAt(i - s1.length()) - 'a']--;
            if(Arrays.equals(s1count , windowcount)) {
                return true;
            }
        }
        return false;
    }
}
