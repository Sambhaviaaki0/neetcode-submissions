class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(ans , curr , 0 , nums);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans , List<Integer> curr , int index , int[] nums) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(ans, curr , index+1 , nums);
        curr.remove(curr.size() - 1);
        backtrack(ans , curr , index+1 , nums);
    }
}
