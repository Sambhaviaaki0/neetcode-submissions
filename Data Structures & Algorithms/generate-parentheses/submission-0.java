class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backtrack(n , ans , curr , 0 , 0);
        return ans;
    }
    private void backtrack(int n , List<String> ans , StringBuilder curr , int open , int close) {
        if(curr.length() == n*2) {
            ans.add(curr.toString());
            return;
        }
        if(open < n) {
            curr.append('(');
            open+=1;
            backtrack(n , ans , curr , open , close);
            open-=1;
            curr.deleteCharAt(curr.length() - 1);
        }
        if(close < open) {
            curr.append(')');
            close+=1;
            backtrack(n , ans , curr , open , close);
            close-=1;
            curr.deleteCharAt(curr.length() - 1);

        }
    }
}
