int* nextGreaterElement(int* nums1,int nums1Size,int* nums2,int nums2Size,int* returnSize){
    int *ans=malloc(nums1Size*sizeof(int));
    int stack[1000],top=-1;
    int map[10001];

    for(int i=0;i<10001;i++)
        map[i]=-1;

    for(int i=0;i<nums2Size;i++){
        while(top!=-1&&nums2[i]>stack[top]){
            map[stack[top]]=nums2[i];
            top--;
        }
        stack[++top]=nums2[i];
    }

    for(int i=0;i<nums1Size;i++)
        ans[i]=map[nums1[i]];

    *returnSize=nums1Size;
    return ans;
}