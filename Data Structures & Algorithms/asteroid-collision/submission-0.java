class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids) {
            boolean flag = false;
            while(!st.isEmpty() && ast < 0 && st.peek() > 0) {
                if(st.peek() < -ast) {
                    st.pop();
                }else if(st.peek() == -ast) {
                    st.pop();
                    flag = true;
                    break;
                }else{
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                st.push(ast);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}