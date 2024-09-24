/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* res=(int*)malloc(sizeof(int)*2);
    *res=0;
    *(res+1)=0;
    int i,j;
    for(i=0;i<numsSize-1;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if((*(nums+i)+(*(nums+j)))==target)
            {
                *returnSize=2;
                *res=i;
                *(res+1)=j;
                return res;
            }
        }
    }
    *returnSize=0;
    return 0;


}