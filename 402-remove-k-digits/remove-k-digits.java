class Solution {
    public String removeKdigits(String num, int k) {
        char[] stack=new char[num.length()];
        int top=-1;

        for(char c:num.toCharArray()){
            while(top>=0&&k>0&&stack[top]>c){
                top--;
                k--;
            }
            stack[++top]=c;
        }

        while(k>0){
            top--;
            k--;
        }

        int start=0;
        while(start<=top&&stack[start]=='0')
            start++;

        if(start>top)
            return "0";

        return new String(stack,start,top-start+1);
    }
}