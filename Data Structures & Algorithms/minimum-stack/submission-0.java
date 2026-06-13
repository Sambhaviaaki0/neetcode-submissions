class MinStack {
    Stack<Integer> st;
    Stack<Integer> minstack;
    public MinStack() {
        st = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty()) {
            minstack.push(val);
        }else{
            minstack.push(Math.min(val , minstack.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        minstack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
