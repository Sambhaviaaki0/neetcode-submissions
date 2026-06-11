class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int maxcnt = 0;
        for(int num : set) {
           if(!set.contains(num-1)) {
            int curr = num;
            int length = 1;
            while(set.contains(curr+1)) {
                curr++;
                length++;
            }
           maxcnt = Math.max(maxcnt , length);
           }
        }
        return maxcnt;
    }
}
