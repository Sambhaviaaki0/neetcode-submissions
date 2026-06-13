class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        while(l < r) {
            if(height[l] < height[r]) {
                if(leftmax < height[l]) {
                    leftmax = height[l];
                }else{
                    water += leftmax - height[l];
                }
                l++;
            }else{
                if(rightmax < height[r]) {
                    rightmax = height[r];
                }else{
                    water += rightmax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
