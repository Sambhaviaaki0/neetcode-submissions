class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums , target , ans , curr ,0);
        return ans;
    }
    private void backtrack(int[] nums , int target , List<List<Integer>> ans , List<Integer> curr , int index) {
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0) {
            return;
        }

        for(int i=index;i<nums.length;i++) {
            curr.add(nums[i]);
            backtrack(nums,target-nums[i],ans,curr,i);
            curr.remove(curr.size() - 1);
        }
    }
}
