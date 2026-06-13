class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int best = Integer.MIN_VALUE;
        while(left < right) {
            int height = Math.min(heights[left] , heights[right]);
            int width = right - left;
            best = Math.max(best , height*width);
            if(heights[left] < heights[right]) {
                left++;
            }else{
                right--;
            }
        }
        return best;
    }
}
