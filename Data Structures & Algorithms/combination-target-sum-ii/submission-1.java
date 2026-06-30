class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates , target , ans , curr , 0);
        return ans;
    }
    private void backtrack(int[] candidates , int target , List<List<Integer>> ans , List<Integer> curr , int index) {
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0) {
            return;
        }
        for(int i=index;i<candidates.length;i++) {
            if(i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            curr.add(candidates[i]);
            backtrack(candidates , target-candidates[i] , ans , curr , i+1);
            curr.remove(curr.size() - 1);
        }
    }
}
