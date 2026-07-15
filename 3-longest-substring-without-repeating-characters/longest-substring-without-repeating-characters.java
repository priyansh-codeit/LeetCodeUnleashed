class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            // shrink window from left until s[i] is no longer a duplicate
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));                  // expand window to include s[i]
            ans = Math.max(ans, i - left + 1);     // update max window size
        }

        return ans;
    }
}