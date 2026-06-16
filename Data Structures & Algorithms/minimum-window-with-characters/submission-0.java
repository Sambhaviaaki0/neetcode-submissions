class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] countT = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) {
            countT[c]++;
        }

        int have = 0;
        int need = 0;

        for (int i = 0; i < 128; i++) {
            if (countT[i] > 0) {
                need++;
            }
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window[c]++;

            if (countT[c] > 0 &&
                window[c] == countT[c]) {
                have++;
            }

            while (have == need) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);

                window[remove]--;

                if (countT[remove] > 0 &&
                    window[remove] < countT[remove]) {
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}