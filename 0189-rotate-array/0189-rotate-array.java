class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        k=k%nums.length;
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            a[j++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++)
        {
            a[j++]=nums[i];
        }
        j=0;
        for(int i:a)
        {
            nums[j++]=i;
        }
    }
}