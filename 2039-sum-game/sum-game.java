class Solution{public boolean sumGame(String num){
    int n=num.length(),lSum=0,rSum=0,lQ=0,rQ=0;
    for(int i=0;i<n/2;i++){
        char c=num.charAt(i);
        if(c=='?')
            lQ++;
        else 
            lSum+=c-'0';
            }
        for(int i=n/2;i<n;i++){
            char c=num.charAt(i);
            if(c=='?')
                rQ++;
            else 
                rSum+=c-'0';
                }
                int dSum=lSum-rSum,dQ=lQ-rQ;
                return(dQ%2!=0)||(dSum+dQ/2*9!=0);
     }
}