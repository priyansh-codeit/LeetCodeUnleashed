class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = -1, finals = (int)1e9 + 7;
        while (l < finals - 1) 
        {
            int mid = l + (finals - l) / 2;
            int count = 0;
            for (int i = 1; i < n; i++) 
            {
                if (nums[i] - nums[i - 1] <= mid) 
                {
                    count++;
                    i++; 
                }
            }
            if (count >= p) 
            {
                finals = mid;
            } 
            else 
            {
                l = mid;
            }
        }
        return finals;
    }
}