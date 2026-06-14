class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int w : weights) {
            left = Math.max(left , w);
            right += w;
        }
        int ans = right;
        while(left <= right) {
            int mid = left + (right - left)/2;
            int requireddays = 1;
            int curr = 0;
            for(int w : weights) {
                if(curr + w > mid) {
                    requireddays += 1;
                    curr = w;
                }else{
                    curr+=w;
                }
            }
            if(requireddays <= days) {
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}