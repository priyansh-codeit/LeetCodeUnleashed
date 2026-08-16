class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack <Integer> st = new Stack <>();
        for(int i =0;i<arr.length;i++){
            int curr = arr[i];
            if(curr>0){
                st.push(curr);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < Math.abs(curr)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek() == Math.abs(curr)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(curr);
                }
            }
        }
        int [] ans = new int[st.size()];
        for(int i =ans.length-1;i>=0;i--){
            ans[i]=st.pop();

        }        
        return ans;
    }
}