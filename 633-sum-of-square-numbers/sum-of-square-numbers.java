class Solution{
    public boolean judgeSquareSum(int c){
        for(long a=0;a*a<=c;a++){
            long target=c-a*a;
            long l=0,r=(long)Math.sqrt(target);

            while(l<=r){
                long mid=l+(r-l)/2;

                if(mid*mid==target)
                    return true;
                else if(mid*mid<target)
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return false;
    }
}