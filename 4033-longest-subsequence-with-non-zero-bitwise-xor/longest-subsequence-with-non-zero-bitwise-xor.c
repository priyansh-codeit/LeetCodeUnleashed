int longestSubsequence(int* nums, int numsSize) {
    int x=0;
    int nonZero=0;

    for(int i=0;i<numsSize;i++){
        x^=nums[i];
        if(nums[i]!=0)
            nonZero=1;
    }

    if(x!=0)
        return numsSize;

    if(nonZero)
        return numsSize-1;

    return 0;
}