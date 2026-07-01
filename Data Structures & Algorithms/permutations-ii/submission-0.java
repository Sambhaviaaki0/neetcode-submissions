class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums , ans , curr , used);
        return ans;
    }
    private void backtrack(int[] nums , List<List<Integer>> ans , List<Integer> curr , boolean[] used) {
        if(nums.length == curr.size()) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }
            if(!used[i]) {
                curr.add(nums[i]);
                used[i] = true;
                backtrack(nums , ans , curr , used);
                curr.remove(curr.size()-1);
                used[i] = false;
            }
        }
    }
}