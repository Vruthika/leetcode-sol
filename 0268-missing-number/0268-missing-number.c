int sum(int n)
{
    if(n==1)
    return 1;
    else 
    return n+sum(n-1);
}
int missingNumber(int* nums, int numsSize) {
    int i,s=0;
    for(i=0;i<numsSize;i++)
    {
        s+=nums[i];
    }
    int tot=sum(numsSize);
    int a=tot-s;
    return a;
}