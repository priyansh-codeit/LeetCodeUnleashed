class Solution {
    public int scoreOfParentheses(String s) {
        int len=s.length();
        int pwr=0,ans=0;
        for(int i = 0; i < s.length(); ++i) {
        if(s.charAt(i)=='(') pwr++;
        else pwr--;
        if(s.charAt(i)==')'&& s.charAt(i-1)=='(') ans+=1 <<pwr; 
        }
        return ans;
    }
    
}