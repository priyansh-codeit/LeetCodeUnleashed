class MinStack {

    Stack<int[]> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        int mini = val;
        if (!st.isEmpty()) {
            mini = Math.min(mini, st.peek()[1]);
        }
        st.push(new int[] { val, mini });
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek()[0];
    }

    public int getMin() {
        return st.peek()[1];
    }
}