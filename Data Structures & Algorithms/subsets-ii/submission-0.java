class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        backtrack(nums , ans , curr , index);
        return ans;
    }
    private void backtrack(int[] nums , List<List<Integer>> ans , List<Integer> curr , int index) {
        ans.add(new ArrayList<>(curr));
        
        for(int i=index;i<nums.length;i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums , ans , curr , i+1);
            curr.remove(curr.size() - 1);
        }
    }
}
