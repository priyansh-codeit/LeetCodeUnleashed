class Solution {
    public String minRemoveToMakeValid(String s) {
        int count=0;
        StringBuilder str=new StringBuilder();
        char[] chars=s.toCharArray();
        for(char c:chars){
            if(c=='(') ++count;
            if(c==')'){
                --count;
            }
            if(count<0){
                count=0;
            }else{
                str.append(c);
            }
        }
       int index=str.length()-1;
        while(count>0 && index>=0){
            if(str.charAt(index)=='(') {
                str.deleteCharAt(index);
                count--;
            }
            index--;
        }
        return str.toString();
    }
}