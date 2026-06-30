class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(n ,k , ans , curr , 1);
        return ans;
    }
    private void backtrack(int n , int k , List<List<Integer>> ans , List<Integer> curr , int index){
        if(curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<=n;i++) {
            curr.add(i);
            backtrack(n,k,ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}