class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count=new int[26];
        int left=0;
        int right=0;
        int max=0;

        while(right<s.length()){
            count[s.charAt(right)-'a']++;

            while(count[s.charAt(right)-'a']>2){
                count[s.charAt(left)-'a']--;
                left++;
            }

            max=Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
}