class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int best = Integer.MAX_VALUE;
        int curr = 0;
        int left = 0;
        for(int i=0;i<n;i++) {
            curr += nums[i];
            while(curr >= target) {
                best = Math.min(best , i-left+1);
                curr -= nums[left];
                left++;
            }
        }
        if(best == Integer.MAX_VALUE) {
            return 0;
        }
        return best;
    }
}