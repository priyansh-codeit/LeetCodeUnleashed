class Solution {
    //function to find greatest common divisor
    public int GCD(int n1, int n2) {
        while (n1!=0 && n2!=0)
        {
            if (n1>n2){
                n1%=n2;
            } 
            else {
                n2%=n1;
            }
        }

        return n1|n2; 
    }
    
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2 + str1)) {
            return "";
        }
        
        int gcdLen = GCD(str1.length(), str2.length());
        return str1.substring(0, gcdLen);
    }
}