class Solution {
    public int hammingWeight(int n) {
        int sb=0;
        while(n!=0){
            int re=n%2;
            if(re==1)
            sb++;
            n/=2;
        }
        return sb;
    }
}