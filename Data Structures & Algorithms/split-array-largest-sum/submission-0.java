class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            left = Math.max(num, left);
            right += num;
        }
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currsum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (currsum + num <= mid) {
                    currsum += num;
                } else {
                    currsum = num;
                    pieces++;
                }
            }
            if(pieces <= k) {
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}